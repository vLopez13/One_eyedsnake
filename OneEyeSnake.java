/**
OneEyeSnake.java --- dice rolling game, first to 30 wins, lose turn if user/computer rolls a double
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

//Main Class
import java.util.Scanner;

//Main Class
public class OneEyeSnake extends PairOfDice
{
	public static void main(String[]args)
	{
		int currHuman = 0;    //current points they each have 
		int currComp = 0;
      
		boolean resume_game = true;
        //boolean true = human,  false = comp
      
		PairOfDice userdie = new PairOfDice();
		PairOfDice compdie = new PairOfDice();
      
		int compTotal = 0;      //Total displays the points on the top
		int userTotal = 0;
      
      
		Scanner sc = new Scanner(System.in);
      
      
    while(userTotal <= 50 && compTotal <= 50){
		  
			System.out.println("Current Status:" + 
							"\n\tComputer:" + compTotal + 
							"\n\tYou:" + userTotal);

			//human turn
		  if(resume_game == true && currHuman <= 50)   
		   { 
                     userdie.roll();  //roll the dice and gets generated
           
                     if (userdie.roll_double() == true){
      
                        System.out.println("Die 1: " + userdie.getDie1FaceValue() + "\tDie2: " + userdie.getDie2FaceValue());
			System.out.println("Busted! You got a double!");
			resume_game = false; 
                        System.out.println("Human player lost its turn.");
           
                      }
                    else {
            	     currHuman = 0 + userdie.getTotalFaceValue();
		     userTotal = userTotal + currHuman;
         	     System.out.println("Human's Potential Total: " + currHuman);
           
         	     System.out.println("Would you like to roll again (y/n)?");//keeps rolling their turn
			char input = sc.next().charAt(0);
 
			   if (input == 'n')     //if said no 
			   {
				 resume_game = false;    //goes to computer turn 
				 // System.out.println(currHuman);
            	           }
            	 	     else 
            			resume_game = true;
             
          			}   

        } //end in human's part
        
    		if (resume_game == false && currComp <= 50){
              
				 compdie.roll(); //computers turn
               
                 
				if (compdie.roll_double() == true)
            { System.out.println("Die 1: " + compdie.getDie1FaceValue() + "\tDie2: " + compdie.getDie2FaceValue());
				  System.out.println("Busted! You got a double!");
				  resume_game = true; 
              System.out.println("Computer player lost its turn.");
            } 
            
            else {
            currComp = 0 + compdie.getTotalFaceValue();
            compTotal = compTotal + currComp;
            System.out.println("Comp's Potential Total: " + currComp);
            resume_game = false;
            
            
            
             if (compTotal == 50){  
             System.out.println("The computer has won. Congratulations!"); 
             }   
            }      
     } //end of comp's part
   }//end of while
   
   
   if (compTotal == 50){                 
      System.out.println("Congratulations, the 1st player with a total of 50 has won");
      System.out.println("Current Status:" + 
							"\n\tComputer:" + compTotal + 
							"\n\tYou:" + userTotal);

    }
   else {
    System.out.println("Congratulations, the 1st player with a total of 50 has won");
    System.out.println("Current Status:" + 
							"\n\tComputer:" + compTotal + 
							"\n\tYou:" + userTotal);
                     
       }
       
    
       
 
   
   
   

 }//end main     


}//end class
