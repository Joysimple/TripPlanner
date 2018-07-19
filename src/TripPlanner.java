import java.util.Scanner;

public class TripPlanner {
    public static void main(String[] args) {
        Greeting();
        TimeAndBudget();
    }

    public static void Greeting() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you travelling to? " );
        String city = input.nextLine();
        System.out.println("Great! " + city + " sounds like a great trip");

}
    public static void TimeAndBudget(){
        Scanner input = new Scanner(System.in);
        System.out.print("How many days are you going to spend travelling? ");
        int days = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        double money = input.nextDouble();
        input.nextLine();
        System.out.print("What is the three letter currency symbols for your travel destination? ");
        String symbol = input.nextLine();
        System.out.print("How many " + symbol + " are there in 1 USD? ");
        double rate = input.nextDouble();
        input.nextLine();
        int hours = days * 24;
        int minutes = hours * 60;
        System.out.println("If you are travelling for " + days + " days that is the same as " + hours + " hours or " + minutes + " minutes");
        double moneyperday = money / days;
        System.out.println("If you are going to spend $" + money + " USD that means per day you can spend up to $" + moneyperday + " USD");
        double budget = money * rate;
        double budgetperday = budget / days;
        System.out.println("Your total budget in " + symbol + " is " + budget + " " + symbol + ", which per day is " + String.format("%.2f",budgetperday) + " " + symbol);

    }
}