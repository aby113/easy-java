package ex07;

import java.util.Random;

import org.junit.Test;

import ex07.buy.Audio;
import ex07.buy.Buyer;
import ex07.buy.Computer;
import ex07.robot.DanceRobot;
import ex07.robot.DrawRobot;
import ex07.robot.Robot;
import ex07.robot.SingRobot;

public class Ex7 {

	@Test
	public void test7_1() {
		SutdaDeck deck = new SutdaDeck();

		for (int i = 0; i < deck.cards.length; i++) {
			System.out.print(deck.cards[i] + ",");
		}
	}

	@Test
	public void test7_2() {

		System.out.println(new Random().nextInt(2));
	}

	@Test
	public void test7_5() {
		Tv t = new Tv();
	}
	
	@Test
	public void test7_10() {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:" +  t.getVolume());
	}
	
	@Test
	public void test7_11() {
		MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setChannel(20);
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
		
	}
	
	@Test
	public void test7_18() {
		
		Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};
		
		for(int i = 0; i < arr.length; i++) {
			action(arr[i]);
		}
	}
	
	@Test
	public void test7_19() {
		
		Buyer b = new Buyer();
		b.buy(new ex07.buy.Tv());
		b.buy(new Computer());
		b.buy(new ex07.buy.Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.summary();
		
	}

	@Test
	public void test7_25() {
		
		//Outer outer = new Outer();
		System.out.println(new Outer().new Inner().iv);
	}
	
	
	
	
	public void action(Robot robot) {
		
		if(robot instanceof DanceRobot) {
			DanceRobot dRobot = (DanceRobot) robot;
			dRobot.dance();
		}else if(robot instanceof SingRobot) {
			SingRobot sRobot = (SingRobot)robot;
			sRobot.sing();
		}else if(robot instanceof DrawRobot) {
			DrawRobot drawRobot = (DrawRobot)robot;
			drawRobot.draw();
		}
		
		
	}
	
	
	
}
