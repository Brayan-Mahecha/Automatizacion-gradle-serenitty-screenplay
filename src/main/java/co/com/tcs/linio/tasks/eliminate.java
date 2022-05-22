package co.com.tcs.linio.tasks;

;
import co.com.tcs.linio.userinterface.DentroCarrito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class eliminate implements Task {

   @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DentroCarrito.ELIMINAR));

    }

    public static eliminate eliminamosProductos (){ return  Tasks.instrumented(eliminate.class);
    }
}
