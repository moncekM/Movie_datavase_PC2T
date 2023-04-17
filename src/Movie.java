import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class Movie {
private String name;
private HashMap<String, actor> databazahercov;
List <Integer> rateing = new ArrayList<>();
private String comment;
	public Movie () {
		databazahercov = new HashMap<String, actor>();
}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
