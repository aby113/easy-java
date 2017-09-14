package ex07;

public class MyTv2 {

	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int[] channels = new int[2];
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	public boolean isPowerOn() {
		return isPowerOn;
	}
	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
		int index = 1;
		// 배열의 첫번째 인덱스에 값이 잇는지 확인
		// 배열맨처음 초기화할때 인덱스에 0값이 할당되므로
		if(channels[0] == channels[1])index = 0;
		channels[index] = channel;
	
	}
	
	public void gotoPrevChannel() {
			this.channel = channels[0];
			channels[0] = channels[1];
			channels[1] = this.channel;
	}
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
	
}
