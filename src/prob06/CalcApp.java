package prob06;

import java.util.Scanner;

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
			
			switch(tokens[1]){
			case "+":{
				
				Add add= new Add();
				
				add.setValue(a,b);
				int result=add.calc();
				System.out.println(">>"+result);
				break;
			}
			case "-":{
				Sub sub=new Sub();
				
				sub.setValue(a,b);
				int result=sub.calc();
				System.out.println(">>"+result);
				break;
			}
			case "*": {
				Mul mul=new Mul();
				
				mul.setValue(a, b);
				int result=mul.calc();
				System.out.println(">>"+result);
				break;
			}
			case "/": {
				Div div=new Div();
				div.setValue(a, b);
				int result=div.calc();
				System.out.println(">>"+result);
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
