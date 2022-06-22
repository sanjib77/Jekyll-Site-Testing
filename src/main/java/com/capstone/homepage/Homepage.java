package com.capstone.homepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capstone.browserfactory.BrowserFactory;

public class Homepage extends BrowserFactory {
	
	@FindBy(xpath="/html/body/header/div/nav/ul/li[5]/a") //News button
	WebElement newsbutton;
	
	@FindBy(xpath="/html/body/header/div/div[3]/ul/li[2]/a") //github button
	WebElement githubbutton;
	
	@FindBy(xpath="/html/body/header/div/nav/ul/li[2]/a") //docs button
	WebElement docsbutton;
	
	@FindBy(xpath="/html/body/header/div/nav/ul/li[3]/a")
	WebElement resourcebutton;
	
	@FindBy(xpath="/html/body/header/div/nav/ul/li[4]/a")
	WebElement showcasebutton;

	
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clicknews() {
		this.newsbutton.click();
	}
	
	public void clickgithub() {
		this.githubbutton.click();
	}
	
	public void clickdocs() {
		this.docsbutton.click();
	}
	
	public void clickresource() {
		this.resourcebutton.click();
	}
	
	public void clickshowcase() {
		this.showcasebutton.click();
	}
			
	
	public void close() {
		driver.close();
	}

}
