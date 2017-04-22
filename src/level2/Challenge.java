package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level2.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		Sonar sonar = new Sonar(roomba);
	}

	public void initialize() {
		driveDirect(100,100);
		sleep(15000);
		driveDirect(0,55);
		sleep(5000);
		driveDirect(100,100);
		sleep(25000);
		driveDirect(50,0);
		sleep(5000);
		driveDirect(100,100);

	}

	public void loop() {
	
	}
}
