package task.simple_compound;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.properties.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import house_construct.MainProgram;
public class Main_Program {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Logger logger = LogManager.getLogger(MainProgram.class); 
	    Scanner sc=new Scanner (System.in);
		Simple_and_Compound sim_com=new Simple_and_Compound();
		double amount, rate_of_interest, year;
		logger.error("Enter the amount:");
	    //System.out.println("Enter the amount:");
	    amount=sc.nextDouble();	 
		logger.error("Enter the No.of years:");
	    //System. out. println("Enter the No.of years:");
	    year=sc.nextDouble();	 
		logger.error("Enter the Rate of  interest");
	    //System. out. println("Enter the Rate of  interest");
	    rate_of_interest=sc.nextDouble();
	    //callling the method of other class to calculate the simple and compund interest
	    sim_com.calculate_interest(amount, rate_of_interest, year);
	    sc.close();

	}

}
