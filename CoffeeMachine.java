import java.util.Scanner;
import java.lang.*;
public class CoffeeMachine {

    public static int water = 400;
    public static int milk = 540;
    public static int coffe = 120;
    public static int cups = 9;
    public static int money = 550;
    public static Scanner scaner = new Scanner(System.in);
    public static boolean stop=false;
    public static boolean resource=true;

    public static String input() {
        String x =  scaner.nextLine();
        return x;
    }

    public static void main(String[] args) {

        while(stop==false){
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            System.out.println("");
            String action = input();

            if(action.equals("buy")){
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                buy(input());
                continue;
            }else if(action.equals("fill")){
                System.out.println("Write how many ml of water do you want to add: ");
                String tempWater = input();
                System.out.println("Write how many ml of milk do you want to add: ");
                String tempMilk = input();
                System.out.println("Write how many grams of coffee beans do you want to add: ");
                String tempCoffee = input();
                System.out.println("Write how many disposable cups of coffee do you want to add: ");
                String tempCups = input();
                fill(tempWater,tempMilk,tempCoffee,tempCups);
                continue;
            }else if(action.equals("take")){
                take();
                continue;
            }else if(action.equals("remaining")){
                remaining();
                continue;
            }else if(action.equals("exit")){
                stop=true;
            }
        }
    }

    public static void fill(String water1, String milk1, String coffe1, String cups1){
        water+=Integer.parseInt(water1);
        milk+=Integer.parseInt(milk1);
        coffe+=Integer.parseInt(coffe1);
        cups+=Integer.parseInt(cups1);
    }
    public static void take(){
        System.out.println("I gave you: $"+money);
        money=0;
    }
    public static void remaining(){
        System.out.println("The coffee machine has: ");
        System.out.println(water+" of water");
        System.out.println(milk+ " of milk");
        System.out.println(coffe+ " of coffee beans");
        System.out.println(cups+ " of disposable cups");
        System.out.println(money+ " of money");
        System.out.println("");
    }
    public static void buy(String bevarage){
        resource = true;
        if(bevarage.equals("1")){
            waterEnough(250);
            coffeEnough(16);
            cupsEnough();
            if(resource){
                water-=250;
                coffe-=16;
                cups-=1;
                money+=4;
                System.out.println("I have enough resources, making you a coffee!");
                System.out.println("");
            }
        }else if(bevarage.equals("2")){
            waterEnough(350);
            milkEnough(75);
            coffeEnough(20);
            cupsEnough();
            if(resource){
                water-=350;
                milk-=75;
                coffe-=20;
                cups-=1;
                money+=7;
                System.out.println("I have enough resources, making you a coffee!");
                System.out.println("");
            }
        }else if(bevarage.equals("3")){
            waterEnough(200);
            milkEnough(100);
            coffeEnough(12);
            cupsEnough();
            if(resource){
                water-=200;
                milk-=100;
                coffe-=12;
                cups-=1;
                money+=6;
                System.out.println("I have enough resources, making you a coffee!");
                System.out.println("");
            }
        }else if(bevarage.equals("back")){

        }
    }
    public static void waterEnough(int water1){
        if(water>=water1){

        }else {
            System.out.println("Sorry, not enough water!");
            System.out.println("");
            resource=false;}
    }

    public static void milkEnough(int milk1){
        if(milk>=milk1){

        }else {
            System.out.println("Sorry, not enough milk!");
            System.out.println("");
            resource=false;
        }
    }

    public static void coffeEnough(int coffe1){
        if(coffe>=coffe1){

        }else {
            System.out.println("Sorry, not enough milk!");
            System.out.println("");
            resource=false;}
    }

    public static void cupsEnough(){
        if(cups>=1){

        }else {
            System.out.println("Sorry, not enough cups!");
            System.out.println("");
            resource=false;
        }
    }
}
