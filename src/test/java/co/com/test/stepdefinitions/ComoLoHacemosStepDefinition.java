package co.com.test.stepdefinitions;

import co.com.test.questions.LasPalabras;
import co.com.test.tasks.DarClick;
import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;


public class ComoLoHacemosStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor usuario = Actor.named("Usuario");

    @Before

    public void configuracionInicial() {

        usuario.can(BrowseTheWeb.with(hisBrowser));

    }
    @Cuando("^validar que el botón de Cómo lo hacemos hace lo especificado$")
    public void validarQueElBotónDeCapacidadesHaceLoEspecificado() throws Exception {

        usuario.attemptsTo(DarClick.Vinculo());

    }



    @Entonces("^deberia ver en pantallas las (.*) que el vínculo ofrece$")
    public void deberiaVerEnPantallasLasCómoLoHacemosQueElVínculoOfrece(String palabras) throws Exception {


      usuario.should(GivenWhenThen.seeThat(LasPalabras.Validacion(), Matchers.equalTo(palabras)));
    }

}
