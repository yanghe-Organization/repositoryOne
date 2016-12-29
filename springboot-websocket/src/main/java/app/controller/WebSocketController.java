package app.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import app.entity.ClientRequestMessage;
import app.entity.ServerResponseMessage;
@Controller
public class WebSocketController {
	@Autowired
	private SimpMessagingTemplate messagingTemplate;
	
	@MessageMapping("/welcome")
	@SendTo("/topic/getResponse")
	public ServerResponseMessage test (ClientRequestMessage message){
		System.out.println(message.getName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return new ServerResponseMessage("welcome,"+message.getName());
	}
	@MessageMapping("/chat")
	public void handleChat(Principal principal,String msg){
		System.out.println("/chat");
		if(principal.getName().equals("wyf")){
			messagingTemplate.convertAndSendToUser("wisely", "/queue/notifcations", principal.getName()+"-send:"+msg);
		}else{
			messagingTemplate.convertAndSendToUser("wyf", "/queue/notifications", principal.getName()+"-send:"+msg);
		}
	}
}
