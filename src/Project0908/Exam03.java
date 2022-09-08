package Project0908;
abstract class Car{
	int speed;
	String color;
	
	void upSpeed(int value) {
		speed=speed+value; //value가 올경우 this는 사라지고 speed=speed+value 매개변수가 오면 구분을짓기위해 this가 옴
	}
	abstract void work();
}
	class Sedan2 extends Car{
		void work() {
			System.out.println("사람을 태웁니다.");
		}
	}
	class Truck2 extends Car{
		void work() {
			System.out.println("화물을 싣습니다.");
		}
	}
public class Exam03 {

	public static void main(String[] args) {
		Sedan2 sedan1=new Sedan2();
		sedan1.work();
		
		Truck2 truck1=new Truck2();
		truck1.work();
	}

}
