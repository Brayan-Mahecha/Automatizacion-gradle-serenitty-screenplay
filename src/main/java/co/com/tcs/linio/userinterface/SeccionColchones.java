package co.com.tcs.linio.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class SeccionColchones {

    // ubicamos el elemento mediante un xpath
    public static final Target PRODUCTO = Target.the("producto seleccionado").
            locatedBy("//img[@src=\'//i.linio.com/p/4c69640cbae435739d09636594759e3c-catalog.jpg\']");
}
