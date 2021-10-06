package com.Assign4.SnakeAndLadder.BridgeLabz;
public class UC5_ExactWinningPositionHundred {
	public static final int WINNING_POSITION = 100;
	public static final int IS_LADDER = 1;
	public static final int IS_SNAKE = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startPosition = 0;
        System.out.println("Player staring position is : " + startPosition);
        int position = 0;
        while (position < WINNING_POSITION) {
        	int diceNumber = (int) Math.floor(Math.random() * 10) % 6 + 1;
        	System.out.println("diceNumber is : " + diceNumber);
        	int option = (int) Math.floor(Math.random() * 10) % 2;
            System.out.println("selected player option : " + option);
            if (option == IS_SNAKE) {
            	System.out.println("Snake for the Player");
            	if(position - diceNumber > 0){
            		position = position - diceNumber;
                    System.out.println("Position for the Player after the snake : " + position);
                }
            }
            else if (option == IS_LADDER) {
            	System.out.println("Ladder for the Player");
            	if (position + diceNumber <= 100) {
            		position = position + diceNumber;
            		System.out.println("Position for the Player after the snake : " + position);
                 }

            }
        }

	}

}
