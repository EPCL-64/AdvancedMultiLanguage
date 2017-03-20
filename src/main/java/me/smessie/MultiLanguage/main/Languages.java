package me.smessie.MultiLanguage.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Languages {
	
	public static List<String> languages = new ArrayList<>();
	public static HashMap<String, String> languagesOwn = new HashMap<>();
	public static HashMap<String, String> languagesFull = new HashMap<>();
	
	public static void addSupportedLanguages() {
		languages.add("NL");	languagesOwn.put("nederlands", "NL");	languagesFull.put("dutch", "NL");
		languages.add("EN");	languagesOwn.put("english", "EN");		languagesFull.put("english", "EN");
		languages.add("FR");	languagesOwn.put("francais", "FR");		languagesFull.put("french", "FR");
		languages.add("DE");	languagesOwn.put("deutsch", "DE");		languagesFull.put("german", "DE");
		languages.add("ES");	languagesOwn.put("español", "ES");		languagesFull.put("spanish", "ES");
		languages.add("RU");	languagesOwn.put("pусский", "RU");		languagesFull.put("russian", "RU");
		languages.add("LV");	languagesOwn.put("latviešu", "LV");		languagesFull.put("latvian", "LV");
		languages.add("DK");	languagesOwn.put("denis", "DK");		languagesFull.put("dansk", "DK");
		languages.add("HU");	languagesOwn.put("magyar", "HU");		languagesFull.put("hungarian", "HU");
		languages.add("IT");	languagesOwn.put("italiano", "IT");		languagesFull.put("italian", "IT");
		languages.add("BG");	languagesOwn.put("български", "BG");	languagesFull.put("bulgarian", "BG");
		languages.add("CHS");	languagesOwn.put("chinois", "CHS");		languagesFull.put("chinese", "CHS");
	}

}