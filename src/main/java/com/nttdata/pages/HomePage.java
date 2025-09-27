package com.nttdata.pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://www.demoblaze.com/")
public class HomePage extends PageObject {

    // SIGN UP

    public static final Target ITM_SIGN_UP = Target.the("Item para ir a Registrarse")
            .located(By.id("signin2"));

    // LOG IN

    public static final Target ITM_LOG_IN = Target.the("Item para Iniciar Sesión")
            .located(By.id("login2"));


    // LOG OUT
    public static final Target ITM_LOG_OUT = Target.the("Item para Cerrar Sesión")
            .located(By.id("logout2"));
}
