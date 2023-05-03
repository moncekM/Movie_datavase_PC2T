import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import javax.swing.JOptionPane;

public class actorDatabase {
	public HashMap<String, actor> actors;
	private actor pomactor;
	private actor actactor;
	private String Moviename;
	public static List<actor> tempactorlist = new ArrayList<actor>();
	public static List<actor> movieactorlist = new ArrayList<actor>();
	private actorDatabase() {
		actors = new HashMap<String, actor>();
	}
	private static actorDatabase instance = new actorDatabase();
	 
	   //private constructor so that we cannot instantiate the class
	 
	   //returns the only available object
	   public static actorDatabase getInstance(){
 	      return instance;
	   }
public  void SetActors (String moviename) {
	 
	
		for (actor a : tempactorlist) {
			if (actors.containsKey(a.getName())){
			pomactor= actors.get(a.getName());
			pomactor.setMovies(moviename);
			actors.put(a.getName() ,pomactor);
			}
			else {
				a.setMovies(moviename);
				actors.put(a.getName() ,a);
			}
			
		}
		tempactorlist.clear();
}
public void actorsFromMovie(String Moviename) {
	movieactorlist.clear();
	this.Moviename=Moviename;
	Set <String> klice =actors.keySet();

	for (String actor : klice) {
	actactor= actors.get(actor);
	for (String m :actactor.movielist) {
	if (Moviename.equals(m)) {
	movieactorlist.add(actactor);
	}
	}
	}
	}
public void addactor(String moviename) {
	moviename=Moviename;
	for (actor a : tempactorlist) {
		if(movieactorlist.contains(a)) {
			JOptionPane.showMessageDialog(null, "zadaný herec vo filme už hrá");	
		}
		else {
		if (actors.containsKey(a.getName())){
		pomactor= actors.get(a.getName());
		pomactor.setMovies(moviename);
		actors.put(a.getName() ,pomactor);
		}
		else {
			a.setMovies(moviename);
			actors.put(a.getName() ,a);
		}
		}
}
}
public void romoveactor(String moviename) {
	moviename=Moviename;
	for (actor a : tempactorlist) {
			a.movielist.remove(moviename);
			actors.put(a.getName() ,a);
				
}
}
public void deletemovie(String moviename) {
	for (actor a : movieactorlist) {
			a.movielist.remove(moviename);
			actors.put(a.getName() ,a);
				
		}
		
}
}
