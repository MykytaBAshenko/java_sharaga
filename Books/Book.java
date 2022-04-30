
public class Book
{
    public String id;
    public String title;
    public String author;
    public String publisher; 
    public int year;
    public int numberOfPages; 
    public double cost;
    
    public Book(String id, String title,String author,String publisher,int year,int numberOfPages,double cost
    )
    {   this.id=id;
        this.title=title;
        this.author=author;
        this.publisher=publisher;
        this.year=year;
        this.numberOfPages = numberOfPages;
        this.cost=cost;
    }
    
    public String toString()
    {
        return "The details of the book are: id = " + id + ", title = " + title + ", author = " + author + ", year = " + year + ", publisher = " + publisher + ", cost = " + cost;
    }

    public String changeCost(String oper, double cost)
    {
        if(oper.equals("*")) {
            this.cost*=cost;
        }

        if(oper.equals("/")) {
            this.cost/=cost;
        }

        if(oper.equals("-")) {
            this.cost-=cost;
        }

        if(oper.equals("+")) {
            this.cost+=cost;
        }
        return "The new cost is " + this.cost;
    }
    public Boolean isThisAuthor(String author) {
        if(this.author.equals(author)){
            return true;
        }
        return false;
    }

    public Boolean isThisYear(int year) {
        if(this.year == year){
            return true;
        }
        return false;
    }
}