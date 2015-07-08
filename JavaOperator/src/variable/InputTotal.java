package variable;
import java.util.Scanner;
public class InputTotal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("국어점수를 입력하시오");
		int kor = scan.nextInt();
		System.out.println("영어점수를 입력하시오");
		int eng = scan.nextInt();
		System.out.println("수학점수를 입력하시오");
		int math = scan.nextInt();
		
		int total = kor+eng+math;
		System.out.println("총점 : "+total);
		int avg = total/3;
		System.out.println("평균 : "+avg);


	}

}
