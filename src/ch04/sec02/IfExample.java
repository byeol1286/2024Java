package ch04.sec02;
//조건문:if switch 반복문 for while do while
public class IfExample {

	public static void main(String[] args) {
		int score = 93;
		
		if(score >= 90) {
			System.out.println("정수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		
		if(score < 90) {
			System.out.println("정수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}

	}

}