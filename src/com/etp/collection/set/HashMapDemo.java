package com.etp.collection.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.etp.collection.model.Song;

public class HashMapDemo {

	public static void main(String[] args) {

		Map<Country, List> mapCountry = new TreeMap<>();

		List<String> stateList = new ArrayList<>();
		

		stateList.add("MH");
		stateList.add("UP");
		stateList.add("UK");
		stateList.add("MP");
		stateList.add("DL");
		
		//mapCountry.put(null, null);

		mapCountry.put(new Country("India","100000"), stateList);

		mapCountry.put(new Country("Pak","555"), Arrays.asList("Lahore", "Islamabad"));
		
		mapCountry.put(new Country("Bhutal","5566"), stateList);
		
		mapCountry.put(new Country("Araebic","1994"), stateList);


		//System.out.println(mapCountry.size());

		Set<Country> countryKeySet = mapCountry.keySet();

		System.out.println(countryKeySet);

		for (Country country : countryKeySet) {

			System.out.println("Country is  :::  " + country.getPopulation());

			List stateListss = mapCountry.get(country);

			for (Object state : stateListss) {

				System.out.println((String) state);

			}
		}
	}

}
