/**
OneEyeSnake.java --- dice rolling game, first to 30 wins, lose turn if user/computer rolls 1
@author Ziqing Zhang, Joseph Kois, Vanessa Lopez.
@version 1.0
@since 2019-03-12

---Algorithm---
1. displays the current status of the game
2. dice is rolled
3. decide whether or not user wants to roll again or hold 
4. if user rolls a 1 then loses turn
5. rolls until score = 30 then game is over
**/

import java.util.Scanner;

//Main Class
public class OneEyeSnake
{
	public static void main(String[]args)
	{
		int currentHuman = 0;
		int currentComp = 0;
		boolean resume = true;
		PairOfDice userdie = new PairOfDice();
		PairOfDice compdie = new PairOfDice();
		int compTotal = 0;
		int usrTotal = 0;
		Scanner sc = new Scanner(System.in);

		while(currentHuman < 30 && currentComp < 30)
		{
			System.out.println("Current Status:" + 
							"\n\tComputer:" + compTotal + 
							"\n\tYou:" + usrTotal);

			//human turn
			while(resume == true)
			{
				userdie.roll();
				if(userdie.getDie1FaceValue() == 1 || userdie.getDie2FaceValue() == 1)
				{
					System.out.println("Die 1: " + userdie.getDie1FaceValue() + "\tDie2: " + userdie.getDie2FaceValue());
					System.out.println("Busted!!!");
					resume = false;
				}
				else
					currentHuman = currentHuman + userdie.getTotalFaceValue();
					System.out.println("Round Total: " + currentHuman);
					System.out.println("Potential Total: " + currentHuman);
					usrTotal = usrTotal + currentHuman;
					System.out.println("Would you like to roll again (y/n)?");
					char input = sc.next().charAt(0);
					if (input == 'n')
					{
						resume = false;
						System.out.println(currentHuman);

					}
					else
						resume = true;

			}
			while(resume == false)
			{
				compdie.roll();
				if(compdie.getDie1FaceValue() == 1 || compdie.getDie2FaceValue() == 1)
				{
					System.out.println("Die 1: " + compdie.getDie1FaceValue() + "\tDie2: " + compdie.getDie2FaceValue());
					System.out.println("Busted!!!");
					compTotal = 0;
					resume = true;
				}
				else if(compTotal < 20)
				{
					System.out.println("Die 1: " + compdie.getDie1FaceValue() + "\tDie2: " + compdie.getDie2FaceValue());
					currentComp = currentComp + compdie.getTotalFaceValue();
					System.out.println("Round Total: " + currentComp);
					System.out.println("Potential Total: " + currentComp);
					compTotal = compTotal + currentComp;	
				}
				else
					resume = true;

			}
		}
		System.out.println("Congratulations!!!");
	}
}