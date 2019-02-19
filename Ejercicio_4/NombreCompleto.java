public class NombreCompleto{
   /*DEFINIMOS LOS ATRIBUTOS DE LA CLASE*/
   private String primerNombre;
   private String segundoNombre;
   private String primerApellido;
   private String segundoApellido;
   /*DEFINIMOS UN MÉTODO CONSTRUCTOR SIN ARGUMENTOS PARA
   CREAR OBJETOS CON VALORES POR DEFECTO*/
   public NombreCompleto(){
      primerNombre="Pedro";
      segundoNombre="Perico";
      primerApellido="Perez";
      segundoApellido="Palotes";
   }//fin de método constructor
   
   /*IMPLEMENTAMOS LOS MÉTODOS SET PARA ASIGNAR VALORES A CADA ATRIBUTO 
   Y LOS MÉTODOS GET PARA ACCEDER A SUS VALORES. ESTO LO HAREMOS DESDE EL MÉTODO MAIN
   DE LA CLASE "APLICACIONMETODOS"*/
   
   public void setPrimerNombre(String primerNombre){
      this.primerNombre=primerNombre;
   }//fin de método nulo
   
   public String getPrimerNombre(){
      return primerNombre;
   }//fin de método de retorno
   
   public void setSegundoNombre(String segundoNombre){
      this.segundoNombre=segundoNombre;
   }//fin de método nulo
   
   public String getSegundoNombre(){
      return segundoNombre;
   }//fin de método de retorno

   
   public void setPrimerApellido(String primerApellido){
      this.primerApellido=primerApellido;
   }//fin de método nulo
   
   public String getPrimerApellido(){
      return primerApellido;
   }//fin de método de retorno

   
   public void setSegundoApellido(String segundoApellido){
      this.segundoApellido=segundoApellido;
   }//fin de método nulo
   
   public String getSegundoApellido(){
      return segundoApellido;
   }//fin de método de retorno
   
   
}//fin de la clase NombreCompleto