package co.com.tcs.linio.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MechaPage {
    public static final Target TIENDAS_OFICIALES = Target.the("tiendas").located(By.xpath("//body/nav[@id='secondary-navigation']/div[1]/div[1]/ul[1]/li[1]/a[1]"));
    public static final Target cookies = Target.the("cookies").located(By.xpath("//*[@id='onesignal-slidedown-cancel-button']"));

    public static final Target FRASE = Target.the("FRASE").located(By.xpath("/html/body/header/div/nav[1]/div/div[3]/ul/li[8]/a"));
    public static final Target PATROCINADORES = Target.the("PATROCINADORES").located(By.xpath("//a[contains(text(),'Patrocinadores')]"));
    public static final Target PRENSA = Target.the("PRENSA").located(By.xpath("//body/nav[@id='secondary-navigation']/div[1]/div[1]/ul[1]/li[3]/a[1]"));
    public static final Target REGISTRO = Target.the("REGISTRO").located(By.xpath("//a[contains(text(),'Registro')]"));
    public static final Target CONTACTO = Target.the("CONTACTO").located(By.xpath("//body/nav[@id='secondary-navigation']/div[1]/div[1]/ul[1]/li[5]/a[1]"));
    public static final Target INGRESAR_CORREO = Target.the("INGRESAR_CORREO").located(By.xpath("//*[@id='form-field-email'][1]"));
    public static final Target ENVIAR_CORREO = Target.the("ENVIAR_CORREO").located(By.xpath("//*[@class='elementor-button-text'][1]"));



}
