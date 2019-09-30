package com.skilldistillery.jets.app;

public class AirField {

	private Jet[] jets;
	private int currentJetIndex;

	public AirField() {

	}

	public void allFly(Jet[] jet) {
		for (int i = 0; i < jet.length; i++) {
			Jet j = jet[i];
			j.fly();

		}
	}

	public void addJet(Jet j) {
		jets[currentJetIndex] = j;
		currentJetIndex++;

	}

}
