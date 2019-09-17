package StreamParteDos;

public class Principal {

    public static void main(String[] args) {
        StreamMethods metodos = new StreamMethods();
        metodos.addBand(new Band("cob","Helsinki",5));
        metodos.addBand(new Band("acdc","London",5));
        metodos.addBand(new Band("abbath","Oslo",4));
        metodos.addBand(new Band("venom","Norwich",3));
        metodos.iterate();
        metodos.sort();
        metodos.iterate();
        System.out.println("Bandas 2");
        StreamMethods metodosdos = new StreamMethods();
        metodosdos.addBand(new Band("cob","Helsinki",5));
        metodosdos.addBand(new Band("acdc","London",5));
        metodosdos.addBand(new Band("cob","Arch",4));
        metodosdos.addBand(new Band("venom","Norwich",3));
        metodosdos.iterate();
        metodosdos.sortByName();
        metodosdos.iterate();
        metodosdos.sort();
        metodosdos.iterate();

    }
}
