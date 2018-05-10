package MicroblogPart1Number1;
import java.util.ArrayList;
import java.util.Scanner;

public class MicroblogPart1 {
    static Scanner keyboard = new Scanner(System.in);
    static int numUsers;
    static int currentUser = -1;
    static int numPosts;
    static int postNum;

    private static ArrayList<User> users = new ArrayList<User>();
    private static ArrayList<Post> allPosts = new ArrayList<Post>();

    static User[] userArray = new User[20];
    public static void main(String[] args) {
        int x = -1;
        userMenu();
        do {

            mainMenu();
            x = keyboard.nextInt();
            keyboard.nextLine();
            if (x != 9) {
                executeCommand(x);
            }
        } while (x!=9);

        keyboard.close();

    }

    public static void executeCommand(int x) {

        if (x == 1) {
            //create new user
            User newUser = newUser();
            //add to Users array
            users.add(newUser);
            //userArray[5] = newUser;
            //numUsers++;

        }
        else if (x == 2) {

            for (int counter = 0; counter < users.size(); counter++) {
                System.out.println((counter + 1) + " = " + users.get(counter).getUserName());
            }
            System.out.println("Which user name would you like to become?");
            currentUser=keyboard.nextInt() - 1;
            //keyboard.nextLine();

        }

        if (x == 3) {
            //find last post made by that user
            //Post newPost = newPost();
            //print post to screen

            //ask user to type in next post

            //when done entering it, save in post array

            if (currentUser > -1) {
                User user = users.get(currentUser);

                int indexOfLastPost = user.getPosts().size() - 1;

                if (indexOfLastPost > -1) {
                    System.out.println("The last post by the current user was:");
                    System.out.println(user.getPosts().get(indexOfLastPost).getPost());
                    System.out.println();
                } else {
                    System.out.println("No posts by current user");
                    System.out.println();
                }

                System.out.println("Please enter the next post:");
                String postContent = keyboard.nextLine();

                System.out.println("Would you like to enter this post's webAddress? Type: yes/no");
                String typeWebAddress = keyboard.nextLine();

                Post newPost;
                String webAddress;
                if (typeWebAddress.equalsIgnoreCase("yes")) {
                    System.out.println("Please enter the webAddress:");
                    webAddress = keyboard.nextLine();
                    newPost = new Post(user, postContent, (allPosts.size() + 1));
                    user.getPosts().add(newPost);
                    allPosts.add(newPost);
                } else {
                    newPost = new Post(user, postContent, (allPosts.size() + 1));
                    user.getPosts().add(newPost);
                    allPosts.add(newPost);
                }
            } else {
                System.out.println("No user is currently selected. Please use option 2 to select a user.");
                System.out.println();
            }}
        else if (x == 4)
            //postMenu();
            //for (int counter = 0; counter < postMenu().length; counter++) {
                //System.out.println(counter + ". " + postMenu()[counter].getPosts());
           // }

        {
            if (allPosts.size() > 0) {
                for (int counter = 0; counter < allPosts.size(); counter++) {
                    System.out.println((counter + 1) + ": " + allPosts.get(counter).getPost());
                }
            } else {
                System.out.println("There are zero posts, no posts to view.");
            }
            System.out.println();

        }
        else if (x == 5) //{
            userMenu();
            for (int counter = 0; counter < numUsers; counter++) {
                System.out.println(userArray[counter].getUserContents());
            }

        }
        {
            if (users.size() > 0) {
                for (int counter = 0; counter < users.size(); counter++) {
                    System.out.println(users.get(counter).getUserContents());
                }
            } else {
                System.out.println("There are zero users, no users to view.");
            }
            System.out.println();
        } //else {
            //System.out.println("Please choose a valid menu option.");
            //System.out.println();
       // }


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


    //public static Post[] postMenu() {

        //Post[] postContents = new Post[5];
       // postContents[0] = new Post("JJ", "Visual Veggies served as a helpful comprehensive resource for preparing to take the RD exam.", "visualveggies.com");
        //postContents[1] = new Post("KK", "Many undergrads preparing to take the RD exam utilize RD in a Flash, recommended by a SLU professor.", "RDinaflash.com");
        //postContents[2] = new Post("MM", "Metromix provided a variety of resources, including a study tips DVD, three full 125-question practice exams, and an outline of all four domains for the exam.",
                //"metromix.com");
        //postContents[3] = new Post("PE", "Blocking out three hours at a time to take a practice exam trains the brain to focus on each question and use proper time management to successfully complete all the exam questions.", "" +
                //"RD.com");
        //postContents[4] = new Post("Bailey", "A registered dietitian named Bailey has a phenomenal coaching program designed to help RD's pass their exam.", "bailey.com");
        //eturn postContents;
    //}

    public static User newUser() {
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
        return newUser;
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
