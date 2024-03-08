package ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<>();

        //메세지 넣을게
        messageQueue.offer(new Message("sendMail", "박봉팔"));
        messageQueue.offer(new Message("sendSMS", "박춘배"));
        messageQueue.offer(new Message("sendKaKaoTalk", "박명자"));

        //메세지를 하나씩 꺼내기
        while (!messageQueue.isEmpty()) {
            //비어있지 않다면 반복
            Message message = messageQueue.poll(); //꺼내기
            switch (message.command) {
                case "sendMail":
                    System.out.println(message.to + "님에게 메일을 보냅니다.");
                    break;
                case "sendSMS":
                    System.out.println(message.to + "님에게 SMS내용을 보냅니다.");
                    break;
                case "sendKaKaoTalk":
                    System.out.println(message.to + "님에게 까까오톡을 보냅니다.");
                    break;
            }
        }

    }
}
