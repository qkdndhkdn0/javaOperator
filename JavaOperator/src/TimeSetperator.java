import java.util.Scanner;

public class TimeSetperator {
	public static void main(String[] args) {
		/*
		 * �Է� ���� �ʸ� �ð� �� �ʷ� ȯ���ϴ� ���α׷�
		 */
		//������ ����
		Scanner scan = new Scanner(System.in);
		int second;
		System.out.println("���ϰ����ϴ� �ð�(��) �Է�");
		second = scan.nextInt();
		//�Է� ���� �ʰ� 500�̶�� �Ѵٸ� 500�ʸ� 60���� ���� �������� ���̰� ���� ���̴�. �� ���꿡�� ���� ���� 
		//
		
		System.out.println("�� : "+(second%60));
		
		System.out.println("�� : "+(second/60));
		
		System.out.println("�ð� : "+(second/60)/60);
	}

}
