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

    NUMEROENTERO("Es entero"),
    NUMERODECIMAL("Es un decimal"),
    ID("Es un id"),
    SIMBOLO("Es un simbolo");

    private String tipo;

    private TipoToken(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "El token leido es de tipo " + this.name().toLowerCase();
    }

    
}
