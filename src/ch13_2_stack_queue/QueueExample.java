package ch13_2_stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<>();

		messageQueue.offer(new Message("SendMail", "홍길동"));// 메시지 저장
		messageQueue.offer(new Message("SendSMS", "신용권"));
		messageQueue.offer(new Message("SendKaKaoTalk", "홍두깨"));

		System.out.println(messageQueue.size());

		while (!messageQueue.isEmpty()) {
			Message message = messageQueue.poll(); // 메시지 큐에서 1개의 메시지를 꺼냄
			switch (message.getCommand()) {
			case "SendMail":
				System.out.println(message.getTo() + "님에게 메일을 보냅니다.");
				break;
			case "SendSMS":
				System.out.println(message.getTo() + "님에게 SMS를 보냅니다.");
				break;
			case "SendKaKaoTalk":
				System.out.println(message.getTo() + "님에게 카카오톡을 보냅니다.");
				break;
			}
		}
		System.out.println(messageQueue.size());
	}
}
