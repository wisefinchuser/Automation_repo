package com.wisefinch.java;


import static org.testng.AssertJUnit.assertTrue;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Base class for all the pages.
 *
 */
public class Page extends DriverScript{
	protected WebDriver browser;
	
	
	/**
	 * Constructor for Page class 
	 * @param browser
	 * @param report
	 */
	protected Page(WebDriver browser) {
		
		this.browser=browser;		
		PageFactory.initElements(browser, this);
		
		
	}
	
	public static String testcasemethod ;

	/*** Test case Method Name : navigateToAseedPage
	 * 	 Functionality         : validate Accounting seed Page
	 * 	 Created By			   : Subramanya MS
	 * 
	***/
	public synchronized AseedPage navigateToAseedPage(int threadID , List<String> tempList , String pathLoc ) {
		String testcasemethod = new Object(){}.getClass().getEnclosingMethod().getName();
		ReusableComponents.reportInfo(threadID,tempList, testcasemethod , "Validation Accounting Seed Page" , browser ,pathLoc+"\\"+testcasemethod , false );			
		return new AseedPage(browser);
	}
	
	/*** Test case Method Name : navigateTocustomPage
	 * 	 Functionality         : validate Custom Test Page
	 * 	 Created By			   : Subramanya MS
	 * 
	***/
	public synchronized Custprojpage navigateToCustpage(int threadID , List<String> tempList , String pathLoc ) {
		String testcasemethod = new Object(){}.getClass().getEnclosingMethod().getName();
		ReusableComponents.reportInfo(threadID,tempList, testcasemethod , "Validation Custom Page" , browser ,pathLoc+"\\"+testcasemethod , false );			
		return new Custprojpage(browser);
	}
	
	/*** Test case Method Name : navigateToPLPage
	 * 	 Functionality         : validate PL Page
	 * 	 Created By			   : Subramanya MS
	 * 
	***/
	public synchronized PlPage navigateToPlPage(int threadID , List<String> tempList , String pathLoc ) {
		String testcasemethod = new Object(){}.getClass().getEnclosingMethod().getName();
		ReusableComponents.reportInfo(threadID,tempList, testcasemethod , "Validation PL Page" , browser ,pathLoc+"\\"+testcasemethod , false );			
		return new PlPage(browser);
	}
	
	/*** Test case Method Name : navigateToOpenhrmlivePage
	 * 	 Functionality         : validate Openhrmlive Page
	 * 	 Created By			   : Subramanya MS
	 * 
	***/
	public synchronized OpenhrmlivePage navigateToOpenhrmlivePage(int threadID , List<String> tempList , String pathLoc ) {
		String testcasemethod = new Object(){}.getClass().getEnclosingMethod().getName();
		ReusableComponents.reportInfo(threadID,tempList, testcasemethod , "Validation Openhrmlive Page" , browser ,pathLoc+"\\"+testcasemethod , false );			
		return new OpenhrmlivePage(browser);
	}
	
	/*** Test case Method Name : navigateToTricentisPage
	 * 	 Functionality         : validate Tricentis Page
	 * 	 Created By			   : Anandh
	 * 
	***/
	public synchronized TricentisPage navigateToTricentisPage(int threadID , List<String> tempList , String pathLoc ) {
		String testcasemethod = new Object(){}.getClass().getEnclosingMethod().getName();
		ReusableComponents.reportInfo(threadID,tempList, testcasemethod , "Validation Tricentis Page" , browser ,pathLoc+"\\"+testcasemethod , false );			
		return new TricentisPage(browser);
	}

	/*** Test case Method Name : navigateToSuacedemoPage
	 * 	 Functionality         : validate Saucedemo Page
	 * 	 Created By			   : Lakshman
	 * 
	***/
	public synchronized SaucedemoPage navigateToSaucedemoPage(int threadID , List<String> tempList , String pathLoc ) {
		String testcasemethod = new Object(){}.getClass().getEnclosingMethod().getName();
		ReusableComponents.reportInfo(threadID,tempList, testcasemethod , "Validation Saucedemo Page" , browser ,pathLoc+"\\"+testcasemethod , false );			
		return new SaucedemoPage(browser);
	}
	
	/*** Test case Method Name : navigateToTricentistestPage
	 * 	 Functionality         : validate Tricentis Page
	 * 	 Created By			   : Subramanya MS
	 * 
	***/
	public synchronized TricentistestPage navigateToTricentistestPage(int threadID , List<String> tempList , String pathLoc ) {
		String testcasemethod = new Object(){}.getClass().getEnclosingMethod().getName();
		ReusableComponents.reportInfo(threadID,tempList, testcasemethod , "Validation tricentis Page" , browser ,pathLoc+"\\"+testcasemethod , false );			
		return new TricentistestPage(browser);
	}

}
