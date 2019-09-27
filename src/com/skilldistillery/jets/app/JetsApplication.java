package com.skilldistillery.jets.app;
import java.io.File;
import java.util.List;
import java.util.Scanner;

public class JetsApplication {

	AirField airField = new AirField();
	Scanner kb = new Scanner(System.in);
	
	
	public JetsApplication() {
		
	}
	
	public static void main(String[] args) {
		File j = new File("jets.txt");
		
		System.out.println("Welcome to the Jets Application where you are in control"
				+ " of aircraft worth millions and millions of dollars! No Pressure!");
		
		
//		launch();
		
	}
	
	public void launch() {
		// Jets already in airfield
		Jet j1 = new FighterJet("F-15E Strike Eagle", 1875.0 , 2992, 31_001_000);
		Jet j2 = new FighterJet("A-10 Warthog", 2240 , 2578, 31_001_000);
		Jet j3 = new CargoPlane("C-5M Super Galaxy", 518 , 8056, 100_037_000);
		Jet j4 = new CargoPlane("C-130 Hercules", 336 , 2360, 30_001_000);
		Jet j5 = new JetReg("Cessna Citation XLS", 498 , 1961, 13_700_000);
		
		List<AirField> jetsList = null;
		
		
				
				
				
	}
	
	public void displayUserMenu() {
		
		
		System.out.println("");
		
	}
	
	
}
