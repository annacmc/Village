import java.io.*; // import java.io for collecting/reading input
import java.util.ArrayList; // import the ArrayList class
import java.util.Random; // import random for selecting random villager to get married

public class Main {

    public static void main(String[] args) throws IOException {
        // todo: Create several Person objects to create yourself a little Village. Store these so you can print them later.
        // You can either hardcode these in, or better yet, ask the user for information about them! If you do this, you might want to define a helper function.

        //testing creating new people
        Person person = new Person("McPhee", "Anna", "Brown", "Brown", "May 27, 1986");

        //call method to ask questions and populate arrayList with answers
        ArrayList<Person> people = myQuestions();


        // todo: One person just got married. They changed their surname!

        // Choose a random villager
        Random randomGenerator = new Random();
        int index = randomGenerator.nextInt(people.size());
        Person randomItem = people.get(index);
        System.out.println(randomItem.fullNameString() + "Is getting married! They Changed their surname!");


        // First one is changing name to match second one. Call changeSurname

        // Print update. eg String.format("%s got married! Their surname is now %s", this.firstname, this.surname);



        // Print out each Person in the Village (make sure you have implemented the Person.toString() method first)
        System.out.println("Every Person in the Village:");
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }

    }


    // define a helper function for questioning user

    public static ArrayList<Person> myQuestions() throws IOException {
        char quit = 'Y';
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Create an ArrayList object
        ArrayList<Person> people = new ArrayList<>();

        // Ask for traits of each villager, loop until user decides it's enough
        while (quit == 'Y')
        {

            String firstname, surname, haircolour, eyecolour, birthdate;

            System.out.println("Enter First Name: ");
            firstname = br.readLine();
            System.out.println("Enter Last Name: ");
            surname = br.readLine();
            System.out.println("Enter Hair Colour: ");
            haircolour = br.readLine();
            System.out.println("Enter Eye Colour: ");
            eyecolour = br.readLine();
            System.out.println("Enter Birth Date: ");
            birthdate = br.readLine();
            System.out.println("Would you like to create another villager? (Y/N) ");
            String word = br.readLine();
            word = word.toUpperCase();
            quit= word.charAt(0);

            // create instance of person
            Person person = new Person(surname, firstname, haircolour, eyecolour, birthdate);

            // add person to people arraylist
            people.add(person);

        }
        //
        br.close();
        // return array
        return people;
    }

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

    // Method to output just the fullname

    public String fullNameString() {
        return String.format(" %s %s ", this.firstname, this.surname);
    }
}