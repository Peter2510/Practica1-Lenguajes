/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author GORDILLO G
 */
public enum TipoToken {

    NUMEROENTERO("Enteros: "),
    NUMERODECIMAL("Decimales: "),
    CARACTER("Caracteres: "),
    ID("Id: "),
    SIMBOLO("Simbolos: ");

    private String tipo;

    private TipoToken(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "El token leido es un " + tipo;
    }

    public String getTipo() {
        return tipo;
    }

}
