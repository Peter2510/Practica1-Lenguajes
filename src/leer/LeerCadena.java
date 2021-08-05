/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leer;

import enums.TipoToken;
import interfaz.Interfaz;

/**
 *
 * @author GORDILLO G
 */
public class LeerCadena {

    public static void leer() {
        String cadena = Interfaz.textoIngresado.getText();
        String simbolo;
        String cadenaSimbolos = "";

        for (int i = 0; i < cadena.length(); i++) {

            String caracter = String.valueOf(cadena.charAt(i));

            if (caracter.equals("{") || caracter.equals("}")||caracter.equals("[")||caracter.equals("]")||caracter.equals(",")||caracter.equals(";")) {

                System.out.println(TipoToken.SIMBOLO.toString());
                System.out.println(cadena.charAt(i));
                cadenaSimbolos = cadenaSimbolos + cadena.charAt(i);
                System.out.println(cadenaSimbolos);
                Interfaz.salida.setText(TipoToken.SIMBOLO.getTipo() + " " + cadenaSimbolos);
            }

        }
    }
}
