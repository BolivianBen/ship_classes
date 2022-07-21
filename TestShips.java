package holman13;
//import for the array list
import java.util.ArrayList;

//not a parent class or anything. just normal class
public class TestShips {

	public static void main(String[] args) {
		
		//create the array and pass in all the parameters for the desired output
		
		//I'm passing in all the same parameters from the example, to ensure I can double check the output 
		Ship[] array=new Ship[6];
		array[0]=new CruiseShip("Magic: ",1998,83338,2700,"Caribbean");
		array[1]=new CruiseShip("Titanic: ",1912,46328,2435,"Atlantic Ocean");
		array[2]=new CargoShip("Algeciras: ",2020,228283,"containers",391);
		array[3]=new CargoShip("Seawise Giant: ",1979,260941,"crude oil",564763);
		array[4]=new WarShip("USS Nimitz: ",1972,97000,"super carrier","United States");
		array[5]=new WarShip("USS Zumwalt DDG 1000: ",2013,15656,"destroyer","United States");
		System.out.println("An unordered fleet of various ships");
		System.out.println();
		
		//create a loop that goes through each array and prints out the full expected results with optimal spacing.
		for(Ship n:array){
		System.out.println(n.getClass());
		System.out.println(n);
		System.out.println(n.purpose());
		System.out.println();
		}

		//create a for loop that keeps track of the number of ships in the array
		ArrayList<Ship> list=new ArrayList();
			for(int i=0;i<array.length;i++){
				list.add(array[i]);}

			/// add a new ship to the array of ships 
		list.add(new CruiseShip(" Symphony of the Seas ",2018,228081,6680," Atlantic Ocean"));
		
		///create nested for loop that will sort the array by the size of the tons within the updated list by using
		///the method "compareTo" from the ship class
		Ship n;
			for(int i = 0; i < list.size(); i++){
				for(int N = i + 1; N < list.size(); N++){
		if(list.get(i).compareTo(list.get(N)) > 0) {
			n=list.get(i);
			list.set(i,list.get(N));
			list.set(N,n);}
		}
		}
		//print out to the user the new size of the fleet, once the new ship was added....also added some spacing
			System.out.println();
			System.out.println("Fleet size is now " + Ship.numShips);
			System.out.println();
		
		
		///create ANOTHER for loop that sorts the array in order by tonnage
		System.out.println("Fleet sorted by tonnage after adding Symphony of the Seas ");
			for (int i = 0; i < list.size(); i++){
		System.out.println(list.get(i));
		System.out.println();}

		}
		}