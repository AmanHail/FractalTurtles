import java.awt.Color;

import edu.gatech.mediaprogramming.Turtle;

public class GasketTurtle extends Turtle{

	public void drawSTriangle(int depth, double distance) {
		if (depth == 1) {
			for (int i = 0; i<3; i++) {
				forward(distance);
				turn(-120);
			}
		}
		else {
			drawSTriangle(depth-1, distance/2); //draw 1st triangle
			penUp();
			forward(distance/2); //move to pos of next triangle
			penDown();
			drawSTriangle(depth-1, distance/2); //draw 2nd triangle
			penUp();
			turn(-120); //orient to next triangle
			forward(distance/2); //move to pos of next triangle
			turn(120); //reorient
			penDown();
			drawSTriangle(depth-1, distance/2); //draw 3rd triangle
			penUp();
			turn(120); //orient to start
			forward(distance/2); //move to start
			turn(-120); //reorient

		}
	}

	public void drawRTriangle(int depth, double distance) {
		if (depth == 1) {
			forward(distance);
			turn(-135);
			forward(Math.sqrt((distance*distance)* 2));
			turn(-135);
			forward(distance);
			turn(-90);
		}
		else {
			drawRTriangle(depth-1, distance/2);
			penUp();
			forward(distance/2);
			penDown();
			drawRTriangle(depth-1, distance/2);
			penUp();
			turn(-135);
			forward(Math.sqrt((distance/2*distance/2)* 2));
			turn(135);
			penDown();
			drawRTriangle(depth-1, distance/2);
			penUp();
			turn(90);
			forward(distance/2);
			turn(-90);
		}
	}
	
	public void drawTriangle(int depth, double size) {
		if (depth==1) {
			for(int i = 0;i<3; i++) {
				forward(size);
				turn(-120);
			}
		}
		else { 
			drawTriangle(depth-1, size/2);
			turn(-60);
			forward(size);
			turn(-120);
//			forward(size/2);
//			turn(-120);
//			
//			turn(30);
//			drawTriangle(depth-1, size/2);
//			turn(-30);
//			forward(size/2);
//			turn(-150);
//			drawTriangle(depth-1, size/2);
//			turn(-60);
			
		}
	}
	
	public void tictactoe(int depth, double size) {
		if (depth == 1) {
			forward(size);
			penUp();
			backward(3 * size/4);
			turn(-90);
			penDown();
			forward(size/4);
			backward(size);
			penUp();
			forward(size/4);
			turn(-90);
			penDown();
			forward(size/4);
			backward(size);
			penUp();
			forward(size/4);
			turn(90);
			penDown();
			backward(size/4);
			forward(size);
			penUp();
			backward(size/4);
			turn(-90);
			penDown();
			forward(3*size/4);
			turn(180);
			penUp();
		}
		else {
			penDown();
			tictactoe(1, size);
			turn(-90);
			forward(size/12);
			penDown();
			tictactoe(depth-1, size/4);
			turn(90);
			forward(size/4 + size/8);
			turn(90);
			forward(size/4);
			turn(-90);
			penDown();
			tictactoe(depth-1, size/4);
			forward(size/2-size/16);
			turn(90);
			forward(size/2-size/16);
			turn(-90);
			penDown();
			tictactoe(depth-1, size/4);
			backward(size/2+size/4+size/16);
			turn(-90);
			forward(10* size/16 - 5*size/256);
			turn(90);
		}
	}

	public static void main(String[] args) {
		System.out.println("Hello");
		GasketTurtle t = new GasketTurtle();
		t.penUp();
		t.moveTo(200, 300);
		t.setColor(Color.black);
		t.penDown();
		t.turn(90);
		t.tictactoe(4, 300);
		
	


	}
}
