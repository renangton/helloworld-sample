package test;

public class Main {

	public static void main(String[] args) {
		// Hello Worldを出力
		System.out.println("Hello World");
				
		for(int i = 1; i <= 20; i++) {
			// 10回目まではHello Worldを出力
			if(i <= 10) {
				System.out.println("Hello World");
			// 20回目はGood Byeを出力 
			}else if(i == 20) {
				System.out.println("Good Bye");
			//　11回目からはHelloのみ出力
			}else {
				System.out.println("Hello");
			}
		}
	}
}