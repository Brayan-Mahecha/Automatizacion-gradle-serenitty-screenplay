package co.com.tcs.linio.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import co.com.tcs.linio.userinterface.linioPage;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

//Implementamos task de serenitybdd

public class seleccionar implements Task {

// creamos atributo de home para abrir pagina
   // private linioPage HomePage;



//indicamos acciones de pagina homePage
    @Override
    public <T extends Actor> void performAs(T actor) {
        Click.on(linioPage.BOTON_MENU);
    }

    // creamos metodo para instrumentar tarea seleccionar colchones
    public static seleccionar SeIngresaColchones (){ return Tasks.instrumented(seleccionar.class);
    }

}
