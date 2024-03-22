package springAssign2.assign2;

import java.util.HashMap;
import java.util.Map;

public class map {

	private HashMap<String, Integer> map = new HashMap<>();
	
	public map(HashMap<String, Integer> map){
		this.map = map;
	}
	
	public void print() {
		for(Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}
}
