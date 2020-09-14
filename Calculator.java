import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		double input1,input2,result;
		char operator;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numbers to be operated");
		input1=scan.nextDouble();
		input2=scan.nextDouble();
		System.out.println("enter the operator [+,-,*,/,%]");
		operator=scan.next().charAt(0);
		switch(operator)
		{
		case '+':
			result = (input1+input2);
			System.out.println(result);
		break;
		case '-':
			result = (input1-input2);
			System.out.println(result);
		break;
		case '*':
			result = (input1*input2);
			System.out.println(result);
		break;
		case '/':
			result = (input1/input2);
			System.out.println(result);
		break;
		case '%':
			result = (input1%input2);
			System.out.println(result);
		break;
		default:
			System.out.println("incorrect operator");
		}}}
