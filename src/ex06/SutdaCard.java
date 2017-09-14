package ex06;

import java.util.Random;


public class SutdaCard {

	public int num;
	public boolean isKwang;

	public SutdaCard() {
		// TODO Auto-generated constructor stub
		this(1, true);
	}

	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public String info() {

		return this.isKwang ? this.num + "K" : Integer.toString(this.num);
	}

	public static int[] shuffle(int[] arr) throws Exception {

		// 카드 돌릴 갯수
			for(int i = 0; i < 30; i++) {
				int randomPick1 = new Random().nextInt(arr.length);
				int randomPick2 = new Random().nextInt(arr.length);
					int temp = arr[randomPick2];
					arr[randomPick2] = arr[randomPick1];
					arr[randomPick1] = temp;
			}
		
		return arr;
	}
	
	

	
	
	
	
}
