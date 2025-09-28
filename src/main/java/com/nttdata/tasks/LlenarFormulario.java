package com.nttdata.tasks;

import com.nttdata.pages.ProductPage;
import com.nttdata.pages.RegisterPage;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

@AllArgsConstructor
public class LlenarFormulario implements Task {
    private final String name;
    private final String country;
    private final String city;
    private final String creditcard;
    private final String month;
    private final String year;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(name).into(ProductPage.INP_NOMBRE),
                Enter.theValue(country).into(ProductPage.INP_PAIS),
                Enter.theValue(city).into(ProductPage.INP_CIUDAD),
                Enter.theValue(creditcard).into(ProductPage.INP_TARJETA_DE_CREDITO),
                Enter.theValue(month).into(ProductPage.INP_MES),
                Enter.theValue(year).into(ProductPage.INP_ANIO)
        );
    }

    public static Performable withData(String name, String country, String city, String creditcard, String month, String year){
        return new LlenarFormulario(name, country, city, creditcard, month, year);
    }
}
