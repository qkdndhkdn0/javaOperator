
public class Ternary {
	/*
	 * @Date : 2015.07.07
	 * @ Author : me
	 * @Stroy : 삼항 연산자 문법
	 */
	public static void main(String[] args) {
		int left = 1, right = 0, result =0; //지변초기화
		boolean bool = true;
		
		result = bool ? left : right;
		/*
		 * 삼항 연산자는 if else 문의 축약문으로 
		 * 조건식(bool)이 true 값이면 left값을 출력하고
		 * false이면 right값을 출력
		 */
		
		System.out.println(result);

	}

}
