import java.util.Scanner;

public class ToyShopApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "UTF-8");
        int option;
        String name;
        double price;
        ToyShop toyShop = new ToyShop();
        do {
        System.out.println("--------toy shop--------");
        System.out.println("1.- add bear");
        System.out.println("2.- add car");
        System.out.println("3.- add book");
        System.out.println("4.- add puzzle");
        System.out.println("5.- display all");
        System.out.println("0.- stop");

        option = scanner.nextInt();
        scanner.nextLine();


            switch (option) {

                case 1:
                    System.out.println("Name: ");
                    name = scanner.nextLine();

                    System.out.println("Price: ");
                    price = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("Material: ");
                    String material = scanner.nextLine();

                    Bear bear = new Bear(name, price, material);
                    toyShop.add(bear);
                    break;

                case 2:

                    System.out.println("Name: ");
                    name = scanner.nextLine();

                    System.out.println("Price: ");
                    price = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("Type: ");
                    String type = scanner.nextLine();

                    Car car = new Car(name, price, type);
                    toyShop.add(car);
                    break;

                case 3:

                    System.out.println("Name: ");
                    name = scanner.nextLine();

                    System.out.println("Price: ");
                    price = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("Pages: ");
                    int pages = scanner.nextInt();
                    scanner.nextLine(); // /n

                    System.out.println("Age: ");
                    int childAge = scanner.nextInt();
                    scanner.nextLine(); // n

                    Book book = new Book(name, price, pages, childAge);
                    toyShop.add(book);
                    break;

                case 4:

                    System.out.println("Name: ");
                    name = scanner.nextLine();

                    System.out.println("Price: ");
                    price = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("Elements: ");
                    int numbersElements = scanner.nextInt();
                    scanner.nextLine(); // /n

                    Puzzle puzzle = new Puzzle(name, price, numbersElements);
                    toyShop.add(puzzle);
                    break;

                case 5:

                    toyShop.displayAll();
                    break;
            }


        } while (option != 0);
    scanner.close();
    }
}
