package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirField {

	private List<Jet> jets;
	private int currentJetIndex;
	private String jetType;

	public AirField() {

	}

	public void allFly(List<Jet> jets) {
		for (Jet fly : jets) {
			System.out.println(fly.getModel());
			fly.fly();
		}

	}

	public void fightReady(List<Jet> jets) {
		for (Jet jetFight : jets) {
			if (jets instanceof FighterJet) {
				System.out.println(jetFight.getModel());
				((FighterJet) jetFight).fight();
			}
		}
	}

	public void allLoadCargo(List<Jet> jets) {
		for (Jet cargo : jets) {
			if (jets instanceof FighterJet()) {
				System.out.println(cargo.getModel());
				((CargoPlane) cargo).loadCargo();
			}
		}
	}
	
	public void doABarrelRoll(List<Jet> jets) {
		
	}

	public void removeJet(Scanner kb) {
		int i -1;
	}

	public void addJet(Jet jetsList) {
		jets[currentJetIndex] = jetsList;
		currentJetIndex++;

	}

//	private double fastestJet(double speed) {
//	double fastest = 0;
//	for( int i = 1; i < : speed) {
//		
//	}
//	
//	return fastest;
//}

	public int longestRange(List<Jet> jets) {
		int longest = 0;
		for (Jet l : jets) {
			if (longest < ((Jet) jets).getRange()) {
				longest = ((Jet) jets).getRange();
			}
		}
		return longest;
	}

	private void addJets(List<Jet> jets) {

		jets.add((Jet) this.jets);
	}

	public List<Jet> readJets(String file) {

		List<Jet> jets = new ArrayList<>();
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while (((line = br.readLine()) != null)) {
				int jetNum = 1;

				if (jetNum == 1) {
					String[] jetInfo = line.split(", ");
					String model = jetInfo[0];
					double speed = Double.parseDouble(jetInfo[1]);
					int range = Integer.parseInt(jetInfo[2]);
					long price = Long.parseLong(jetInfo[3]);

					Jet fJ1 = new FighterJet(model, speed, range, price);
					jets.add(fJ1);
					++jetNum;

				} else if (jetNum == 2) {
					String[] jetInfo = line.split(", ");
					String model = jetInfo[0];
					double speed = Double.parseDouble(jetInfo[1]);
					int range = Integer.parseInt(jetInfo[2]);
					long price = Long.parseLong(jetInfo[3]);

					Jet fJ2 = new FighterJet(model, speed, range, price);
					jets.add(fJ2);
					++jetNum;

				} else if (jetNum == 3) {
					String[] jetInfo = line.split(", ");
					String model = jetInfo[0];
					double speed = Double.parseDouble(jetInfo[1]);
					int range = Integer.parseInt(jetInfo[2]);
					long price = Long.parseLong(jetInfo[3]);

					Jet cP1 = new CargoPlane(model, speed, range, price);
					jets.add(cP1);
					++jetNum;

				} else if (jetNum == 4) {
					String[] jetInfo = line.split(", ");
					String model = jetInfo[0];
					double speed = Double.parseDouble(jetInfo[1]);
					int range = Integer.parseInt(jetInfo[2]);
					long price = Long.parseLong(jetInfo[3]);

					Jet cP2 = new CargoPlane(model, speed, range, price);
					jets.add(cP2);
					++jetNum;

				} else if (jetNum == 5) {
					String[] jetInfo = line.split(", ");
					String model = jetInfo[0];
					double speed = Double.parseDouble(jetInfo[1]);
					int range = Integer.parseInt(jetInfo[2]);
					long price = Long.parseLong(jetInfo[3]);

					Jet jR1 = new JetReg(model, speed, range, price);
					jets.add(jR1);
					++jetNum;
				}

			}
			br.close();
		} catch (

		IOException e) {
			System.err.println("Problem while reading: " + e.getMessage());
		}

		return jets;
	}

}
