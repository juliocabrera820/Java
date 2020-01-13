package FunctionalInterfaceAnotation;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Principal {

    public static void main(String[] args) {

        ISaludo Saludo = () -> "Saludo desde interfaz";
        System.out.println(Saludo.saludo());
        ISuma suma = (a,b) -> System.out.println(a+b);
        suma.sumar(7,11);
        List<Integer> numeros = Arrays.asList(5,10,3,2,8,2);
        IPromedio pro = (nums) -> nums.stream().reduce(0,Integer::sum)/(double)nums.size();
        System.out.println("El promedio es "+pro.promedio(numeros));
        Function<Integer, String> ejemplo = x -> "El numero es "+x;
        String res = ejemplo.apply(5);
        System.out.println(res);
        Consumer<List<Integer>> consumer = x -> x.stream().forEach(System.out::println);
        List<Integer> num = Arrays.asList(2,10,5,7,11);
        consumer.accept(num);
        Function<Integer,Boolean> par = x -> x % 2 == 0;
        System.out.println(par.apply(10));
        Predicate<Integer> impar = x -> x % 2 != 0;
        System.out.println(impar.test(7));
        Consumer<String> word = System.out::println;
        word.andThen(word).accept("Message");
    }
}
