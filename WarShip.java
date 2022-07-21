package holman13;

public class WarShip extends Ship {
	
	//two unique private variable for this class
	private String type;
	private String nation;
	
	
/// Public variable and methods for this class
	
	public WarShip(String name, int year, int tons, String type, String nation) {
	super(name, year, tons);
	this.type = type;
	this.nation = nation;}
	
	//Lets be real; this is the actual purpose.
	public String purpose() {
		return " A ship for attacking other countries to bring home that OIL BABY!! ";}
	
	public String toString(){
		return super.toString() + "\n Type: " + this.type + " operated by " + this.nation + " Navy";}

}
