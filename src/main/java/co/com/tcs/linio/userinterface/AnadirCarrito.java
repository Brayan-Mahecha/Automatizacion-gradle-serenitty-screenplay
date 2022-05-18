package co.com.tcs.linio.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AnadirCarrito {


    // ubicamos el elemento mediante un xpath
    public static final Target BOTON_DESPLEGABLE= Target.the("boton desplegable").
            located(By.id("selected-option-product-quantity"));


    // ubicamos el elemento mediante un xpath
    public static final Target OPCION_TRES= Target.the("elegimos tres unidades").
            locatedBy("//li[@data-value=\\'3\\']");

    // ubicamos el elemento mediante un xpath

    public static final Target OPCION_ANADIR = Target.the("añadir al carrito").
            located(By.id("buy-now"));

    // ubicamos el elemento mediante un xpath
    public static final Target BOTON_IR_CARRITO= Target.the("boton para ir al carrito").
            locatedBy("//href[@class=\'btn btn-sm btn-go-to-cart added-product\']");

}
