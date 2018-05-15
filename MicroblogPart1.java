package MicroblogPart1Number1;
import java.util.ArrayList;
import java.util.Scanner;

public class MicroblogPart1 {
    static Scanner keyboard = new Scanner(System.in);
    static int numUsers;
    static int currentUser;
    static int numPosts;
    static int postNum;
    static Post[] postContents=new Post[100];
    static User[] userArray = new User[20];

    public static void main(String[] args) {
        int x;
        userMenu();
        postContents=postMenu();
        do {

            mainMenu();
            x = keyboard.nextInt();
            keyboard.nextLine();
            if (x != 9) {
                executeCommand(x);
            }
        } while (x!=9);

    }

    public static void executeCommand(int x) {

        if (x == 1) {
//create new user
            newUser();
//add to Users array

            numUsers++;

        }
        if (x == 2) {

            for (int counter = 0; counter < numUsers; counter++) {
                System.out.println((counter+1)+" "+userArray[counter].getUserName());

            }
            System.out.println("Which user name would you like to become?");
            currentUser=keyboard.nextInt();
            keyboard.nextLine();
            currentUser=currentUser-1;
        }

        if (x == 3) {
//find last post made by that user

//print post to screen

//ask user to type in next post

//when done entering it, save in post array

            int userPost = -1;
            for (int counter = 0; counter<numPosts; counter++) { //numPost--total posts in whole array
//System.out.println(userArray[currentUser].getUserName());

//System.out.println(postContents[0].getUser());

                if (postContents[counter].getUser().equals(userArray[currentUser].getUserName())) {

//currentUser=counter;

//System.out.println(postContents[counter].getUser());

//System.out.println(userArray[currentUser].getUserName());

                    userPost=counter;
                }
//userPost++;
            }
            if (userPost > -1) {
                System.out.println("YOUR LAST POST:");
                System.out.println(postContents[userPost].getPosts());
            } else {
                System.out.println("no posts by current user");
            }

            System.out.println("ENTER WHAT DO U WANT TO POST:");
            String pst=keyboard.nextLine();//input
            postContents[numPosts] = new Post(userArray[currentUser].getUserName(), pst, userArray[currentUser].getEmailAddress());
            System.out.println("Successfully posted:");
            System.out.println(postContents[numPosts].getPosts());
//System
            numPosts++;// last index of post array!!! we just updated it

        }
        if (x == 4) {
            postMenu();
            for (int counter = 0; counter < numPosts; counter++) {
                System.out.println(counter + ". " + postContents[counter].getPosts());
            }

        }
        if (x == 5) {
//userMenu();
            for (int counter = 0; counter < numUsers; counter++) {
                System.out.println(userArray[counter].getUserContents());
            }

        }
    }

    public static void userMenu() {

// User[] userName = new User[20];
        userArray[0] = new User("WW", "WonderWoman", "Wonder", "Woman", "wonderwoman@gmail.com");
        userArray[1] = new User("LCK", "louisck", "Louis", "CK", "lck@gmail.com");
        userArray[2] = new User("LJ", "lorijones", "Lori", "Jones", "lorijones@gmail.com");
        userArray[3] = new User("BY", "beyonce", "beyonce", "knolls", "beyonce@gmail.com");
        userArray[4] = new User("MT", "mathew", "Mathew", "Shaw", "mathew@gmail.com");
        String [] avatarPictureNames = {"WonderWoman", "LouisCK", "LoriJones", "Beyonce", "Mathew"};
        numUsers = 5;

    }

    public static Post[] postMenu() {

//postContents = new Post[5];
        postContents[0] = new Post("WonderWoman", "Visual Veggies served as a helpful comprehensive resource for preparing to take the RD exam.", "wonderwoman@gmail.com");
        postContents[1] = new Post("louisck", "Many undergrads preparing to take the RD exam utilize RD in a Flash, recommended by a SLU professor.", "lck@gmail.com");
        postContents[2] = new Post("lorijones", "Metromix provided a variety of resources, including a study tips DVD, three full 125-question practice exams, and an outline of all four domains for the exam.",
                "lorijones@gmail.com");
        postContents[3] = new Post("beyonce", "Blocking out three hours at a time to take a practice exam trains the brain to focus on each question and use proper time management to successfully complete all the exam questions.", "" +
                "beyonce@gmail.com");
        postContents[4] = new Post("mathew", "A registered dietitian named Bailey has a phenomenal coaching program designed to help RD's pass their exam.", "mathew@gmail.com");
        numPosts=5;
        return postContents;
    }

    public static void newUser() {
        System.out.println("What is the new user's avatar picture?");
        String avatarPicture = keyboard.nextLine();
        System.out.println("What is the new user's user name?");
        String myAuthor = keyboard.nextLine();
        System.out.println("What is the new user's first name?");
        String firstName = keyboard.nextLine();
        System.out.println("What is the new user's last name?");
        String lastName = keyboard.nextLine();
        System.out.println("What is the new user's email address?");
        String emailAddress = keyboard.nextLine();
        User newUser = new User(avatarPicture, myAuthor, firstName, lastName, emailAddress);
        userArray[numUsers]=newUser;
//return newUser;
    }

    public static String mainMenu() {
        System.out.println("Main Menu");
        System.out.println("1) Create a new user");
        System.out.println("2) Become an existing user");
        System.out.println("3) Create a post as the current user");
        System.out.println("4) Print all posts");
        System.out.println("5) Print all users");

        return null;
    }
}
