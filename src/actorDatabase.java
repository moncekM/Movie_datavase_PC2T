import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class actorDatabase {
	public HashMap<String, actor> actors;
	private actor pomactor;
	public static List<actor> tempactorlist = new ArrayList<actor>();
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
}


}
