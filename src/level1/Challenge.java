package level1;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level1.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * Without touching the wall reach the endZone
	 * use sleep an driveDirect 
	 */
	public void initialize() {
		//write code here!
		driveDirect(100,100);
		sleep(9000);
		driveDirect(0,75);
		sleep(5000);
		driveDirect(100,100);
		sleep(40000);
		driveDirect(0,75);
		sleep(5000);
		driveDirect(100,100);
		
		
	}

	public void loop() {
	
	}
}
