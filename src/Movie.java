import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class Movie {
private String name;
private String director;
private int releaseyear;
private List<rateing> rateinglist = new ArrayList<>(); 
private HashMap<String, actor> databazahercov;


public Movie (String name, String director, int releaseyear) {
this.name = name;
this.director = director;
this.releaseyear = releaseyear;
}
	
	public String getName() {
		return name;
	}
	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getReleaseyear() {
		return releaseyear;
	}

	public void setReleaseyear(int releaseyear) {
		this.releaseyear = releaseyear;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
