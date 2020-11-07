package GuessTheInteger;
import java.util.*;
public class GuessTheInterger {

	public static void main(String[] args) {
		System.out.println("Welcome to GuessTheInteger Game: ");
		System.out.println();
		System.out.println("Instructions: ");
		System.out.println("You have to guess one number in between 0-19 (both inclusive).");
		System.out.println("points is awarded on the basis of how close your guess is to the correct output. ");
		System.out.println();
		System.out.println("Simple error calculation method is used to award. ");
		Random rand=new Random();
		Scanner sc=new Scanner(System.in);
		double Counter1=0.00,Counter2=0.00;
		String player1="",player2="";
		System.out.println("Player1 enter your name: ");
		player1=sc.nextLine();
		System.out.println("Welcome to the game "+player1+".");
		System.out.println("Player2 enter your name: ");
		player2=sc.nextLine();
		System.out.println("Welcome to the game "+player2+".");
		//System.out.println("Game is being started....");
		boolean toss=rand.nextBoolean();
		int counter=0;
		if(toss==true){
			System.out.println(player1+" won the toss.Enter 0 to start the game:");
			int a=sc.nextInt();
			counter=1;
		}else{
			System.out.println(player2+" won the toss. Enter 0 to start the game:");
			int a=sc.nextInt();
			counter=2;
		}
		double db=100.00;
		while(Counter1<=db&&Counter2<=db){
			int num=rand.nextInt(20);
			if(counter%2==1){
				System.out.println(player1+" Guess a number [0-19]:");
				int p1=sc.nextInt();
				if(p1>19){
					System.out.println("You must enter number between [0-19]. Your chance is over.");
				}else{
				double actual=(double)(20-Math.abs(p1-num));
				actual/=2;
				double award=(double)(((actual)*Math.exp(actual))/((actual)*Math.exp(10)));
			    double score=(double)(award*actual);
			    score*=100;
			     score=(int)score;
				score/=100;
				Counter1+=score;
				System.out.println(player1+" your score in this round: ");
				System.out.println();
				System.out.println("Guessed "+" ActualNumer "+" Points");
				System.out.println(p1+"             "+num+"        "+score);}
				
				counter+=1;
			}else{
				System.out.println(player2+" Guess a number [0-19]:");
				int p2=sc.nextInt();
				if(p2>19){
					System.out.println("You must enter number between [0-19]. Your chance is over.");
				}else{
				double actual=(double)(20-Math.abs(p2-num));
				actual/=2;
				double award=(double)(((actual)*Math.exp(actual))/((actual)*Math.exp(10)));
				double score=(award*actual);
				score*=100;
				score=(int)score;
				score/=100;
				Counter2+=score;
				System.out.println();
				System.out.println("Guessed "+" ActualNumer "+" Points");
				System.out.println(p2+"           "+num+"         "+score);}
				counter+=1;
			}
			Counter1*=100;
			Counter1=(int)Counter1;
			Counter1/=100;
			
			Counter2*=100;
			Counter2=(int)Counter2;
			Counter2/=100;
			System.out.println("Updates: ");
			System.out.println(player1+ "  "+ player2);
			System.out.println(Counter1+ "     "+ Counter2);
		}
		double d=100;
		if(Counter1>=d&&Counter2>=d){
			System.out.println("Draw!!");
		}else if (Counter1>=d){
			System.out.println("Wow!! "+player1+" won!!");
		}else if(Counter2>=d){
			System.out.println("Wow!! "+player2+" won!!");
		}
		

	}

}
