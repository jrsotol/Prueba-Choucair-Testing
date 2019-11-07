package co.com.test.tasks;

import co.com.test.userinterface.ChoucairServiciosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

/**
 * Created by Candado on 06/11/2019.
 */
public class Entrar implements Task{


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(ChoucairServiciosPage.VINCULO_CAPACIDADES));






    }

    public static Entrar Vinculo() {
        return Tasks.instrumented(Entrar.class);
    }
}
