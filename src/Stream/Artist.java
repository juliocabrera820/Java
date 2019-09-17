package Stream;

public class Artist {
    private String name;
    private int members;
    private String city;

    public Artist(String name, int members, String city) {
        this.name = name;
        this.members = members;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Name " + name +
            " Members " + members +
            " City " + city;
    }
}
