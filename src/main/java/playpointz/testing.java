package playpointz;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

@SuppressWarnings("unused")
public class testing {
			
			static AppiumDriver<MobileElement> driver;
			
			public static void main(String[] args) {
				
				try {
					openTesting();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				
			}
			

			public static void openTesting() throws Exception {
				
				  DesiredCapabilities cap = new DesiredCapabilities();

			        cap.setCapability("deviceName","✰𝐏𝐚𝐳𝐲✰");
			        cap.setCapability("automationName","UiAutomator2");
			        cap.setCapability("platformName","Android");
			        cap.setCapability("platformVersion","10");

			        cap.setCapability("appPackage","com.avanux.playpoints");
			        cap.setCapability("appActivity","com.avanux.playpoints.MainActivity");
				// TODO Auto-generated method stub
			        
			        URL url = new URL("http://127.0.0.1:4723/wd/hub");
			        driver = new AppiumDriver<MobileElement>(url, cap);
			        
			    //get started
			        Thread.sleep(3000);
			        driver.findElement(By.xpath(("	\r\n"
			        		+ "//android.widget.Button[@content-desc=\"Get Started\"]"))).click();
			        
			    //login page
			        Thread.sleep(3000);
			        
			    //enter user name
			        
			       WebElement username = driver.findElement(By.xpath("	\r\n"
			        		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
			     
			       username.click();
			       Thread.sleep(3000);
			       username.sendKeys("depp123");
			       
			       
			       
			    //enter password
			        Thread.sleep(4000);
			       WebElement password = driver.findElement(By.xpath("//android.widget.EditText[@text='Password']"));
			       password.click();
			       Thread.sleep(3000);
			       password.sendKeys("********");
			       
//LOGIN PAGE
			        Thread.sleep(3000);
			        driver.findElement(By.xpath("	\r\n"
			        		+ "//android.widget.Button[@content-desc=\"Login\"]")).click();
			        
			        
               //scroll down
			        
			        Thread.sleep(8000);
			        
			       org.openqa.selenium.Dimension dimension = driver.manage().window().getSize();
			       int start_x = (int) (dimension.width * 0.5);
			       int start_y = (int) (dimension.height * 0.8);
			       
			       int end_x = (int) (dimension.width * 0.2);
			       int end_y = (int) (dimension.height * -0.8);
			       
			        
			       TouchAction action = new TouchAction(driver);
			       action.press(PointOption.point(start_x, start_y))
			        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
			        .moveTo(PointOption.point(end_x, end_y)).release().perform();   
			        
			       
            //comment
			      // Thread.sleep(3000);
			       //WebElement comment =  driver.findElement(By.xpath("//android.view.View[@content-desc=\"12 days ago 3 likes\"]/android.widget.EditText"));
			       //Thread.sleep(3000);
			      // comment.click();
			      // Thread.sleep(3000);
			      // comment.sendKeys("nice pic");   
			       
			       //	
			     //android.view.View[@content-desc="Friend Suggesions 4 days ago 2 likes"]/android.widget.Button
			       
//PLAY PAGE
			       
			       Thread.sleep(4000);
			       driver.findElement(By.xpath("	\r\n"
			       		+ "//android.view.View[@content-desc=\" Play\"]")).click();
			       
			       //answer select
			       
			      // Thread.sleep(4000);
			       driver.findElement(By.xpath("	\r\n"
			      		+ "//android.view.View[@content-desc=\"Toucan\"]")).click();
			       
			       //answer submit
			       
			       Thread.sleep(3000);
			       driver.findElement(By.xpath("	\r\n"
			       		+ "//android.widget.Button[@content-desc=\"Submit\"]")).click();
			   
//HOME
			       Thread.sleep(4000);
			       driver.findElement(By.xpath("	\r\n"
			       		+ "//android.view.View[@content-desc=\"Store\"]")).click();
			       
			     //scroll down
			        
			        Thread.sleep(8000);
			        
			       org.openqa.selenium.Dimension dimension2 = driver.manage().window().getSize();
			       int start_a = (int) (dimension2.width * 0.2);
			       int start_b = (int) (dimension2.height * 0.4);
			       
			       // test comment
			       int end_a = (int) (dimension2.width * 0.2);
			       int end_b = (int) (dimension2.height * -0.4);
			       
			        
			       TouchAction action2 = new TouchAction(driver);
			       action2.press(PointOption.point(start_x, start_y))
			        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
			        .moveTo(PointOption.point(end_x, end_y)).release().perform();   
			       
			       
			      //select item & back
			       
			       // Thread.sleep(8000);
			       // driver.findElement(By.xpath("	\r\n"
			        	//	+ "//android.widget.ImageView[@content-desc=\"00 DAYS 00 HRS 00 MINS 00 SEC 1000 PTZ\"]")).click();
			        
			        Thread.sleep(5000);
			        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button")).click();
			        
			        
//CONNECT
			        Thread.sleep(3000);
			        driver.findElement(By.xpath("	\r\n"
			        		+ "//android.view.View[@content-desc=\"Connect\"]")).click();
			        
			        
			       
			       
//MENU
			        Thread.sleep(3000);
			        driver.findElement(By.xpath("	\r\n"
			        		+ "//android.view.View[@content-desc=\"Menu\"]")).click();
			        
			        //profile**
			        
			        Thread.sleep(5000);
			        driver.findElement(By.xpath("//android.view.View[@content-desc=\"Profile\"]")).click();
			        
			        //orders
			        
			        Thread.sleep(3000);
			        driver.findElement(By.xpath("	\r\n"
			        		+ "//android.widget.Button[@content-desc=\"Orders\"]")).click();
			        
			        
			        
			          //processing
			        
			       // Thread.sleep(3000);
			       // driver.findElement(By.xpath("//android.view.View[@content-desc=\"Processing Tab 2 of 4\"]")).click();
			          
			          //shipped
			        
			      //  Thread.sleep(3000);
			        //driver.findElement(By.xpath("	\r\n"
			        	//	+ "//android.view.View[@content-desc=\"Shipped Tab 3 of 4\"]")).click();
			        
                      //deliver		        
			        
			        //Thread.sleep(3000);
			     //   driver.findElement(By.xpath("	\r\n"
			       // 		+ "//android.view.View[@content-desc=\"Deliverd Tab 4 of 4\"]")).click();
			        
			        //back
			        Thread.sleep(3000);
			        driver.findElement(By.xpath("	\r\n"
			        		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button")).click();


			        
			       
			     //friends
			        Thread.sleep(4000);
			        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Friends\"]")).click();
			        
			        Thread.sleep(4000);
			        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Friends Requests\"]")).click(); 
			        
			     //back
			        
			        Thread.sleep(3000);
			        driver.findElement(By.xpath("	\r\n"
			        		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button[1]")).click(); 
			       
			        
			     //notification
			        
			        Thread.sleep(5000);
			        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Notifications\"]")).click(); 
			        
			        
			/*     //notification see more
			        
			        Thread.sleep(3000);
			        driver.findElement(By.xpath("	\r\n"
			        		+ "//android.widget.Button[@content-desc=\"See\"]")).click();  */
			        
			        
			        
			        
			      //back
			        
			       //  Thread.sleep(5000);
			        // driver.findElement(By.xpath("	\r\n"
			         	//	+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button[1]")).click();
			         
			         Thread.sleep(4000);
				     driver.findElement(By.xpath("	\r\n"
				        		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[9]")).click();
				   
				    
				        
				   //change password**
				        
				      Thread.sleep(3000);
				      driver.findElement(By.xpath("//android.view.View[@content-desc=\"Change Password\"]")).click();
				       
				       
		/*		   //current password
				       
				       Thread.sleep(3000); 
				       WebElement password1 =  driver.findElement(By.xpath("//android.view.View[@content-desc=\"Change password\"]/android.widget.EditText[1]\r\n"
				       		+ ""));
				        
				        password1.click();
				        Thread.sleep(2000);
				        password1.sendKeys("testing");
				        Thread.sleep(2000);
				        password1.clear();
				        
				    //new password
				        
				        Thread.sleep(3000);
				        WebElement password2 = driver.findElement(By.xpath("	\r\n"
				        		+ "//android.view.View[@content-desc=\"Change password\"]/android.widget.EditText[2]"));
				        
				        
                        password2.click();
                        Thread.sleep(2000);
                        password2.sendKeys("testing");
                        Thread.sleep(2000);
                        password2.clear();
                        
                     //confirm new password
                        
                        Thread.sleep(3000);
                        WebElement password3 = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Change password\"]/android.widget.EditText[3]"));
				        
				        password3.click();
				        Thread.sleep(2000);
				        password3.sendKeys("testing");
				        Thread.sleep(2000);
				        password3.clear();                           */
				        
				     //save
				        
				        Thread.sleep(3000);
				        driver.findElement(By.xpath("	\r\n"
				        		+ "//android.widget.Button[@content-desc=\"Save\"]")).click();
				        
				      
				     //support**
				        
				        Thread.sleep(3000);
				        driver.findElement(By.xpath("	\r\n"
				        		+ "//android.view.View[@content-desc=\"Support\"]")).click();
				        
				     
			
				        Thread.sleep(3000);
				        
				        
				      //save
				        
				        Thread.sleep(3000);
				        driver.findElement(By.xpath("	\r\n"
				        		+ "//android.widget.Button[@content-desc=\"Save\"]")).click();
				        
				        
          /*           //about us**
				        
				        Thread.sleep(3000);
				        driver.findElement(By.xpath("	\r\n"
				        		+ "//android.view.View[@content-desc=\"About Us\"]")).click();  
				        
				        
				        
				        
				        
				        
				     
				        
			/*	        Thread.sleep(4000);
				        
					       org.openqa.selenium.Dimension dimension1 = driver.manage().window().getSize();
					       int start_x1 = (int) (dimension1.width * 0.5);
					       int start_y1 = (int) (dimension1.height * 0.8);
					       
					       int end_x1 = (int) (dimension1.width * 0.2);
					       int end_y1 = (int) (dimension1.height * -0.8);
					       
					        
					       TouchAction action1 = new TouchAction(driver);
					       action1.press(PointOption.point(start_x1, start_y1))
					        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
					        .moveTo(PointOption.point(end_x1, end_y1)).release().perform();
					       
					       
					       
					       Thread.sleep(3000);
					       
					       dimension1 = driver.manage().window().getSize();
					       start_x1 = (int) (dimension1.width * 0.5);
					       start_y1 = (int) (dimension1.height * -0.8);
					       
					       end_x1 = (int) (dimension1.width * 0.2);
					       end_y1 = (int) (dimension1.height * 0.8);
					       
					        
					       action1 = new TouchAction(driver);
					       action1.press(PointOption.point(start_x1, start_y1))
					        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
					        .moveTo(PointOption.point(end_x1, end_y1)).release().perform();      */
				        
				        
				        
			/*	        //about us back
				          
				          Thread.sleep(4000);
				          driver.findElement(By.xpath("	\r\n"
				          		+ "//android.widget.Button[@content-desc=\"About Us\"]")).click(); */
				          
				        
				          
				         //log out** 
				          
				          Thread.sleep(3000);
				          driver.findElement(By.xpath("	\r\n"
				          		+ "//android.view.View[@content-desc=\"Log out\"]")).click();
				          
				          
				         //cancel
				          
				          Thread.sleep(3000);
				          driver.findElement(By.xpath("	\r\n"
				          		+ "//android.widget.Button[@content-desc=\"Cancel\"]")).click();
				        
				          
//AGAIN HOME
				          Thread.sleep(3000);
					      driver.findElement(By.xpath("//android.view.View[@content-desc=\"Home\"]")).click();
					       
					       
				/*	       //click post 3 dots
					       
					       Thread.sleep(5000);
					       driver.findElement(By.xpath("	\r\n"
					       		+ "//android.view.View[@content-desc=\"Friend Suggesions 2 hours ago new 2 likes\"]/android.widget.Button")).click();
					       
					       
					       //post edit
					       
					       Thread.sleep(3000);
					       driver.findElement(By.xpath("	\r\n"
					       		+ "//android.widget.Button[@content-desc=\"Edit\"]")).click();    */
					       
					       
					       //what's on your mind
					       
					       Thread.sleep(3000);
					       driver.findElement(By.xpath("//android.view.View[@content-desc=\"What is on your mind?\"]")).click();
					       
					       
					       //write 
					       
					       Thread.sleep(3000);
					       
					       WebElement text = driver.findElement(By.xpath("	\r\n"
					       		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.EditText"));
					       
					       text.click();
					       Thread.sleep(2000);
					       text.sendKeys("testing post");
					       
					       //posting this post
					       
					       Thread.sleep(3000);
					       driver.findElement(By.xpath("	\r\n"
					       		+ "//android.widget.Button[@content-desc=\"Post\"]")).click();
					       
				/*	       //visit profile
					       
					       Thread.sleep(3000);					       
					       driver.findElement(By.xpath("(//android.widget.Button[@content-desc=\"Visit\"])[1]")).click();
				          
					       
					       //requested
					       
					       Thread.sleep(3000);
					       driver.findElement(By.xpath("	\r\n"
					       		+ "//android.widget.Button[@content-desc=\"Requested\"]")).click();   */
				          
					       
					       //notification bell icon
					       
					       Thread.sleep(3000);
					       driver.findElement(By.xpath("	\r\n"
					       		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button")).click();
					       
					       //like a post
					       
					       Thread.sleep(8000);
					       driver.findElement(By.xpath("	\r\n"
					       		+ "//android.view.View[@content-desc=\"2 minutes ago testing post 0 likes\"]/android.widget.Button")).click();
					       
					       //comment a post
					       
					       Thread.sleep(3000);
					       WebElement comment =  driver.findElement(By.xpath("//android.view.View[@content-desc=\"about an hour ago testing post 0 likes\"]/android.widget.EditText"));
					       comment.click();
					       Thread.sleep(2000);
					       comment.sendKeys("tetsting comment");
					       
					       
					       
					       
					       					       
					   					       					   					       
					       
				        
				        
				    //profile**
				        
				     Thread.sleep(3000);
				     driver.findElement(By.xpath("//android.view.View[@content-desc=\"Profile\"]")).click();      
			         
			       
			         
			       //see more
			         
			        Thread.sleep(3000);
			        WebElement seemore = driver.findElement(By.xpath("//android.view.View[@content-desc=\"See More\"]"));
			        seemore.click();
			        
			        
			       //edit
			        
			        Thread.sleep(3000);
			        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Edit\"]")).click();
			        
			        
			       //name
			        
			        
			        
			        
       
			       Thread.sleep(3000);
			        WebElement name =  driver.findElement(By.xpath("	\r\n"
			        		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]"));
			        
			        
			        Thread.sleep(3000);
			        name.click();			        
			        Thread.sleep(3000);
			        name.clear();
			        Thread.sleep(2000);
			        name.sendKeys("Tharuke Rajapaksha");
			        
			        
			       
			        
			      //user name
			        
			        Thread.sleep(3000);
			        WebElement user =  driver.findElement(By.xpath("	\r\n"
			        		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]"));
			        
			        Thread.sleep(3000);
			        user.click();
			        Thread.sleep(2000);
			        user.clear();
			        Thread.sleep(2000);
			        user.sendKeys("depp123");
			        
 
			        
			        
			       //public email 
			        
			        
			        Thread.sleep(2000);
			        WebElement  email =  driver.findElement(By.xpath("	\r\n"
			        		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[4]"));
			        
			        Thread.sleep(2000);
			         email.click();
			        Thread.sleep(2000);
			         email.clear();
			        Thread.sleep(3000);
			         email.sendKeys("testdepp@gmail.com");
			        
			       
			         //date of birth
				        
				        
				       Thread.sleep(2000);
				       WebElement  birth =  driver.findElement(By.xpath("	\r\n"
				       		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[4]"));
				       birth.click();
				       
				       Thread.sleep(3000);
				       driver.findElement(By.xpath("	\r\n"
				       		+ "//android.widget.Button[@content-desc=\"OK\"]")).click();
				          
				  
			      
			         
			         
				        
				      //address
				        
				        
				        Thread.sleep(2000);
				        WebElement  address =  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[3]"));
				        
				        Thread.sleep(3000);
				         address.click();
				        Thread.sleep(2000);
				         address.clear();
				        Thread.sleep(2000);
				         address.sendKeys("No 15,Hela Halpe");
				         
				       //city
					        
					        
					      Thread.sleep(2000);
					      WebElement  city =  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[5]"));
					        
					      Thread.sleep(3000);
					      city.click();
					      Thread.sleep(2000);
					      city.clear();
					      Thread.sleep(2000);
					      city.sendKeys("Halpe");  
				          
				        
			      //save
					      
					      Thread.sleep(3000);
					      driver.findElement(By.xpath("	\r\n"
					      		+ "//android.widget.Button[@content-desc=\"Save\"]")).click();
					      
					      
					    //scroll down
					        
					       Thread.sleep(8000);
					        
					       org.openqa.selenium.Dimension dimension1 = driver.manage().window().getSize();
					       int start_x1 = (int) (dimension1.width * 0.5);
					       int start_y1 = (int) (dimension1.height * -0.8);
					       
					       int end_x1 = (int) (dimension1.width * 0.2);
					       int end_y1 = (int) (dimension1.height * -0.8);
					       
					        
					       TouchAction action1 = new TouchAction(driver);
					       action1.press(PointOption.point(start_x1, start_y1))
					        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
					        .moveTo(PointOption.point(end_x1, end_y1)).release().perform();     
			        
					      
					   //back
					      Thread.sleep(5000);   
					      driver.findElement(By.xpath("	\r\n"
					      		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.Button")).click();
					      
			        
			        
			        
			    	
			     
			        
			        
			        
			}
}
			        
