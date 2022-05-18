package co.com.tcs.linio.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class ClickInicio {

    // Creamos atrubutos con los elementos con que vamos a interactuar en la pagina
    public static final Target BOTON_MENU = Target.the("boton menu despleglable").
            locatedBy("//div[@class=\'icon icon-hamburger\']");

    public static final Target OPCION_COLCHONES = Target.the("boton colchones").
            locatedBy("//*[@title=\'Colchones, Base Camas y Almohadas\'] ");

}
