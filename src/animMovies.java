
public class animMovies extends Movie {

	private int pegiyear;
	public animMovies(String name, String director, int releaseyear, int pegiyear, boolean type) {
		super(name, director, releaseyear, type);
		this.pegiyear=pegiyear;
	}
	public int getPegiyear() {
		return pegiyear;
	}
	public void setPegiyear(int pegiyear) {
		this.pegiyear = pegiyear;
	}

}
