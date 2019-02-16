/*
@Autor:
@Versión: 1.0
@Fecha: 12/02/19

*/


import java.util.Scanner;
public class Aerolinea
/*
   En el aeropuerto de Barquisimeto “Jacinto Lara” operan  cuatro (04) líneas aéreas: Avensa, Aereopostal, Zuliana y Aserca. 
   Las líneas ofrecen vuelos nacionales e internacionales. Diariamente, por cada vuelo que sale del aeropuerto se registran 
   los siguientes datos: Hora de salida, número de vuelo, línea aérea, tipo de vuelo (nacional o internacional)  
   y número de pasajeros. Los datos son clasificados por línea aérea.
   
   Imprima un reporte por pantalla que muestre:
   •	Cantidad de pasajeros por cada vuelo.
   •	Total de vuelos internacionales.
   •	Tipo de vuelo con mayor número de vuelos.
   •	Total de Pasajeros que salieron del aeropuerto

*/
{
   public static void main (String [] args){
      /*ZONA DE DECLARACIÓN DE ATRIBUTOS  e Instanciación de objetos*/
      final String AVENSA        = "1";
      final String AEROPOSTAL    = "2";
      final String ZULIANA       = "3";
      final String ASERCA        = "4";
      final String V_NACIO       = "5";
      final String V_INTER       = "6";
      /*Definimos las constantes para las aerolineas*/
      
      String hSalida,minSalida,linAerea,numVuelo,tipVuelo;
      byte nPasajerosL1=0,nPasajerosL2=0,nPasajerosL3=0,nPasajerosL4=0;
      byte opc=0;
      String tipVueloMayor="";
      byte ctaVInter=0;
      byte ctaVNacio=0;
      int ttalPasajeros=0;
      /*Definimos los atributos para capturar las entradas y guardar los datos calculados respectivamente*/
      
      Scanner entrada = new Scanner(System.in);
      /*Instanciamos un objeto de tipo Scanner para la captura de los datos*/
      
      /*MENSAJE DE BIENVENIDA*/
      System.out.println("************************************************************************************************");
      System.out.println("      BIENVENIDOS        AL        MODULO       DE       REGISTRO       DE       VUELOS         ");
      System.out.println("************************************************************************************************");
      
      /*Dado que no sabemos el número de vuelos a procesar, implementamos un ciclo NO Automático DO WHILE (equivale a un REPEAT
      en otros lenguajes de programación) para repetir el proceso de preguntas hasta que el usuario introduzca cero "0" para culminar
      y mostrar los resultados*/
      do {
         /*ENTRADA DE DATOS*/
         System.out.println("Por favor, Ingrese el Codigo de la aerolinea (1=AVENSA; 2=AEROPOSTAL; 3=ZULIANA; 4=ASERCA): ");
         linAerea = entrada.next();
         System.out.println();//Linea en blanco para darle estilo
         
         System.out.println("Por favor, Ingrese el numero de pasajeros: ");
         System.out.println();//Linea en blanco para darle estilo

         /*PROCESAMIENTO DE DATOS*/
         switch (linAerea)
         {
            case "1": {
                     nPasajerosL1 = entrada.nextByte();
                     ttalPasajeros+=nPasajerosL1;
                     break;
                     }
            case "2":{
                      nPasajerosL2 = entrada.nextByte();
                      ttalPasajeros+=nPasajerosL2;
                     break;
                     }
            case "3":{
                     nPasajerosL3 = entrada.nextByte();
                     ttalPasajeros+=nPasajerosL3;
                     break ;
                     }
            case "4":{ 
                     nPasajerosL4 = entrada.nextByte();
                     ttalPasajeros+=nPasajerosL4;
                     break ;
                     }
         }//fin de switch
         
         
         /*ENTRADA DE DATOS*/
         System.out.println("Por favor, Ingrese el tipo de vuelo (5=NACIONAL - 6=INTERNACIONAL): ");
         tipVuelo = entrada.next();
         System.out.println();//Linea en blanco para darle estilo
         
         /*EVALUAMOS EL TIPO DE VUELO PARA CONTARLO*/
         if (tipVuelo.equals("5")){
            ctaVNacio++;
         }//fin del if
         else{
            ctaVInter++;
         }//fin del else
         
         /*SOLICITAMOS EL RESTO DE LOS VALORES DE ENTRADA*/

         System.out.println("Por favor, Indique el numero del vuelo: ");
         numVuelo = entrada.next();
         System.out.println();//Linea en blanco para darle estilo

         System.out.println("Por favor, Ingrese la hora de salida: ");
         hSalida = entrada.next();
         System.out.println();//Linea en blanco para darle estilo

         System.out.println("Por favor, Ingrese el minuto de salida: ");
         minSalida = entrada.next();
         System.out.println();//Linea en blanco para darle estilo 
         System.out.println("***TRANSACCION CULMINADA SATISFACTORIAMENTE***");
        
         /*PROCESAMIENTO DE DATOS*/
         System.out.println();//Linea en blanco para darle estilo
         System.out.println();//Linea en blanco para darle estilo
         System.out.println();//Linea en blanco para darle estilo
         System.out.println("¿Desea Procesar mas datos?");
         System.out.println("***Ingrese \"1\" para continuar o \"0\" para salir***");
         opc = entrada.nextByte();
      }while(opc!=0); 
   
   /*PROCESAMIENTO DE DATOS FUERA DEL CICLO*/
   
   /*EVALUAMOS CUAL TIPO DE VUELO TUVO MAYOR CONCURRENCIA Y ASIGNAMOS EN TIPO DE VUELO A UNA VARIABLE STRING
   ESTO ES UNA FORMA DE HACERLO DE TANTAS QUE EXISTEN TODO DEPENDE DE COMO UD ABORDE EL PROBLEMA*/
   if (ctaVInter>ctaVNacio){
         tipVueloMayor="INTERNACIONAL";
   }//fin de if
   else if (ctaVInter<ctaVNacio){
         tipVueloMayor="NACIONAL";
   }//fin de if
   else{
         tipVueloMayor="LOS VUELOS NACIONALES E INTERNACIONALES TUVIERON LA MISMA CONCURRENCIA";
   }//fin de else   
   
   /*SALIDA DE DATOS FUERA DEL CICLO DO WHILE CON UN PEQUEÑO REPORTE RESPECTIVO PARA LA AEROLINEA*/
   System.out.println("*******************************************************************");
   System.out.println("             R E P O R T E     D E     V U E L O S                 ");
   System.out.println("*******************************************************************");
     
   System.out.println();//Linea en blanco para darle estilo
   System.out.println("AEROLINEA    :                    NUMERO DE PASAJEROS :");//ENCABEZADOS DE LAS AEROLINEAS
   System.out.print("A V E N S A");
   System.out.print("                               ");//Linea en blanco para darle estilo
   System.out.print(""+nPasajerosL1);
   System.out.println();//Linea en blanco para darle estilo
      
   System.out.print("A E R O P O S T A L");
   System.out.print("                       ");//Linea en blanco para darle estilo
   System.out.print(""+nPasajerosL2);
   System.out.println();//Linea en blanco para darle estilo
      
   System.out.print("Z U L I A N A");
   System.out.print("                             ");//Linea en blanco para darle estilo
   System.out.print(""+nPasajerosL3);
   System.out.println();//Linea en blanco para darle estilo
    
   System.out.print("A S E R C A");
   System.out.print("                               ");//Linea en blanco para darle estilo
   System.out.print(""+nPasajerosL4);
   System.out.println();//Linea en blanco para darle estilo
   System.out.println();//Linea en blanco para darle estilo
      
   System.out.println("TOTAL DE VUELOS NACIONALES                        : "+ctaVNacio);
   System.out.println();//Linea en blanco para darle estilo
    
   System.out.println("TOTAL DE VUELOS INTERNACIONALES                   : "+ctaVInter);
   System.out.println();//Linea en blanco para darle estilo
      
   System.out.println("TIPO DE VUELOS CON MAYOR NRO DE VUELOS            : "+tipVueloMayor);
   System.out.println();//Linea en blanco para darle estilo
   System.out.println();//Linea en blanco para darle estilo
            
   System.out.println("TOTAL DE PASAJEROS QUE SALIERON POR EL AEROPUERTO : "+ttalPasajeros);

   }//fin de método main
}//fin de la clase