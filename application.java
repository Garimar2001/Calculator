package Calculator;

import java.io.IOException;
import java.util.*;
//import java.util.LinkedList;
//import java.util.Scanner;

public class application {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Expression");
		String input = sc.nextLine();
		String numberarr[] = input.split("[+-/*]");
		String operators[]= input.split("[0-9]");
		
		Queue<String> numberslist = new LinkedList<String>(Arrays.asList(numberarr));
		Queue<String> operatorlist = new LinkedList<String>(Arrays.asList(operators));
		double result = Double.parseDouble(numberslist.poll());

		while(!numberslist.isEmpty())
		{
			String opr = operatorlist.poll();
			Operate op;
			switch(opr)
			{
			case "+" : op = new add();
			break;
			case "-" : op = new subtract();
			break;
			case "*" : op = new multiplication();
			break;
			case "/" : op = new division();
			break;
			default : System.out.println("Enter valid expression");
			continue;
			}
			double result2 = Double.parseDouble(numberslist.poll());
			result = op.getResult(result, result2);
		}
				
		System.out.println(result);
	}
	

}
