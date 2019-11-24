package Optional;

import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar palabra:");
        String pal = scanner.nextLine();
        orElse(pal);
        orElseThrow(pal);
        isPresent(pal);
        optionalIfPresent(pal);
        orElse(null);
        orElseThrow(null);
        isPresent(null);
        optionalIfPresent(null);
    }

    public static void orElse(String pal){
        Optional<String> op = Optional.ofNullable(pal);
        String palabra = op.orElse("Usando un valor por defecto");
        System.out.println(palabra);
    }

    public static void orElseThrow(String pal){
        Optional<String> op = Optional.ofNullable(pal);
        System.out.println("Lanzando InputMisMatchException");
        op.orElseThrow(InputMismatchException::new);
    }

    public static void isPresent(String pal){
        Optional<String> op = Optional.ofNullable(pal);
        System.out.println(op.isPresent());
    }

    public static void optionalIfPresent(String pal){
        Optional<String> op = Optional.ofNullable(pal);
        op.ifPresent(x -> System.out.println("El valor es "+x));
    }

}
