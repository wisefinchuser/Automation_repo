package com.wisefinch.java;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import java.time.format.*;
//import java.time.LocalDateTime;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.*;


/**
 * Base class for all the pages.
 *
 */
public class TricentistestPage extends DriverScript{
	protected WebDriver browser;
		
	ReusableComponents reusableComponents = new  ReusableComponents();
	/**
	 * Constructor for Page class 
	 * @param browser
	 * @param report
	 */
	protected TricentistestPage(WebDriver browser) {
		this.browser=browser;		
		PageFactory.initElements(browser, this);
	
	}


public TricentistestPage() {
		// TODO Auto-generated constructor stub
	}


@FindBy(css = "#Layer_1_1_")
WebElement tricentislogo;

	/*** Test case Method Name : validateTestA
	 * 	 Functionality         : validate login to Accounting seed salesforce
	 * 	 Created By			   : Subramanya MS
	 * @throws IOException 
	 * @throws AWTException 
	 * 
	***/
	public synchronized  TricentistestPage validateTestA(int threadID , List<String> tempList , String pathLoc ) throws IOException, AWTException {
		String testcasemethod = new Object(){}.getClass().getEnclosingMethod().getName();
	try{
		
		
		if(ReusableComponents.isElementPresent(tricentislogo)){
			
			ReusableComponents.reportPass(threadID, tempList, testcasemethod, "the company logo is displayed successfully in landing page", browser, pathLoc+"\\"+testcasemethod, false);
			
			ReusableComponents.reportSpecific(threadID, tempList, testcasemethod, "screen grab of landing page", browser, pathLoc+"\\"+testcasemethod, true);
			
		}else{
			ReusableComponents.reportFail( threadID , tempList , testcasemethod , "company logo not present", browser ,pathLoc+"\\"+testcasemethod , true );
		}
		
		
		
		
	}catch(NoSuchElementException e){
		ReusableComponents.reportFail( threadID , tempList , testcasemethod , " Object is not present"+e.getStackTrace() , browser ,pathLoc+"\\"+testcasemethod , false );
	}
		
		return new TricentistestPage(browser);
	}


}


