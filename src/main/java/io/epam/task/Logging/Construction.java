package io.epam.task.Logging;
public class Construction {
	int choiceOfStandard,area;
	Construction(int choiceOfStandard,int area)
	{
		this.choiceOfStandard = choiceOfStandard;
		this.area = area;
	}
	String calculateConstructionCost()
	{
		switch(choiceOfStandard)
		{
			case 1:return("Construction cost of house : "+area*1200);
			case 2:return("Construction cost of house : "+area*1500);
			case 3:return("Construction cost of house : "+area*1800);
			case 4:return("Construction cost of house : "+area*2500);
			default:return("Invalid choice of Standard");
		}			
	}

}