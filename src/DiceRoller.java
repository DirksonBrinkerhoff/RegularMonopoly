public class DiceRoller
	{
		
		static boolean doubles;
		public static int direction = 1;
		public static int diceRoll;
		public static int rollDice(int i, int j)
		    {
	    	int dieOne = 0;
	    	int dieTwo = 0;
	    	doubles = false;
			 int sumOfDice = 0;
			 for(int k = 0 ; k < i ; k++)
			    {
			      //roll the dice
				  int diceRollNumber = (int) (Math.random()*j)+1;
				  diceRoll = diceRollNumber * direction;
				  sumOfDice = diceRoll+sumOfDice;
				  System.out.println("You rolled a "+diceRoll);
				  
			      if(k == 0)
			    	  {
			    		  dieOne = diceRoll;
			    	  }
			      else if(k == 1)
			    	  {
			    		  dieTwo = diceRoll;
			    	  }
			    }
			 if(dieOne == dieTwo)
				 {
					doubles = true;
					
					System.out.println("You rolled doubles!");
				 }
			 return sumOfDice;
		
		    }
	}
