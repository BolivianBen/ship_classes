package holman13;

public class CruiseShip extends Ship {
	
	//as always, private variables for the class first
	private int passengers;
	private String zone;
	
	
	//public methods
	public CruiseShip(String name, int year, int tons, int passengers, String zone) {
		super (name, year, tons);
		this.passengers = passengers;
		this.zone = zone;}

	
	public int getPassengers() {
		return this.passengers;}
	
	public String getZone() {
		return this.zone;}
	
	public String toString(){
		return super.toString() + "\n" + this.passengers + " passenger capacity, operating in the " + this.zone;}
	
	public String purpose() {
		return "A holiday vessel for going on three day benders";}
	
}