public class NombreCompleto{
   /*DEFINIMOS LOS ATRIBUTOS DE LA CLASE*/
   private String primerNombre;
   private String segundoNombre;
   private String primerApellido;
   private String segundoApellido;
   /*DEFINIMOS UN M�TODO CONSTRUCTOR SIN ARGUMENTOS PARA
   CREAR OBJETOS CON VALORES POR DEFECTO*/
   public NombreCompleto(){
      primerNombre="Pedro";
      segundoNombre="Perico";
      primerApellido="Perez";
      segundoApellido="Palotes";
   }//fin de m�todo constructor
   
   /*IMPLEMENTAMOS LOS M�TODOS SET PARA ASIGNAR VALORES A CADA ATRIBUTO 
   Y LOS M�TODOS GET PARA ACCEDER A SUS VALORES. ESTO LO HAREMOS DESDE EL M�TODO MAIN
   DE LA CLASE "APLICACIONMETODOS"*/
   
   public void setPrimerNombre(String primerNombre){
      this.primerNombre=primerNombre;
   }//fin de m�todo nulo
   
   public String getPrimerNombre(){
      return primerNombre;
   }//fin de m�todo de retorno
   
   public void setSegundoNombre(String segundoNombre){
      this.segundoNombre=segundoNombre;
   }//fin de m�todo nulo
   
   public String getSegundoNombre(){
      return segundoNombre;
   }//fin de m�todo de retorno

   
   public void setPrimerApellido(String primerApellido){
      this.primerApellido=primerApellido;
   }//fin de m�todo nulo
   
   public String getPrimerApellido(){
      return primerApellido;
   }//fin de m�todo de retorno

   
   public void setSegundoApellido(String segundoApellido){
      this.segundoApellido=segundoApellido;
   }//fin de m�todo nulo
   
   public String getSegundoApellido(){
      return segundoApellido;
   }//fin de m�todo de retorno
   
   
}//fin de la clase NombreCompleto