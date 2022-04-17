package pageObject;

import org.openqa.selenium.By;

import config.Capabilities;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class object extends Capabilities {

	public By menu_shrine						= By.xpath("\\[contains(@content-desc,'Shrine')]");
	public By et_username						= By.xpath("\\[contains(@text,'Username')]");
	public By et_password						= By.xpath("\\[contains(@text, 'Password')]");
	public By txt_product						= By.xpath("\\[contains(@content-desc,'Shrine')]");
	public By btn_chart							= By.xpath("\\[contains(@content-desc,'Chart')]");
	public By btn_clear_chart					= By.xpath("\\[contains(@content-desc,'Delete')]");
	
	
	
	public void swipeByElements (AndroidElement startElement, AndroidElement endElement) {
        int startX = startElement.getLocation().getX() + (startElement.getSize().getWidth() / 2);
        int startY = startElement.getLocation().getY() + (startElement.getSize().getHeight() / 2);
        int endX = endElement.getLocation().getX() + (endElement.getSize().getWidth() / 2);
        int endY = endElement.getLocation().getY() + (endElement.getSize().getHeight() / 2);
        new TouchAction(driver)
            .press(point(startX,startY))
            .waitAction(waitOptions(ofMillis(1000)))
            .moveTo(point(endX, endY))
            .release().perform();
    }



	private WaitOptions waitOptions(Object ofMillis) {
		// TODO Auto-generated method stub
		return null;
	}



	private Object ofMillis(int i) {
		// TODO Auto-generated method stub
		return null;
	}



	private PointOption point(int startX, int startY) {
		// TODO Auto-generated method stub
		return null;
	}
}
