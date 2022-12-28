package mediaRentalManager;

public class Movie extends Movies {

	
	private String movieRating;

	public Movie(String movieTitle, int movieCopies, String movieRating)
	{
		super(movieTitle, movieCopies);
		this.movieRating = movieRating;
	}

	/**
	 * 
	 * @param movieRating
	 */
	public void setMoviRating(String movieRating)
	{
		this.movieRating=movieRating;
	}
	/**
	 * 
	 * @return
	 */
	public String getMovieRating()
	{
		return movieRating;
	}

	/**
	 * 
	 */
	public boolean equals (Object object)
	{
		Movie movie = (Movie) object;
		boolean answer;
		
		if (object==null||(!(object instanceof Movie))) 
		{
			answer= false;
			
		}
		else if (movieTitle.equals(movie.movieTitle))
		{
			if(movieCopies == movie.movieCopies)
			{
				if(movieRating.equals(movie.movieRating))
				{
					answer= true;
				}
			}
			
		}
		answer= false;
		
		return answer;
	}

	/**
	 * 
	 */
	public String toString()
	{
		String answer="";
		
		answer+= super.toString() + ", Rating: " + getMovieRating() + "\n";
		
		return answer;
	}
	

}