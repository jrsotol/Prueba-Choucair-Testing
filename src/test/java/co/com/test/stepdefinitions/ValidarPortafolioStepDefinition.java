package co.com.test.stepdefinitions;


        import co.com.test.questions.ElTitulo;
import co.com.test.tasks.EntrarPortafolio;
import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class ValidarPortafolioStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor usuario = Actor.named("Usuario");

    @Before

    public void configuracionInicial() {

        usuario.can(BrowseTheWeb.with(hisBrowser));

    }

    @Cuando("^validar que el botón de Portafolio de soluciones hace lo especificado$")
    public void validarQueElBotónDePortafolioDeSolucionesHaceLoEspecificado() throws Exception {

        usuario.attemptsTo(EntrarPortafolio.Vinculo());

    }


    @Entonces("^deberia ver en pantallas el (.*) que el vínculo ofrece$")
    public void deberiaVerEnPantallasElPortafolioDeServiciosQueElVínculoOfrece(String elTitulo) throws Exception {

        usuario.should(GivenWhenThen.seeThat(ElTitulo.es(), Matchers.equalTo(elTitulo)));

    }}

