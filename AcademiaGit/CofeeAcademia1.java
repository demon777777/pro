import java.util.Scanner;

public class CoffeeMachine {

    public static void printAmount(int water, int milk, int beans, int cups, int money){
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String action;

        int water = 1200;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;

        printAmount(water, milk, beans, cups, money);

        System.out.println("Write action (buy, fill, take): ");
        action = scanner.next();

        switch (action) {
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino");
                int buyOption = scanner.nextInt();

                switch (buyOption){
                    case 1: // espresso
                        water -= 250;
                        beans -= 16;
                        cups --;
                        money += 4;
                        break;
                    case 2: // latte
                        water -= 350;
                        milk -= 75;
                        beans -= 20;
                        cups --;
                        money += 7;
                        break;
                    case 3: // cappuccino
                        water -= 200;
                        milk -= 100;
                        beans -= 12;
                        cups --;
                        money += 6;
                        break;
                    default:
                        break;
                }
                break;
            case "fill":
                System.out.println("Write how many ml of water do you want to add: ");
                water += scanner.nextInt();
                System.out.println("Write how many ml of milk do you want to add: ");
                milk += scanner.nextInt();
                System.out.println("Write how many grams of coffee beans do you want to add: ");
                beans += scanner.nextInt();
                System.out.println("Write how many disposable cups of coffee do you want to add: ");
                cups += scanner.nextInt();
                break;
            case "take":
                System.out.println("I gave you $" + money);
                money = 0;
                break;
            default:
                break;
        }
        printAmount(water, milk, beans, cups, money);
    }
}