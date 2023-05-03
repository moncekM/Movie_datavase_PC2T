
public class rateing implements Comparable<rateing>{
int Rateing;
String Coment;

public rateing (int rateing, String Coment) {
	this.Rateing=rateing;
	this.Coment=Coment;
}
public int getHodnotenie() {
	return Rateing;
}
public void setHodnotenie(int hodnotenie) {
	this.Rateing = hodnotenie;
}
public String getComent() {
	return Coment;
}
public void setComent(String coment) {
	Coment = coment;
}
@Override
public int compareTo(rateing o) {
	Integer rate = Rateing;
	return rate.compareTo(o.getHodnotenie());
}

}
