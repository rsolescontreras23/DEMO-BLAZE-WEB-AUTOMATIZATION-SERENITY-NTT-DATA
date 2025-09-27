package com.nttdata.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target INP_USERNAME = Target.the("Campo de texto para el nombre")
            .located(By.id("loginusername"));

    public static final Target INP_CONTRASENIA = Target.the("Campo de texto para el apellido")
            .located(By.id("loginpassword"));

    public static final  Target BTN_LOGIN = Target.the("Botón de registro").located(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));

}
