package mediaRentalManager;

public class Movies implements Comparable <Movies> {
	
	
	protected String movieTitle;
	
	protected int movieCopies;
	/**
	 * 
	 * @param movieTitle
	 * @param movieCopies
	 */

	public Movies(String movieTitle, int movieCopies) 
	
	{
		this.movieTitle = movieTitle;
		
		this.movieCopies = movieCopies;
		
	}
	/**
	 * 
	 * @param movieTitle
	 */

	public void setMovieTitle(String movieTitle)
	{
		this.movieTitle = movieTitle;
	}
	/**
	 * 
	 * @param movieCopies
	 */
	public void setMoiveCopies(int movieCopies)
	{
		this.movieCopies = movieCopies;
	}
	/**
	 * 
	 * @return
	 */
	public String getMovieTitle()
	{
		return movieTitle;
	}
	/**
	 * 
	 * @return
	 */

	public int getMovieCopies()
	{
		return movieCopies;
	}
	/**
	 * 
	 */

	public void addMovieCopy()
	{
		movieCopies++;
	}

	/**
	 * 
	 */
	public void removeMovieCopy()
	{
		if (movieCopies>0)
		{
			movieCopies--;
		}
	}

	/**
	 * 
	 */
	public int compareTo(Movies movie)
	{

		int answer;
		
		
		String movie1 = new String ( this.movieTitle);
		
		
		
		String movie2 =  new String (movie.movieTitle);
		
		
		answer= movie1.compareTo(movie2);
		
		return answer;
	}


	public String toString()
	{
		String answer="";
		
		
		answer="Title: " + getMovieTitle() + ", Copies Available: " + getMovieCopies();
		
		return answer;
	}


}