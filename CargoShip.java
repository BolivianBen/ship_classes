package holman13;

public class CargoShip extends Ship {

	
	//two private variables
	private String cargo;
	
	private int capacity;
	
	
	//add methods and public variables
	public CargoShip(String name, int year, int tons, String cargo, int capacity) {
		super(name, year, tons);
		this.cargo = cargo;
		this.capacity = capacity;}

	public int getCapacity() {
		return this.capacity;}
	
	
	public boolean equals(CargoShip N){
		
		if(this.cargo.equalsIgnoreCase(N.cargo) && this.capacity == N.capacity){return true;}
		else return false;}
	
	
	///name this purpose of this class
	public String purpose() {
	return "Hauling cargo across the seas, then sitting outside the dock due to Covid";}
	
	public String toString() {
		return super.toString() + "Capacity of " + this.cargo + "is " + this.capacity;}
}
