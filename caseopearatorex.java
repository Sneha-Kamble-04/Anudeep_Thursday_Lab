/*
 1)Write a program to accept choice from the user and display the output
	1.Arithmetic operator
	2.Logical Operator
	3.Relational Operator
	4.Bitwise Operator
	5.Conditional Operator
	6.Assignment Operator
 */
package Practicode;
import java.util.*;
public class caseopearatorex 
{

	public static void main(String[] args) 
	{
		int value1,value2, choice, result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Yourchoice for Performed Operators = 1.Arithmetic operator 2.Logical Operator 3.Relational Operator  4.Bitwise Operator 5.Conditional Operator 6.Assignment Operator");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1 ://for Arithmetic operator 
				System.out.println("Enter The value of Value1 =");
				value1=sc.nextInt();
				System.out.println("Enter The value of Value2 =");
				value2=sc.nextInt();
				result=value1+value2;//For Addition +
				System.out.println("Addition of value1+value2= "+result);
				result=value1-value2;//For Substraction - 
				System.out.println("Substraction of value1-value2= "+result);
				result=value1*value2;//For Multiplication *
				System.out.println("Multiplication of value1*value2= "+result);
				result=value1/value2;//For Division / 
				System.out.println("Division of value1/value2= "+result);
				result=value1%value2;//For Modulas 
				System.out.println("Mod of value1%value2= "+result);
				break;
		
		case 2://for Logical Operator(&&,||,!)
				boolean num1 = true , num2 = false;
				System.out.println("num1: " + num1);
				System.out.println("num2: " + num2);
				System.out.println("num1 && num2: " + (num1 && num2));//Logical && Operator
				System.out.println("num1 || num2: " + (num1 || num2));//Logical || Opeartor
				System.out.println("!num1: " + !num1);//Logical Not ! Operator
				System.out.println("!num2: " + !num2);
				break;
				
		case 3 : // For Realtional Opearator(<,>,==,!=) 
				System.out.println("Enter The value for value1 & value2  between 1-10=");
				value1=sc.nextInt();
				value2=sc.nextInt();
				if(value1!=value2)//!= operator
				{
				if(value1>=1&&value2<=10)//<=,>= operator
					{
						System.out.println("The values of value1 & value2 is between 1-10");
					}	
					else
					{
						System.out.println("Enter correct values of value1 & value2");
					}
				}
				if(value1==value2)//== operator
				{
					System.out.println("Vlaues of  value1 & value2 is equal");
				}
				else 
				{
					System.out.println("Vlaues of  value1 & value2 is not equal");
				}
				break;
			
		case 4: //For Bitwise Operator
				// Initial values
	        	int num3 = 8, num4 = 9;
	        	// bitwise and (&)
	        	System.out.println("num3&num4 = " + (num3 & num4));
	        	
	        	// bitwise or (|)
	        	System.out.println("num3|num4 = " + (num3 | num4));
	 
	        	// bitwise xor (^)
	        	System.out.println("num3^num4 = " + (num3 ^ num4));
	        	break;
	        	
		case 5 : //For Conditional Operator
				System.out.println("Enter the value of value1 =");
				value1=sc.nextInt();
				System.out.println("Enter the value of value2=");
				value2=sc.nextInt();
				result=(value1<value2)?value1:value2;
				System.out.println("The Result of Conditional operator is ="+result);
				break;
				
		case 6: //Assignment Operator
				System.out.println("Enter the value of value1 =");
				value1=sc.nextInt();
				System.out.println("Enter the value of value2 =");
				value2=sc.nextInt();
				
				// Adding & Assigning values
				value1 += value2;
				System.out.println("Result of Adding Assignemnt values = "+value1);
				
				// Subtracting & Assigning values
				value1-=value1;
				System.out.println("Result of Substraction Assignemnt values = "+value1);
				
				// Multipilcation & Assigning values
				value1*=value2;
				System.out.println("Result of Multipication Assignemnt values = "+value1);
			
				// Division & Assigning values
				value1/=value2;
				System.out.println("Result of Division Assignemnt values = "+value1);
			
				// Modules & Assigning values
				value1%=value2;
				System.out.println("Result of Modules Assignemnt values = "+value1);
				break;
				
				
		default:
				System.out.println("Enter Correct Choice ");
		}
	 

	       
		

	}

}

