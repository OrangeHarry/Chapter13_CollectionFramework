package ch13_2_stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<>();

		messageQueue.offer(new Message("SendMail", "ȫ�浿"));// �޽��� ����
		messageQueue.offer(new Message("SendSMS", "�ſ��"));
		messageQueue.offer(new Message("SendKaKaoTalk", "ȫ�α�"));

		System.out.println(messageQueue.size());

		while (!messageQueue.isEmpty()) {
			Message message = messageQueue.poll(); // �޽��� ť���� 1���� �޽����� ����
			switch (message.getCommand()) {
			case "SendMail":
				System.out.println(message.getTo() + "�Կ��� ������ �����ϴ�.");
				break;
			case "SendSMS":
				System.out.println(message.getTo() + "�Կ��� SMS�� �����ϴ�.");
				break;
			case "SendKaKaoTalk":
				System.out.println(message.getTo() + "�Կ��� īī������ �����ϴ�.");
				break;
			}
		}
		System.out.println(messageQueue.size());
	}
}
