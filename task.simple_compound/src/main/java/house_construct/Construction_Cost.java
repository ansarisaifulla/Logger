package house_construct;

import java.io.PrintWriter;

public class Construction_Cost {

	public void calculate_cost(double total_area,int material_std)
	{
	    PrintWriter writer = new PrintWriter(System.out);    

		double total_cost;
		switch(material_std)
		{
		case 0:
			total_cost=1200*total_area;
			break;
		case 1:
			total_cost=1500*total_area;
			break;
		case 3:
			total_cost=1800*total_area;
			break;
		case 5:
			total_cost=2500*total_area;
			break;
		default:
			total_cost=0;
			writer.println("Sorry your input is invalid ");
			break;
			
		}
		writer.println("The House Construction cost is : "+total_cost);
		writer.flush();
		writer.close();

	}
}
