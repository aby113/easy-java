package ex05;

import java.util.Scanner;

import org.junit.Test;

public class JavaTest {

	@Test
	public void test5_2() throws Exception {

		int[][] arr = { 
				{ 5, 5, 5, 5, 5 }, { 10, 10, 10 }, { 20, 20, 20, 20 }, { 30, 30 }
				};
		System.out.println(arr[3].length);

	}

	@Test
	public void test5_3() {

		int[] arr = { 10, 20, 30, 40, 50 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum=" + sum);
	}

	@Test
	public void test5_4() {

		int[][] arr = { 
				{ 5, 5, 5, 5, 5 }, { 10, 10, 10, 10, 10 }, { 20, 20, 20, 20, 20 }, { 30, 30, 30, 30, 30 }
		};
		int total = 0;
		float average = 0;
		int arrCount = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];

			}

			arrCount += arr[i].length;
		}

		System.out.printf("total=%4d%n", total);
		System.out.printf("average=%3s%n", (double) total / arrCount);
	}

	@Test
	public void test5_5() throws Exception {

		int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] ball3 = new int[3];

		for (int x = 0; x < 20; x++) {
			// 0 ~ 8 까지 반환
			int i = (int) (Math.random() * ballArr.length);
			int j = (int) (Math.random() * ballArr.length);
			int tmp = 0;
			// int temp = 0;
			if (i != j && x != i && x != j) {
				tmp = ballArr[x];
				ballArr[0] = ballArr[i];
				ballArr[1] = ballArr[j];
				ballArr[2] = tmp;
				System.out.printf("i=%2d, j=%2d, x=%2d %n", ballArr[0], ballArr[1], ballArr[2]);
				break;
			}

			x = 0;
		}

		ball3 = new int[] { ballArr[0], ballArr[1], ballArr[2] };

		for (int i = 0; i < ball3.length; i++) {
			System.out.print(ball3[i]);
		}
		System.out.println();

	}

	@Test
	public void test5_6() throws Exception {

		int[] coinUnit = { 500, 100, 50, 10 };
		int money = 2680;
		System.out.println("money=" + money);

		for (int i = 0; i < coinUnit.length; i++) {

			if (money >= coinUnit[i]) {
				int temp = coinUnit[i];
				coinUnit[i] = money / coinUnit[i];
				money %= temp;
				System.out.printf("%d원 : %d개%n", temp, coinUnit[i]);
				System.out.println("잔액: " + money);
			}
		}

	}

	@Test
	public void test5_7() throws Exception {
		System.out.println("값을 입력해주세요");
		int money = new Scanner(System.in).nextInt();
		System.out.println("money: " + money);

		int[] coinUnit = { 500, 100, 50, 10 }; // 동전의 단위
		int[] coin = { 5, 5, 5, 5 }; // 단위별 동전의 개수

		for (int i = 0; i < coinUnit.length; i++) {
			int coinNum = 0;

			// 잔돈이 존재하고 금액이 동전의 단위보다 클경우
			if (coinUnit[i] != 0 && money >= coinUnit[i]) {
				// 3000
				// 동전의 갯수 = 돈 / 동전액수
				coinNum = money / coinUnit[i];
				// money 양수 잔돈보다큼 음수 잔돈보다 작음
				// 거스름돈이 잇을경우
				if (coin[i] - coinNum > 0) {
					
					coin[i] -= coinNum;
					money -= (coinNum * coinUnit[i]);
					continue;
				} else {
					// 잔돈이 안남을경우
					coinNum = 5;
					money -= (coin[i] * coinUnit[i]);
				}
			}

			System.out.println(coinUnit[i] + "원:" + coinNum);

		}

		if (money > 0) {
			System.out.println("거스름돈이 부족합니다.");
			return;
		}

		System.out.println("=남은 동전의 개수 = ");

		for (int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "원:" + coin[i]);
		}
	}

	@Test
	public void test5_8()throws Exception{
		
		int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3 ,2};
		int[] counter = new int[4];
		
		for(int i = 0; i < answer.length; i++){
			
		}
		
		for(int i = 0; i < counter.length; i++){
			
			
			System.out.println();
		}
		
		
	}
	
	
	
	
		
	
	
}
