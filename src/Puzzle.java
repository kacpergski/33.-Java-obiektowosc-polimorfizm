public class Puzzle extends Toy {
    private int numbersElements;

    public Puzzle(String name, double price, int numbersElements) {
        super(name, price);
        this.numbersElements = numbersElements;
    }

    public void display(){
        super.display();
        System.out.println("Numbers of elements: " + numbersElements);

    }
}
