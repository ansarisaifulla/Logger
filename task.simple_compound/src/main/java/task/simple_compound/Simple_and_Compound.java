package task.simple_compound;

import java.io.PrintWriter;

public class Simple_and_Compound {

	public void calculate_interest(double amount,double rate_of_interest,double year)
	{
		double pr, rate, t, sim,com;
	    pr=amount;
	    t=year;
	    rate=rate_of_interest;
	    sim=(pr * t * rate)/100;
	    com=pr * Math.pow(1.0+rate/100.0,t) - pr;
	    PrintWriter writer = new PrintWriter(System.out);    
	      writer.println("Simple Interest="+sim);        
	      writer.write("Compound Interest="+com);        
	      writer.flush();  
	      writer.close();  
	    //System.out.println("Simple Interest="+sim);
	    //System.out. println("Compound Interest="+com);
	}

}
