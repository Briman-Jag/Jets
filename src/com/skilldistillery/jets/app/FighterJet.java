package com.skilldistillery.jets.app;

public class FighterJet extends Jet implements CombatReady, BarrelRoll{

	
	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		
	}
	
	public void fight() {
		System.out.println("Weapons initialized and targeting computer turned on.");
	}

	@Override
	public void doABarrelRoll() {
		System.out.println("Do a Barrel Roll!" + "\n" + "*Barrel Rolls*");
		
	}


}
