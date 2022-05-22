package co.com.tcs.linio.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class CarritoLimpio {

   //es constante, estatica que se puede acceder desde cualquier parte osea publica
    public static final Target FRASE = Target.the("mensaje sin productos").
            locatedBy("//h2[@class=\'highlight col-md-6 offset-md-3\']");
}
