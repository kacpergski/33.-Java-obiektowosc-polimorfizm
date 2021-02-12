public class Book extends Toy{
    private int pages;
    private int childAge;

    public Book(String name, double price, int siteNumbers, int childAge) {
        super(name, price);
        this.pages = siteNumbers;
        this.childAge = childAge;
    }

    public void display(){
        super.display();
        System.out.println("Pages: " + pages );
        System.out.println("Age: " + childAge );

    }
}
