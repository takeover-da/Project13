package innerclass;

// 외부클래스
class Outer {

	// 멤버 변수 2개
	private int a = 10;
	private static int b = 20; // 정적변수
	
	// 인스턴스 내부클래스
	class InClass {
		int i1 = a;	// 외부클래스의 private 멤버도 사용가능
		int i2 = b; // private는 같은 클래스에서만 사용가능하나 안쪽에 있어서 사용가능
	}
	
	// 정적 내부클래스
	static class InStaticClass {
//		int i1 = a;	// 정적클래스에서 인스턴스변수 사용불가, 'a'는 생명주기(static)가 다르기 때문에 사용불가(static이 먼저 생성되기 때문!)
		int i2 = b;	// static에서 static 사용은 가능
	}
}
