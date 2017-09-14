package ex06;

import java.util.Arrays;

import org.junit.Test;

public class Ex06Test {

	@Test
	public void test6_2() throws Exception {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();

		System.out.println(card1.info());
		System.out.println(card2.info());
	}

	@Test
	public void test6_4() throws Exception {
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;

		System.out.println("이름:" + s.name);
		System.out.println("총점:" + s.getTotal());
		System.out.println("평균:" + s.getAverage());
	}

	@Test
	public void test6_5() throws Exception {
		Student s = new Student("홍길동", 1, 1, 100, 60, 76);

		System.out.println(s.info());
	}

	@Test
	public void test6_20() throws Exception {

		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(SutdaCard.shuffle(original)));
	}

	@Test
	public void test6_21()throws Exception{
		MyTv t = new MyTv();
		
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
		
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:" + t.channel + ", VOL:"+t.volume);
	
		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
	}
	
	public boolean isNumber(String str){
		// 문자열이 null이거나 공백이면 리턴
		if(str == null || str.equals(""))return false;
		
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) < '0' || str.charAt(i) > '9') return false;
		}
		
		return true;
	}
	
	@Test
	public void test6_22() {
		
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		
		str = "12s34";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
	}
	
	@Test
	public void test6_23(){
		
		int[] data = {3, 2, 9, 4, 7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:" + max(data));
		System.out.println("최대값:" + max(null));
		System.out.println("최대값:" + max(new int[]{}));
	}
	
	@Test
	public void test6_24(){
		
		int value = 5;
		System.out.println(value + "의 절대값:" + abs(value));
		value = -10;
		System.out.println(value + "의 절대값:" + abs(value));
	}
	
	public int max(int[] arr){
		int temp = 0;
		if(arr == null || arr.length == 0)return -999999;
		for(int i = 0; i < arr.length; i++){
			
			if(arr[i] > temp){
				temp = arr[i];
			}
			
		}
		return temp;
	}
	
	public int abs(int value){
		int result = value > 0? value:-value;
		return result;
	}
}
