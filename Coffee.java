package machine;

import java.util.Scanner;

public class CoffeeMachine {
    static int water = 1200;
    static int milk = 540;
    static int beans = 120;
    static int n = 9;
    static int money = 550;


    public static void main(String[] args) {
        new CoffeeMachine();

    }

    public CoffeeMachine() {
        hasMachine();
    }

    private void hasMachine() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + "120 of coffee beans");
        System.out.println(n + " of disposable cups");
        System.out.println(money + " of money");
        select();
    }

    public static int getMoney() {
        return money;
    }

    private void espresso() throws InterruptedException {
        System.out.println("The coffee machine has:");
        water -= 200;
        milk -= 100;
        beans -= 12;
        n -= 1;
        money += 6;
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(n + " of disposable cups");
        System.out.println(money + " of money");
        Thread.sleep(500);
        select();
    }

    private void latte() throws InterruptedException {
        // Для приготовления латте кофеварке необходимо 350 мл воды, 75 мл молока и 20 г кофейных зерен. Это стоит 7 долларов.
        System.out.println("The coffee machine has:");
        water -= 350;
        milk -= 75;
        beans -= 20;
        n -= 1;
        money += 7;
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(n + " of disposable cups");
        System.out.println(money + " of money");
        Thread.sleep(500);
        select();
    }

    private void capuchino() throws InterruptedException {
        // А для приготовления капучино кофеварке нужно 200 мл воды, 100 мл молока и 12 г кофе. Это стоит 6 долларов.
        System.out.println("The coffee machine has:");
        water -= 200;
        milk -= 100;
        beans -= 12;
        n -= 1;
        money += 6;
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(n + " of disposable cups");
        System.out.println(money + " of money");
        select();
    }

    //выбор операций
    private void select() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Write action (buy, fill, take, balance) :\n");
            String select = scanner.nextLine();
            if (select.equals("buy") || select.equals("fill") || select.equals("take") || select.equals("balance")) {
                switch (select) {
                    case "buy":
                        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuchino:");
                        coffeSelect();
                        break;
                    case "fill":
                        waterAddMilkAddCoffeAdd();
                        break;
                    case "take":
                        iTakeMoney();

                        break;
                    case "balance":
                        System.out.println(getMoney() + "$");
                        Thread.sleep(1000);
                        select();
                        break;
                }
            } else {
                System.out.println("Такой команды нет!");
                Thread.sleep(600);
                System.out.println("Предлагаю попробовать снова!");
                select();
            }
        } catch (Exception e) {
            System.out.println("Incorrect enter!");
            select();
        }
    }

    //добавить ингридиенты
    private void waterAddMilkAddCoffeAdd() {
        try {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Write how many ml of water do you want to add: ");
            water = water + scanner1.nextInt();
            // System.out.println(water);

            System.out.println("Write how many grams of coffee beans do you want to add: ");
            beans = beans + scanner1.nextInt();
            // System.out.println(beans);

            System.out.println("Write how many ml of milk do you want to add: ");
            milk = milk + scanner1.nextInt();
            //System.out.println(milk);

            System.out.println("Write how many disposable cups of coffee do you want to add: ");
            n = n + scanner1.nextInt();
            // System.out.println(n);
            select();
        } catch (Exception e) {
            System.out.println("Incorrect enter! Try again!");
            waterAddMilkAddCoffeAdd();
        }

    }

    //выбор кофе
    private void coffeSelect() {
        try {
            Scanner scanner = new Scanner(System.in);
            int coffeSelect = scanner.nextInt();
            switch (coffeSelect) {
                case 1:
                    espresso();
                    break;
                case 2:
                    latte();
                    break;
                case 3:
                    capuchino();
                    break;

                default:
                    System.out.println(" Not number select!");
            }

        } catch (Exception e) {
            System.out.println("Enter number!");
            coffeSelect();
        }

    }

    private void iTakeMoney() {
        money = 0;
        select();
    }
}