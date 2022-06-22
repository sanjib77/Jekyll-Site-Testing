package com.capstone.docspage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capstone.browserfactory.BrowserFactory;

public class Docspage extends BrowserFactory{
	
	@FindBy(xpath="/html/body/header/div/nav/ul/li[2]/a")
	WebElement docs;
	
	@FindBy(xpath = "/html/body/section/div/div[2]/article/div[1]/a/i")
	WebElement editlink;
	
	@FindBy(xpath="/html/body/section/div/div[3]/aside/ul[1]/li[5]/a")
	WebElement tutoriallink;
	
	@FindBy(xpath="/html/body/section/div/div[2]/article/div[6]/div[2]/a")
	WebElement nextbutton;
	
	@FindBy(xpath="/html/body/section/div/div[2]/article/div[7]/div[1]/a")
	WebElement backbutton;
	
	@FindBy(xpath="/html/body/section/div/div[3]/aside/ul[3]/li[5]/a")
	WebElement datafileslink;

	public Docspage() {
		PageFactory.initElements(driver, this);
	}
	
	public void docsclick() {
		this.docs.click();
	}
	public void editlinkclick() {
		this.editlink.click();
	}
	public void tutoriallinkclick() {
		this.tutoriallink.click();
	}
	public void nextbuttonclick() {
		this.nextbutton.click();
	}
	public void backbuttonclick() {
		this.backbutton.click();
	}
	public void datafileslinkclick() {
		this.datafileslink.click();
	}
	
	
	public void close() {
		driver.close();
	}
}
