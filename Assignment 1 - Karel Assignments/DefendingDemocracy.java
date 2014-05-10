/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class DefendingDemocracy extends SuperKarel {

	// You fill in this part
	
	public void run() {
		looponrectangles();
		}

	private void looponrectangles(){
		while (frontIsClear()) {
			move();
			clearBeepersToRight();
			clearBeepersToLeft();
			clearBeepers();
			putBeeper();
			move();
		}
	}

	private void clearBeepersToRight(){
		turnRight();
		move();
		clearBeepers();
		turnAround();
		move();
		turnRight();
	}
	
	private void clearBeepersToLeft(){
		turnLeft();
		move();
		clearBeepers();
		turnAround();
		move();
		turnLeft();
	}
	
	private void clearBeepers(){
		while (beepersPresent()){
			pickBeeper();
		}
		}
	}