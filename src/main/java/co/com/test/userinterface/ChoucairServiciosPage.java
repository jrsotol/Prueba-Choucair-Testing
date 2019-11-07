package co.com.test.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class ChoucairServiciosPage extends PageObject {

    public static final Target FRASE_VALIDACION = Target.the("La frase que valida la tarea")
            .located(By.xpath("//*[@id=\"main\"]/div/div/div/div/section[3]/div/div/div[3]/div/div/div/div/div/div/h3/a"));

    public static final Target VINCULO_CAPACIDADES = Target.the("El vinculo para ser redirigido a la informacion de capacidades")
            .located(By.xpath("//*[@id=\"main\"]/div/div/div/div/section[3]/div/div/div[1]/div/div/div/div/div/figure/a"));

    public static final Target TITULO_VALIDACION = Target.the("El titulo para validar la prueba")
            .located(By.xpath("//h2[@class='elementor-heading-title elementor-size-large']"));

    public static final Target BOTON_LEERMAS = Target.the("El boton de leer mas")
            .located(By.xpath("//a[@class='elementor-button-link elementor-button elementor-size-xs']"));




}