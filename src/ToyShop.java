public class ToyShop {
    private Toy [] toys = new Toy[40];
    private int indexToy = 0;

//    private  Car [] cars = new Car[10];
//    private  int indexCar = 0;
//
//    private  Book [] books = new Book[10];
//    private  int indexBook = 0;
//
//    private  Puzzle[] puzzles = new Puzzle[10];
//    private  int indexPuzzle = 0;



    public void add (Toy toy){
        if (indexToy < toys.length){
        toys[indexToy++] = toy;}
       else System.out.println("Brak miejsca");
            }


//    public void addCar(Car car) {
//        if (indexCar < cars.length){
//            cars[indexCar++] = car;}
//        else System.out.println("Brak miejsca na car");
//    }
//
//    public void addBook(Book book) {
//        if (indexBook < books.length){
//            books[indexBook++] = book;}
//        else System.out.println("Brak miejsca na book");
//    }
//    public void addPuzzle(Puzzle puzzle) {
//        if (indexPuzzle < puzzles.length){
//            puzzles[indexPuzzle++] = puzzle;}
//        else System.out.println("Brak miejsca na puzzle");
//    }


    public void displayAll(){

        for (int i = 0; i <indexToy ; i++) {
            toys[i].display();
        }

    }
}
