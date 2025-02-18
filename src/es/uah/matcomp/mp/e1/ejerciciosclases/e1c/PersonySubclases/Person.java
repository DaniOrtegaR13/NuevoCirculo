package es.uah.matcomp.mp.e1.ejerciciosclases.e1c.PersonySubclases;

public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String toString() {
        return "[name = " + name + " address = " + address + "]";
    }
}
