package BiFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Principal {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,5,0,-1,-8,-22,11,22,3);
        BiFunction<
            List<Integer>,
            Predicate<Integer>,
            List<Integer>
            > filtrado = (lista,predicado) -> {
            ArrayList<Integer> nueva = lista.stream().filter(predicado).collect(Collectors.toCollection(ArrayList::new));
            return nueva;
        };
        filtrado.apply(numbers,x -> x>=0).forEach(System.out::println);

    }
}
