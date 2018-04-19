
public class Ex05 {

	public static void main(String[] args) {
		
		/*
		 * static 은... 바로 호출가능
		 * non-static 은 new 라는 예약어를 통해서 호출 가능.
		 */
		
		System.out.println(Ex04.a);
		Ex04.doA();
		Ex04.doB();
		
		Ex04 ex04 = new Ex04();
		System.out.println(ex04.b);
		ex04.doC();
		
	}
}
