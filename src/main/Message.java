package main;

import java.util.*;
import java.io.*;

public class Message {
	static Profile sender;
	static Profile receiver;
	static String content;

	public Message(Profile sender, Profile receiver, String content) {
		this.sender = sender;
		this.receiver = receiver;
		this.content = content;
	}
}
