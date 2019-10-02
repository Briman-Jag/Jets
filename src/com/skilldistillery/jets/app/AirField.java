package com.skilldistillery.jets.app;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirField {

	private List<Jet> jets;;
	Scanner kb = new Scanner(System.in);
	Scanner bk = new Scanner(System.in);
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
			if (jetFight instanceof FighterJet) {
				System.out.println(jetFight.getModel());
				((FighterJet) jetFight).fight();
			}
		}
	}

	public void allLoadCargo(List<Jet> jets) {
		for (Jet cargo : jets) {
			if (cargo instanceof CargoPlane) {
				System.out.println(cargo.getModel());
				((CargoCarrier) cargo).loadCargo();

			}

		}
	}

	public void doABarrelRoll(List<Jet> jets) {
		for (Jet roll : jets) {
			if (roll instanceof FighterJet) {
				System.out.println(roll.getModel());
				((BarrelRoll) roll).doABarrelRoll();
			} else if (roll instanceof JetReg) {
				System.out.println(roll.getModel());
				((BarrelRoll) roll).doABarrelRoll();
			}
		}

	}

	public void addJets(List<Jet> jets) {

		System.out.println("-Adding Regular Jet-");
		System.out.println("Enter Model:");
		String model = kb.nextLine();
		System.out.println("Enter speed:");
		double speed = kb.nextDouble();
		System.out.println("Enter range:");
		int range = kb.nextInt();
		System.out.println("Enter price:");
		long price = kb.nextLong();
		Jet jR = new JetReg(model, speed, range, price);
		jets.add(jR);

	}

	public void removeJet(List<Jet> jets) {
		int jetNum = 1;
		int choice = 0;
		for (Jet jet : jets) {
			System.out.println(jetNum + "- " + jet.getModel());
			jetNum++;
		}
		System.out.println("Enter number of Jet to be removed: ");
		choice = kb.nextInt();
		jets.remove(choice - 1);

	}

	public void fastestJet(List<Jet> jets) {
		double fastest = 0;
		double fastestMach = 0;
		String fastestModel = "";

		for (Jet jet : jets) {
			if (((Jet) jet).getSpeed() > fastest) {
				fastest = ((Jet) jet).getSpeed();
				fastestModel = ((Jet) jet).getModel();
			}
		}

		System.out.println(fastestModel + " is the fastest at " + fastest + " MPH");

	}

	public void longestRange(List<Jet> jets) {
		int longest = 0;
		String longestModel = "";
		for (Jet jet : jets) {
			if (((Jet) jet).getRange() > longest) {
				longest = ((Jet) jet).getRange();
				longestModel = ((Jet) jet).getModel();
			}
		}
		System.out.println("Jet with longest range is " + longestModel + " with a range of " + longest + " Miles");
	}

	public List<Jet> readJets(String file) {

		List<Jet> jets = new ArrayList<>();
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while (((line = br.readLine()) != null)) {
				String[] jetInfo = line.split(", ");
				if (line.contains("FighterJet")) {
					String model = jetInfo[1];
					double speed = Double.parseDouble(jetInfo[2]);
					int range = Integer.parseInt(jetInfo[3]);
					long price = Long.parseLong(jetInfo[4]);
					Jet fJ = new FighterJet(model, speed, range, price);
					jets.add(fJ);
				}
				if (line.contains("CargoPlane")) {
					String model = jetInfo[1];
					double speed = Double.parseDouble(jetInfo[2]);
					int range = Integer.parseInt(jetInfo[3]);
					long price = Long.parseLong(jetInfo[4]);
					Jet cJ = new CargoPlane(model, speed, range, price);
					jets.add(cJ);
				}
				if (line.contains("JetReg")) {
					String model = jetInfo[1];
					double speed = Double.parseDouble(jetInfo[2]);
					int range = Integer.parseInt(jetInfo[3]);
					long price = Long.parseLong(jetInfo[4]);
					Jet jR = new JetReg(model, speed, range, price);
					jets.add(jR);
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
