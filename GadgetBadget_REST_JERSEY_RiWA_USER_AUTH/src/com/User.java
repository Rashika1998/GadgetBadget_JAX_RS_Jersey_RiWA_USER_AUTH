package com;

public class User {
	
	public String login(String un, String pw)
	{ 
		 String output = ""; 
		if (!un.equals("it18213140"))//Hard coded test value 
		 { 
			output = "Invalid Username"; 
		 } 
		else if (un.equals("it18213140"))//Hard coded test value 
			 { 
			 if (!pw.equals("it18213140"))//Hard coded test value 
			 { 
				 output = "Invalid Password"; 
			 } 
			 else if (pw.equals("it18213140"))//Hard coded test value 
			 { 
				 output = "success"; 
			 } 
		 } 
		return output; 
	}
}
