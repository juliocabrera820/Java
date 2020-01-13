package FunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Principal {
    public static void main(String[] args) {
        //No retorna valor
        Consumer<Integer> cuadrado = (num) -> System.out.println("El cuadrado es "+num*num);
        cuadrado.accept(15);
        cuadrado.accept(7);
        cuadrado.andThen((num)-> System.out.println("Argumento "+num)).accept(10);

        //Retorna un booleano
        Predicate<Integer> esPar = (num) -> num % 2 == 0;
        System.out.println((esPar.test(12)) ? "Es par" : "Es impar");

        Supplier<String> mensaje = () -> "Supplier no recibe argumentos y retorna un valor";
        System.out.println(mensaje.get());

        System.out.println("Filtrar numeros");
        BiConsumer<List<Integer>,Integer> filtrar = (numeros,numero) -> {
            numeros.stream().filter(x -> x>numero).forEach(x -> System.out.print(x+" "));
        };
        List<Integer> numeros = Arrays.asList(10,5,2,3,8,9,0,11,3,7,8,22);
        filtrar.accept(numeros,3);
    }
}
