package chat.model;

import java.util.ArrayList;

public class Chatbot {

	private ArrayList<String> spookyList;
	private ArrayList<String> responseList;
	
	private String content;
	private String joke;
	private String currentUser;
	
	
	public Chatbot()
	{
		this.joke = "kill mii";
		this.content = new String("");
		this.currentUser = new String("Default User");
		
		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList<String>();
		
		buildLists();
	}
	
	private void buildLists()
	{
		//helper method
		//helper methods should be private almost every time
		responseList.add("lol that suxs");
		responseList.add("haha wow");
		responseList.add("Nice.");
		responseList.add("No wayyyyyy");
		responseList.add("wowwww");
		
		spookyList.add("boo");
		spookyList.add("you get a f");
		spookyList.add("you failed your ctec test");
		spookyList.add("you got a a- this quarter");
		spookyList.add("you aren't allowed to have a water cup");
		
	}
	
	public String processText(String userText)
	{
		String answer = "";
		answer += "you said: " + userText;
		return answer;
	}	
	
}
