package co.com.tcs.linio.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;
import net.serenitybdd.screenplay.actions.ScrollToBy;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.WaitUntil;
import co.com.tcs.linio.userinterface.MechaPage;
import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.junit.Assert;
import org.seleniumhq.jetty9.util.log.Logger;

import java.sql.Driver;
import java.sql.SQLOutput;

//Implementamos task de serenitybdd

public class Recorrer implements Task {

// creamos constructor de la clase

    public Recorrer() {
    }

    //indicamos acciones de actor en la pagina en el override
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MechaPage.cookies));
        wait(2);
        actor.attemptsTo(Click.on(MechaPage.TIENDAS_OFICIALES));
        wait(2);
        actor.attemptsTo(Scroll.to(MechaPage.TIENDA_COSMOCENTRO));
        actor.attemptsTo(WaitUntil.the(MechaPage.PATROCINADORES, WebElementStateMatchers.isPresent()),  //explicit wait
                Click.on(MechaPage.PATROCINADORES),
                Scroll.to(MechaPage.GOLTY));
        Assert.assertTrue(true);

        actor.attemptsTo(Click.on(MechaPage.PRENSA),
                Click.on(MechaPage.REGISTRO),
                WaitUntil.the(MechaPage.CONTACTO, WebElementStateMatchers.isClickable()),     //otra explicit wait
                Click.on(MechaPage.CONTACTO));
        wait(2);  //una espera implicita

        if (Visibility.of(MechaPage.TIENDAS_OFICIALES).viewedBy(actor).asBoolean()){
            actor.attemptsTo(Click.on(MechaPage.TIENDAS_OFICIALES));
            System.out.println("if ejecutado con exito");
        }
    }

    // creamos metodo que retorna la tarea instrumentada  que viene desde overrider
    public static Recorrer Header (){ return Tasks.instrumented(Recorrer.class);
    }

    //un metodo para espera implicita
    public static void wait(int i){
        try {
            Thread.sleep((long) i*1000);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }

}
