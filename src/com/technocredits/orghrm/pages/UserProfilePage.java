package com.technocredits.orghrm.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.technocredits.orghrm.base.PredefinedActions;

public class UserProfilePage extends PredefinedActions {

	public void clickOnUserDropdown() {
		driver.findElement(By.xpath("//a[@id='user-dropdown']")).click();
	}
	
	public List<String> getListOfUserDropDownOptions() {
		/*List<WebElement> list = driver.findElements(By.xpath("//ul[@id='user_menu']/li/a"));
		List<String> userOptionsList = new ArrayList<String>();
		for(WebElement e : list) {
			userOptionsList.add(e.getText());
		}
		return userOptionsList;*/
		return getTextOfAllElements("//ul[@id='user_menu']/li/a");
	}
	
	public int getTotalAvailableOptions() {
		return getListOfUserDropDownOptions().size();
	}
	
	public void clickOnAbout() {
		driver.findElement(By.xpath("//ul[@id='user_menu']//a[text()='About']")).click();
	}
	
	public String getTitleFromAboutPopup() {
		return driver.findElement(By.xpath("//div[@class='customized-modal-header']")).getText();
	}
	
	public void clickOnSubMenu(String subMenu) {
		driver.findElement(By.xpath("//ul[@id='user_menu']//a[text()='"+subMenu+"']")).click();
	}
	
	public String getCmpNameFromAboutPopup() {
		return driver.findElement(By.xpath("//div[@id='companyInfo']/div/div[1]/p")).getText();
	}
	
	public List<String> getAboutMenuText(){
		/*List<WebElement> elementList = driver.findElements(By.xpath("//div[@id='companyInfo']//p"));
		List<String> elementTextList = new ArrayList<String>();
		for(WebElement e : elementList) {
			elementTextList.add(e.getText());
		}
		return elementTextList;*/
		return getTextOfAllElements("//div[@id='companyInfo']//p");
		
	}
	
	public void clickOnAboutPopupOKButton() {
		driver.findElement(By.xpath("//a[@id='heartbeatSubmitBtn']")).click();
	}
	
}
