package com.technocredits.orghrm.testscripts;

import java.util.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.technocredits.orghrm.pages.UserProfilePage;

public class UserProfileTest extends TestBase{
	
	@BeforeClass
	public void setUp() {
		super.setup();
	}

	@Test
	public void verfiyUserMenuOptions() {
		
		UserProfilePage userprofile=new UserProfilePage();
		System.out.println("Verify- User Profile Link Available Options");
		userprofile.clickOnUserDropdown();
		List<String> actualList=new ArrayList<String>();
		actualList=userprofile.getListOfUserDropDownOptions();
		List<String> expectedList=new ArrayList<String>();
		expectedList.add("About");
		expectedList.add("Change Password");
		expectedList.add("Logout");
		softAsset.assertTrue(actualList.equals(expectedList));
		System.out.println("Verify- About Options");
		System.out.println("Click on About Option");
		userprofile.clickOnAbout();
		System.out.println("Verify- About Option Popup Title");
		String expected="About";
		String actual=userprofile.getTitleFromAboutPopup();
		softAsset.assertEquals(actual, expected);
		System.out.println("Verify- About Option Popup Information");
		List<String> expectedInfoList=new ArrayList<String>();
		expectedInfoList.add("Company Name: OrangeHRM (Pvt) Ltd(Parallel Demo)");
		expectedInfoList.add("Version: OrangeHRM 7.2.159485");
		expectedInfoList.add("Employees: 102 (298 more allowed)");
		expectedInfoList.add("Users: 77 (723 more allowed)");
		expectedInfoList.add("Renewal on: Wed, 01 Jun 2022");
		List<String> actualInfoList=new ArrayList<String>();
		actualInfoList=userprofile.getAboutMenuText();
		softAsset.assertTrue(actualInfoList.equals(expectedInfoList));
		System.out.println("Clcik- On About Popup OK button");
		userprofile.clickOnAboutPopupOKButton();
		
		
	}
}
