/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	// You fill in this part
	
	public void run() {
		placeBeebers();
		turnUpCorrectDirection();
		while (frontIsClear()){
			takeATurn();
			placeBeebers();
			turnUpCorrectDirection();
		}
	}

	private void turnUpCorrectDirection(){
		if (facingEast()){
			turnLeft();
		} else {
			turnRight();
		}
	}

	private void takeATurn(){
		if (beepersPresent()){
			turnOnBeeper();
		} else {
			turnOnEmpty();
		}
	}

	private void turnOnBeeper(){
		move();
		if (leftIsClear()){
			turnLeft();
			move();
		} else {
			turnRight();
			move();
		}
	}

	
	private void turnOnEmpty(){
	move();
		if (leftIsClear()){
			turnLeft();
		} else {
			turnRight();
		}
	}
	
	private void placeBeebers(){
		putBeeper();
		while (frontIsClear()){
			move();
			if (frontIsClear()){
				move();
				putBeeper();
			}
		}
	}
			
}
