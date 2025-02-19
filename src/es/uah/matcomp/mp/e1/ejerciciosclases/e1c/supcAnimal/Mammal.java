package es.uah.matcomp.mp.e1.ejerciciosclases.e1c.supcAnimal;

public class Mammal extends Animal{
    public Mammal(String name) {
        super(name);

    }
    public String toString() {
        return "Mammal[ "+ super.toString() +"]";
    }
}
