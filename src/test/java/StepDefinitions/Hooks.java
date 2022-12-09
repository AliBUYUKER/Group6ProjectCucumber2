package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void before()
    {  System.out.println("Senaryo başladı");   }
    @After
    public void after(Scenario scenario)
    {
        System.out.println("senaryo bitti");
        if (scenario.isFailed())
        {
           final byte[] byteHali= ((TakesScreenshot) GWD.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(byteHali,"image/png", "screenshot name");

            //TakesScreenshot ts= (TakesScreenshot) GWD.getDriver();

           /* File hafizadakiHali=ts.getScreenshotAs(OutputType.FILE);

            LocalDateTime time=LocalDateTime.now();
            DateTimeFormatter tf= DateTimeFormatter.ofPattern("dd_MM_YYHHmmss");
            try {
                FileUtils.copyFile(hafizadakiHali, new File("ekranGoruntuleri\\screenshot_"+time.format(tf)+".png"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }*/
        }
        GWD.quitDriver();
    }
}
