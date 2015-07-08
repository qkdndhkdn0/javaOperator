package cast;
/*
 * @Date : 2015.07.07
 * @ Author : me
 * @Stroy : 단항 연산자 문법
 */
public class Unary {
/*
 * 단항연산자
 * 후위 연산자 또는 전위연산자
 */
	public static void main(String[] args) {
		int i =5 ,j=0, x=5, y=0; //지역변수는 디폴트로 초기화
		j=i++;
		System.out.println("j =\t"+j);
		
		y= ++x;
		System.out.println("++x \n ="+y);

	}

}
