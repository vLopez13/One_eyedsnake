//get die class and place more comments 
//import die.java; connect with die.java
//PairOfDice class
class PairOfDice extends Die
{
	//variable declaration
   
	private Die die1, die2;
	//constructor
	public PairOfDice()
	{
		Die die1 = new Die();
		Die die2 = new Die();
	}

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