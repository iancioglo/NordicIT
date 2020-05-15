package com.inordic.homeWorkParking.parking;

import java.util.ArrayList;
import java.util.List;

public class Parking {
	
private List<Boolean> places = new ArrayList<>();
	
	public Parking() {
		for (int i = 0; i < 20; i++) {
			places.add(i, true);
		}
	}
	
	public String occupate(Integer place) {
		if (place != null) {
			if (places.get(place - 1) == true) {
				places.set(place - 1, false);
				return "Теперь парковочное место номер " + place + " занято.";
			} else {
				return "Парковочное место номер " + place + " уже занято.";
			}
		} else {
			Integer freePlace = null;
			for (int i = 0; i < places.size(); i++) {
				if (freePlace == null) {
					if (places.get(i) == true) {
						places.set(i, false);
						freePlace = i;
					}
				} else {
					break;
				}
			}
			return "Теперь парковочное место номер " + (freePlace + 1) + " занято." ;
		}
	}
	
	public String free(int number) {
		if (places.get(number - 1) == false) {
			places.set(number - 1, true);
			return "Теперь парковочное место номер " + number + " свободно." ;
		} else {
			return "Парковочное место номер " + number + " и так свободно.";
		}
	}
	
	public List<Integer> freePlacesList() {
		var freePlaces = new ArrayList<Integer>();
		for (int i = 0; i < places.size(); i++) {
			if (places.get(i) == true) {
				freePlaces.add(i + 1);
			}
		}
		return freePlaces;
	}
	
}
