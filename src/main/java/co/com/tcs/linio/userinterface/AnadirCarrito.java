package co.com.tcs.linio.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class AnadirCarrito {

    // ubicamos el elemento mediante un xpath
    public static final Target BOTON = Target.the("añadir al carrito").
            locatedBy("//*[@ id=\'buy-now\']");

    // ubicamos el elemento mediante un xpath
    public static final Target CANTIDAD= Target.the("pestaña cantidad").
            locatedBy("//li[@data-value=\'3\'] ");

}
