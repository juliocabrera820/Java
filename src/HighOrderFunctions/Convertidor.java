package HighOrderFunctions;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Convertidor {

    public void imprimir(Function<String,String> funcion,String cadena){
        System.out.println(funcion.apply(cadena));
    }
    public Function<Integer,String> funcion (String msj){
        return x-> msj+x;
    }
    public void funcionCompleta(Predicate<String> pre,Consumer<String> con, ArrayList<String> palabras){
        palabras.stream().filter(pre).forEach(con);
    }
}
