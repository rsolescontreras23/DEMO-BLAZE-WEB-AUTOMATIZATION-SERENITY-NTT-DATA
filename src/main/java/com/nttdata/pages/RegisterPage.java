package com.nttdata.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage extends PageObject {

    public static final Target INP_USERNAME = Target.the("Campo de texto para el nombre")
            .located(By.id("sign-username"));

    public static final Target INP_CONTRASENIA = Target.the("Campo de texto para el apellido")
            .located(By.id("sign-password"));

    public static final  Target BTN_SIGN_UP = Target.the("Botón de registro").located(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]"));

}
