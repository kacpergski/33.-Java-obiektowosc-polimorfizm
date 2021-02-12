public class Beer extends Drink{
    private int alkPercent;

    public Beer(double volume, String ingredient, int alkPercent) {
        super(volume, ingredient);
        this.alkPercent = alkPercent;
    }

    public void display(){
        super.display();
        System.out.println("Alkohol %:" + alkPercent);

    }
}
