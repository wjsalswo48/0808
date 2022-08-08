// 부모클래스는 강제형변환만 가능하다. -> 부모클래스에 가지고 있는것만 가능 -> 없던것을 가질수가 없음
//자식클래스는 항상 부모 클래스가 될수 있다(강제,묵시 둘다 해당하게됨)
public class PolymorphismDemo1 {
	public static void main(String[] args) {
		Mammal 부모 = new Mammal();
		부모.display();
		Lion 자식 = new Lion();
		자식.display();
		Mammal 부모1 = new Lion();
		부모1.display();
	}
}






