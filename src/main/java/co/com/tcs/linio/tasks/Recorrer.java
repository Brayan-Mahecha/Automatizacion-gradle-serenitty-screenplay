package co.com.tcs.linio.tasks;

import co.com.tcs.linio.userinterface.AnadirCarrito;
import co.com.tcs.linio.userinterface.ClickInicio;


import co.com.tcs.linio.userinterface.MechaPage;
import co.com.tcs.linio.userinterface.SeccionColchones;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;


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
                Click.on(MechaPage.PATROCINADORES),
                Click.on(MechaPage.PRENSA),
                Click.on(MechaPage.REGISTRO),
                Click.on(MechaPage.CONTACTO));
    }

    // creamos metodo que retorna la tarea instrumentada  que viene desde overrider
    public static Recorrer Header (){ return Tasks.instrumented(Recorrer.class);
    }

}
