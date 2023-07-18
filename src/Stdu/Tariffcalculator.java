package Stdu;

import java.util.Scanner;

public class Tariffcalculator{
	

	public static void main(String[] args) {
		int month, days;
		float rent,t=0,r=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of month:");
		month = sc.nextInt();
		System.out.println("Enter rent per day:");
		rent = sc.nextFloat();
		System.out.println("Enter the no.of days:");
		days = sc.nextInt();
		
		if(month<13){
			if(month==4||month==5||month==6||month==11||month==12){
				r = (rent+(rent*0.2f))*days;
				System.out.print(r);
			}
			else
			{
				t= rent * days;
				System.out.print(t);
			}
		}
		else
			System.out.println("invalid input");
		
	}

}
