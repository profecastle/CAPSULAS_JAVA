import javax.swing.JOptionPane;
public class GestionArreglos{
  public static void inicializar(int[] arreglo){
   /*Este m�todo nulo se encargar� de recibir por par�metro el
   arreglo desde el metodo main e inicilizarlo.
   Este m�todo tiene declarado en su cabecera un par�metro formal denominado arreglo*/
      byte i=0; //Inicializamos la variable de control del FOR
      for (i = 0;i<arreglo.length;i++){
         arreglo[i]=0;//incializamos el arreglo que recibimos por par�metro
      }//fin de for
   }//fin de metodo
   
   public static Integer mostrarArreglo(int[] arreglo, byte pos){
   /*Este m�todo de retorno se encargar� de recibir por par�metro el
   arreglo y la posici�n a devolver desde el metodo main.
   Este m�todo tiene declarado en su cabecera un par�metro formal denominado arreglo*/
      return arreglo[pos];//retornamos el valor del arreglo que recibimos por par�metro en la posici�n indicada
   }//fin de metodo
   
   public static void setValor(int[] arreglo, byte pos, int valor){
      /*Este m�todo nulo recibe por par�metros :
      1.-el arreglo
      2.-La posici�n donde guardar
      3.-El valor a guardar
      Este m�todo tiene declarado en su cabecera un par�metro formal denominado arreglo
      y 2 variables*/
      arreglo[pos]=valor;
      
      //guardamos el valor en el arreglo que recibimos por par�metro en la posicio respectiva
   }//fin de metodo

   
   public static void main (String [] args){
      int[]arr_Enteros; //Definimos un array entero de 4 posiciones 
      arr_Enteros = new int[4];//Instanciamos el array
      byte i=0;//Definimos un atributo de control para el ciclo FOR
      String resp;//Definimos un atributo para guardar el valor capturado en el control showInputDialog() 
      //Recordando que debemos parsearlo posteriormente a Integer.
      
      inicializar(arr_Enteros);//Invocamos el metodo que inicializa el arreglo
      
      for (i=0;i<arr_Enteros.length;i++){      
         resp=JOptionPane.showInputDialog(null,"Por favor, Ingrese Valor entero: ");
         setValor(arr_Enteros,i,Integer.parseInt(resp));//Invocamos el metodo que asigna los valores al arreglo
      }//fin de FOR

      for (i=0;i<arr_Enteros.length;i++){      
         JOptionPane.showMessageDialog(null," En la Posicion: "+i+" Se encuentra el Valor: "+mostrarArreglo(arr_Enteros,i));
         //Invocamos el metodo que muestra los valores guardados en el arreglo
      }//fin de FOR

            
   }//fin de metodo main

}//fin de la clase