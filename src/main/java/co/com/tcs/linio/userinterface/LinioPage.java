package co.com.tcs.linio.userinterface;

// aqui indicamos la direccion de la pagina web


import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.linio.com.co/")

// extiende desde serenity pageObject

public class LinioPage extends PageObject {

    public static final Target BOTON_MENU = Target.the("boton menu despleglable").
            locatedBy("//*[@title=\'Colchones, Base Camas y Almohadas\'] ");

    public static final Target PRODUCTO = Target.the("producto seleccionado").
            locatedBy("//img[@src=\'//i.linio.com/p/4c69640cbae435739d09636594759e3c-catalog.jpg\']");
}
