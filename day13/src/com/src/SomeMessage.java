package com.src;

public class SomeMessage {
	
	private String message;
	public SomeMessage(String message)
	{
		this.message = message;
	}
	public String appendMessage()
	{
		message="hello" + message;
		System.out.println(message);
		return message;
	}
	public String PrintMessage()
	{
		System.out.println(message);
		return message;
	}
}