package chat.controller;
import javax.swing.JOptionPane;

import chat.model.Chatbot;
import chat.view.ChatFrame;

public class ChatController 
{

	private Chatbot simpleBot;
	private ChatFrame appFrame;
	
	public ChatController()
	{
		simpleBot = new Chatbot();
		appFrame = new ChatFrame(this);
	}
	
	public void start() 
	{
		String userInput = "";
				
		while(!userInput.equalsIgnoreCase("quit"))
			{
				userInput = JOptionPane.showInputDialog(null, "what do you want to do");
			
			}	
		
		while(userInput.isEmpty())
		{
			JOptionPane.showInputDialog(null, "actually type something");
		}
		
	}
	
	public String interactWithChatbot(String userText)
	{
		
		String Output = "";
		String nullCheck = "not null";
		userText = JOptionPane.showInputDialog(null, "i want to stop this conversation");
		Output = simpleBot.processText(userText);
		if(userText == null)
		{
			Output = "you need to type something it can't contain null";
			nullCheck = "null";
		}
		return nullCheck;
	}
	
	public Chatbot getChatbot()
	{
		return simpleBot;
	}

	public String useChatbotCheckers(String Text)
	{
		String testedChecker = "these checkers passed:";
		if (simpleBot.contentChecker(Text))
		{
			testedChecker += "\nContent Checker";
		}
		if (simpleBot.spookyChecker(Text))
		{
			testedChecker += "Halloween";
		}
		return testedChecker;
			
		
	}



}
