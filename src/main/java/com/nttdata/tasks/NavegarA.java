package com.nttdata.tasks;

import com.nttdata.pages.HomePage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavegarA {

    public static Performable theHomePage(){
        return Task.where("navega a la pagina de inicio",
                Open.browserOn().the(HomePage.class));
    }
}
