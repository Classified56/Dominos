
public class WorkDay
	{
		private static Store fun;
		public static void main(String[] args)
			{
				fun = new Store("Littleton");
				hireEmployees();
				for(int i = 0; i < 20; i++)
					{
						for(int j = 3; j <= 6; j++)
							((CSR)fun.getEmployee(j)).makePizza();
						System.out.println();
					}
			}
		public static void hireEmployees()
			{
				fun.hireEmployee(new Manager("Fred", 5, 20.2));
				fun.hireEmployee(new Manager("Alicia", 3, 15.8));
				fun.hireEmployee(new Manager("Skylar", 3, 15.8));
				fun.hireEmployee(new CSR("Davis", 0, 8.78));
				fun.hireEmployee(new CSR("Ali", 2, 8.78));
				fun.hireEmployee(new CSR("Ben", 1, 8.78));
				fun.hireEmployee(new CSR("Raynnie", 0, 8.78));
				fun.hireEmployee(new Driver("Joe", 0, 8.78));
				fun.hireEmployee(new Driver("Keith", 0, 8.78));
				fun.hireEmployee(new Driver("Barbara", 0, 8.78));
				fun.hireEmployee(new Driver("Annie", 0, 8.78));
				fun.hireEmployee(new Driver("Harry", 0, 8.78));
			}

	}
