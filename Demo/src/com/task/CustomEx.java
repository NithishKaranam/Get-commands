package com.task;

import java.util.Scanner;
class LoginCredentials extends Throwable{
	LoginCredentials(){
		System.out.println("so please enter user name");
	}
}
public class CustomEx {
	public static void main(String[] args) throws LoginCredentials {
		String username="admin";
		String password="admin";
		if(username.equals("admin")&&password.equals("admin")) {
			System.out.println("login is sucess");
			
		}
		else 
		{
			throw new LoginCredentials();
		}
	}

}
