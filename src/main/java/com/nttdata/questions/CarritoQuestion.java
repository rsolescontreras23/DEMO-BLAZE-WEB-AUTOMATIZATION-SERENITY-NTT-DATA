package com.nttdata.questions;

import lombok.AllArgsConstructor;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

@AllArgsConstructor
public class CarritoQuestion implements Question<Boolean> {

    private final Target item;

    public static CarritoQuestion visibleEn(Target item){
        return new CarritoQuestion((item));
    }

    @Override
    public Boolean answeredBy(Actor actor){
        List<WebElementFacade> productos = item.resolveAllFor(actor);

        if (productos.isEmpty()) {
            return true;
        }

        return false;
    }

}
