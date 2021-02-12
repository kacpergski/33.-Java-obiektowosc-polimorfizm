import java.sql.SQLOutput;
import java.util.Scanner;

public class DrinkShopApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "UTF-8" );
        int option;
        double volume;
        String ingrident;
        DrinkShop drinkShop = new DrinkShop();

        do{
            System.out.println("---------drink factory---------------");
            System.out.println("1. - add beer");
            System.out.println("2. - add water");
            System.out.println("3. - display all");
            System.out.println("0. - stop app");

            option = scanner.nextInt();
            scanner.nextLine(); //n

            switch (option){

                case 1:
                    System.out.println("Volume: ");
                    volume = scanner.nextDouble();
                    scanner.nextLine(); //n
                    System.out.println("Ingredients: ");
                    ingrident = scanner.nextLine();
                    System.out.println("Alkohol %");
                    int alkPercent = scanner.nextInt();
                   scanner.nextLine(); //n
                    Beer beer = new Beer(volume,ingrident,alkPercent);
                    drinkShop.add(beer);


                    break;
                case 2:

                    System.out.println("Volume: ");
                    volume = scanner.nextDouble();
                    scanner.nextLine(); //n
                    System.out.println("Ingredients: ");
                    ingrident = scanner.nextLine();
                    System.out.println("Type: ");
                    String type = scanner.nextLine();

                    Water water = new Water(volume,ingrident,type);
                    drinkShop.add(water);


                    break;

                case 3:
                    drinkShop.displayAll();

                    break;


            }

        }while (option != 0);
scanner.close();
    }
}
