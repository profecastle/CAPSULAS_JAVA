/*
@Autor:Julio Castillo
@Versión: 1.0
@Fecha: 12/02/19

*/
import java.lang.Math; 
/*Esta librería no es obligatoria, la utilizaremos para usar el método de redondeo Math.round para los porcentajes...*/

import java.util.Scanner;
public class Encuesta
/*
Se desea automatizar una encuesta para estimar el grado de aceptación de los productos “Harina
Pan” y “Harina Juana”. A cada encuestado se le pregunta si consume alguno de los productos. La 
respuesta puede ser sí o no.  
 
Se requiere imprimir por pantalla el siguiente reporte:
o Porcentaje de personas que consumen el producto “Harina Pan” 
o Porcentaje de personas que consumen el producto “Harina Juana”
o Porcentaje de personas que consumen ambos producto “Harina Pan  y Harina Juana” 
o Porcentaje de personas que NO consumen ambos producto “Harina Pan y Harina Juana”

*/
{
   public static void main (String [] args){
      /*ZONA DE DECLARACIÓN DE ATRIBUTOS  e Instanciación de objetos*/
      boolean swHPan=false;
      boolean swHJuana=false;
      /* Atributos booleanas para detectar las repuestas "Sí o No" de los encuestados, 
         es una de las tantas fomas de hacerlo.
         
         Se utilizaran para no hacer comparaciones de si o no. Sin embargo, se pudo haber utilizado  
         valores de 1 para si y 0 para no y hacer las comparaciones. Es cuestión de como usted le
         sea más comodo.*/
      
      String hPan;
      String hJuana;
      /*Atributos String para alamacenar las repuestas "Sí o No" de los encuestados*/
      
      byte ctaHPan=0;
      byte ctaHJuana=0;
      byte ctaAmbasOPciones=0;
      byte ctaNinguna=0;
      byte ctaEncuestados=0;
      byte opc=0;
      /*Atributos bayte para contar las repuestas de los encuestados*/
      
      float pctHPan=0,pctHJuana=0,pctNgo=0,pctAmb=0;
      /*Atributos para almacenar el porcentaje de personas que consumieron Harina Pan, 
      Harina Juana, Ninguna de las 2 marcas y Ambas Harinas respectivamente*/

      Scanner teclado = new Scanner(System.in);
      /*Instanciamos un objeto de tipo Scanner para la captura de los datos*/
      
      /*ENTRADA DE DATOS*/
      System.out.println("A CONTINUACIÓN SE LE HARÁN UNA PREGUNTAS SOBRE EL CONSUMO DE HARINA PRECOCIDA");
      System.out.println("A CADA PREGUNTA INGRESE \"s\" SI SU REPSUESTA ES  \"SI\" Y \"n\" SI SU RESPUESTAS ES \"NO\"");
      System.out.println("***************************************************************************************************");
      
      /*Dado que no sabemos el número de personas a encuestar, implementamos un ciclo NO Automático DO WHILE (equivale a un REPEAT
      en otros lenguajes de programación) para repetir el proceso de preguntas hasta que el usuario introduzca cero "0" para culminar
      y mostrar los resultados*/
      do {
         ctaEncuestados++;
         System.out.println("¿Consume usted Harina Pan? s/n");
         hPan = teclado.next();
         System.out.println("¿Consume usted Harina Juana? s/n");
         hJuana = teclado.next();
         System.out.println("***GRACIAS POR SUS REPUESTAS***");
         System.out.println();//Linea en blanco para darle estilo 
      
         /*PROCESAMIENTO DE DATOS*/
         if (hPan.equals("s")){
            swHPan=true;
     
         }//fin de if
         else{
            swHPan=false;
         }//fin de else
         
          if (hJuana.equals("s")){
            swHJuana=true;
         }//fin de if
         else{
            swHJuana=false;
         }//fin de else
         
         if (swHPan==true && swHJuana==false){
         /* Si el encuestado elije HARINA PAN y no HARINA JUANA incrementamos uno el contador de harina pan
            Teniendo en cuenta que se deben cumplir amabas condiciones*/
            ctaHPan++; 
         }//fin de if
         else if(swHPan==false && swHJuana==true){
            /* Si el encuestado elije HARINA JUANA  y HARINA PAN incrementamos uno el contador de harina Juana
            Teniendo en cuenta que se deben cumplir amabas condiciones*/
            ctaHJuana++;
         }//fin de elseif
         else if (swHPan==true && swHJuana==true){
            /* Si el encuestado elije AMBAS incrementamos uno el contador de ambas opciones
            Teniendo en cuenta que se deben cumplir amabas condiciones*/
            ctaAmbasOPciones++;
         
         }//fin de else if
         else{
             /* Si el encuestado no elije NINGUNA incrementamos uno el contador de ninguna de las opciones
            Teniendo en cuenta que se deben cumplir amabas condiciones*/
            ctaNinguna++;
         }//fin de else
         System.out.println("¿Desea Procesar más encuestados?");
         System.out.println("***Ingrese \"1\" para continuar o \"0\" para salir***");
         opc = teclado.nextByte();
      }while(opc!=0); 
      
   /*SALIDA DE DATOS*/
   
   /*Calculamos los porcentajes*/
      pctHPan=(ctaHPan*100)/ctaEncuestados;
      pctHJuana=(ctaHJuana*100)/ctaEncuestados;
      pctAmb=(ctaAmbasOPciones*100)/ctaEncuestados;
      pctNgo=(ctaNinguna*100)/ctaEncuestados;
      
      System.out.println("***********************************************");
      System.out.println("   I N F O R M E   D E   R E S U L T A D O S   ");
      System.out.println("***********************************************");
      System.out.println("Total Personas Encuestadas: "+ctaEncuestados);
      System.out.println();
      System.out.println("Porcentaje de personas que consumen solo el producto Harina Pan                   : "+Math.round(pctHPan)+"%");
      System.out.println("Porcentaje de personas que consumen solo el producto Harina Juana                 : "+Math.round(pctHJuana)+"%");
      System.out.println("Porcentaje de personas que consumen ambos producto Harina Pan y Harina Juana      : "+Math.round(pctAmb)+"%");
      System.out.println("Porcentaje de personas que NO consumen ninguno de los  producto                   : "+Math.round(pctNgo)+"%");
      
   }//fin de método main
}//fin de la clase