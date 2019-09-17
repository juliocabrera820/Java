package Stream;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Artist> artistas = new ArrayList<>();
        artistas.add(new Artist("Black Sabbath",4,"London"));
        artistas.add(new Artist("Dio",4,"Manchester"));
        artistas.add(new Artist("Iron Maiden",6,"Manchester"));
        artistas.add(new Artist("Children Of Bodom",5,"Helsinki"));
        artistas.stream().
            filter(artist -> artist.getCity().equals("Manchester")).
            forEach(System.out::println);
        int counter = (int) artistas.stream().
            filter(artist -> artist.getCity().
                equals("Manchester")).count();
        System.out.println("Bandas de Manchester "+counter);
        ArrayList<Artist> fourmembers = artistas.stream().
            filter(a -> a.getMembers()==4).
            collect(Collectors.toCollection(ArrayList::new));
        fourmembers.stream().
            forEach(System.out::println);
        ArrayList<String> names = artistas.stream().
            map(x -> x.getName().toUpperCase()).
            collect(Collectors.toCollection(ArrayList::new));
        names.stream().forEach(System.out::println);
        //Metodos de stream usados: filter,map,collect,foreach,count
    }
}
