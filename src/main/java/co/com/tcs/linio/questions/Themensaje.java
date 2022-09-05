package co.com.tcs.linio.questions;

import co.com.tcs.linio.userinterface.MechaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class  Themensaje implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
    //le pasamos el objeto como un Target y luego le decimos que lo vea como string, aqui validaremos la respuesta como resultado
        return Text.of(MechaPage.FRASE).viewedBy(actor).asString();
    }
    public static Themensaje isVisible () {
        return new Themensaje();
    }
}
