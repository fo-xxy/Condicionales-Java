package enumerados;

public enum Constantes {
    /*No trabajar con tipos de datos combinadas*/

    /*Se crea una propiedad*/
    MENSAJE_CUANDO("Esto es un mensaje"),
    MENSAJE_TITULO( "Esto es un titulo"),
    MENSAJE_DOLAR_ALTO("El dólar está muy caro"),
    MENSAJE_DOLAR_BAJO("El dólar está super barato"),
    MENSAJE_INGRESO_VALOR("Ingresa un valor");
    /*Vamo al main*/

    /* Se crea un atributo de tipo string porque es un mensaje*/
    private String mensaje;


    Constantes(String s){

        /*Este atributo va a recibir lo que viene de mansaje*/
        this.mensaje = s;
    }
    /*Returna el mensaje*/
    public String getMensaje() {
        return mensaje;
    }
}
