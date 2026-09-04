package Phase1.DAY2;
class Book{
    String title;
    double price;

    Book(){
        this.title = "Harry potter";
        this.price = 1200;
    }
}
public class NonParametric {
    public static void main(String[] args){
        Book b = new Book();
        System.out.println("title:" +b.title + ", price:" +b.price); 

    }
    
}
