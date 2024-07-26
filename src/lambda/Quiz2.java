package lambda;

public class Quiz2 {

	public static void main(String[] args) {

		//구현클래스
//		Hello hello1 = new Hello();
//		hello1.helloPrint();
		
		//익명클래스
		Hello hello2 = new Hello() { //생성자 호출부분
			public void helloPrint() {
				System.out.println("안녕하세요");
			}
		};
		hello2.helloPrint();
		
		//람다식
		Hello hello3 = () -> 
			System.out.println("안녕하세요");
		hello3.helloPrint();	
	}

}

//함수형 인터페이스 선언
@FunctionalInterface
interface Hello {
	
	//안녕하세요를 출력하는 함수
	void helloPrint();
}

class HelloImpl implements Hello {

	@Override
	public void helloPrint() {
		System.out.println("안녕하세요");
	}
	
}

// Hello의 구현클래스를 만들고 helloprint()를 호출
// Hello의 익명클래스를 만들고 helloprint()를 호출
// Hello의 람다식함수를 만들고 helloprint()를 호출
