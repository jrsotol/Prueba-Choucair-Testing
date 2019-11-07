package co.com.test.stepdefinitions;

import co.com.test.questions.ElTituloValidacion;
import co.com.test.tasks.Entrar;
import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;


public class ValidarCapacidadesStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor usuario = Actor.named("Usuario");

    @Before

    public void configuracionInicial() {

        usuario.can(BrowseTheWeb.with(hisBrowser));

    }


    @Cuando("^validar que el botón de Capacidades hace lo especificado$")
    public void validarQueElBotónDeCapacidadesHaceLoEspecificado() throws Exception {

        usuario.attemptsTo(Entrar.Vinculo());

    }

    @Entonces("^deberia ver en pantalla las (.*) que el vínculo ofrece$")
    public void deberiaVerEnPantallaLasCapacidadesDePruebasCentradasEnElNegocioQueElVínculoOfrece(String titulo) throws Exception {

        usuario.should(GivenWhenThen.seeThat(ElTituloValidacion.es(), Matchers.equalTo(titulo)));
    }
}
