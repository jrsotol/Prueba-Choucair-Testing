package co.com.test.tasks;

import co.com.test.userinterface.ChoucairHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class Ingresar implements Task{


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(ChoucairHomePage.VINCULO_SERVICIOS));
    }

    public static Ingresar Servicios() {
        return Tasks.instrumented(Ingresar.class);
    }
}
