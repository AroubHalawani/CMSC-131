package mediaRentalManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;

public class MediaRentalManager implements MediaRentalManagerInt {

	private ArrayList<Customers> customers = new ArrayList<Customers>();

	private ArrayList<Movies> movie = new ArrayList<Movies>();

	public void addCustomer(String name, String address, String plan)

	{
		Customers customer = new Customers(name, address, plan);

		customers.add(customer);
	}

	public void addMovie(String title, int copiesAvailable, String rating)

	{
		Movies moviee = new Movie(title, copiesAvailable, rating);

		movie.add(moviee);
	}

	public void addAlbum(String title, int copiesAvailable, String artist, String songs)

	{
		Album album = new Album(title, artist, songs, copiesAvailable);
		movie.add(album);
	}

	public void setLimitedPlanLimit(int value) {
		for (Customers customer : customers) {
			switch (customer.getCustomerPlan()) {

			case "LIMITED":

				customer.setCustomerPlan(value);

			}

		}
	}

	public String getAllCustomersInfo()

	{

		String answer = "***** Customers' Information *****\n";

		Collections.sort(customers);

		for (Customers customer : customers) {
			answer += customer;
		}

		return answer;
	}

	public String getAllMediaInfo() {
		String answer = "***** Media Information *****\n";

		Collections.sort(movie);

		for (Movies movie : movie) {
			answer += movie;
		}

		return answer;
	}

	public boolean addToQueue(String customerName, String mediaTitle) {
		Customers customer = new Customers(customerName, "", "");

		if (customers.contains(customer)) {
			for (Customers count : customers) {

				Queue<String> queue = count.getInter();

				if (count.getCustomertName().equals(customerName) && (!queue.contains(mediaTitle))) {

					count.addToInter(mediaTitle);

					return true;
				}
			}

		}

		return false;
	}

	public boolean removeFromQueue(String customerName, String mediaTitle) {
		boolean answer;

		Customers removeFromQueue = new Customers(customerName, "", "");

		Queue<String> queue;

		for (Customers customer : customers) {
			queue = customer.getInter();
			if (customer.getCustomertName().equals(customerName) && customers.contains(removeFromQueue)
					&& queue.contains(mediaTitle)) {

				customer.removeInter(mediaTitle);
				answer = true;

			}
		}

		answer = false;

		return answer;
	}

	public String processRequests() {
		String answer = "";

		Collections.sort(customers);

		for (Customers customer : customers) {

			Queue<String> queue = customer.getInter();
			ArrayList<String> toRemove = new ArrayList<String>();

			for (String media : queue) {
				if (!customer.Space()) {

					for (Movies movie : this.movie) {

						if (movie.getMovieTitle().equals(media) && movie.getMovieCopies() > 0 && customer.Rented(media))

						{

							movie.removeMovieCopy();

							answer += "Sending " + media + " to " + customer.getCustomertName() + "\n";

							toRemove.add(media);

							break;

						}
					}
				}

			}

			for (String toBeRemoved : toRemove) {
				customer.getInter().remove(toBeRemoved);
			}
		}

		return answer;

	}

	public boolean returnMedia(String customerName, String mediaTitle) {
		Collections.sort(customers);
		Queue<String> queue;
		boolean answer;

		for (Customers customer : customers)
		{
			if (customer.getCustomertName().equals(customerName)) 
			{
				queue = customer.getRented();

				if (queue.contains(mediaTitle)) {
					customer.removeRent(mediaTitle);

					for (Movies movie : this.movie) {
						if (movie.getMovieTitle().equals(mediaTitle))
						{
							movie.addMovieCopy();

							answer = true;

							break;
						}
					}

				}
				answer = false;
			}
		}

		answer = false;
		Collections.sort(customers);

		return answer;

	}

	public ArrayList<String> searchMedia(String title, String rating, String artist, String songs) {

		ArrayList<String> answer = new ArrayList<String>();

		if (title == null && rating == null && artist == null && songs == null) {
			for (Movies movie : movie) {
				answer.add(movie.movieTitle);
			}
			return answer;
		}

		else if (title != null || rating != null || artist != null || songs != null) {
			for (Movies movie : movie) {
				if (title != null || rating != null) {
					if (movie.movieTitle.equals(title)) {
						answer.add(movie.movieTitle);
						break;
					}

					else if (!(movie instanceof Movie)) {
						continue;
					}

					Movie m = (Movie) movie;

					if ((m.getMovieRating().equals(rating)) && (answer.contains(m.movieTitle) == false)) {
						answer.add(m.movieTitle);

					}
				} else if (artist != null || songs != null) {
					if (!(movie instanceof Album))

					{
						continue;

					}

					Album album = (Album) movie;

					if ((artist != null || songs != null)
							&& (album.getAlbumArtist().equals(artist) || album.getAlbumSongs().contains(songs))
							&& (answer.contains(album.movieTitle) == false)) {
						answer.add(album.movieTitle);

					}
				}

			}
		}

		Collections.sort(answer);

		return answer;
	}

	public String toString() {
		String answer = "";

		answer = "Customers: " + customers + "\n";
		answer += " Media Avail: " + movie;

		return answer;
	}

}