package MicroblogPart1Number1;

public class Post {
    private static int nextOrderPosted = 0;

    private User user;
    private String postContent;
    private String webAddress;
    private int orderPosted;

    public Post(User user, String postContent, int orderPosted) {
        this.orderPosted = orderPosted;
        this.user = user;
        this.postContent = postContent;
        this.webAddress = webAddress;
        }

    //public Post(User myAuthor) {
    //}

    //public String getPosts() {
            //return user + " " + postContent+ " " + webAddress + " " + orderPosted;
        //}


    public String getPost() {
        if (webAddress != null)
            return "userName: " + user.getUserName() + ", postContent: " + postContent + ", orderPosted: " + orderPosted
                    + ", webAddress: " + webAddress;
        else
            return "userName: " + user.getUserName() + ", postContent: " + postContent + ", orderPosted: "
                    + orderPosted;
    }

    public User getUser() {
        return user;
    }

    public String getPostContent() {
        return postContent;
    }

    public String getWebAddress() {
        return webAddress;
    }

    public int getOrderPosted() {
        return orderPosted;
    }





}

