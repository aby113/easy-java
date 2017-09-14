package ex06;

public class Student {

	public String name;
	public int ban;
	public int no;
	public int kor;
	public int eng;
	public int math;
	
	
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
public Student() {
	// TODO Auto-generated constructor stub
}
	// 국영수 점수합산 반환
	public int getTotal()throws Exception{
		
		return kor + eng + math;
	}
	
	// 국영수를 과목수로 나눈 평균
	public float getAverage()throws Exception{
		float average = (float) (Math.round((float)(kor + eng + math) / 3 * 10) / 10.0);
		return average;
	}
	// 멤버변수 + 총합 + 평균 문자열 출력
	public String info()throws Exception{
		
		return this.name +","+ this.ban + ","+this.no + ","+this.kor
				+","+ this.eng +","+ this.math+","
				+ this.getTotal()+"," + this.getAverage();
	}
	
	
}
