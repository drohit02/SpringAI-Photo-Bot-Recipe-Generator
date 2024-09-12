package com.ai.SpringAI.service;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

	private final ChatModel chatModel;
	
	public ChatService(ChatModel chatModel) {
		this.chatModel = chatModel;
	}
	
	public String getResponseFromAI(String prompt) {
		return this.chatModel.call(prompt);
	}
}
