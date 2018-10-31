package chat.model;

import java.util.ArrayList;
import java.util.Random;
/**
 * 
 * @author agar7800
 *──────────▄▄▄▄▄▄▄▄▄▄▄▄▄
────────▄▀▀═════════════▀▀▄
───────█═══════════════════█
──────█═════════════════════█
─────█══════▄▄███████▄▄══════█
────█═════▄█████████████▄═════█
────█════▄████▀─────▀████▄════█
───███████████──█▀█──███████████
───███████████──▀▀▀──███████████
────█════▀█████▄▄▄▄▄█████▀════█
────█══════▀███████████▀══════█
────█═█▄═══════════════════▄█═█
────█══██▄═══════════════▄██══█
────█═══██▄═════════════▄██═══█
────█════▀███▄═══════▄███▀════█
────█═════▀▀███████████▀▀═════█
────█═════════▀▀▀▀▀▀▀═════════█
───▐▓▓▌═════════════════════▐▓▓▌
───▐▐▓▓▌▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▐▓▓▌▌
───█══▐▓▄▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▄▓▌══█
──█══▌═▐▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌═▐══█
──█══█═▐▓▓▓▓▓▓▄▄▄▄▄▄▄▓▓▓▓▓▓▌═█══█
──█══█═▐▓▓▓▓▓▓▐██▀██▌▓▓▓▓▓▓▌═█══█
──█══█═▐▓▓▓▓▓▓▓▀▀▀▀▀▓▓▓▓▓▓▓▌═█══█
──█══█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█══█
─▄█══█▐▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌█══█▄
─█████▐▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌─█████
─██████▐▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌─██████
──▀█▀█──▐▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌───█▀█▀
─────────▐▓▓▓▓▓▓▌▐▓▓▓▓▓▓▌──────────
─────────▄████▀────▀████▄
─────────▀▀▀▀────────▀▀▀▀﻿
 */
public class Chatbot {

	private ArrayList<String> spookyList;
	private ArrayList<String> responseList;
	
	private String content;
	private String joke;
	private String currentUser;
	private Random randomGenerator;

	public Chatbot()
	{
		this.joke = "kill mii";
		this.content = new String("");
		this.currentUser = new String("");
		
		
		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList<String>();
		
		buildLists();
	}
	
	public String getContent()
	{
		return content;
	}
	
	public String getCurrentUser()
	{
		return currentUser;
	}
	
	private void buildLists()
	{
		//helper method
		//helper methods should be private almost every time
		responseList.add("Hello. lol that suxs");
		responseList.add("haha wow");
		responseList.add("Nice.");
		responseList.add("No wayyyyyy");
		responseList.add("wowwww");
		responseList.add("Okay");
		responseList.add("Alright");
		responseList.add("ohhhhhh");
		responseList.add("good");
		responseList.add("neat");
		responseList.add("Sweet");
		responseList.add("you don't say");
		responseList.add("really");
		responseList.add("I guess");
		responseList.add("sure");
		responseList.add("thats nice");
		
		spookyList.add("Halloween");
		spookyList.add("boo");
		spookyList.add("you get a f");
		spookyList.add("you failed your ctec test");
		spookyList.add("you got a a- this quarter");
		spookyList.add("you aren't allowed to have a water cup");
		spookyList.add("*read*");
		spookyList.add("*police lights flash*");
		spookyList.add("alarm is set for 4:30 am");
		
	}
	//this is to get a random response
	//it doesn't work though
	public String processText(String userText)
	{
		String processAnswer = "";
		String botAnswer = "";
		int index = randomGenerator.nextInt(responseList.size());
		
		processAnswer = "You said: " + userText;
		botAnswer = "Chatbot says: " + responseList.get(index);
			
		return processAnswer + botAnswer;
	}	
	
	public Boolean legitimacyChecker(String userText)
	{
		boolean isValid = true;
		
		if (userText == null)
		{
			isValid = false;
		}
		
		else if (userText.length() < 2)
		{
			isValid = false;
		}
		
		else if (userText.contains("sdf") || userText.contains("cvb"))
		{
			
		}
		
			return isValid;
	}
	
	public Boolean contentChecker(String userText)
	{
		boolean isContent = true;
		
		return isContent;
	}
	
	public Boolean spookyChecker(String userText)
	{
		boolean isSpooky = true;
		
		if(userText == null)
		{
			isSpooky = false;	
		}
		
		else if (userText.contains("Halloween")) 
		{
			isSpooky = true;	
		}
		
		else if (userText.contains("Easter"))
		{
			isSpooky = false;
		}
		
		else if(userText != null)
		{
			for(String phrase : spookyList)
			{
				if (userText.contains(phrase)) 
				{
					isSpooky = true;	
				}
				
			}
		}
		return isSpooky;
	}

	public ArrayList <String> getResponseList()
	{
		return responseList;
	}
	
	public ArrayList <String> getSpookyList()
	{
		return spookyList;
	}
	
	public Chatbot(String string)
	{
		content = "sample content";
	}





}
