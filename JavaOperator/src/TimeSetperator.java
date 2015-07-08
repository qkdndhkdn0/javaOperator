import java.util.Scanner;

public class TimeSetperator {
	public static void main(String[] args) {
		/*
		 * 입력 받은 초를 시간 분 초로 환산하는 프로그램
		 */
		//변수의 선언
		Scanner scan = new Scanner(System.in);
		int second;
		System.out.println("구하고자하는 시간(초) 입력");
		second = scan.nextInt();
		//입력 받은 초가 500이라고 한다면 500초를 60으로 나눈 나머지가 초이고 몫이 분이다. 위 연산에서 나온 몫을 
		//
		
		System.out.println("초 : "+(second%60));
		
		System.out.println("분 : "+(second/60));
		
		System.out.println("시간 : "+(second/60)/60);
	}

}
