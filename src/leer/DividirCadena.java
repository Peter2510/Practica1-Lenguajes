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

    private static String cadenaSimbolos = "";
    private static String cadenaCaracteres = "";
    private static String cadenaId = "";
    private static String cadenaEnteros = "";
    private static String cadenaDecimales = "";

    private static String cadenaFSimbolos = "";
    private static String cadenaFCaracteres = "";
    private static String cadenaFId = "";
    private static String cadenaFEnteros = "";
    private static String cadenaFDecimales = "";

    public static void leerCadena() {

        String cadena = Interfaz.textoIngresado.getText();

        String[] dato = cadena.split(" ");

        for (int i = 0; i < dato.length; i++) {

            System.out.println(dato[i]);
            Clasificar(dato[i]);

        }

    }

    public static void Clasificar(String dato) {

        for (int i = 0; i < dato.length(); i++) {

            String caracter = String.valueOf(dato.charAt(i));

            if (caracter.equals("*") || caracter.equals("/") || caracter.equals("+") || caracter.equals("-") || caracter.equals("(") || caracter.equals(")") || caracter.equals("{") || caracter.equals("}") || caracter.equals("[") || caracter.equals("]") || caracter.equals("?") || caracter.equals("¿") || caracter.equals("!") || caracter.equals("¡") || caracter.equals("]") || caracter.equals("<") || caracter.equals(">")) {

                cadenaSimbolos = cadenaSimbolos + dato.charAt(i);
                cadenaFSimbolos = cadenaSimbolos;
                System.out.println("Final simbolos "+cadenaFSimbolos);

            }

            if (caracter.equals(".") || caracter.equals(",") || caracter.equals(";") || caracter.equals(":") || caracter.equals("´") || caracter.equals("'") || caracter.equals("_") || caracter.equals("@")
                    || caracter.equals("#") || caracter.equals("%") || caracter.equals("=")) {

                System.out.println(TipoToken.CARACTER.toString());
                System.out.println(dato.charAt(i));
                cadenaCaracteres = cadenaCaracteres + dato.charAt(i);
                cadenaFCaracteres = cadenaCaracteres;
                System.out.println(cadenaFCaracteres);
            }

            /* if (validarNumero(dato) == true) {
                
                System.out.println(TipoToken.NUMEROENTERO.toString());
                System.out.println(dato.charAt(i));
                cadenaEnteros = cadenaEnteros + dato.charAt(i);
                System.out.println(cadenaEnteros);

            }*/
            if (caracter.equals("1") || caracter.equals("2") || caracter.equals("3") || caracter.equals("4") || caracter.equals("5") || caracter.equals("6") || caracter.equals("7") || caracter.equals("8")
                    || caracter.equals("9") || caracter.equals("0")) {

                System.out.println(TipoToken.NUMEROENTERO.toString());
                System.out.println(dato.charAt(i));
                cadenaEnteros = cadenaEnteros + dato.charAt(i);
                cadenaFEnteros =  cadenaEnteros;
                System.out.println(cadenaEnteros);

            }

        }

        Interfaz.salida.setText(TipoToken.CARACTER.getTipo() + " " + cadenaFCaracteres + "\n" + TipoToken.SIMBOLO.getTipo() + " " + cadenaFSimbolos + "\n" + TipoToken.NUMEROENTERO.getTipo() + cadenaFEnteros + "\n" + TipoToken.ID.toString() + cadenaFId);

    }

    public static boolean validarNumero(String dato) {

        if (dato == null || dato.length() == 0) {
            return false;
        }
        try {
            Double.parseDouble(dato);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

}
