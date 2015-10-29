
public abstract class Employee
	{
		protected String name;
		protected int experience;
		protected double wage;
		protected String shift;
		
		protected abstract void setShift(String s);
		protected abstract void giveRaise(double w);
		
	}
