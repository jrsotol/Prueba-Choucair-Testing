package co.com.test.stepdefinitions;

import co.com.test.questions.LaFraseValidacion;
import co.com.test.tasks.Abrir;
import co.com.test.tasks.Ingresar;
import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

/**
 * Created by Candado on 06/11/2019.
 */
public class ValidarSeviciosStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor usuario = Actor.named("Usuario");

    @Before

    public void configuracionInicial() {

        usuario.can(BrowseTheWeb.with(hisBrowser));

    }

    @Dado("^que usuario quiere ingresar a la pagina de Choucair Testing$")
    public void queUsuarioQuiereIngresarALaPaginaDeChoucairTesting() throws Exception {

        usuario.wasAbleTo(Abrir.LaPaginaDeChoucair());
    }


    @Cuando("^el ingrese y se dirija a revisar los servicios que ofrecen$")
    public void elIngreseYSeDirijaARevisarLosServiciosQueOfrecen() throws Exception {

        usuario.attemptsTo(Ingresar.Servicios());
    }

    @Entonces("^el deberia ver el (.*) ofrecidos en pantalla$")
    public void elDeberiaVerElPortafolioDeSolucionesOfrecidosEnPantalla(String frase) throws Exception {

        usuario.should(GivenWhenThen.seeThat(LaFraseValidacion.es(), Matchers.equalTo(frase)));
    }
}
