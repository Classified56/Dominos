import java.util.ArrayList;

public class Store
	{
		ArrayList<Employee> payRoll = new ArrayList<Employee>();
		ArrayList<String> oven = new ArrayList<String>();
		private String location;
		public Store(String l)
			{
				location = l;
			}
		public ArrayList<String> getOven()
			{
				return oven;
			}
		public void ovenPizza(String p)
			{
				oven.add(p);
			}
		public String getLocation()
			{
				return location;
			}
		public void hireEmployee(Employee e)
			{
				payRoll.add(e);
			}
		public Employee getEmployee(int s)
			{
				return payRoll.get(s);
			}
	}
