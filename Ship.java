package holman13;

public abstract class Ship {
		
		//Start with the private variables
		private String name;
		private int year;
		private int tons;
		
		//now the public variable
		public static int numShips;

		
		///public methods are next
		public Ship(String name, int year, int tons){
			this.name = name;
			this.year = year;
			this.tons = tons;
			numShips += 1;}
		
		public String getName() {
			return this.name;}
		
		public int getYear() {
			return this.year; }
		
		public int getTons() {
			return this.tons; }
		
		public abstract String purpose();
		
		//this method compares a ship to a new ship and uses if statement to check if the tons are greater in the new ship
		//this will be used to sort the ships later...I hope
		public int compareTo(Ship n){
			if (this.tons == n.tons){return 0;}
			
			else if (this.tons > n.tons) {return 1;}
			return -1;}
		
		public String toString() {
			return "Ship name: " + this.name + "year launched: " + this.year + " GT " + this.tons;}
		
	}


