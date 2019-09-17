package StreamNumbers;

import java.util.ArrayList;
import java.util.Arrays;

public class Numbers {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(1);
        numeros.add(7);
        numeros.add(11);
        numeros.add(9);
        //Reduce
        int sum = numeros.stream().reduce(0,(a,b) -> a+b);
        System.out.println(sum);
        //Metodo de referencia
        int suma = numeros.stream().reduce(1,Integer::sum);
        System.out.println(suma);
        int sumaimpares = numeros.stream().
            filter(x -> x%2 != 0).
            reduce(0,Integer::sum);
        int numeropares = (int)numeros.stream().filter(x->x%2==0).count();
        System.out.println("Suma de numeros impares "+sumaimpares);
        System.out.println("Hay "+numeropares+" Numeros pares");

        String string = "10 10 Item2 25 Item3 30 Item4 45";

        Integer sumaArray = Arrays.stream(string.split(" "))
            .filter((s) -> s.matches("\\d+"))
            .mapToInt(Integer::valueOf)
            .sum();
        System.out.println(sumaArray);
    }
}
