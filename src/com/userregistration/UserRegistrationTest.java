package com.userregistration;


import org.junit.Test;

import org.junit.Assert;
import com.userregistration.IUserValidator;
import com.userregistration.UserRegistration;

public class UserRegistrationTest {
	UserRegistration user = new UserRegistration();
    
	 @Test
	    public void givenFirstName_Proper_ReturnTrue() {
	        try {
	         Assert.assertEquals(true, user.firstNameValidator.validate("Aditya"));
	        }catch(UserRegistrationException e) {
	        	Assert.assertEquals("Please enter proper firstname", e.getMessage());
	        }
	 }
	 @Test
	    public void givenFirstName_Improper_ReturnFalse() {
	        try {
	      Assert.assertEquals(false, user.firstNameValidator.validate("aditya"));
	        }catch(UserRegistrationException e) {
	        	Assert.assertEquals("Please enter proper firstname", e.getMessage());
	        }
	 }
	 @Test
	    public void givenLastName_Proper_ReturnTrue() {
	        try {
	        Assert.assertEquals(true, user.lastNameValidator.validate("Kumar"));
	        }catch(UserRegistrationException e) {
	        	Assert.assertEquals("Please enter proper lastname", e.getMessage());
	        }
	 }
	 @Test
	    public void givenLastName_Improper_ReturnFalse() {
	        try {
	        Assert.assertEquals(false, user.lastNameValidator.validate("kumar"));
	        }catch(UserRegistrationException e) {
	        	Assert.assertEquals("Please enter proper lastname", e.getMessage());
	        }
	 }
	 @Test
	    public void givenEmail_Proper_ReturnTrue() {
	        try {
	        Assert.assertEquals(true, user.emailValidator.validate("ab.xyz@bridgelabz.co.in"));
	        }catch(UserRegistrationException e) {
	        	Assert.assertEquals("Please enter proper email", e.getMessage());
	        }
	 }
	 @Test
	    public void givenEmail_Imroper_ReturnFalse() {
	        try {
	        Assert.assertEquals(false, user.emailValidator.validate("abc.co.in"));
	        }catch(UserRegistrationException e) {
	        	Assert.assertEquals("Please enter proper email", e.getMessage());
	        }
	 }
	 @Test
	    public void givenPassword_Proper_ReturnTrue() {
	        try {
	        Assert.assertEquals(true, user.passwordValidator.validate("Aditya@765"));
	        }catch(UserRegistrationException e) {
	        	Assert.assertEquals("Please enter proper password", e.getMessage());
	        }
	 }
	 @Test
	    public void givenPassword_Imroper_ReturnFalse() {
	        try {
	        Assert.assertEquals(false, user.passwordValidator.validate("asgdafgd"));
	        }catch(UserRegistrationException e) {
	        	Assert.assertEquals("Please enter proper password", e.getMessage());
	        }
	 }
	 @Test
	    public void givenMobileNo_Proper_ReturnTrue() {
	        try {
	        Assert.assertEquals(true, user.mobileNoValidator.validate("91 1234567890"));
	        }catch(UserRegistrationException e) {
	        	Assert.assertEquals("Please enter proper mobile no", e.getMessage());
	        }
	 }
	 @Test
	    public void givenMobileNo_Improper_ReturnFalse() {
	        try {
	        Assert.assertEquals(false, user.mobileNoValidator.validate("12345"));
	        }catch(UserRegistrationException e) {
	        	Assert.assertEquals("Please enter proper mobile no", e.getMessage());
	        }
	 }
	
}