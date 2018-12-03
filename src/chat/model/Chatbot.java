package chat.model;

import java.util.ArrayList;
import java.util.Random;

/**
 * 
 * @author agar7800 ──────────▄▄▄▄▄▄▄▄▄▄▄▄▄ ────────▄▀▀═════════════▀▀▄
 *         ───────█═══════════════════█ ──────█═════════════════════█
 *         ─────█══════▄▄███████▄▄══════█ ────█═════▄█████████████▄═════█
 *         ────█════▄████▀─────▀████▄════█ ───███████████──█▀█──███████████
 *         ───███████████──▀▀▀──███████████ ────█════▀█████▄▄▄▄▄█████▀════█
 *         ────█══════▀███████████▀══════█ ────█═█▄═══════════════════▄█═█
 *         ────█══██▄═══════════════▄██══█ ────█═══██▄═════════════▄██═══█
 *         ────█════▀███▄═══════▄███▀════█ ────█═════▀▀███████████▀▀═════█
 *         ────█═════════▀▀▀▀▀▀▀═════════█ ───▐▓▓▌═════════════════════▐▓▓▌
 *         ───▐▐▓▓▌▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▐▓▓▌▌ ───█══▐▓▄▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▄▓▌══█
 *         ──█══▌═▐▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌═▐══█ ──█══█═▐▓▓▓▓▓▓▄▄▄▄▄▄▄▓▓▓▓▓▓▌═█══█
 *         ──█══█═▐▓▓▓▓▓▓▐██▀██▌▓▓▓▓▓▓▌═█══█ ──█══█═▐▓▓▓▓▓▓▓▀▀▀▀▀▓▓▓▓▓▓▓▌═█══█
 *         ──█══█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█══█ ─▄█══█▐▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌█══█▄
 *         ─█████▐▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌─█████ ─██████▐▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌─██████
 *         ──▀█▀█──▐▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌───█▀█▀ ─────────▐▓▓▓▓▓▓▌▐▓▓▓▓▓▓▌──────────
 *         ─────────▄████▀────▀████▄ ─────────▀▀▀▀────────▀▀▀▀﻿
 */
public class Chatbot {

	private ArrayList<String> spookyList;
	private ArrayList<String> responseList;

	private String content;
	private String joke;
	private String currentUser;
	private Random randomGenerator;

	public Chatbot() {
		this.joke = "kill mii";
		this.content = new String("special content");
		this.currentUser = new String("");

		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList<String>();

		buildLists();
	}

	public String getContent() {
		return content;
	}

	public String getCurrentUser() {
		return currentUser;
	}

	private void buildLists() {
		// helper method
		// helper methods should be private almost every time
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

	// this is to get a random response
	// it doesn't work though
	public String processText(String userText) {
		String answer = "";
		if (userText == null) {
			answer += "dont send null";
		} else {
			answer += "You said: " + userText;

			if (contentChecker(userText)) {
				answer += "You said the special words";
			}
		}
		int randomIndex = (int) (responseList.size() * Math.random());
		return answer += "Chatbot says: " + responseList.get(randomIndex);
	}

	public boolean legitimacyChecker(String userText) {
		boolean isValid = true;

		if (userText == null) {
			isValid = false;
		}

		else if (userText.length() < 1) {
			isValid = false;
		}

		else if (userText.contains("asdfghjkl") || userText.contains("cvb")) {
			isValid = false;
		}

		else if (userText.length() == 1) {
			isValid = true;
		}
		return isValid;
	}

	public boolean contentChecker(String userText) {
		boolean isContent = false;
		// String text = "words";

		if (userText.contains(" " + content + " ")) {
			isContent = true;
		}

		else if (userText.contains("You said the special words")) {
			isContent = true;
		}

		else if (userText.equals(content)) {
			isContent = true;
		}

		else if (getContent() != "") {
			isContent = false;
		}

		else if (!userText.contains(" " + getContent())) {
			isContent = false;
		}

		else if (userText == null) {
			isContent = false;
		}
		return isContent;
	}

	public boolean spookyChecker(String userText) {
		boolean isSpooky = true;

		if (userText == null) {
			isSpooky = false;
		}

		else if (userText.contains("Halloween")) {
			isSpooky = true;
		}

		else if (userText.contains("Easter")) {
			isSpooky = false;
		}

		else if (userText != null) {
			for (String phrase : spookyList) {
				if (userText.contains(phrase)) {
					isSpooky = true;
				}

			}
		}
		return isSpooky;
	}

	public ArrayList<String> getResponseList() {
		return responseList;
	}

	public ArrayList<String> getSpookyList() {
		return spookyList;
	}

	public Chatbot(String string) {
		content = "sample content";
	}

}
