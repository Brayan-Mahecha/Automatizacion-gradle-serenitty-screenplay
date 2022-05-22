package co.com.tcs.linio.questions;

import co.com.tcs.linio.userinterface.TuProductoSeAgrego;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class visualizaProductos implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return TuProductoSeAgrego.PRECIO.resolveAllFor(actor).get(0).getText();
    }

    public static visualizaProductos verColchones (){ return new visualizaProductos();}
}
