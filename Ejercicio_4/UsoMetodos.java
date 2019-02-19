import javax.swing.JOptionPane;
public class UsoMetodos{
   public static void main (String [] args){
   /*Definimos el objeto nombre que pertenece a la clase NombreCompleto 
   y algunos atributos para almacenar los valores que soliciaremos al usuario*/ 
      NombreCompleto nombre;
      String pNomb, secNomb, pApel, secApel;
      /*Estos atributos son homologos a los de la clase NombreCompleto, lo usuaremos para almacenarlos temporalmente
      y enviarlos como parámetros e los métodos modificadores "SET"*/
      
   /*Instanciamos el objeto nombre*/
      nombre=new NombreCompleto();
    /*Solicitamos los datos de entrada utilizando el componente showInputDialog() y guardandolo en cada atributo dispuesto en esta clase
      el cual coincide con los atributos de la clase  NombreCompleto.
      seguidamente invocamos el método set correspondiente que almacenará el dato en el atributo correspondiente
      de la clase NombreCompleto pasandole como parámetro el atributo coincidente de esta clase.
    */
      pNomb=JOptionPane.showInputDialog(null, "Por favor, Ingrese su Primer Nombre: ","Solicitud de Datos", JOptionPane.QUESTION_MESSAGE);
      nombre.setPrimerNombre(pNomb);
      
      secNomb=JOptionPane.showInputDialog(null, "Por favor, Ingrese su Segundo Nombre: ","Solicitud de Datos", JOptionPane.QUESTION_MESSAGE);
      nombre.setSegundoNombre(secNomb);
      
      pApel=JOptionPane.showInputDialog(null, "Por favor, Ingrese su Primer Apellido: ","Solicitud de Datos", JOptionPane.QUESTION_MESSAGE);
      nombre.setPrimerApellido(pApel);
      
      secApel=JOptionPane.showInputDialog(null, "Por favor, Ingrese su Segundo Apellido: ","Solicitud de Datos", JOptionPane.QUESTION_MESSAGE);
      nombre.setSegundoApellido(secApel);
      
      JOptionPane.showMessageDialog(null,"***LOs DATOS HAN SIDO CARGADOS CORRECTAMENTE***");
      
      /*MOSTRAMOS USANDO LOS MÉTODOS GET A TRAVES DEL COMPONENTE SHOWMESSAGE*/
      
      JOptionPane.showMessageDialog(null,"Ficha de Datos Almacenados: "+"\n"+"Primer Nombre    : "+nombre.getPrimerNombre()+"\n"+
      "Segundo Nombre: "+nombre.getSegundoNombre()+"\n"+"Primer Apellido    : "+nombre.getPrimerApellido()+"\n"+
      "Segundo Apellido: "+nombre.getSegundoApellido());
      
      
      
   }//fin de método main

}//fin de la clase