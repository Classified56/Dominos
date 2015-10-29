
public class Driver extends Employee
	{

		public Driver(String n, int e, double w)
			{
				name = n;
				experience = e;
				wage = w;
				shift = "Dinner";
			}
		public void setShift(String s)
			{
				shift = s;
			}
		public void giveRaise(double w)
			{
				wage = w;
			}
		public void deliverPizza(String s)
			{
				System.out.println(name + " delivered the " + s);
			}

	}
