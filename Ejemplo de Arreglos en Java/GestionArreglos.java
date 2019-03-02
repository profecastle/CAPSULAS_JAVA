import javax.swing.JOptionPane;
public class GestionArreglos{
  public static void inicializar(int[] arreglo){
   /*Este método nulo se encargará de recibir por parámetro el
   arreglo desde el metodo main e inicilizarlo.
   Este método tiene declarado en su cabecera un parámetro formal denominado arreglo*/
      byte i=0; //Inicializamos la variable de control del FOR
      for (i = 0;i<arreglo.length;i++){
         arreglo[i]=0;//incializamos el arreglo que recibimos por parámetro
      }//fin de for
   }//fin de metodo
   
   public static Integer mostrarArreglo(int[] arreglo, byte pos){
   /*Este método de retorno se encargará de recibir por parámetro el
   arreglo y la posición a devolver desde el metodo main.
   Este método tiene declarado en su cabecera un parámetro formal denominado arreglo*/
      return arreglo[pos];//retornamos el valor del arreglo que recibimos por parámetro en la posición indicada
   }//fin de metodo
   
   public static void setValor(int[] arreglo, byte pos, int valor){
      /*Este método nulo recibe por parámetros :
      1.-el arreglo
      2.-La posición donde guardar
      3.-El valor a guardar
      Este método tiene declarado en su cabecera un parámetro formal denominado arreglo
      y 2 variables*/
      arreglo[pos]=valor;
      
      //guardamos el valor en el arreglo que recibimos por parámetro en la posicio respectiva
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