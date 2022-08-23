package co.com.tcs.linio.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import co.com.tcs.linio.userinterface.MechaPage;

//Implementamos task de serenitybdd

public class Recorrer implements Task {

// creamos atributo de home para abrir pagina
   // private linioPage HomePage;


    public Recorrer() {
    }

    //indicamos acciones de pagina homePage
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MechaPage.cookies),
                Click.on(MechaPage.TIENDAS_OFICIALES),
                WaitUntil.the(MechaPage.TIENDAS_OFICIALES, WebElementStateMatchers.isPresent()),  //explicit wait
                Click.on(MechaPage.PATROCINADORES),
                Click.on(MechaPage.PRENSA),
                Click.on(MechaPage.REGISTRO),
                (WaitUntil.the(MechaPage.CONTACTO, WebElementStateMatchers.isClickable())),     //otra explicit wait
                Click.on(MechaPage.CONTACTO));
    }

    // creamos metodo que retorna la tarea instrumentada  que viene desde overrider
    public static Recorrer Header (){ return Tasks.instrumented(Recorrer.class);
    }

}
