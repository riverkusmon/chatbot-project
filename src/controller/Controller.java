package controller;
import model.Chatbot;
import javax.swing.JOptionPane;

public class Controller 
{

	private Chatbot simpleBot;
	
	public Controller()
	{
		simpleBot = new Chatbot();
		
	}
	
	public void start() 
	{
		String userInput = "";
				
		while(!userInput.equalsIgnoreCase("quit"))
			{
				userInput = JOptionPane.showInputDialog(null, "what do you want to do");
			}	
		
	}
	
	public String interactWithChatBot(String text)
	{
		String output = "";
		String userResponse = JOptionPane.showInputDialog(null, "i want to stop this conversation");
		output = simpleBot.processText(userResponse);
		return output;
	}
	

}
