package co.com.tcs.linio.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MechaPage {
    public static final Target TIENDAS_OFICIALES = Target.the("tiendas").located(By.xpath("//body/nav[@id='secondary-navigation']/div[1]/div[1]/ul[1]/li[1]/a[1]"));
    public static final Target cookies = Target.the("tiendas").located(By.xpath("//*[@id='onesignal-slidedown-cancel-button']"));


    ////*[@id="onesignal-slidedown-cancel-button"]
}
