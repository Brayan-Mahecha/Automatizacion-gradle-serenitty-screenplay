package co.com.tcs.linio.tasks;

import co.com.tcs.linio.userinterface.MechaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;

import static co.com.tcs.linio.userinterface.MechaPage.INGRESAR_CORREO;

public class IngresarCorreo implements Task {

    //se crea atributo tipo strig con su constructor para usarlo en override
    String Email;
    public IngresarCorreo(String Email) {
    this.Email = Email;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(MechaPage.REGISTRO));
    wait(2);
    actor.attemptsTo(Enter.theValue(Email).into(INGRESAR_CORREO),
            Click.on(MechaPage.ENVIAR_CORREO));
    }
    public static IngresarCorreo InLogin (String Email) {return Tasks.instrumented(IngresarCorreo.class,Email);
    }

    public static void wait(int i){
        try {
            Thread.sleep((long) i*1000);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
