package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class JetsApplication {

	AirField airField = new AirField();
	Scanner kb = new Scanner(System.in);

	public JetsApplication() {

	}

	public static void main(String[] args) throws IOException {
		String fileName = "jets.txt";
		JetsApplication jetApp = new JetsApplication();
		

		System.out.println("Welcome to the Jets Application where you are in control"
				+ " of aircraft worth millions and millions of dollars! No Pressure!");
		System.out.println("Fly, Fight, Win!");
		jetApp.launch();
///		pw.printLine(printFleet);
		jetApp.displayUserMenu();

	}

	public void launch() {
		List<AirField> jetsList = null;
		Set<AirField> jetsSet = null;
		
		List<Set<String>> printFleet = readEntireFleet(jetsList, jetsSet);

		// Jets already in airfield
		Jet j1 = new FighterJet("F-15E Strike Eagle", 1875.0, 2992, 31_001_000);
		Jet j2 = new FighterJet("A-10 Warthog", 2240, 2578, 31_001_000);
		Jet j3 = new CargoPlane("C-5M Super Galaxy", 518, 8056, 100_037_000);
		Jet j4 = new CargoPlane("C-130 Hercules", 336, 2360, 30_001_000);
		Jet j5 = new JetReg("Cessna Citation XLS", 498, 1961, 13_700_000);

		Set<Jet> jetFleet = new HashSet<>();
		
	}

	public void displayUserMenu() {
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
				
				break;

			case 2:
				// Initiates entire fleet of planes to use fly method

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
				 * CargoCarrier's loadCargo();
				 */
				// Try to turn this into way to look for CargoPlanes?
//				try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
//				      String line;
//				      while ((line = bufIn.readLine()) != null) {
//				        if (line.contains("manager")) {
//				          System.out.println(line);
//				        }
//				      }
//				    }
//				    catch (IOException e) {
//				      System.err.println(e);
//				    }
//				  

				break;

			case 6:
				/*
				 * Analyzes entire fleet for jets of type FighterJet and initiates implemented
				 * CombatReady's fight();
				 */

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
				System.out.println("**Quitting Jets Application**");
				System.out.println("Thanks for playing! Gotta Jet!");
				System.out.println("*ZOOOOOOOOOOOOOOOOOOOOOOOOOOOM*");
				cont = false;
				break;
			default:
				System.out.println("Not a valid option. \n Choose from numbers 1-9 ");
			}

		} while (cont);
		kb.close();
		System.exit(0);
	}
	
	
	private void writeEntireFleet(String outFileName, List<AirField> jets) {
		try {
			FileWriter fw = new FileWriter(outFileName);
		    PrintWriter pw = new PrintWriter(fw);
		}
		
	}

	private List<Set<AirField>> readEntireFleet(List<AirField> jetsList, Set<AirField> jetsSet){
		
		List<Set<AirField>> jetsListSet = new ArrayList<>();
		try {
			FileReader fr = new FileReader("jets.txt");
			BufferedReader br = new BufferedReader(fr);
			String name;
			while ((name = br.readLine()) != null) {
                jetsListSet.add(name);
            }
            br.close();
		
		} catch (FileNotFoundException e) {
            System.err.println("Invalid filename: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Problem while reading: " + e.getMessage());
        }
		
		
		
		return jetsListSet;
	}

}
