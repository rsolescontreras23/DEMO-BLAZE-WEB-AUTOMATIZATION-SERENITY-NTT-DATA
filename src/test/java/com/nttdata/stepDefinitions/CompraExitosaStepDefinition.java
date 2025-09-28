package com.nttdata.stepDefinitions;

import com.nttdata.pages.HomePage;
import com.nttdata.pages.ProductPage;
import com.nttdata.questions.AlertaQuestion;
import com.nttdata.questions.CarritoQuestion;
import com.nttdata.questions.LoginQuestion;
import com.nttdata.tasks.LlenarFormulario;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.equalTo;

public class CompraExitosaStepDefinition {
    @When("selecciona aleatoriamente un producto de la primera página")
    public void seleccionaAleatoriamenteUnProductoDeLaPrimeraPágina() {
        theActorInTheSpotlight().attemptsTo(Click.on(ProductPage.A_PRODUCTO));
    }

    @And("lo añade al carrito de compras")
    public void loAñadeAlCarritoDeCompras() {
        theActorInTheSpotlight().attemptsTo(WaitUntil.the(ProductPage.BTN_AGREGAR_AL_CARRITO, isVisible()).forNoMoreThan(30).seconds());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        theActorInTheSpotlight().attemptsTo(Click.on(ProductPage.BTN_AGREGAR_AL_CARRITO));
    }

    @Then("se agrega el producto exitosamente")
    public void seAgregaElProductoExitosamente() {
        theActorInTheSpotlight().should(
                seeThat(AlertaQuestion.texto(), equalTo("Product added."))
        );
    }

    @When("selecciona el item Cart para ver el carrito")
    public void seleccionaElItemCartParaVerElCarrito() {
        theActorInTheSpotlight().attemptsTo(WaitUntil.the(ProductPage.ITM_CARRITO, isVisible()).forNoMoreThan(30).seconds());
        theActorInTheSpotlight().attemptsTo(Click.on(ProductPage.ITM_CARRITO));
    }

    @And("selecciona el botón Place Order para realizar un pedido")
    public void seleccionaElBotónPlaceOrderParaRealizarUnPedido() {
        theActorInTheSpotlight().attemptsTo(WaitUntil.the(ProductPage.BTN_REALIZAR_PEDIDO, isVisible()).forNoMoreThan(30).seconds());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        theActorInTheSpotlight().attemptsTo(Click.on(ProductPage.BTN_REALIZAR_PEDIDO));
    }

    @And("completa el formulario con los datos nombre {string}, país {string}, ciudad {string}, número de tarjeta de crédito {string}, mes {string} y año {string}")
    public void completaElFormularioConLosDatosNombrePaísCiudadNúmeroDeTarjetaDeCréditoMesYAño(String name, String country, String city, String creditcard, String month, String year) {
        theActorInTheSpotlight().attemptsTo(WaitUntil.the(ProductPage.BTN_COMPRAR, isVisible()).forNoMoreThan(30).seconds());
        theActorInTheSpotlight().attemptsTo(LlenarFormulario.withData(name, country, city, creditcard, month, year));
    }

    @And("selecciona el botón Purchase")
    public void seleccionaElBotónPurchase() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        theActorInTheSpotlight().attemptsTo(Click.on(ProductPage.BTN_COMPRAR));
    }


    @Then("se realiza la compra exitosamente")
    public void seRealizaLaCompraExitosamente() {
        theActorInTheSpotlight().attemptsTo(WaitUntil.the(ProductPage.MSG_COMPRA_EXITOSA, isVisible()).forNoMoreThan(30).seconds());
        theActorInTheSpotlight().should(seeThat(LoginQuestion.visibleEn(ProductPage.MSG_COMPRA_EXITOSA), equalTo("Thank you for your purchase!")));
    }

    @Then("el carrito esta vácio")
    public void elCarritoEstaVácio() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        theActorInTheSpotlight().should(seeThat(CarritoQuestion.visibleEn(ProductPage.TBODY_PRODUCTOS), equalTo(true)));
    }


    @And("presiona el botón OK del mensaje exitoso")
    public void presionaElBotónOKDelMensajeExitoso() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        theActorInTheSpotlight().attemptsTo(Click.on(ProductPage.BTN_COMPRA_EXITOSA));
    }
}
