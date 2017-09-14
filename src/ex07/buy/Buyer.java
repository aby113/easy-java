package ex07.buy;

public class Buyer {

	public int money = 1000;
	public Product[] cart = new Product[3];
	public int i = 0;
	
	public void buy(Product p) {
		// 지불 가능하면
		if(money >= p.price) {
			money -= p.price;
			add(p);
		}else {
			System.out.println("잔액이 부족하여 " + p + "를 살수 없습니다.");
			return;
		}
		
		
	}
	
	public void add(Product p) {
			if(i >= cart.length) {
				System.out.println("인덱스 검사:" + i);
				Product[] newCart = new Product[cart.length * 2];
				System.arraycopy(cart, 0, newCart, 0, cart.length);
				this.cart = newCart;
			}
			cart[i] = p;
			i++;
	}
	
	public void summary() {
		int amount = 0;
		System.out.print("구입한 물건:");
		for (int i = 0; i < cart.length; i++) {
			amount += cart[i].price;
			System.out.print(cart[i]+",");

		}
		System.out.println();
		System.out.println("사용한 금액:" + amount);
		System.out.println("남은 금액:" + money);
		
	}
}
