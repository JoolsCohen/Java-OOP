package Task03;

public class Book {
    private String title;
    private String author;
    private Boolean available;
    Book(){
    }
    Book(String title, String author, Boolean available) {
        this.title = title;
        this.author = author;
        this.available = available;
    }
    public String setTitle(String title){
        return this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public String setAuthor(String author){
        return this.author = author;
    }
    public String getAuthor(){
        return author;
    }
    public Boolean setAvailable(Boolean value){
        return this.available = value;
    }
    public Boolean getAvailable(){
        return available;
    }
    public String displayInfo(){
        return "[" + getTitle() + "." + getAuthor() + "," + getAvailable() + "]";
    }
}