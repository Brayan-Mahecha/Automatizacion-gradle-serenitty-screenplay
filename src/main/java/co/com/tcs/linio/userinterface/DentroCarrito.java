package co.com.tcs.linio.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class DentroCarrito {

    // ubicamos el elemento mediante un xpath
    public static final Target ELIMINAR = Target.the("eliminar productos carrito").
            locatedBy("//*[@ng-click=\'cart.removeItem(item.sku)\']");
}
