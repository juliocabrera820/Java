package StreamParteDos;

import java.util.ArrayList;
import java.util.Comparator;

public class StreamMethods {

    private ArrayList<Band> bands;

    public StreamMethods() {

        bands = new ArrayList<>();
    }

    public void addBand (Band banda){

        bands.add(banda);
    }

    public void iterate (){

        bands.stream().
            forEach(System.out::println);
    }

    public void removeIfMethod(String name){

        bands.removeIf(x -> x.equals(name));
    }

    public void sortByName(){

        bands.sort(Comparator.comparing(Band::getName));
    }

    public void sort(){

        bands.sort(Comparator.comparing(Band::getName).
            thenComparing(Band::getCity));
    }
}
