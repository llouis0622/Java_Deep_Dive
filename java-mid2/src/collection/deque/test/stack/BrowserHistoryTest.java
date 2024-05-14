package collection.deque.test.stack;

public class BrowserHistoryTest {
    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory();

        browser.visitPage("youtube.com");
        browser.visitPage("google.com");
        browser.visitPage("facebook.com");

        String currentPage1 = browser.goBack();
        System.out.println("currentPage1 = " + currentPage1);
        String currentPage2 = browser.goBack();
        System.out.println("currentPage2 = " + currentPage2);
    }
}