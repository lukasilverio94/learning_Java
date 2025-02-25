package rock_paper_scissors2;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose: [rock, paper or scissors]");
		String playerMove = sc.next();
		
		// get random choose from computer
		Random random = new Random();
		int randomNumber = random.nextInt(3);
		
		String computerMove;
		if (randomNumber == 0) {
			computerMove = "rock";
		} else if(randomNumber == 1) {
			computerMove = "paper";
		} else {
			computerMove = "scissors";
		}
		
		System.out.println("Computer chose: " + computerMove + "!");
		
		// print results
		if(playerMove.equals(computerMove)) {
			System.out.println("Its a draw!");
		} else if(playerWins(playerMove, computerMove)) {
			System.out.println("Player wins!");
		} else {
			System.out.println("Computer wins!");
		}
		
		sc.close();
	}
	
	static boolean playerWins(String playerMove, String computerMove) {
		if(playerMove.equals("rock")) {
			return computerMove.equals("scissors");
		} else if(playerMove.equals("paper")) {
			return computerMove.equals("rock");
		} else {
			return computerMove.equals("paper");
		}
	}

}
