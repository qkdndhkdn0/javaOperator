package variable;
import java.util.Scanner;
public class InputTotal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���������� �Է��Ͻÿ�");
		int kor = scan.nextInt();
		System.out.println("���������� �Է��Ͻÿ�");
		int eng = scan.nextInt();
		System.out.println("���������� �Է��Ͻÿ�");
		int math = scan.nextInt();
		
		int total = kor+eng+math;
		System.out.println("���� : "+total);
		int avg = total/3;
		System.out.println("��� : "+avg);


	}

}
