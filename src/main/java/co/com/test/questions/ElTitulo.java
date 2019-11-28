package co.com.test.questions;

import co.com.test.userinterface.ChoucairServiciosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class ElTitulo implements Question{



    @Override
    public Object answeredBy(Actor actor) {

        return Text.of(ChoucairServiciosPage.ELTITULO_VALIDACION).viewedBy(actor).asString();
    }

    public static ElTitulo es() {
        return new ElTitulo();
    }
}



