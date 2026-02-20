package com.java.day8;

public class SwitchStatement {

	public static void main(String[] args) {
		String inputDay = "holiday";
		
//		if(inputDay.equalsIgnoreCase("sunday"))
//		{
//			System.out.println("Today is Weekend");
//		}
//		else if(inputDay.equalsIgnoreCase("monday"))
//		{
//			System.out.println("Today is Weekday");
//		}
//		else if(inputDay.equalsIgnoreCase("tuesday"))
//		{
//			System.out.println("Today is Weekday");
//		}
//		else if(inputDay.equalsIgnoreCase("wednesday"))
//		{
//			System.out.println("Today is Weekday");
//		}
//		else if(inputDay.equalsIgnoreCase("thursday"))
//		{
//			System.out.println("Today is Weekday");
//		}
//		else if(inputDay.equalsIgnoreCase("friday"))
//		{
//			System.out.println("Today is Weekday");
//		}
//		else if(inputDay.equalsIgnoreCase("saturday"))
//		{
//			System.out.println("Today is Weekend");
//		}
//		else
//		{
//			System.out.println("Wrong Day Mentioned");
//		}
//		
		switch(inputDay)
		{
			
			case "monday":
			case "tuesday" : 
			case "wednesday" :
			case "thursday" : 
			case "friday" : System.out.println("Today is working Day");
							break;
			case "saturday" : 
			case "sunday" : System.out.println("Today is WeekEnd");
							break;
			default : System.out.println("Wrong Day Mentioned");
						
		}
		
	}

}
