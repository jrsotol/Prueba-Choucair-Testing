package co.com.test.tasks;

import co.com.test.userinterface.ChoucairServiciosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class DarClick implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(ChoucairServiciosPage.BOTON_COMO_LO_HACEMOS));


    }

    public static DarClick Vinculo() {
        return Tasks.instrumented(DarClick.class);
    }
}
