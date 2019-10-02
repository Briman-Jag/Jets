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
			if (roll instanceof FighterJet || roll instanceof JetReg) {
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
		Jet r = new JetReg(model, speed, range, price);
		jets.add(r);

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
			int jetNum = 1;
			while (((line = br.readLine()) != null)) {

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
