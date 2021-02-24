import java.io.*; // import java.io for collecting/reading input
import java.util.ArrayList; // import the ArrayList class

public class Main {

    public static void main(String[] args) throws IOException {
        // Create several Person objects to create yourself a little Village. Store these so you can print them later.
        // You can either hardcode these in, or better yet, ask the user for information about them! If you do this, you might want to define a helper function.

        ArrayList<Person> people = myQuestions();  //call method to ask questions and populate arrayList with People

        // One person just got married. They changed their surname!

        Person spouse = people.get(0); // take first person in village to get married
        String oldName = spouse.nameString(); // define old name
        spouse.changeSurname("Smith"); // use changeSurname to change surname
        String newName = spouse.nameString(); // define new name
        System.out.println("\n"+oldName+" got married, and is now "+newName+"!\n"); // output old + new names


        // Print out each Person in the Village (make sure you have implemented the Person.toString() method first)
        System.out.println("----------\nEvery Person in the Village:\n----------\n");
        for (int i = 0; i < people.size(); i++) {
            System.out.println(i+1+"."+people.get(i));
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

    // Implement changeSurname
    public void changeSurname(String newSurname) {
        this.surname = newSurname;
    }

    // Create a sensible toString implementation so each Person object can be printed out.
    public String toString() {
        return String.format("%s %s [%s hair; %s eyes; born %s]", this.firstname, this.surname, this.haircolour, this.eyecolour, this.birthdate);
    }

    // Create a sensible toString implementation so each Person object can be printed out.
    public String nameString() {
        return String.format("%s %s", this.firstname, this.surname);
    }
}