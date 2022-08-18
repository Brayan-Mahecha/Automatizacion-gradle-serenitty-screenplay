package co.com.tcs.linio.stepdefinitions;


import co.com.tcs.linio.questions.TheTitleAME;
import co.com.tcs.linio.tasks.Recorrer;
import co.com.tcs.linio.userinterface.LinioPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
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
        theActorInTheSpotlight().attemptsTo(Recorrer.Header());

    }
    @Then("^el usuario deberia ver el nombre en la aplicacion (.*)$")
    public void elUsuarioDeberiaVerElNombreEnLaAplicacion(String titulo) {
        theActorInTheSpotlight().should(seeThat(TheTitleAME.isPresent(), Matchers.equalTo(titulo)));
        //el actor que esta en la luz, pudo ver, si el mensaje es visible , y comparelo con "mensaje"
    }


}
