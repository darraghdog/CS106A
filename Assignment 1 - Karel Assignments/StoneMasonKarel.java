/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {
	
	public void run() {
		buildWall();
		while (frontIsClear()) {
			moveColumns();
			buildWall();
		}
	}

	private void buildWall(){
		for (int i=0 ; i < 2 ; i++){	
			turnLeft();
			while (frontIsClear()) {
				if (noBeepersPresent()) {
					putBeeper();
					}
				move();
			}
			turnLeft();
		}
	}
	
	private void moveColumns(){
		for (int i=0 ; i < 4 ; i++){	
			if (frontIsClear()) {
				move();			
			}
		}
	}

}
