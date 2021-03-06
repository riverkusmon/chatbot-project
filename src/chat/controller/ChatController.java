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
		
	}
	
	public String interactWithChatbot(String userText)
	{
		
		String Output = "";
		String nullCheck = "not null";
		Output += simpleBot.processText(userText);
		return Output;
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
	
	private void close()
	{
		System.exit(0);
	}
	
	public void handleErrors(Exception error)
	{
		JOptionPane.showMessageDialog(appFrame, error.getMessage());
	}
	
	public ChatFrame getAppFrame()
	{
		return appFrame;
	}

	public Chatbot getChatbot()
	{
		return simpleBot;
	}
}
