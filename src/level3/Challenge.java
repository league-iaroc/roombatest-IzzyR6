package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
		driveDirect(300,300);
		sleep(4000);
		driveDirect(0,60);
		sleep(4000);
		driveDirect(300,300);
		sleep(4000);
		driveDirect(60,0);
		sleep(4000);
		driveDirect(300,300);
		sleep(2500);
		driveDirect(0,60);
		sleep(3000);
		driveDirect(300,300);
	
	}

	public void loop() {
	
	}
}
