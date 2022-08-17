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

public class seleccionar implements Task {

// creamos atributo de home para abrir pagina
   // private linioPage HomePage;


    public seleccionar() {
    }

    //indicamos acciones de pagina homePage
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MechaPage.cookies));
        actor.attemptsTo(Click.on(MechaPage.TIENDAS_OFICIALES));
    }

    // creamos metodo que retorna la tarea instrumentada  que viene desde overrider
    public static seleccionar seleccionamosColchones (){ return Tasks.instrumented(seleccionar.class);
    }

}
