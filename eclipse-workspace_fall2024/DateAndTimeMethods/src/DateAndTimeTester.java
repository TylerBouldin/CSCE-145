/*
 * Tyler Bouldin
 */

import java.util.Scanner;


public class DateAndTimeTester {


	public void run () 
	{

		System.out.println("Enter a date and time (MM/DD hh:mm) and I will determine if it is valid.");
		Scanner k = new Scanner(System.in);
		String datetime = k.nextLine();
		if(isValid(datetime) == true) 
		{
			System.out.println("That date and time is valid!");
			
			System.out.println("Would you like to exit? Type quit to exit or press [ENTER] to continue");
			String end = k.nextLine();
			if (end == "") 
			{
				run();
			}
			else if (end == "quit") 
			{
				System.out.println("Goodbye");
			}
		}
		else 
		{
			System.out.println("That date and time is not valid.");
		}

	}


	public Boolean isValid(String dateTime) 
	{
		String date = "";
		String time = "";
		for (int i = 0; i< dateTime.length(); i++ ) 
		{
			if(dateTime.charAt(i) == ' ') {
				date = dateTime.substring(0,i);

				time = dateTime.substring(i+1,dateTime.length());
// setting up the difference between the date and the tie using substrings
			}
		}

		isValidTime(time);
		isValidDate(date);

		if (isValidTime(time) == true && isValidDate(date) == true) 
		{
			return true;
		}
		else 
		{
		return false;
		}
	}

	public boolean isValidDate(String date)
	{
//connecting the get month and the get day to the date method
		int month = getMonth(date);
		int day = getDay(date);
// checking using if statments to make sure the date is valid
		if (month > 0 && month <= 12) 
		{
			if(month == 4 || month == 6 || month == 9 || month == 11 ) 
			{
				if(day > 0 || day <= 30) 
				{
					return true;
				}
				else 
				{
					return false;
				}
			}
			else if (month == 2) 
			{
				if (day > 0 && day <= 28) 
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			else if (month ==1 ||month ==3 ||month ==5 ||month ==7||month ==8 ||month ==10 ||month ==12) 
			{
				if (day > 0 && day <= 31) 
				{
					return true;
				}
				else 
				{
					return false;
				}
			}
		}
		else
		{
			return false;
		}
		return false;
	}

	public boolean isValidTime(String time)
	{
		int hour = getHour(time);
		int minute = getMinute(time);


		if (hour > 0 && hour <= 12) 
		{
			if (minute > 0 && minute <= 60) 
			{
				return true;
			}
			else 
			{
				return false;
			}
		}
		else 
		{
			return false;
		}

	}

	public int getMonth(String date)
	{
		for (int i = 0; i< date.length(); i++ ) 
		{
			if(date.charAt(i) == '/') 
			{
				date = date.substring(0,i);
			}
		}
// finding the exact numbers for the month
		return Integer.parseInt(date);
	}

	public int getDay(String date)
	{
		for (int i = 0; i< date.length(); i++ ) 
		{
			if(date.charAt(i) == '/' ) 
			{
				date = date.substring(i+1,date.length());
			}
		}
		return Integer.parseInt(date);
	}

	public int getHour(String time)
	{
		for (int i = 0; i< time.length(); i++ ) 
		{
			if(time.charAt(i) == ':') 
			{
				time = time.substring(0,i);
			}
		}
		return Integer.parseInt(time);
		// turning the int into a string for the other methods
	}

	public int getMinute(String time)
	{
		for (int i = 0; i< time.length(); i++ ) 
		{
			if(time.charAt(i) == ':') 
			{
				time = time.substring(i+1,time.length());
			}
		}
		return Integer.parseInt(time);
	}
}

