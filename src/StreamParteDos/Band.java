package StreamParteDos;

public class Band {

    private String name;
    private String city;
    private int members;

    public Band(String name, String city, int members) {
        this.name = name;
        this.city = city;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "Name " + name + " City " + city +
            " Members " + members;
    }
}
