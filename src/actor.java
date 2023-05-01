import java.util.ArrayList;
import java.util.List;

public class actor {
private String name;
public List<String> movielist;
 
	public actor (String name) {
	this.name = name;
	movielist =	new ArrayList<String>();
}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMovies(String movies) {
		movielist.add(movies);
	}
	
}
