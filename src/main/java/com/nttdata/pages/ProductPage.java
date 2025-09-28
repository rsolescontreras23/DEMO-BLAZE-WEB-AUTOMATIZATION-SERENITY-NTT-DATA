package com.nttdata.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class ProductPage {

//    En la primera página el rango del index de cada producto esta entre 1 y 9.
    public static final int RANDOM_PRODUCT_INDEX = (int)(Math.random() * 9) + 1;

    public static final Target A_PRODUCTO = Target.the("Anchor del Nombre del próducto")
            .located(By.xpath("//*[@id=\"tbodyid\"]/div["+ RANDOM_PRODUCT_INDEX +"]/div/div/h4/a"));


    public static final Target BTN_AGREGAR_AL_CARRITO = Target.the("El botón de agregar al carrito")
            .located(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a"));


    public static final Target ITM_CARRITO = Target.the("El botón de agregar al carrito")
            .located(By.id("cartur"));

    public static final Target BTN_REALIZAR_PEDIDO = Target.the("El botón de realizar pedido")
            .located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button"));


//    Datos del formulario para realizar pedido

    public static final Target INP_NOMBRE = Target.the("Input del nombre")
            .located(By.id("name"));

    public static final Target INP_PAIS = Target.the("Input del pais")
            .located(By.id("country"));

    public static final Target INP_CIUDAD = Target.the("Input de ciudad")
            .located(By.id("city"));

    public static final Target INP_TARJETA_DE_CREDITO = Target.the("Input de la tarjeta de crédito")
            .located(By.id("card"));

    public static final Target INP_MES = Target.the("Input del mes")
            .located(By.id("month"));

    public static final Target INP_ANIO = Target.the("Input del año")
            .located(By.id("year"));

    public static final Target BTN_COMPRAR = Target.the("El botón de compra")
            .located(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]"));


//    Mensaje de gracias

    public static final Target MSG_COMPRA_EXITOSA = Target.the("El mensaje de compra exitosa")
            .located(By.xpath("/html/body/div[10]/h2"));

//    Boton OK
    public static final Target BTN_COMPRA_EXITOSA = Target.the("El botón para cerrar la ventana de compra exitosa")
        .located(By.xpath("/html/body/div[10]/div[7]/div/button"));


//    Elementos tabla
public static final Target TBODY_PRODUCTOS = Target.the("El cuerpo de la tabla de productos")
        .located(By.xpath("//*[@id='tbodyid']/tr"));
}
