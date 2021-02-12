public class Water extends Drink {
    private String type;

    public Water(double volume, String ingredient, String type) {
        super(volume, ingredient);
        this.type = type;
    }


    public void display() {
        super.display();
        System.out.println("Type: " + type);
    }
}
