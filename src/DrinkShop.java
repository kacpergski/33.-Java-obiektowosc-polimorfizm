import java.sql.SQLOutput;

public class DrinkShop {

    private Drink [] drinks = new Drink[20];
    private int indexDrink = 0 ;

    public void add(Drink drink){
        if (indexDrink < drinks.length){
        drinks[indexDrink++] = drink;}

    }

    public void displayAll(){

        for (int i = 0; i <indexDrink ; i++) {
            drinks[i].display();
        }

    }

}
