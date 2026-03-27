import java.util.Scanner;
public class region
{
	private String name ;
	private int area;
	region()
	{
		
	}
	 

	
	region(String name , int area)
	{
		this.name = name;
		this.area = area;
	}
	String getname()
	{
		return name;
	}
	int getarea()
	{
		return area;
	}
}
class city extends region
{
	private int population;
	private int count_of_town;
	private int destiny;
	
	city(String name , int area ,int population , int count_of_town)
	{	
		super(name,area);
			this.population = population;
			this.count_of_town = count_of_town;
	}
			
		int calc ()
		{
				destiny = population / getarea();
				return destiny;
		}
		
		public void display() 
		{
        System.out.println("\n--- City Details ---");
        System.out.println("City: " + getName());
        System.out.println("Area: " + getArea());
        System.out.println("Population: " + population);
        System.out.println("Number of Towns: " + countOfTown);
        System.out.println("Density: " + calc());
	}

public static void main (String [] args)
	{
		Scanner scan = new Scanner (System.in);
		
			city c1 = new city();
			System.out.println("enter city:");
			c1. name = scan.nextLine();
			System.out.println("enter area:");
			c1.area = scan.nextInt();
			System.out.println("enter population:");
			c1. population= scan.nextInt();
			System.out.println("enter destiny:");
			int destiny= c1.calc ();
			System.out.println("enter no.of.towns:");
			c1.count_of_town = scan.nextInt();
			c1.display();
		
	}
}		