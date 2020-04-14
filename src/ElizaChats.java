import java.util.Scanner;

public class ElizaChats {
    public static void main(String[] args) {
        String name;
        String howWasYourDay;
        String whyWasYourDay;
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to ElizaChats! My name is Eliza, what's your name?");
        name = input.nextLine();
        System.out.println("Nice to meet you " + name + ", how has your day been?");
        howWasYourDay = input.nextLine();
        System.out.println("Okay, anything in particular that makes you feel that " + howWasYourDay + "?");
        whyWasYourDay = input.nextLine();
        System.out.println("Okay, well it has been my pleasure to speak with you today!");
        System.out.println("Here are your responses: \n" + name + "\n" + howWasYourDay + "\n" + whyWasYourDay);
    }
}
