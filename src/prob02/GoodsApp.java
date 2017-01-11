package prob02;
import java.util.Scanner;

public class GoodsApp {
	private static final int countStock=3;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
		
		Goods[] goods= new Goods[countStock];
		
		System.out.println("상품을 입력하세요: ");
		
		for(int i=0; i<countStock; i++){
			String name = scanner.next();
			int price=scanner.nextInt();
			int stock=scanner.nextInt();
			
			goods[i]=new Goods();
			goods[i].setName(name);
			goods[i].setPrice(price);
			goods[i].setStock(stock);
			
		}
		
		for(Goods g : goods){
			System.out.println(g.getName()+"(가격: "+g.getPrice()+")가 "+g.getStock()+"개 입고 되었습니다 . ");
		}
		
		
		scanner.close();
	}
}
