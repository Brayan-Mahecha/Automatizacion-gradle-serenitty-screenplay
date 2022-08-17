package co.com.tcs.linio.stepdefinitions;


import co.com.tcs.linio.tasks.seleccionar;
import co.com.tcs.linio.userinterface.LinioPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CompraProductoStepDefinitions {

    LinioPage page;


// configuracion inicial creacion escenario
    @Before
    public void setup() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Brayan");
    }


    @Given("^el usuario se encuentra en la pagina (.*)$")
    public void elUsuarioSeEncuentraEnLaPagina (String url) {
        theActorInTheSpotlight().attemptsTo(Open.browserOn(page));
    }


    @When("^el usuario interactua con el header alto de la pagina$")
    public void elusuariointeractuaconelheaderaltodelapagina() {
        theActorInTheSpotlight().attemptsTo(seleccionar.seleccionamosColchones());

    }


}
