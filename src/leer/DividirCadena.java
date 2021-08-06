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
    private static String cadenaError = "";

    private static String cadenaFSimbolos = "";
    private static String cadenaFCaracteres = "";
    private static String cadenaFId = "";
    private static String cadenaFEnteros = "";
    private static String cadenaFDecimales = "";
    private static String cadenaFError = "";

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
            
            char idL = dato.charAt(i);

            String caracter = String.valueOf(dato.charAt(i));

            if (caracter.equals("*") || caracter.equals("/") || caracter.equals("+") || caracter.equals("-") || caracter.equals("(") || caracter.equals(")") || caracter.equals("{") || caracter.equals("}") || caracter.equals("[") || caracter.equals("]") || caracter.equals("?") || caracter.equals("¿") || caracter.equals("!") || caracter.equals("¡") || caracter.equals("]") || caracter.equals("<") || caracter.equals(">")) {

                cadenaSimbolos = cadenaSimbolos + dato.charAt(i);
                cadenaFSimbolos = cadenaSimbolos;
                System.out.println("Final simbolos " + cadenaFSimbolos);

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
            if (validarNumero(dato)==true) {

                System.out.println(TipoToken.NUMEROENTERO.toString());
                System.out.println(dato.charAt(i));
                cadenaEnteros = cadenaEnteros + dato.charAt(i);
                cadenaFEnteros = cadenaEnteros;
                System.out.println(cadenaEnteros);

            } 
            
            if (validarNumero(dato)==false) {

                cadenaId = cadenaId + dato.charAt(i);
                cadenaFId = cadenaId;
                System.out.println(cadenaId);

            }

            
        else {
                cadenaError = cadenaError + dato.charAt(i);
                cadenaFError = cadenaError;
            }

        }

        Interfaz.salida.setText(TipoToken.CARACTER.getTipo() + " " + cadenaFCaracteres + "\n" + TipoToken.SIMBOLO.getTipo() + " " + cadenaFSimbolos + "\n" + TipoToken.NUMEROENTERO.getTipo() + cadenaFEnteros + "\n" + TipoToken.ID.getTipo() + cadenaFId + "\n" + TipoToken.ERROR.getTipo());

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
