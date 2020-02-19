package bhaskar;
import bhaskar.*;


import java.io.IOException;



public class Client {

	public static void main(String[] args) throws IOException {
		
		float[] interestparams=inputsoutputsforinterest.takeinputs();
		String interest=String.valueOf(interestfinder.computeinterest(interestparams));
		inputsoutputsforinterest.printoutput(interest);
		
		float[] constructionparams=ioconstruction.takeinputs();
		String cost=String.valueOf(costfinder.computecost(constructionparams));
		ioconstruction.printoutput(cost);
				
		
		
	}

}
