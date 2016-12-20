package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot bender = new Robot();
bender.penDown();
bender.setSpeed(255);
for (int i = 0; i < 4; i++) {
bender.move(500);
bender.turn(90);
}
for (int i = 0; i < 4; i++) {
bender.move(400);
bender.turn(90);
}
for (int i = 0; i < 4; i++) {
bender.move(300);
bender.turn(90);
}
for (int i = 0; i < 4; i++) {
bender.move(200);
bender.turn(90);
}
for (int i = 0; i < 4; i++) {
bender.move(100);
bender.turn(90);
}
	}
}
