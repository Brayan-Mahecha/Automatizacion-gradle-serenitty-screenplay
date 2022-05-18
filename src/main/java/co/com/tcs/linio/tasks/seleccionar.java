package co.com.tcs.linio.tasks;

import co.com.tcs.linio.userinterface.ClickInicio;
import co.com.tcs.linio.userinterface.LinioPage;

import co.com.tcs.linio.userinterface.SeccionColchones;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;



//Implementamos task de serenitybdd

public class seleccionar implements Task {

// creamos atributo de home para abrir pagina
   // private linioPage HomePage;


    public seleccionar() {
    }

    //indicamos acciones de pagina homePage
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ClickInicio.BOTON_MENU));
        actor.attemptsTo (Click.on(ClickInicio.OPCION_COLCHONES));
        actor.attemptsTo (Click.on(SeccionColchones.PRODUCTO));
    }

    // creamos metodo que retorna la tarea instrumentada  que viene desde overrider
    public static seleccionar seleccionamosColchones (){ return Tasks.instrumented(seleccionar.class);
    }

}
