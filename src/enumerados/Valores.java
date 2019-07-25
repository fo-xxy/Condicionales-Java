package enumerados;

public enum Valores {
    /*Se crea un mensaje pero en int*/

    DOLAR(3199);

    /*Se define el tipo de dato*/
    private int valor;

        /*Se crea el constructor alt + enter sbre el mensaje en este caso 3199*/
    Valores(int i) {
        this.valor = 1;
    }

        /*Se crea el metodo getter que va a entregar el valor*/
    public int getValor() {
        return valor;
    }

    /*Se definen en constantes*/
}
