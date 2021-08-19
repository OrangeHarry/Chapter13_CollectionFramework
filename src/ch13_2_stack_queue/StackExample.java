package ch13_2_stack_queue;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<>();

		// 동전을 끼움
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));

		while (!coinBox.isEmpty()) { // 동전박스가 비어있지 않으면
			Coin coin = coinBox.pop(); // 동전 케이스에서 제일 위에 동전을 꺼냄
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		}
	}
}
//메모리에 들어간 순서의 역순으로 나온다