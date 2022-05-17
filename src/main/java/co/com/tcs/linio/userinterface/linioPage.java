package co.com.tcs.linio.userinterface;

// aqui indicamos la direccion de la pagina web

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.linio.com.co/")

// extiende desde serenity pageObject

public class linioPage extends PageObject {

    public static final Target BOTON_MENU = Target.the("boton menu despleglable").
            locatedBy("//*[@title=\'Colchones, Base Camas y Almohadas\'] ");
}
