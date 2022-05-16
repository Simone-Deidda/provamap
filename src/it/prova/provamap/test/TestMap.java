package it.prova.provamap.test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {

	public static void main(String[] args) {
		System.out.println("HashMap:");
		Map<String, String> mappaMorseHM = new HashMap<String, String>();
		inizializzaEStampaMorse(mappaMorseHM);
		
		System.out.println("Aggiungo un elemento del codice morse già esistente: HashMap non ammette dupplicati");
		aggiungiMorse(mappaMorseHM, "A", ".-");
		stampaMorse(mappaMorseHM);
		
		// -----------------------------------------------
		
		System.out.println("TreeMap:");
		Map<String, String> mappaMorseTM = new TreeMap<String, String>();
		inizializzaEStampaMorse(mappaMorseTM);
		
		System.out.println("Aggiungo un elemento del codice morse già esistente: HashMap non ammette dupplicati");
		aggiungiMorse(mappaMorseTM, "A", ".-");
		stampaMorse(mappaMorseTM);
	}

	public static void aggiungiMorse(Map<String, String> map, String key, String value) {
		map.put(key, value);
	}
	
	public static void inizializzaEStampaMorse(Map<String, String> map) {
		map.put("A", ".-");
		map.put("B", "-...");
		map.put("C", "...");

		stampaMorse(map);
	}
	
	public static void stampaMorse(Map<String, String> map) {
		for (String morse : map.keySet()) {
			System.out.println(morse + " " + map.get(morse));
		}
	}
}
