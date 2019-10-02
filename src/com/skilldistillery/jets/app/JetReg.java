package com.skilldistillery.jets.app;

public class JetReg extends Jet implements BarrelRoll{

	
	public JetReg(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		
	}
	

	@Override
	public void doABarrelRoll() {
		System.out.println("Do a Barrel Roll!" + "\n" + "*Does Unnecessary Barrel Rolls*");
		
	}
	
	
}
