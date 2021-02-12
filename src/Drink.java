public class Drink {
    private double volume;
    private String ingredient;

    public Drink(double volume, String ingredient) {
        this.volume = volume;
        this.ingredient = ingredient;
    }

    public void display(){

        System.out.println("Volume: " + volume);
        System.out.println("Ingredients: " + ingredient);

    }
}
