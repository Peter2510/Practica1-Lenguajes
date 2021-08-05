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

        if (dato.equals("a")) {
            System.out.println("soy una a");

        }

        if (dato.equals("b")) {
            System.out.println("soy una b");

        }

        if (dato.equals("*") || dato.equals("/") || dato.equals("+") || dato.equals("-") || dato.equals("(") || dato.equals(")") || dato.equals("{") || dato.equals("}")
                || dato.equals("[") || dato.equals("]") || dato.equals("?") || dato.equals("¿") || dato.equals("!") || dato.equals("¡") || dato.equals("]") || dato.equals("<") || dato.equals(">")) {

           /* System.out.println(TipoToken.SIMBOLO.toString());
            System.out.println(dato.charAt(i));
            cadenaSimbolos = cadenaSimbolos + dato.charAt(i);
            System.out.println(cadenaSimbolos); */

        }

        if (dato.equals(".") || dato.equals(",") || dato.equals(";") || dato.equals(":") || dato.equals("´") || dato.equals("'") || dato.equals("_") || dato.equals("@")
                || dato.equals("#") || dato.equals("%") || dato.equals("=")) {
/*
            System.out.println(TipoToken.CARACTER.toString());
            System.out.println(dato.charAt(i));
            cadenaCaracteres = cadenaCaracteres + dato.charAt(i);
            System.out.println(cadenaCaracteres); */

        }

        if (dato.equals("1") || dato.equals("2") || dato.equals("3") || dato.equals("4") || dato.equals("5") || dato.equals("6") || dato.equals("7") || dato.equals("8")
                || dato.equals("9") || dato.equals("0")) {

            /*System.out.println(TipoToken.NUMEROENTERO.toString());
            System.out.println(dato.charAt(i));
            cadenaEnteros = cadenaEnteros + dato.charAt(i);
            System.out.println(cadenaEnteros);*/

        }

        /*if ((idL >= 'a' && idL <= 'z' || idL >= 'A' && idL <= 'Z')) {

            cadenaId = cadenaId + cadena.charAt(i);
            System.out.println(cadenaId);

        } */

        Interfaz.salida.setText(TipoToken.CARACTER.getTipo() + " " + cadenaCaracteres + "\n" + TipoToken.SIMBOLO.getTipo() + " " + cadenaSimbolos + "\n" + TipoToken.NUMEROENTERO.getTipo() + cadenaEnteros + "\n" + TipoToken.ID.toString() + cadenaId);

    }

}
