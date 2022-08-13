package game;
import java.util.Scanner;

class Guesser
{
    int guessNum;
	public int guessNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Guesser kindly guess the number betweens(0-100):");
		guessNum=sc.nextInt();
		if(guessNum>=0 &&guessNum<=100) {
			System.out.println("Guesser guess the vaild number");
		}else {
			System.out.println("Guesser guess the invaild number");
		}
		return guessNum;
	}
}

class Player{
	int playerGuessNum;
	public  int guessNumber(){
		Scanner sc  = new Scanner(System.in);
		System.out.println("Player kindly guess the number betweens(0-100):");
		playerGuessNum = sc.nextInt();
		if(playerGuessNum>=0 && playerGuessNum<=100) {
			System.out.println("Guesser guess the vaild number");
		}else {
			System.out.println("Guesser guess the invaild number");
		}
		return playerGuessNum;
	}
	
}

class Umpire{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	int numFromPlayer4;
	int numFromPlayer5;
	
public void collectNumFromGuesser(){
		Guesser g =new Guesser();
		numFromGuesser=g.guessNumber();     //guessing number formguesser
	}

public void collectNumberPlayer(){
	
	Player p1 =new Player();
	Player p2 =new Player();
	Player p3 =new Player();
	Player p4 =new Player();
	Player p5 =new Player();
	numFromPlayer1=p1.guessNumber();
	numFromPlayer2=p2.guessNumber();
	numFromPlayer3=p3.guessNumber();
	numFromPlayer4=p4.guessNumber();
	numFromPlayer5=p5.guessNumber();
}
public void compare()
{
 if(numFromGuesser == numFromPlayer1)         //player1 guess correct number so compare with rest player guess number
	{
		
		if(numFromGuesser == numFromPlayer2 && numFromGuesser ==numFromPlayer3 &&  numFromGuesser ==numFromPlayer4 &&  numFromGuesser ==numFromPlayer5)        //condition for that all player can win
		{
			System.out.println("Game tied all Five Player guessed correctly.");
			System.out.println("Well done Players:)");		
		}
		else if( numFromGuesser ==numFromPlayer3 &&  numFromGuesser ==numFromPlayer4 &&  numFromGuesser ==numFromPlayer5) //player 2 lost The game
		{
			System.out.println("Player1,player3,player4 and Player5 won the game!");
			System.out.println("Well done Players:)");
			System.out.println("Player2 you lost the game, Good Luck & try Again!");
		}
		else if( numFromGuesser == numFromPlayer2 && numFromGuesser ==numFromPlayer4 &&  numFromGuesser ==numFromPlayer5)   //Player3 lost the game
		{
			System.out.println(" Player1,Player2, Player4 and player5 won the game!");
			System.out.println("Well done Players:)");
			System.out.println("Player3 you lost the game, Good Luck & try Again!");
		}
		else if(numFromGuesser == numFromPlayer2 && numFromGuesser ==numFromPlayer3 &&  numFromGuesser ==numFromPlayer5)    //Player4 lost The game
		{
			System.out.println(" Player1,Player2, Player3 and player5 won the game!");
			System.out.println("Well done Players:)");
			System.out.println("Player4 you lost the game, Good Luck & try Again!");
		}
		
		else if(numFromGuesser == numFromPlayer2 && numFromGuesser ==numFromPlayer3 &&  numFromGuesser ==numFromPlayer4)    //Player5 lost The game
		{
			System.out.println(" Player1,Player2, Player3 and player4 won the game!");
			System.out.println("Well done Players:)");
			System.out.println("Player5 you lost the game, Good Luck & try Again!");
		}else {
			System.out.println("Player1 won the game!");
			System.out.println("Well done Player:)");
			System.out.println("Player2,Player3,Player4 and Player5 you all lost the game, Good Luck & try Again!");
		}
     }
  else if(numFromGuesser == numFromPlayer2)                     //player2 guess correct number so compare with rest player guess number
	{
	 if(numFromGuesser ==numFromPlayer3 &&  numFromGuesser ==numFromPlayer4 &&  numFromGuesser ==numFromPlayer5)
	 {
		 System.out.println("Player2,Player3,Player4 and Player5 won the game!");
		 System.out.println("Well done Players:)");
		 System.out.println("Player1 you lost the game, Good Luck & try Again!");
	 }
	 else if(numFromGuesser ==numFromPlayer4 &&  numFromGuesser ==numFromPlayer5)
	 {
		 System.out.println("Player2,Player4 and Player5 won the game!");
		 System.out.println("Well done Players:)");
		 System.out.println("Player1 and Player3 you both lost the game, Good Luck & try Again!");
	}
	else if(numFromGuesser ==numFromPlayer3 &&  numFromGuesser ==numFromPlayer4)
	{
		System.out.println("Player2,Player3 and Player4 won the game!");
		System.out.println("Well done Players:)");
		System.out.println("Player1 and Player5 you both lost the game, Good Luck & try Again!");
	}
	else if(numFromGuesser ==numFromPlayer3 &&  numFromGuesser ==numFromPlayer5)
	{
		System.out.println("Player2,Player3 and Player5 won the game!");
		System.out.println("Well done Players:)");
		System.out.println("Player1 and Player4 you both lost the game, Good Luck & try Again!");
	}
	else 
	{
		System.out.println("Player2 won the game!");
		System.out.println("Well done Player:)");
		System.out.println("Player1, Player3,Player4 and Player5 you all lost the game, Good Luck & try Again!");
	}
}
	 else if(numFromGuesser == numFromPlayer3)         //player3 guess correct number so compare with rest player guess number
	{
	 if(numFromGuesser ==numFromPlayer4 &&  numFromGuesser ==numFromPlayer5)
	{
		System.out.println("Player3,Player4 and Player5 won the game!");
	   	System.out.println("Well done Players:)");
		System.out.println("Player1, Player2 you both lost the game, Good Luck & try Again!");
     }
	 else if(numFromGuesser ==numFromPlayer4)
	 {
	    System.out.println("Player3,Player4 won the game!");
	    System.out.println("Well done Players:)");
		System.out.println("Player1, Player2 and Player5 you all lost the game, Good Luck & try Again!");
	 }
	 else if(numFromGuesser ==numFromPlayer5)
	 {
		 System.out.println("Player3,Player5 won the game!");
		 System.out.println("Well done Players:)");
		 System.out.println("Player1, Player2 and Player4 you all lost the game, Good Luck & try Again!");
		 
	 }
	 else 
	 {
		 System.out.println("Player3 you won the game!");
		 System.out.println("Well done Player:)");
		 System.out.println("Player1, Player2,Player4 and Player5 you all lost the game, Good Luck & try Again!");
	 }
  }
	 else if(numFromGuesser == numFromPlayer4)       //player4 guess correct number so compare with rest player guess number
	 {
	 if(numFromGuesser == numFromPlayer5)
	 {
		 System.out.println("Player4 and Player5 you both won the game!");
		 System.out.println("Well done Players:)");
		 System.out.println("Player1, Player2 and Player3 you all lost the game, Good Luck & try Again!");	 
	 }
	 else
	 {
		 System.out.println("Player4 you won the game!");
		 System.out.println("Well done Player:)");
		 System.out.println("Player1, Player2,Player3 and PLayer5 you all lost the game, Good Luck & try Again!");
	 }
  }
	 else if(numFromGuesser == numFromPlayer5)         //At last player5 won no one player is left!
	 {
		 System.out.println("Player5 you won the game!");
		 System.out.println("Well done Player:)");
		 System.out.println("Player1, Player2,Player3 and PLayer4 you all lost the game, Good Luck & try Again!");
	 }
	 else {
		 System.out.println("No one won because Guesser guess invaild number!");
		 System.out.println("Guesser Kindly guess the number within the Range");
	 }
}
}

public class LaunchGuesserGame {

	public static void main(String[] args) {

		Umpire u  = new Umpire();
     	u.collectNumFromGuesser();
    	u.collectNumberPlayer();
    	u.compare();
  	}
}


