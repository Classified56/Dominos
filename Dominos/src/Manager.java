
public class Manager extends Insider
	{

		public Manager(String n, int e, double w)
			{
				name = n;
				experience = e;
				wage = w;
				shift = "All Day";
			}
		public String cutPizza(Store s, Driver d)
			{
				String pizza = s.getOven().get(0);
				s.getOven().remove(0);
				d.deliverPizza(pizza);
				return pizza;
			}
	}
