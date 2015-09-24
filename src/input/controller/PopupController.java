package input.controller;

import input.view.PopupDisplay;
import input.model.Thing;

public class PopupController
{
	private PopupDisplay myPopups;
	private Thing myThing;
	
	public PopupController()
	{
		myPopups = new PopupDisplay();
	}
	
	public void start()
	{		
		String temp = myPopups.getAnswer("Type in your name");
		
		myPopups.displayResponse("ou tped in " + name);
		
		int age;
		String tempAge = myPopups.getAnswer("Type in your age");
		
		age = Integer.parseInt(tempAge);
		
		myPopups.displayResponse("You typed in" + age);
		
		double weight;
		String tempWeight = myPopups.getAnswer("Type in your weight");
		weight = Double.parseDouble(tempWeight);
				
		myPopups.displayResponse("you typed in" + weight);
		
		myThing = new Thing(name, age, weight);
	}
}