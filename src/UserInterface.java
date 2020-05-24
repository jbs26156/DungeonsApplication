import java.util.*;

public class UserInterface {

    Scanner scnr = new Scanner(System.in);
    private String response = "";

    public void prompt() {
        while (!response.equals("P") || !response.equals("Q")) {
            System.out.println("Type Q to quit");
            System.out.println("Type P to play");
            response = scnr.next();
            if (response.toUpperCase().equals("Q")) {
                System.out.print("Thank you");
                break;
            } else if (response.toUpperCase().equals("P")) {
                System.out.print("*Playlist queued*");
                break;
            } else {
                System.out.println("I'm sorry, that response doesn't work.");
                continue;
            }
        }
    }

}
