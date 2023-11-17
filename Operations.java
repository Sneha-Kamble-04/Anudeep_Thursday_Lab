/*
 3)Write a program to accept choice from the user and perform the operation
	1.Find out greater between 3 NO
	2.Check given no is even or odd
	3.Checkk the given character is vowel or not
	4.check the given no is divible by 5 or not
 */
package Practicode;
import java.util.Scanner;
public class Operations 
{
	public static void main(String[] args) 
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice for 1.Find out greater between 3 NO ,	2.Check given no is even or odd , 3.Checkk the given character is vowel or not , 4.check the given no is divible by 5 or not");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1 ://Finds Greatest number between three numbers
				int value1,value2,value3;
				System.out.println("Enter the value of value1 =");
				value1=sc.nextInt();
				System.out.println("Enter the value of value2 =");
				value2=sc.nextInt();
				System.out.println("Enter the value of value3 =");
				value3=sc.nextInt();
				System.out.println("The value of num1 is ="+value1);
				System.out.println("The value of num2 is ="+value2);
				System.out.println("The value of num3 is ="+value3);
				if(value1>+value2&&value1>=value3)
				{
					System.out.println(value1+" "+"Is Greater than"+" "+value2+" "+"and"+" "+value3);
				}
				else if(value2>=value1&&value2>=value3)
				{
					System.out.println(value2+" "+"Is Greater than"+" "+value1+" "+"and"+" "+value3);
				}
				else
				{
					System.out.println(value3+" "+"Is Greater than"+" "+value1+" "+"and"+" "+value2);
				}
				break;
				
		case 2 : //Find Given number is even or odd
				System.out.println("Enter the value of num1 =");
				int num1=sc.nextInt();
				if(num1%2==0)
				{
					System.out.println(num1+" "+"is Even Number");
				}
				else
				{
					System.out.println(num1+" "+"is Odd Number");
				}
				break;
				
		case 3 : //Find Given Character is Vowel or Not
				System.out.println("Enter Character = ");
				char character = sc.next().charAt(0);
				// Checking Vowel Character
				if((character=='a'||character=='A')||(character=='e'||character=='E')||(character=='i'||character=='I')||(character=='o'||character=='O')||(character=='u'||character=='U'))
				{
	            	System.out.println(character + " is a Vowel.");
				}
				else
				{
	                		System.out.println(character + " Is not vowel");
				}
				break;
				
		case 4 : //check the given no is divible by 5 or not
				System.out.println("Enter the number for check is it divisible by 5 or not");
				num1=sc.nextInt();
				if(num1%5==0)
				{
					System.out.println(num1+" "+"Is Divisible by 5");
				}
				else
				{
					System.out.println(num1+" "+"Is not Divisible by 5");
				}
	             break;  
				
		default : 
			System.out.println("Please Entered Correct Choice");
				
		}
		
	}

}
