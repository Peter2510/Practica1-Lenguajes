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
public class DividirCadena {

    public static void leerCadena() {

        String cadena = Interfaz.textoIngresado.getText();

        String[] dato = cadena.split(" ");

        for (int i = 0; i < dato.length; i++) {

            System.out.println(dato[i]);
            Clasificar(dato[i]);

        }

    }

    public static void Clasificar(String dato) {

        String simbolo;
        String caractere;
        String id;
        int entero;
        double decimal;

        String cadenaSimbolos = "";
        String cadenaCaracteres = "";
        String cadenaId = "";
        String cadenaEnteros = "";
        String cadenaDecimales = "";

        for (int i = 0; i < dato.length(); i++) {
            
            String caracter = String.valueOf(dato.charAt(i));

            if (caracter.equals("*") || caracter.equals("/") || caracter.equals("+") || caracter.equals("-") || caracter.equals("(") || caracter.equals(")") || caracter.equals("{") || caracter.equals("}")|| caracter.equals("[") || caracter.equals("]") || caracter.equals("?") || caracter.equals("¿") || caracter.equals("!") || caracter.equals("¡") || caracter.equals("]") || caracter.equals("<") || caracter.equals(">")) {
                System.out.println(TipoToken.SIMBOLO.toString());
                System.out.println(dato.charAt(i));
                cadenaSimbolos = cadenaSimbolos + dato.charAt(i);
                System.out.println(cadenaSimbolos);

            }

            if (dato.equals("b")) {
                System.out.println("soy una b");

            }
        }

        Interfaz.salida.setText(TipoToken.CARACTER.getTipo() + " " + cadenaCaracteres + "\n" + TipoToken.SIMBOLO.getTipo() + " " + cadenaSimbolos + "\n" + TipoToken.NUMEROENTERO.getTipo() + cadenaEnteros + "\n" + TipoToken.ID.toString() + cadenaId);

    }

}
