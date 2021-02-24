import java.io.*;
import java.util.ArrayList; // import the ArrayList class

public class Main {

    public static void main(String[] args) throws IOException {
        // todo: Create several Person objects to create yourself a little Village. Store these so you can print them later.
        // You can either hardcode these in, or better yet, ask the user for information about them! If you do this, you might want to define a helper function.

        //testing creating new people
        Person person = new Person("McPhee", "Anna", "Brown", "Brown", "May 27, 1986");

        String myTest = myQuestions();



        // todo: One person just got married. They changed their surname!


        // todo: Print out each Person in the Village (make sure you have implemented the Person.toString() method first)

    }

    public ArrayList<Person> myQuestions() throws IOException {
}

class Person {
    // Include at least four other 'traits' that a Person might have that usually differ from other People.
    private String surname;
    private String firstname;
    private String haircolour;
    private String eyecolour;
    private String birthdate;


    // Update this constructor to include the additional traits you made.
    public Person(String surname, String firstname, String haircolour, String eyecolour, String birthdate) {
        this.surname = surname;
        this.firstname = firstname;
        this.haircolour = haircolour;
        this.eyecolour = eyecolour;
        this.birthdate = birthdate;
    }

    // todo: Implement
    public void changeSurname(String newSurname) {

    }

    // Create a sensible toString implementation so each Person object can be printed out.
    public String toString() {
        return String.format("%s %s with %s hair, %s eyes, born on %s.", this.firstname, this.surname, this.haircolour, this.eyecolour, this.birthdate);
    }
}