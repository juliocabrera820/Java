package HighOrderFunctions;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Convertidor convertidor = new Convertidor();
        convertidor.imprimir(x -> x.toUpperCase(),"ejemplo");
        convertidor.imprimir(x -> x.toLowerCase(),"EJEMPLO");
        String msg = convertidor.funcion("Hola ").apply(10);
        System.out.println(msg);
        ArrayList<String> words = new ArrayList<String>();
        words.add("Children Of Bodom");
        words.add("Abbath");
        words.add("Immortal");
        words.add("Sabaton");
        convertidor.funcionCompleta(x -> x.length()>7,System.out::println,words);
    }
}
