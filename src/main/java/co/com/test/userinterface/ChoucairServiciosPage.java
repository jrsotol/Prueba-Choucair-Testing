package co.com.test.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class ChoucairServiciosPage extends PageObject {

    public static final Target FRASE_VALIDACION = Target.the("La frase que valida la tarea")
            .located(By.xpath("//h3[@class=\"elementor-image-box-title\"]//a[@href='#capacidades']"));

    public static final Target VINCULO_CAPACIDADES = Target.the("El vinculo para ser redirigido a la informacion de capacidades")
            .located(By.xpath("//div[@class='elementor-image-box-wrapper']//figure[@class='elementor-image-box-img']//a[@href='#capacidades']"));

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

    public static final Target BOTON_CURSOS = Target.the("las palabras para validar la tarea")
            .located(By.xpath("//*[@id=\"main\"]/div/div/div/div/section[13]/div/div/div[5]/div/div/div"));

    public static final Target LEER_MAS = Target.the("las palabras para validar la tarea")
            .located(By.xpath("//section[@data-id='eaa0702']//div[@class='elementor-text-editor elementor-clearfix']//strong[2]"));

}