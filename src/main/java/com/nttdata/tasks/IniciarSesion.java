package com.nttdata.tasks;

import com.nttdata.pages.LoginPage;
import com.nttdata.pages.RegisterPage;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

@AllArgsConstructor
public class IniciarSesion implements Task {

    private final String username;
    private final String contrasenia;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(LoginPage.INP_USERNAME),
                Enter.theValue(contrasenia).into(LoginPage.INP_CONTRASENIA),
                Click.on(LoginPage.BTN_LOGIN)
        );
    }

    public static Performable withData(String username, String contrasenia){
        return new IniciarSesion(username, contrasenia);
    }

}
