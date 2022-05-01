import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // 
public class Books
{
    public Book[] books;
    public int book_counter = 0;
    public boolean isSaveToFile = false;
    public String fileForSave = "";


    public Books(int books_counter)
    {   
        books = new Book[books_counter];
    }

    public void saveToFile(String filename){
        String newWWriting = "";
        isSaveToFile = true;
        fileForSave = filename;
        for(int i = 0; i < book_counter; i++) {
            newWWriting += Integer.toString(i) + "\n";
            newWWriting += books[i].id + "\n";
            newWWriting += books[i].title + "\n";
            newWWriting += books[i].author + "\n";
            newWWriting += books[i].publisher + "\n";
            newWWriting += books[i].year + "\n";
            newWWriting += books[i].numberOfPages + "\n";
            newWWriting += books[i].cost + "\n";
        }
        try {
            FileWriter fileWriter = new FileWriter(filename);
            fileWriter.write(newWWriting);
            fileWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void work(){
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Enter cmd:");
            String cmd = scanner.nextLine();
            if(cmd.equals("add")){
                System.out.println("Enter the id of the new book");
                String id = scanner.nextLine();
                System.out.println("Enter the title of the new book");
                String title = scanner.nextLine();
                System.out.println("Enter the author of the new book");
                String author = scanner.nextLine();
                System.out.println("Enter the publisher of the new book");
                String publisher = scanner.nextLine();
                System.out.println("Enter the year of the new book");
                int year = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter the numberOfPages of the new book");
                int numberOfPages = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter the cost of the new book");
                double cost = Double.parseDouble(scanner.nextLine());
                if(id.length() == 0) {
                    System.out.println("Id is empty");
                }
                else if(title.length() == 0) {
                    System.out.println("title is empty");
                }
                else if(author.length() == 0) {
                    System.out.println("author is empty");
                }
                else if(publisher.length() == 0) {
                    System.out.println("publisher is empty");
                }
                else if(year < 0 || year > 2022) {
                    System.out.println("bad year");
                }
                else if(numberOfPages < 1) {
                    System.out.println("bad numberOfPages");
                }
                else if(cost < 0 ) {
                    System.out.println("bad cost");
                }
                else
                    books[book_counter++] = new Book(id, title, author, publisher, year, numberOfPages, cost);
            }
            if(cmd.equals("showId")) {
                System.out.println("Enter book index:");
                int index = Integer.parseInt(scanner.nextLine());
                System.out.println(books[index].toString());
            }
            if(cmd.equals("showAll")) {
                System.out.println("Enter book index:");
                for(int y = 0; y < book_counter; y++) {
                    System.out.println("Book " + y);
                    System.out.println(books[y].toString());
                }
            }
            if(cmd.equals("changeCost")) {
                System.out.println("Enter book index:");
                int index = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter a mathematical operation:");
                String oper = scanner.nextLine();
                System.out.println("Enter change number:");
                double costChange = Double.parseDouble(scanner.nextLine());
                System.out.println(books[index].changeCost(oper, costChange));
            }
            if(cmd.equals("findByAuthor")) {
                System.out.println("Enter author name:");
                String author = scanner.nextLine();
                int[] books_indexes = new int[book_counter];
                int books_length = 0;
                for(int y = 0; y < book_counter; y++) {
                    if (books[y].isThisAuthor(author)) {
                        books_indexes[books_length++] = y;
                    }
                }
                for(int y = 0; y < books_length; y++) {
                    System.out.println(books[books_indexes[y]].toString());
                }
            }
            if(cmd.equals("findByYear")) {
                System.out.println("Enter year:");
                int year = Integer.parseInt(scanner.nextLine());
                int[] books_indexes = new int[book_counter];
                int books_length = 0;
                for(int y = 0; y < book_counter; y++) {
                    if (books[y].isThisYear(year)) {
                        books_indexes[books_length++] = y;
                    }
                }
                for(int y = 0; y < books_length; y++) {
                    System.out.println(books[books_indexes[y]].toString());
                }
            }
            if(cmd.equals("sortByYear")) {
                int i, j;
                for (i = 0; i < book_counter - 1; i++)
                    for (j = 0; j < book_counter - i - 1; j++)
                        if (books[j].year > books[j + 1].year){
                            Book b = books[j];
                            books[j] = books[j + 1];
                            books[j + 1] = b;  
                        }
            }
            if(cmd.equals("sortByAuthor")) {
                int i, j;
                for (i = 0; i < book_counter - 1; i++)
                    for (j = 0; j < book_counter - i - 1; j++)
                        if (books[j].author.compareTo(books[j + 1].author) > 0){
                            Book b = books[j];
                            books[j] = books[j + 1];
                            books[j + 1] = b;  
                        }
            }
            if(cmd.equals("sortByPublisher")) {
                int i, j;
                for (i = 0; i < book_counter - 1; i++)
                    for (j = 0; j < book_counter - i - 1; j++)
                        if (books[j].publisher.compareTo(books[j + 1].publisher) > 0){
                            Book b = books[j];
                            books[j] = books[j + 1];
                            books[j + 1] = b;  
                        }
            }
            if(cmd.equals("saveTo")) {
                System.out.println("Enter filename:");
                String filename = scanner.nextLine();
                this.saveToFile(filename);
            }

            if(cmd.equals("readFrom")) {
                System.out.println("Enter filename:");
                String filename = scanner.nextLine();
                fileForSave = filename;
                isSaveToFile = true;
                try {
                    File myObj = new File(filename);
                    Scanner myReader = new Scanner(myObj);
                    ArrayList<String> ar = new ArrayList<String>();
                    while (myReader.hasNextLine()) {
                      String data = myReader.nextLine();
                      ar.add(data);
                    }
                    myReader.close();
                    int y = 0;
                    for (int i = 0; i < ar.size();) {
                        i++;
                        books[y++] = new Book(ar.get(i++), ar.get(i++), ar.get(i++), ar.get(i++),Integer.parseInt( ar.get(i++)), Integer.parseInt(ar.get(i++)), Double.parseDouble(ar.get(i++)));

                    }
                    book_counter = y;
                  } catch (FileNotFoundException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                  }
            }
            if(cmd.equals("exit")) {
                if (isSaveToFile) {
                    this.saveToFile(fileForSave);
                }
                return;
            }
        }
    }
}

  