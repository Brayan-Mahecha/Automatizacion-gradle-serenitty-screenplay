package co.com.tcs.linio.questions;

import co.com.tcs.linio.userinterface.CarritoLimpio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class  Themensaje implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return CarritoLimpio.FRASE.resolveAllFor(actor).get(0).getText();
    }
    public static Themensaje isVisible () {
        return new Themensaje();
    }
}
