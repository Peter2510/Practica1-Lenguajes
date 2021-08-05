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
        String caractere;
        String id;
        int entero;
        double decimal;
        
        String cadenaSimbolos = "";
        String cadenaCaracteres = "";
        String cadenaId = "";
        String cadenaNumeros = "";
        String cadenaDecimales = "";

        for (int i = 0; i < cadena.length(); i++) {

            String caracter = String.valueOf(cadena.charAt(i));

            if (caracter.equals("*") || caracter.equals("/") || caracter.equals("+") || caracter.equals("-") || caracter.equals("(") || caracter.equals(")") || caracter.equals("{") || caracter.equals("}")
                   || caracter.equals("[") || caracter.equals("]")|| caracter.equals("?")|| caracter.equals("¿")|| caracter.equals("!")|| caracter.equals("¡")|| caracter.equals("]")|| caracter.equals("<")|| caracter.equals(">")) {

                System.out.println(TipoToken.SIMBOLO.toString());
                System.out.println(cadena.charAt(i));
                cadenaSimbolos = cadenaSimbolos + cadena.charAt(i);
                System.out.println(cadenaSimbolos);
                
            }
            
               if (caracter.equals(".") || caracter.equals(",") || caracter.equals(";") || caracter.equals(":") || caracter.equals("´") || caracter.equals("'") || caracter.equals("_") || caracter.equals("@")
                   || caracter.equals("#") || caracter.equals("%")|| caracter.equals("=")) {

                System.out.println(TipoToken.CARACTER.toString());
                System.out.println(cadena.charAt(i));
                cadenaCaracteres = cadenaCaracteres + cadena.charAt(i);
                System.out.println(cadenaCaracteres);
                
            }
            
            Interfaz.salida.setText(TipoToken.CARACTER.getTipo() + " " + cadenaCaracteres+"\n"+TipoToken.SIMBOLO.getTipo() + " " + cadenaSimbolos);
            //Interfaz.salida.setText();
        }
    }
}
