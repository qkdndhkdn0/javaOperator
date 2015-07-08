package variable;

public class Total {

	public static void main(String[] args) {
		//국어점수는 데이터 타입이 정수이다
		//변수명은 kor
		//할당된 값은 80
		
		int kor = 80;
		int eng = 70;
		int math = 50;
		//같은 데이터 타입의 변수를 여러개 선언과 할당할때는 다음과 같이 한다.
		
		int total =0;
		total = kor+eng+math;
		
		System.out.println(total);
		int avg = 0;
		avg = total/3;
		System.out.println(avg);
	}

}
