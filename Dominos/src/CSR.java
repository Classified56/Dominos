
public class CSR extends Insider
	{
		public CSR(String n, int e, double w)
			{
				name = n;
				experience = e;
				wage = w;
				shift = "Dinner";
			}
		public String makePizza()
			{
				int random = (int)(Math.random() * 8);
				String pizza;
				switch(random)
				{
					case 0:
						pizza = "Hawaiian";
						break;
					case 1:
						pizza = "Wisconson 6 Cheese";
						break;
					case 2:
						pizza = "Ultimate Pepperoni";
						break;
					case 3:
						pizza = "Deluxe";
						break;
					case 4:
						pizza = "Hamburger";
						break;
					case 5:
						pizza = "America's Favorite";
						break;
					case 6:
						pizza = "Spinach Feta";
						break;
					case 7:
						pizza = "Philly Cheese Steak";
						break;
					default:
						pizza = "Cheese";
						break;
				}
				System.out.println(name + " made a " + pizza + " pizza. It is now in the oven");
				return pizza;
			}
	}
