package co.com.tcs.linio.questions;

import co.com.tcs.linio.userinterface.MechaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheTitleAME implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return MechaPage.FRASE.resolveAllFor(actor).get(0).getText();
    }

    public static TheTitleAME isPresent () {return new TheTitleAME();
    }
}
