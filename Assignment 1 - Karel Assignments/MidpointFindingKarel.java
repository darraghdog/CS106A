/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * When you finish writing it, the MidpointFindingKarel class should
 * leave a beeper on the corner closest to the center of 1st Street
 * (or either of the two central corners if 1st Street has an even
 * number of corners).  Karel can put down additional beepers as it
 * looks for the midpoint, but must pick them up again before it
 * stops.  The world may be of any size, but you are allowed to
 * assume that it is at least as tall as it is wide.
 */

import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {

	// You fill in this part
	
	public void run() {
		fillBeepersInsideRow();
		turnAndMove();
		takeOffEndBeepers();
		turnUpright();
		putBeeper();		
	}

	// if there is a beeper there, pick it up and move to the other side.
	// if not we have exhausted all beepers and are in the middle.
	private void takeOffEndBeepers(){
		while (beepersPresent()) {
			pickBeeper();
			goToEnd();
			}
		}
	
	
	// Now we are in the middle, but we may be upside down. Therefore if we are facing west we should around.
	private void turnUpright(){
		if (facingWest()){
			turnLeft();
			turnLeft();
			}
		
		}
	
	// Place a bed of beepers over the bottom row. 
	private void fillBeepersInsideRow(){
			while (frontIsClear()){
				move();
				if (frontIsClear()){
					putBeeper();
				}
			}
	}
	
	// We are in a position with no beeper, either at the center or facing the center.
	// Move one closer to the center
	// If there is a beeper there, move to the other side of the beepers, and turn and move one back.
	private void goToEnd(){
		move();
			while (beepersPresent()) {
				move();
			}
			turnAndMove();
	}

	// Turn around and move one position to check; 
	// either onto a beeper or not - to be checked in next steps
	private void turnAndMove(){
			turnLeft();
			turnLeft();
			move();
		}
	
}
