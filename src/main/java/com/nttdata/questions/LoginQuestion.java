package com.nttdata.questions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

@AllArgsConstructor
public class LoginQuestion implements Question<String> {
    private final Target item;

    public static LoginQuestion visibleEn(Target item){
        return new LoginQuestion((item));
    }

    @Override
    public String answeredBy(Actor actor){
        return Text.of(item).answeredBy(actor);
    }
}
