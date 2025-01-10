package com;

public class BrowserWindowHandleTogether {
    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = new ChromeDriver();//Browser
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//w1
        Thread.sleep(3000);
        driver.findElement(By.xpath("a//a[contains(@href,'twitter')]")).click();//w2

        //1. fetching wondow ids:
        Set<String> handles =driver.getWindowHandles();

        //set to list
        List<String> handlesList = new ArrayList<String>(handles);

        String parentWindowId = handleslist.get(0);
         String parentWindowId = handleslist.get(0);

         //2.switch work
         driver.switchTo().window(childWindowId);
         System.out.println("child Window url: " + driver.getCurrentUrl());

         //close child window
         driver.close();

         //come to parent window
         driver.switchTo().window(parentWindowId);
         System.out.println("parent Window url: " + driver.getCurrentUrl());

         driver.quit();


    }
}
