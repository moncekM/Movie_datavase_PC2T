import java.util.HashMap;

public class movieDatabase {
	public HashMap<String, Movie> movies;
	private movieDatabase() {
		movies = new HashMap<String, Movie>();
	}
	private static movieDatabase instance = new movieDatabase();
	 
	   //private constructor so that we cannot instantiate the class
	 
	   //returns the only available object
	   public static movieDatabase getInstance(){
	      return instance;
	   }
public  void SetActMovie (String moviename, String directorname, int releaseyear) {
	 
	if (movies.containsKey(moviename)){
		
	}
	else {
		movies.put(moviename ,new actMovie(moviename,directorname, releaseyear,false));	
	}
}
public  void SetAnimMovie (String moviename, String directorname, int releaseyear, int pegiyear) {
	 
	if (movies.containsKey(moviename)){
		
	}
	else {
		movies.put(moviename ,new animMovies(moviename,directorname, releaseyear,pegiyear,true));	
	}
	
}
public  void updteActMovie (String moviename, String directorname, int releaseyear) {
	 
	if (movies.containsKey(moviename)){
		movies.put(moviename ,new actMovie(moviename,directorname, releaseyear,false));	
	}
	else {
		
	}
}
public  void updateAnimMovie (String moviename, String directorname, int releaseyear, int pegiyear) {
	 
	if (movies.containsKey(moviename)){
		movies.put(moviename ,new animMovies(moviename,directorname, releaseyear,pegiyear,true));	
	}
	else {
		
	}
}
}
