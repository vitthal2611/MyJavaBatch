package com.etp.collection.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.etp.collection.model.Song;

public class HashMapDemo {

	public static void main(String[] args) {

		Map<String, List> mapCountry = new HashMap<>();

		List<String> stateList = new ArrayList<>();

		stateList.add("MH");
		stateList.add("UP");
		stateList.add("UK");
		stateList.add("MP");
		stateList.add("DL");

		mapCountry.put("Ind", stateList);

		mapCountry.put("Pak", Arrays.asList("Lahore", "Islamabad"));

		System.out.println(mapCountry.size());

		Set<String> countryKeySet = mapCountry.keySet();

		System.out.println(countryKeySet);

		for (String key : countryKeySet) {

			System.out.println("Country is  :::  " + key);

			List stateListss = mapCountry.get(key);

			for (Object state : stateListss) {

				System.out.println((String) state);

			}
		}
	}

}
