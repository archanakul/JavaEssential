package Section3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class ComplexDataStructures {
	public static String[] vehicles = {"car", "bus", "van"};
	public static String[][] drivers = {{"joe","bob", "mike"},
										{"Mole", "clare","amme", "anna"},
										{"Dan", "kristina","lui"}};
	
	public static void main(String[] args){
		Map<String,Set<String>> personnel = new HashMap<String, Set<String>>();
		for(int i = 0; i < vehicles.length; i++){
			String vehicle = vehicles[i];
			String[] driverList = drivers[i];
			
			Set<String> driverSet = new LinkedHashSet<String>();
			for(String driver : driverList){
				driverSet.add(driver);
			}
			personnel.put(vehicle, driverSet); // mapping Strings & Sets into Maps
		}
		
		//Retrieving the map elements(key-value pairs)
		for(String dr: personnel.keySet()){
			System.out.println("Vehicle:" + dr + " & Drivers:" + personnel.get(dr));
		}
		
	}
}
