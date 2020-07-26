package io.epam.task.Logging;
import java.util.Scanner;
import java.util.logging.Logger; 
public class App 
{
	static
	{
		Logger loggerReferenceVariable=Logger.getLogger(App.class.getName());
		Scanner scannerReferenceVariable=new Scanner(System.in);
		int choiceOfStandard,area;
		loggerReferenceVariable.info("Enter material standard\n1.House with standard material\n2.House with above standard material\n3.House with high standard material\n4.House with high standard and fully automated home");
		choiceOfStandard=scannerReferenceVariable.nextInt();
		if(choiceOfStandard==1||choiceOfStandard==2||choiceOfStandard==3||choiceOfStandard==4)
		{
			loggerReferenceVariable.info("Enter the total area of the house in sq.ft");
			area=scannerReferenceVariable.nextInt();
			Construction referenceVariableOfClassConstruction=new Construction(choiceOfStandard,area);
			loggerReferenceVariable.info(referenceVariableOfClassConstruction.calculateConstructionCost());
		}
		else
		{
			loggerReferenceVariable.info("Invalid choice of standard");
			java.lang.System.exit(0); 
		}
		scannerReferenceVariable.close();
	}
    public static void main( String[] args )
    {   
    }
}
