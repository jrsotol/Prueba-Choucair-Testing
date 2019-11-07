package co.com.test.questions;

import co.com.test.userinterface.ChoucairServiciosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class ElTituloValidacion implements Question<String> {




    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ChoucairServiciosPage.TITULO_VALIDACION).viewedBy(actor).asString();
    }

    public static ElTituloValidacion es() {
        return new ElTituloValidacion();
    }
}