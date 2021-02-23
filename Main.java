public class Main {

    public static void main(String[] args) {
        // todo: Create several Person objects to create yourself a little Village. Store these so you can print them later.
        // You can either hardcode these in, or better yet, ask the user for information about them! If you do this, you might want to define a helper function.

        System.out.println("Hello world!");

        // todo: One person just got married. They changed their surname!


        // todo: Print out each Person in the Village (make sure you have implemented the Person.toString() method first)

    }

}

class Person {
    // Include at least four other 'traits' that a Person might have that usually differ from other People.
    private String surname;
    private String firstname;
    private String haircolour;
    private String eyecolour;
    private String birthdate;


    // todo: Update this constructor to include the additional traits you made.
    public Person (String surname) {
        this.surname = surname;
    }

    // todo: Implement
    public void changeSurname(String newSurname) {

    }

    // todo: Create a sensible toString implementation so each Person object can be printed out.
    public String toString() {
        return "";
    }
}