package StringMethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Principal {
    public static void main(String[] args) {
        String palabra = "";
        System.out.println((palabra.isBlank() ? "Está vacía" : "es una cadena"));
        palabra = "   ";
        System.out.println((palabra.isBlank() ? "Contiene espacios en blanco" : "es una cadena"));
        palabra = " pal";
        System.out.println((palabra.isBlank() ? "Contiene espacios en blanco" : "es una cadena"));
        palabra = "pal";
        System.out.println((palabra.isBlank() ? "Contiene espacios en blanco" : "es una cadena"));

        String str = " JD ";
        System.out.println("Eliminar espacios al principio y al final");
        System.out.print("--");
        System.out.print(str.strip());
        System.out.println("--");
        System.out.println("Elimimar espacios al principio");
        System.out.print("--");
        System.out.print(str.stripLeading());
        System.out.println("--");
        System.out.println("Eliminar espacios al final");
        System.out.print("--");
        System.out.print(str.stripTrailing());
        System.out.println("--");

        System.out.println(str.strip().repeat(3));

        str = "2\n32\n11";
        System.out.println(str.lines().collect(toList()));
    }
}
