package es.uah.matcomp.mp.e1.ejerciciosclases.e1b.AuthorBookOne;
//2.3
public class TestAuthor {
    public static void main(String[] args) {
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com"); // Test the constructor
        System.out.println(ahTeck);  // Test toString()
        ahTeck.setEmail("paulTan@nowhere.com");  // Test setter
        System.out.println("name is: " + ahTeck.getName());
// Test getter
        System.out.println("eamil is: " + ahTeck.getEmail());
// Test getter


    }
}
