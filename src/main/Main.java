package main;

/*Se importa el otro package que sea static */
import static enumerados.Constantes.*;
/*Se importa la clase de valores que sea static para obtener el valor del atributo*/
import static enumerados.Valores.DOLAR;

import javax.swing.*;

public class Main {
    /*Se crea un metodo*/
    public static void main(String[] args) {
        /*Para que muestre un mesaje para que el usuario ingrese un valor*/
        String valor = JOptionPane.showInputDialog(null, MENSAJE_INGRESO_VALOR.getMensaje());
        int val = Integer.parseInt(valor);

        /*Condicional para saber si el dolar esta alto o bajo*/
        if(val >= DOLAR.getValor()){
            JOptionPane.showMessageDialog(null, MENSAJE_DOLAR_ALTO.getMensaje());
        }
        else
        {
           JOptionPane.showMessageDialog(null, MENSAJE_DOLAR_BAJO.getMensaje());
        }

        /*Mostrar mensaje, pero primero se usa otra libreria*/
        /*Se agrega con JOtianPane y se agregan los parametros,
        el primer parametro es el componente que es null,
        el segundo es el mensaje,
        el tercero el titulo de la ventana y el ultimo el icono*/

        JOptionPane.showMessageDialog(null, MENSAJE_CUANDO.getMensaje(), MENSAJE_TITULO.getMensaje(),
                JOptionPane.INFORMATION_MESSAGE);
        /*Se crea unpackage enumerados src -> new -> package y dentro de ese paquete una clase en enum*/



    }
}
