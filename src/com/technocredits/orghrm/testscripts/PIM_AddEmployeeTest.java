package com.technocredits.orghrm.testscripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.technocredits.orghrm.pages.MenuPage;
import com.technocredits.orghrm.pages.PIM_AddEmployeePage;

public class PIM_AddEmployeeTest extends TestBase{

	private MenuPage menuPage;
	
	@BeforeMethod
	public void setUp() {
		menuPage = super.setup();
	}
	
	@Test
	public void verifyAddEmployeeTest() {
		System.out.println("Verfiy - Add Employee test");
		System.out.println("STEP - Navigate to Menu Page");
		menuPage.navigateTo("PIM->Add Employee");
		PIM_AddEmployeePage pim_AddEmployeePage = new PIM_AddEmployeePage();
		pim_AddEmployeePage
			.setEmpFirstName("Techno1")
			.setEmpMiddleName("K")
			.setEmpLastName("Credits2")
			.setEmployeeLocation("Australian Regional HQ")
			.clickOnNext()
			.setHobbies("Reading")
			.clickOnNext()
			.setWorkShift("Twilight")
			.setEffectiveFrom("12")
			.setRegion("Region-1")
			.setFTE("0.75")
			.setTemporaryDepartment("Sub unit-1")
			.clickOnSave();
		String expected="Successfully Saved";
		String actual=pim_AddEmployeePage.getSuccessMessage();
		softAsset.assertEquals(actual, expected);
		System.out.println("Pass");
	}	
	
	
	@AfterMethod
	public void teardown() {
		super.teardown();
	}
}
