package es.uah.matcomp.mp.e1.ejerciciosclases;

    public class TestNuevoCirculo {
        public static void main(String[] args) {
            // Test Constructors and toString()
            NuevoCirculo c1 = new NuevoCirculo(1.1);
            System.out.println(c1);   // toString()
            NuevoCirculo c2 = new NuevoCirculo(); // default constructor
            System.out.println(c2);
            // Test setter and getter
            c1.setRadius(2.2);
            System.out.println(c1);      // toString()
            System.out.println("radius is: " + c1.getRadius());
            // Test getArea() and getCircumference()
            System.out.printf("area is: %.2f%n", c1.getArea());
            System.out.printf("circumference is: %.2f%n", c1.getCircumference());
        }
    }
//Salida esperada verificada con éxito
