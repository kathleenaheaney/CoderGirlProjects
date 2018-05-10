package MicroblogPart1Number1;

import java.util.ArrayList;

public class User {
    private String avatarPicture;
    private String userName;
    private String firstName;
    private String lastName;
    private String emailAddress;

    private ArrayList<Post> posts = new ArrayList<Post>();

    public User(Post p) {
        posts.add(p);
    }



    public User(String avatarPicture, String userName, String firstName, String lastName, String emailAddress) {
        this.avatarPicture = avatarPicture;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;

    }

    public String getUserContents() {
        return avatarPicture + " " + userName + " " + firstName + " " + lastName + " " + emailAddress + " ";
    }

    public String getUserName() {
        return userName;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

}