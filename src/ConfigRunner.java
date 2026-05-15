import java.util.Scanner;

public class ConfigRunner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter browser (Chrome / Firefox)");
        String browser = sc.nextLine().trim();
        int timeout =30;
        if(browser.equalsIgnoreCase("Chrome")) {
            System.out.println("Browser: " + browser + " | Timeout: " + timeout + "s");
        }
        else if(browser.equalsIgnoreCase("Firefox")) {
            System.out.println("Browser: " + browser + " | Timeout: " + timeout + "s");
        }
        else {
            System.out.println("Unsupported browser  ");
        }

        /**
         * get the input from user Chrome / FireFox
         * validate the input with condition which ignores exact text match
         * after validation
         * If user asked chrome send them to chrome area
         * If user asked firefox send them to firefox area
         * if user asked other options give them a message we dont have this option
         */
    }
}