package com.skilldistillery.jets.app;

import java.util.List;

public class AirField {

	private Jet[] jets;
	private int currentJetIndex;

	public AirField() {

	}

	public void allFly(Jet[] jets) {
		for (int i = 0; i < jets.length; i++) {
			Jet j = jets[i];
			j.fly();

		}
	}

	public void addJet(Jet j) {
		jets[currentJetIndex] = j;
		currentJetIndex++;

	}



}
