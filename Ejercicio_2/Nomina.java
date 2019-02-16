/*
@Autor:
@Versión: 1.0
@Fecha: 12/02/19

*/
import java.lang.Math; 
/*Esta librería no es obligatoria, la utilizaremos para usar el método de redondeo Math.round para los porcentajes...*/

import java.util.Scanner;
public class Nomina
/*
   La UPEL desea un reporte por Decanato mostrando por cada docente ciertas características. Teniendo como entrada Decanato, cédula,
   sexo, sueldo base, número de hijos. 
   Calcule: prima por hijo (1.500 bsS por cada uno) y deducciones de Seguro Social 4% sobre el sueldo base 
   e Impuesto Sobre la Renta (ISRL) 2% sobre el sueldo base. 

   Imprima un reporte por pantalla que muestre:
   •	Por cada docente: Asignaciones, deducciones y neto a pagar por profesor
   •	Por la universidad: Promedio de Sueldos. 

   Nota: Tome como referencia el sueldo base de 20.000 bsS . 

*/
{
   public static void main (String [] args){
      /*ZONA DE DECLARACIÓN DE ATRIBUTOS  e Instanciación de objetos*/
      final float SBASE     = 20000;
      final float PRIMHIJO  = 1500;
      final double SS       = 0.04;
      final double ISRL     = 0.02;
      /*Definimos las constantes para el Salario Base, Prima Por Hijos, Seguro Social e Impuesto Sobre La Renta*/
      
      String decanato,CI,sexo;
      byte nHijos=0;
      byte opc=0;
      byte ctaEmpleados=0;
      double asignaciones=0;
      double deducciones=0;
      double netoACobrar=0;
      float acumSueldos=0;
      float promSueldos=0;
      /*Definimos los atributos para capturar las entradas y guardar los datos calculados respectivamente*/
      
      Scanner entrada = new Scanner(System.in);
      /*Instanciamos un objeto de tipo Scanner para la captura de los datos*/
      
      /*ENTRADA DE DATOS*/
      System.out.println("*********************************");
      System.out.println("BIENVENIDOS  AL  MODULO DE NOMINA");
      System.out.println("*********************************");
      
      /*Dado que no sabemos el número de personas a procesar, implementamos un ciclo NO Automático DO WHILE (equivale a un REPEAT
      en otros lenguajes de programación) para repetir el proceso de preguntas hasta que el usuario introduzca cero "0" para culminar
      y mostrar los resultados*/
      do {
         ctaEmpleados++;/*CONTAMOS UN EMPLEADO*/
         System.out.println("Por favor, Ingrese el Codigo del Decanado: ");
         decanato = entrada.next();
         System.out.println();//Linea en blanco para darle estilo
         
         System.out.println("Por favor, Ingrese la Cedula del Empleado: ");
         CI = entrada.next();
         System.out.println();//Linea en blanco para darle estilo

         System.out.println("Por favor, Indique el sexo M=Masculino; F=Femenino; X=Sin Definir: ");
         decanato = entrada.next();
         System.out.println();//Linea en blanco para darle estilo

         System.out.println("Por favor, Ingrese el numero de hijos (0=Ninguno): ");
         nHijos = entrada.nextByte();
         System.out.println();//Linea en blanco para darle estilo

          
      
         /*PROCESAMIENTO DE DATOS*/
         asignaciones=nHijos*PRIMHIJO;/*CALCULAMOS LAS ASIGNACIONES POR PRIMA POR HIJOS */
         deducciones=SBASE*SS+SBASE*ISRL;/*CALCULAMOS LAS DEDUCCIONES DEL SEGURO SOCIAL E ISRL*/
         netoACobrar=(SBASE+asignaciones)-deducciones;/*CALCULAMOS EL NETO A COBRAR POR EL EMPLEADO*/
         acumSueldos+=netoACobrar; /*ACUMULAMOS EL SUELDO DE CADA EMPLEADO PARA POSTERIORMENTE CALCULAR EL PROMEDIO DE SUELDOS
                                    PARA LA UNIVERSIDAD */
         
         System.out.println("***TRANSACCION CULMINADA SATISFACTORIAMENTE***");
         System.out.println();//Linea en blanco para darle estilo
         
         /*SALIDA DE DATOS DENTRO DEL CICLO DO WHILE CON LA INFORMACIÓN DE COBRO PARA CADA EMPLEADO*/
         System.out.println("*************************************************");
         System.out.println("           R E C I B O  D E  P A G O             ");
         System.out.println("*************************************************");
         System.out.println();//Linea en blanco para darle estilo
         
         System.out.println("***********************************************");
         System.out.println("           A S I G N A C I O N E S             ");
         System.out.println("***********************************************");
         System.out.println("PRIMA POR HIJOS    : "+nHijos*PRIMHIJO+" bsS");
         System.out.println();//Linea en blanco para darle estilo
         System.out.println("TOTAL ASIGNACIONES : "+asignaciones+" bsS");
         System.out.println("***********************************************");
         System.out.println();//Linea en blanco para darle estilo
         
         System.out.println("***********************************************");
         System.out.println("            D E D U C C I O N E S              ");
         System.out.println("***********************************************");
         System.out.println("SS                 : "+SBASE*SS+" bsS");
         System.out.println("ISLR               : "+SBASE*ISRL+" bsS");
         System.out.println();//Linea en blanco para darle estilo
         System.out.println("TOTAL DEDUCCIONES  : "+deducciones+" bsS");
         System.out.println("***********************************************");
         System.out.println();//Linea en blanco para darle estilo
        
         System.out.println("SALARIO BASE       : "+SBASE+" bsS");
         System.out.println();//Linea en blanco para darle estilo
         System.out.println("SU SUELDO NETO A COBRAR ES =>: "+netoACobrar+" bsS");
         
         System.out.println();//Linea en blanco para darle estilo
         System.out.println();//Linea en blanco para darle estilo
         System.out.println("¿Desea Procesar otro empleado?");
         System.out.println("***Ingrese \"1\" para continuar o \"0\" para salir***");
         opc = entrada.nextByte();
      }while(opc!=0); 
      
   /*SALIDA DE DATOS FUERA DEL CICLO DO WHILE CON LA INFORMACION RESPECTIVA PARA LA UNIVERSIDAD*/
   
   /*CALCULAMOS EL PROMEDIO DE SUELDOS*/
      promSueldos=acumSueldos/ctaEmpleados;
            
      System.out.println("********************************************************************************");
      System.out.println("                   I N F O R M E   D E   R E S U L T A D O S                    ");
      System.out.println("********************************************************************************");
      System.out.println("EMPLEADOS DE LA NOMINA                        : "+ctaEmpleados);
      System.out.println();
      System.out.println("PROMEDIO DE SUELDOS PAGADOS POR LA UNIVERSIDAD: "+Math.round(promSueldos)+" bsS");
      
   }//fin de método main
}//fin de la clase