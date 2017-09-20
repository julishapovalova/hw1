package hw1;
import java.util.Scanner; 

public class Main {
	
	public static String dayOfWeek(int day)
	{
		String stringDayOfWeek=new String();
		switch(day)
		{
		case 1:
			stringDayOfWeek="Monday";
			break;
		case 2:
			stringDayOfWeek="Tuesday";

			break;
		case 3:
			stringDayOfWeek="Wensday";
			break;
		case 4:
			stringDayOfWeek="Thursday";
			break;
		case 5:
			stringDayOfWeek="Friday";
			break;
		case 6:
			stringDayOfWeek="Saturday";
			break;
		case 7:
			stringDayOfWeek="Sunday";
			break;
		default:
			System.out.println("Error!");
			break;
		}
		return stringDayOfWeek;
	}
	
	
	
	
	public static void main(String[] args)
	{
		int c;
		System.out.println("Enter a,b->");
		Scanner scan = new Scanner(System.in);
		String num1 = scan.next();
		int a = scan.nextInt();
		String num2 = scan.next();
		int b = scan.nextInt();
		if(a%2==0)
			c=a*b;
		else 
			c=a+b;
		System.out.println("Result:"+c);
	}

}
