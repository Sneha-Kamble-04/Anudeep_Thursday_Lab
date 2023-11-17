/*
 
2)Write a program to accept age and gender from the user and check the ROI according to condition

above 60
M: 7%
F: 7.5%

below 60
M,F: 5%
 */
package Practicode;
import java.util.Scanner;
public class RateOfInterest
	{

		public static void main(String[] args) 
		{
			int age;
			double principal_amount,rate,result;
			char gender;
			Scanner sc = new Scanner(System.in);//Accept age and gender from user
			System.out.println("Enter Your age =");
			age=sc.nextInt();
			System.out.println("Enter your Gender m-male Or f-female =");
			gender = sc.next().charAt(0);
			
			if(age>60&&gender=='m')
			{
				System.out.println("Enter The principal_amount for above 60 year Male  = ");
				principal_amount=sc.nextDouble();//Accept principal amount from user
				rate=0.07;
				result=principal_amount*rate;
				System.out.println("Rate of Interest  for  above 60 year Male="+result);		
			}
			else if(age>60&&gender=='f')
			{
				System.out.println("Enter The principal_amount for above 60 year Female = ");
				principal_amount=sc.nextDouble();
				rate=0.075;
				result=principal_amount*rate;
				System.out.println("Rate of Interest For for above 60 year Female   ="+result);
			}
			else if(age<60&&gender=='m')
			{
				System.out.println("Enter The principal_amount for below 60 year Male  = ");
				principal_amount=sc.nextDouble();
				rate=0.05;
				result=principal_amount*rate;
				System.out.println("Rate of Interest  for  below 60 year male  ="+result);
			}
			else if(age<60&&gender=='f')
			{
				System.out.println("Enter The principal_amount for below 60 year Female   = ");
				principal_amount=sc.nextDouble();
				rate=0.05;
				result=principal_amount*rate;
				System.out.println("Rate of Interest  for  below 60 year female ="+result);
			}
			else
			{
				System.out.println("Please Entered Right age and Gender");
			}
		}

	}
