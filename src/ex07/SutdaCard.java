package ex07;

public class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard(){
		
	}
	
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	// info()대신 object클래스의 toString()을 오버라이딩했다
	public String toString() {
		return num + (isKwang ? "K":"");
	}
	
}
