public class Books {
    String Name;
    String Author;
    String Genre = "Fiction";
    double Price = 9.99;

    Books(String Name, String Author ){
       this.Name = Name;
       this.Author = Author;
    }
    Books(String Name, String Author,String Genre ){
        this.Name = Name;
        this.Author = Author;
        this.Genre = Genre;
    }
    Books(String Name, String Author,String Genre, double price1 ){
            this.Name = Name;
        this.Author = Author;
        this.Genre = Genre;
        Price = price1;
}

    public void Name(String Name) {
        System.out.println("Rich Dad Poor Dad");
    }

}
