
class Post {
    String content;
    Post prev, next;

    Post(String content) {
        this.content = content;
    }
}
public class DoublyLinkedlist {

    static Post head = null;
    static Post tail = null;
    static Post current = null;

    // Add Post
    static void addPost(String content) {

        Post newPost = new Post(content);

        if(head == null) {
            head = tail = current = newPost;
        } else {
            tail.next = newPost;
            newPost.prev = tail;
            tail = newPost;
        }
    }

    // Next Post
    static void nextPost() {
        current = current.next;
        System.out.println("Current Post: " + current.content);
    }

    // Previous Post
    static void previousPost() {
        current = current.prev;
        System.out.println("Current Post: " + current.content);
    }

    // Insert Sponsored Post
    static void insertSponsoredPost(String content) {

        Post sponsored = new Post("Sponsored : " + content);

        sponsored.next = current.next;
        sponsored.prev = current;

        current.next.prev = sponsored;
        current.next = sponsored;
    }

    // Delete Current Post
    static void deleteCurrentPost() {

        current.prev.next = current.next;
        current.next.prev = current.prev;

        current = current.next;
    }

    // Display Feed
    static void displayFeed() {

        Post temp = head;

        while(temp != null) {
            System.out.println(temp.content);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        addPost("Vacation Photos");
        addPost("Coding Tips");
        addPost("Food Blog");

        System.out.println("Current Post: " + current.content);

        nextPost();

        insertSponsoredPost("Buy Premium");

        System.out.println("\nFeed After Sponsored Post:");
        displayFeed();

        deleteCurrentPost();

        System.out.println("\nFeed After Deletion:");
        displayFeed();

        previousPost();
    }
}