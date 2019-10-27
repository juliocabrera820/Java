package Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        List<Ordenador> ordenadores = Arrays.asList(new Ordenador("0101", "Gaming Laptop", "Dell"), new Ordenador("XYY5", "Ofimatica", "HP"));
        List<Lavadora> lavadoras = Arrays.asList(new Lavadora("BMPP", "ZYN200", "Normal"), new Lavadora("099", "Ah500", "Avanzado"));
        imprimirLista(ordenadores);
        imprimirLista(lavadoras);
    }

    public static void imprimirLista(List<?> lista) {

        for (Object ob : lista) {
            Method[] methods = ob.getClass().getMethods();
            for (Method mt : methods) {
                if (mt.getName().equals("getId") || mt.getName().equals("getDescripcion")) {
                    try {
                        String attr = (String) mt.invoke(ob, null);
                        System.out.println(attr);
                    } catch (IllegalAccessException | IllegalArgumentException
                        | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }

            }
        }
    }

}

