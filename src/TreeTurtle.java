import java.awt.Color;

import edu.gatech.mediaprogramming.Turtle;

public class TreeTurtle extends Turtle{
	
	public void drawTree(int depth, double distance) {
		if (depth==1) { //Base Case
			forward(distance);		
			backward(distance); //return to base
		}
		else {
			forward(distance); //draw trunk
			turn(45);
			drawTree(depth-1, distance * 0.5);
			turn(-90);
			drawTree(depth-1, distance * 0.5);	
			turn(45);
			backward(distance);
		}
	}
	
	public void drawBranched(int depth, double distance) {
		if (depth == 1) {
			forward(distance);
			backward(distance);
		}
		else {
			forward(distance/4);
			turn(30);
			drawBranched(depth-1, distance/3);
			turn(-30);
			forward(distance/4);
			turn(-30);
			drawBranched(depth-1, distance/3);
			turn(30);
			forward(distance/4);
			turn(30);
			drawBranched(depth-1, distance/3);
			turn(-30);
			forward(distance/4);
			backward(distance);
		}
	}
	
	public void drawUneven(int depth, double distance) {
		if (depth==1) { //Base Case
			
			forward(distance);		
			backward(distance); //return to base
		}
		else {
			if (depth<4) {
				setColor(Color.green);
				setPenWidth(2);
				
			}
			forward(distance); //draw trunk
			turn(70);
			drawUneven(depth-1, distance * 0.75);
			turn(-100);
			drawUneven(depth-1, distance * 0.5);	
			turn(30);
			backward(distance);
			setColor(Color.black);
			setPenWidth(1);
		}
	}
	
	public void drawRandom(int depth, double distance) {
		if (depth==1) { //Base Case
			forward(distance);		
			backward(distance); //return to base
		}
		else {
			int random = 45 + (int) (Math.random()* 90);
			int random2 = (int) ((distance/2) + (Math.random() * distance * 2));
			forward(random2); //draw trunk
			turn(random);
			drawTree(depth-1, distance * 0.5);
			turn(-random-random);
			drawTree(depth-1, distance * 0.5);	
			turn(random);
			backward(random2);
		}
	}
	
	public static void main(String[] args) {
		TreeTurtle t = new TreeTurtle();
		t.penUp();
		t.moveTo(350, 550);
		t.setColor(Color.black);
		t.penDown();
		t.drawUneven(13, 200);
	}
}
