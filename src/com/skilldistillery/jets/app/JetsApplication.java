package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class JetsApplication {

	static AirField airField = new AirField();
	static Scanner kb = new Scanner(System.in);

	public JetsApplication() {

	}

	public static void main(String[] args) {

		launch();

///		pw.printLine(printFleet);
//		jetApp.displayUserMenu();
	}

	private static void launch() throws IOException {
		System.out.println("Welcome to the Jets Application! You are in control"
				+ " of aircraft worth millions and millions of dollars! No Pressure!");
		System.out.println("Fly, Fight, Win!");

		displayUserMenu();

	}

	private static void displayUserMenu() throws IOException {
		JetsApplication jetApp = new JetsApplication();
		String file = "jets.txt";

		BufferedReader bufReader = new BufferedReader(new FileReader(file));
		List<Jet> jetsList = airField.readJets(file);
//		airField.addJet((Jet) jetsList);
//		jetList.writeEntireFleet(outFileName, jets);
//		System.out.println(jetsList);
		boolean cont = true;
		int choice;

		do {
			System.out.println("**********______Main Menu______**********");
			System.out.println("Please choose from the options below: ");
			System.out.println("1 - List fleet");
			System.out.println("2 - Fly all jets");
			System.out.println("3 - View fastest jet");
			System.out.println("4 - View jet with longest range");
			System.out.println("5 - Load all Cargo Jets");
			System.out.println("6 - Dogfight!");
			System.out.println("7 - Add a jet to Fleet");
			System.out.println("8 - Remove a jet from Fleet");
			System.out.println("9 - Quit");
			choice = kb.nextInt();
			switch (choice) {
			case 1:
				// Lists entire fleet of jets taken from AirField array
				System.out.println("Printing entire fleet: ");
				System.out.println(jetsList);
				break;

			case 2:
				// Initiates entire fleet of planes to use fly method
//				airField.allFly(null);

				break;

			case 3:
				// Analyzes entire fleet and finds highest .getSpeed()
				
				break;

			case 4:
				// Analyzes entire fleet and finds longest range

				break;

			case 5:
				/*
				 * Analyzes entire fleet for jets of type CargoPlane and initiates implemented
				 * CargoCarrier's loadCargo(); Use instanceof
				 */
//				Jet cP = new CargoPlane();
//				for (Jet cargo : jetsList) {
//					if ((cP instanceof CargoPlane)) {
//						(Jet)cP.loadCargo();
//
//						System.out.println();
//
//					}
//				}
				break;

			case 6:
				/*
				 * Analyzes entire fleet for jets of type FighterJet and initiates implemented
				 * CombatReady's fight(); Use instanceof
				 */
//				Jet fJ = new FighterJet();
//				for (Jet jet : jetsList) {
//					if ((fJ instanceof FighterJet).fight()) {
//				 FighterJet jetFight = (FighterJet) dogFight;
//				 jetFight.fight();
//						System.out.println();
//					}
//				}

				break;

			case 7:
				// Allows user to add jet and give model, speed, range and price.
				// Does not need to be added to text file

				break;

			case 8:
				// Allows user to delete jet from fleet
				// Does not need to be deleted from text file

				break;
			case 9:
				System.out.println("***Quitting Jets Application***");
				System.out.println("Thanks for playing! Gotta Jet!");
				System.out.println("*ZOOOOOOOOOOOOOOOOOOOOOOOOOOOM*");
				cont = false;
				break;
			default:
				System.out.println("Not a valid option. \n Choose from numbers 1-9 ");
			}

		} while (cont);
		bufReader.close();
		kb.close();
		System.exit(0);
	}
//
//	private double fastestJet(double speed) {
//		double fastest = 0;
//		for( int i = 1; i < : speed) {
//			
//		}
//		
//		return fastest;
//	}

	private int longestRange(List<Jet> jets) {
		int longest = 0;
		for (Jet l : jets) {
			if (longest < ((Jet) jets).getRange()) {
				longest = ((Jet) jets).getRange();
			}
		}
		return longest;
	}

//	private Jet[] createJets(List<Jet> jets) {
//		
//		return jets;
//	}


}
