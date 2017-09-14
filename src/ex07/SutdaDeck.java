package ex07;

import java.util.Random;

public class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		// 배열 SutdaCard 초기화
		int random = new Random().nextInt(2);
		System.out.println(random);
		
		for(int i = 0; i < CARD_NUM; i++) {
			int number = (i + 1) % 10 == 0? 10: (i + 1) % 10;
			boolean isKwang = false;
			if(i / 10 == random && (number == 1 || number == 3 || number == 8)) {
				isKwang = true;
			}
			cards[i] = new SutdaCard(number, isKwang);
		}
		
	}

	public void shuffle()throws Exception{
		// 30번 섞는다
		for(int i = 0; i < 30; i++) {
			// 카드 길이만큼 랜덤한 숫자를 리턴
			int random1 = new Random().nextInt(cards.length);
			int random2 = new Random().nextInt(cards.length);
			// 주소값을 대입할때 기존 값이 지워지므로
			// 지워지기전에 임시로 만든 변수에 값을 넣음
			SutdaCard tempCard = this.cards[random2];
			this.cards[random2] = cards[random1];
			cards[random1] = tempCard;
		}
		
	}
	// 배열 cards에서 지정된 위치의 섯다카드를 반환한다
	public SutdaCard pick(int index)throws Exception{
		return this.cards[index];
	}
	
	public SutdaCard pick()throws Exception{
		return this.cards[(int)(Math.random() * cards.length)];
	}
	
}
