package com.nttdata.stepDefinitions;

import com.nttdata.tasks.NavegarA;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;

public class IngresarAPaginaStepDefinition {

    @Given("el {actor} ingresa a la página web de Demon Blaze")
    public void elActorIngresaALaPáginaWebDeDemonBlaze(Actor actor) {
//        Abrimos la página web
        actor.attemptsTo(NavegarA.theHomePage());
    }
}


