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

    public static final Target BOTON_COMO_LO_HACEMOS = Target.the("El boton de Cómo lo hacemos")
            .located(By.xpath("//div[@class='elementor-image-box-content']//h3[@class='elementor-image-box-title']//a[@href='#hacemos']"));

    public static final Target PALABRAS_VALIDACION = Target.the("las palabras para validar la tarea")
            .located(By.xpath("//section[@data-id='27c5b64']//div[@class='elementor-widget-container']//h2[@class='elementor-heading-title elementor-size-large']"));

    public static final Target BOTON_PORTAFOLIO = Target.the("El boton de Portafolio de servicios")
            .located(By.xpath("//div[@class='elementor-image-box-content']//h3[@class='elementor-image-box-title']//a[@href='#portafolio']"));

    public static final Target ELTITULO_VALIDACION = Target.the("las palabras para validar la tarea")
            .located(By.xpath("//section[@data-id='7e37d7b']//div[@class='elementor-widget-container']//h2[@class='elementor-heading-title elementor-size-large']"));


}