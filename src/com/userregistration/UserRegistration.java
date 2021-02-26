package com.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

@FunctionalInterface
interface IUserValidator{
	boolean validate(String string) throws UserRegistrationException;
}

public class UserRegistration {

	
	static Pattern FIRST_NAME = Pattern.compile("^([A-Z])[a-zA-Z]{2,}$");
	static Pattern LAST_NAME = Pattern.compile("^([A-Z])[a-zA-Z]{2,}$");
	static Pattern EMAIL = Pattern
			.compile("^([a-z]){1,}[a-z0-9]*([.+_-]){0,1}[0-9a-z]+(@){1}([0-9a-z]+)(\\.([a-z]){2,}){1}(\\.[a-z]{2,})?$");
	static Pattern MOBILE_NO = Pattern.compile("^\\d{2} [1-9]\\d{9}$");
	static Pattern PASSWORD = Pattern.compile("^(?=.*\\d)(?=.*[A-Z])(?=.*\\W)(?!.*\\W\\w*\\W)(?!.*\\s).{8,}$");
	
	 IUserValidator firstNameValidator = (string) ->{ FIRST_NAME.matcher(string).find();
	throw new UserRegistrationException ("Please enter proper firstname");};
	
	IUserValidator lastNameValidator = (string) -> {LAST_NAME.matcher(string).find();
	throw new UserRegistrationException ("Please enter proper lastname");};
	
	IUserValidator emailValidator = (string) -> {EMAIL.matcher(string).find();
	throw new UserRegistrationException ("Please enter proper email");};
	
	IUserValidator mobileNoValidator = (string) -> {MOBILE_NO.matcher(string).find();
	throw new UserRegistrationException ("Please enter proper mobile no");};
	
	IUserValidator passwordValidator = (string) -> {PASSWORD.matcher(string).find();
	throw new UserRegistrationException ("Please enter proper password");};
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to User Registration Page");
	}
}