
public class Player
	{
		private String name;
		private int location;
		private boolean inJail;
		private int balance;
		private String inventory;
		private boolean cwDirection;
		
		public Player(String n, int l, boolean in, int b, String inv, boolean cw)
			{
				name = n;
				location = l;
				inJail = in;
				balance = b;
				inventory = inv;
				cwDirection = cw;
		
			}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public int getLocation()
			{
				return location;
			}

		public void setLocation(int location)
			{
				this.location = location;
			}

		public boolean isInJail()
			{
				return inJail;
			}

		public void setInJail(boolean inJail)
			{
				this.inJail = inJail;
			}

		public int getBalance()
			{
				return balance;
			}

		public void setBalance(int balance)
			{
				this.balance = balance;
			}

		public String getInventory()
			{
				return inventory;
			}

		public void setInventory(String inventory)
			{
				this.inventory = inventory;
			}

		public boolean isCwDirection()
			{
				return cwDirection;
			}

		public void setCwDirection(boolean cwDirection)
			{
				this.cwDirection = cwDirection;
			}
	}