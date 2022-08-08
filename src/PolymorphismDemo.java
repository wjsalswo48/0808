// 부모클래스는 강제형변환만 가능하다. -> 부모클래스에 가지고 있는것만 가능 -> 없던것을 가질수가 없음
//자식클래스는 항상 부모 클래스가 될수 있다(강제,묵시 둘다 해당하게됨)
public class PolymorphismDemo {
	public static void main(String[] args) {
		Base base = new Base();
		Derived derived = new Derived();
		Base b = new Derived();
//		if(base instanceof Derived) {
//			derived = (Derived)base; 
//		}else {
//			System.out.println("형변환 불가능");
//		}
//		derived = (Derived)base; 
//		base = derived;
		b.test();
	}
}

class Base{
	public void test() {
		
	}
}
class Derived extends Base{
	public void test(){
		System.out.println("자식입니다.");
	}
}






