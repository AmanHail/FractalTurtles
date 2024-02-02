import java.awt.Color;

import edu.gatech.mediaprogramming.Turtle;

public class CoastTurtle extends Turtle{
	
	public void drawKochCurve(int depth, double length) {
		if (depth == 0) {
			forward(length);
			
		}
		else {
			drawKochCurve(depth-1, length/3);
			turn(-60);
			drawKochCurve(depth-1, length/3);
			turn(120);
			drawKochCurve(depth-1, length/3);
			turn(-60);
			drawKochCurve(depth-1, length/3);

		}
	}
	

	public void drawKochCurveTriangle(int depth, double length) {
		for(int i = 0; i < 4; i++) {
			if (depth == 0) {
				forward(length);
			
			}
			else {
				drawKochCurve(depth-1, length/3);
				turn(-60);
				drawKochCurve(depth-1, length/3);
				turn(120);
				drawKochCurve(depth-1, length/3);
				turn(-60);
				drawKochCurve(depth-1, length/3);
			}
		turn(90);
		}
	}
	
	public void drawHeartbeat(int depth, double length) {
		if (depth == 1) {
			forward(length/4);
			turn(-75);
			forward(length/2);
			turn(150);
			forward(length);
			turn(-150);
			forward(length/2);
			turn(75);
			forward(length/4);
		}
		else {
			
			drawHeartbeat(depth-1, length/4);
			drawHeartbeat(depth-1, length/2);
			drawHeartbeat(depth-1, length/4);
		}
	}
	
	public void kochSnowflake(int depth, double length) {
		if (depth==1) {
			turn(-60);
			forward(length);
			turn(120);
			forward(length);
			turn(-60);
			penUp();
			backward(length);
		}
		else {
			turn(-60);
			for (int i = 0; i<2; i++) {
				forward(length/3);
				kochSnowflake(depth-1, length/3);
				penUp();
				forward(length/3);
				penDown();
				forward(length/3);
				turn(120);
			}
			penUp();
			forward(length);
			turn(180);
			penDown();
		}
	}
	public void snowflake(int depth, double length) {
		if (depth==1) {
			for (int i = 0; i<3; i++) {
				forward(length);
				turn(-120);
			}
		}
		else {
			for(int i = 0; i<3; i++) {
				forward(length/3);
				turn(60);
				snowflake(depth-1, length/3);
				turn(-60);
				penUp();
				forward(length/3);
				penDown();
				forward(length/3);
				turn(-120);
			}
		}
	}
		
	public static void main(String[] args) {
		System.out.println("Hello");
		CoastTurtle t = new CoastTurtle();
		t.penUp();
		t.moveTo(150, 400);
		t.setColor(Color.black);
		t.penDown();
		t.turn(90);
		t.snowflake(5, 200);
		
	}
}
