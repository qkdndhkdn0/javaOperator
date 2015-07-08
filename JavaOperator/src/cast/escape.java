package cast;

import java.util.Scanner;

public class escape {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("두 사람 이름을 입력하세요");
		String hong =scan.next();
		String kim = scan.next();
		System.out.println("두 사람 나이를 입력하세요");
	    int age =scan.nextInt(); 
		int age2 = scan.nextInt();
		
		int a = age-age2;
		
		
		System.out.println(hong+"씨는 "+age+"억 이고, "+kim+"씨는 "+age2+"억이고"+" 재산차이는 "+a+"억 입니다. "+hong+"씨는 "+kim+"씨보다 "+a+"억 많습니다.");

	}

}
