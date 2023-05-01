import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class Movie {
private String name;
private String director;
private int releaseyear;
private boolean type;


private List<rateing> rateinglist = new ArrayList<>(); 


public Movie (String name, String director, int releaseyear, boolean type) {
this.name = name;
this.director = director;
this.releaseyear = releaseyear;
this.type=type;
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
	public boolean isType() {
		return type;
	}

	public void setType(boolean type) {
		this.type = type;
	}
	
}
