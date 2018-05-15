package MicroblogPart1Number1;

public class Post {
    private static int nextOrderPosted = 0;

    private String user;
    private String postContent;
    private String webAddress;
    private int orderPosted;
//User author =null;
//User myAuthor = new User();
//Post myPost = new Post(myAuthor);

    public Post(String user, String postContent, String webAddress) {
        this.orderPosted = nextOrderPosted;
        nextOrderPosted++;
        this.user = user;
        this.postContent = postContent;
        this.webAddress = webAddress;
// this.myAuthor=myAuthor;

    }

    public String getUser()
    {
        return user;
    }

    public Post(User myAuthor) {
    }

    public String getPosts() {
        return user + " " + postContent+ " " + webAddress + " " + orderPosted;
    }

}
