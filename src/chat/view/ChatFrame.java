package chat.view;

import java.awt.Container;

import javax.swing.JFrame;
import chat.controller.ChatController;

public class ChatFrame extends JFrame
{
	private ChatController appController;
	private ChatPanel appPanel;
	
	public ChatFrame(ChatController appController)
	{
		super();
		this.appController = appController;
		this.appPanel = new ChatPanel(appController);
		setupFrame();
		
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(1024, 768);
		this.setTitle("banana");
		this.setResizable(true);
		this.setVisible(true);
	}
}
