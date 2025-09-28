package com.nttdata.stepDefinitions;

import com.nttdata.pages.HomePage;
import com.nttdata.questions.AlertaQuestion;
import com.nttdata.questions.LoginQuestion;
import com.nttdata.tasks.IniciarSesion;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.equalTo;

public class IniciarSesionStepDefinition {
    @And("selecciona el item Log in para el inición de sesión")
    public void seleccionaElItemLogInParaElRegisrtoDeUsuario() {
        theActorInTheSpotlight().attemptsTo(Click.on(HomePage.ITM_LOG_IN));
    }

    @When("se logea ingresando nombre de usuario {string}  y contrasenia {string}")
    public void seLogeaIngresandoNombreDeUsuarioYContrasenia(String username, String password) {
        theActorInTheSpotlight().attemptsTo(IniciarSesion.withData(username, password));
    }

    @Then("se inicia sesión de manera exitosa")
    public void seIniciaSesiónDeManeraExitosa() {

        theActorInTheSpotlight().attemptsTo(WaitUntil.the(HomePage.ITM_LOG_OUT, isVisible()).forNoMoreThan(30).seconds());
        theActorInTheSpotlight().should(seeThat(LoginQuestion.visibleEn(HomePage.ITM_LOG_OUT), equalTo("Log out")));
    }

    @Then("se muestra el mensaje de que el usuario no existe")
    public void seMuestraElMensajeDeQueElUsuarioNoExiste() {
        theActorInTheSpotlight().should(
                seeThat(AlertaQuestion.texto(), equalTo("User does not exist."))
        );
    }


    @When("inicia sesión ingresando el username {string} y la contraseña {string}")
    public void iniciaSesiónIngresandoElUsernameYLaContraseña(String username, String password) {
        theActorInTheSpotlight().attemptsTo(IniciarSesion.withData(username, password));
    }
}
