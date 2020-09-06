//get die class and place more comments 
//import die.java; connect with die.java
//PairOfDice class
class PairOfDice 
{  
	
	//constructor
	
		Die die1 = new Die();
		Die die2 = new Die();
	

	//Rolling two dice
	public int roll()
	{
		return die1.roll() + die2.roll();
	}

	//Retrieving face value
	public int getTotalFaceValue()
	{
		return die1.getFaceValue() + die2.getFaceValue();
	}
	public boolean roll_double()
        { if(die0.getFaceValue() == 1 && die1.getFaceValue()==1)
           return true;
     
          if(die0.getFaceValue() == 2 && die1.getFaceValue()==2) 
           return true;
     
          if(die0.getFaceValue() == 3 && die1.getFaceValue()==3)
          return true;
	 
         if(die0.getFaceValue() == 4 && die1.getFaceValue()==4)
          return true;
	 
         if(die0.getFaceValue() == 5 && die1.getFaceValue()==5)
         return true;
	 
         if(die0.getFaceValue() == 6 && die1.getFaceValue()==6)
          return true;
	 
        else{
     
         return false;
      }
   }

	//updating the value of die1
	public void setDie1FaceValue(int value)
	{
		die1.setFaceValue(value);
	}

	//updating the face value of die2
	public void setDie2FaceValue(int value)
	{
		die2.setFaceValue(value);
	}

	//Retrieving the face value of die1
	public int getDie1FaceValue()
	{
		return die1.getFaceValue();
	}

	//Retrieving the face value of die2
	public int getDie2FaceValue()
	{
		return die2.getFaceValue();
	}

	//Display the strings
	public String toString()
	{
		return "Die 1: " + die1.getFaceValue() + " Die 2: " + die2.getFaceValue();
	}
}
