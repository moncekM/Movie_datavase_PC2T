import java.util.HashMap;
import java.util.Set;

import javax.swing.JOptionPane;

public class movieDatabase {
	public HashMap<String, Movie> movies;
private Movie raitedmovie;
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
		JOptionPane.showMessageDialog(null, "zadaný fulm už exsistuje, použite úravu filmu");
	}
	else {
		movies.put(moviename ,new actMovie(moviename,directorname, releaseyear,false));	
	}
}
public  void SetAnimMovie (String moviename, String directorname, int releaseyear, int pegiyear) {
	 
	if (movies.containsKey(moviename)){
		JOptionPane.showMessageDialog(null, "zadaný fulm už exsistuje, použite úravu filmu");
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
		JOptionPane.showMessageDialog(null, "zadaný film ešte nexsistuje, najskôr ho vytvorte");
	}
}
public  void updateAnimMovie (String moviename, String directorname, int releaseyear, int pegiyear) {
	 
	if (movies.containsKey(moviename)){
		movies.put(moviename ,new animMovies(moviename,directorname, releaseyear,pegiyear,true));	
	}
	else {
		JOptionPane.showMessageDialog(null, "zadaný film ešte nexsistuje, najskôr ho vytvorte");
	}
	
}
public void deletemovie(String moviename) {
	movies.remove(moviename);
	actorDatabase.getInstance().actorsFromMovie(moviename);
	actorDatabase.getInstance().deletemovie(moviename);
	
}
public void addrateing (String Moviename, int rateing, String Coment) {
	
	if (movies.containsKey(Moviename)){
		raitedmovie=movies.get(Moviename);
		raitedmovie.setrateing(rateing, Coment);
		movies.put(raitedmovie.getName(), raitedmovie);
	}
	else {
		JOptionPane.showMessageDialog(null, "zadaný film ešte nexsistuje, najskôr ho vytvorte");
	}
}
}

