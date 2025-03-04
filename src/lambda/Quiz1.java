package lambda;

public class Quiz1 {

	public static void main(String[] args) {

		//Q.MyNumber를 익명클래스로 구현하고 max()를 호출하세요
		//Q.MyNumber를 람다식 함수로 구현하고 max()를 호출하세요
		
		// 구현클래스를 사용하여 max() 호출
		MyNumber number1 = new MyNumberImpl();
		System.out.println(number1.max(10, 20));
		
		// 익명클래스를 사용하여 max()를 호출
		MyNumber number2 = new MyNumber() {
			public int max(int x, int y) {
				return x > y ? x : y;
			}
		};
		System.out.println(number2.max(10, 20));
		
		// 람다식 함수를 사용하여 max를 호출하세요
		MyNumber number3 = (x, y) -> x > y ? x : y;
		System.out.println(number3.max(10, 20));
	}

}

//함수형 인터페이스
@FunctionalInterface
interface MyNumber {
	//두 숫자 중에 더 큰 값을 반환하는 함수
	int max(int x, int y);
}

//Q.MyNumber의 구현 클래스 만들기!
class MyNumberImpl implements MyNumber {

	@Override
	public int max(int x, int y) {
		return x > y ? x : y;
	}
	
}