package co.com.test.tasks;

import co.com.test.userinterface.ChoucairHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class Abrir implements Task{

    private ChoucairHomePage choucairHomePage;


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(choucairHomePage));

    }

    public static Abrir LaPaginaDeChoucair() {

        return Tasks.instrumented(Abrir.class);
    }
}

