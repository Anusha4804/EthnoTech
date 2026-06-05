
class Page {

    String url;
    Page next;

    Page(String url) {
        this.url = url;
    }
}

public class BrowserHistory {

    static Page head = null;
    static Page current = null;

    // Visit a new page
    static void visitPage(String url) {

        Page newPage = new Page(url);

        if(head == null) {
            head = current = newPage;
        }
        else {

            current.next = newPage;
            current = newPage;
        }
    }

    // Go back
    static void back() {

        if(current == head) {
            System.out.println("No Previous Page");
            return;
        }

        Page temp = head;

        while(temp.next != current) {
            temp = temp.next;
        }

        current = temp;

        System.out.println("Current Page : " + current.url);
    }

    // Display current page
    static void displayCurrentPage() {

        System.out.println("Current Page : " + current.url);
    }

    // Display all pages
    static void displayHistory() {

        Page temp = head;

        while(temp != null) {
            System.out.println(temp.url);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        visitPage("Google");
        visitPage("YouTube");
        visitPage("Instagram");

        displayCurrentPage();

        back();

        System.out.println("\nHistory:");

        displayHistory();
    }
}