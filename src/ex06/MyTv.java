package ex06;

public class MyTv {

	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANEL = 100;
	final int MIN_CHANEL = 1;
	
	void turnOnOff(){
		this.isPowerOn = !this.isPowerOn;
	}
	
	void volumeUp(){
		if(MAX_VOLUME > volume) volume++;
	}
	
	void volumeDown(){
		if(volume > MIN_VOLUME) volume--;
	}
	
	void channelUp(){
		channel++;
		if(channel == MAX_CHANEL) channel = MIN_CHANEL;
	}
	
	void channelDown(){
		channel--;
		if(channel == MIN_CHANEL)channel = MAX_CHANEL;
	}
}
