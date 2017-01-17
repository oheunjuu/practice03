package Calculator;

import java.util.Scanner;

import prob06.Add;
import prob06.Div;
import prob06.Mul;
import prob06.Sub;

public class CalcApp {

	public static void main(String[] args) {
		
		// 힌트: Scanner 와 String 클래스의 split 함수를 사용합니다.
		
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			System.out.print(">>");
			String expression=scanner.nextLine();
			
			/*  코드를 완성 합니다 */
			if(expression.equals("quit")){
				break;
			}
			
			String[] tokens=expression.split("");
			int a = Integer.parseInt(tokens[0]);
			int b = Integer.parseInt(tokens[2]);
			
			
			Arith arith= null;
			
			switch(tokens[1]){
			case "+":{
//				arith= new Add();
				break;
			}
			case "-":{
//				arith=new Sub();
				break;
			}
			case "*": {
	//			arith=new Mul();
				break;
			}
			case "/": {
		//		arith=new Div();
				break;
			}
				
			default:{
				System.out.println("알 수 없는 방정식입니다. ");
			}
			}
		}
		
		scanner.close();
	}
}
