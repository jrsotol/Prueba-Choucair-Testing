package co.com.test.tasks;

import co.com.test.userinterface.ChoucairServiciosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class EntrarPortafolio implements Task{


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(ChoucairServiciosPage.BOTON_PORTAFOLIO));

    }


    public static EntrarPortafolio Vinculo() {
        return Tasks.instrumented(EntrarPortafolio.class);
    }
}
