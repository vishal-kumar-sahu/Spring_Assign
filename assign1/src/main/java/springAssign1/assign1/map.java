package springAssign1.assign1;

import java.util.*;

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
