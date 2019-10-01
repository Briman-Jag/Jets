package com.skilldistillery.jets.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirField {

	private ArrayList<Jet> jets;
	private int currentJetIndex;

	public AirField() {
		jets = new ArrayList<Jet>();

	}

	public void allFly(Jet[] jets) {
		for (int i = 0; i < jets.length; i++) {
			Jet j = jets[i];
			j.fly();

		}
	}
	
	public void allLoadCargo() {
		
	}
	
	public void removeJet(Scanner kb) {
		int i -1;
	}

	public void addJet(Jet jetsList) {
		jets[currentJetIndex] = jetsList;
		currentJetIndex++;

	}



}
