


public class BooksWork{
    public static void main(String[] args){
        int books_counter = Integer.parseInt(args[0]);
        Books b = new Books(books_counter);
        b.work();
    }
}