 class Book {
    static int totalBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrow;
    static{
        totalBooks=0;
    }

     {
         totalBooks++;
     }
Book(String isbn,String title,String author ){
        this.isbn=isbn;
        this.title=title;
        this.author=author;

}
Book(String isbn){
        this(isbn,"unknown","unknown");
    }
    static int gettotalnoofBooks() {
        return totalBooks;

    }
    /*void borrowBook(){
        if(isBorrow) {
            System.out.println("book is already borrowed");
        }else{
            this.isBorrow=true;
            System.out.println("enjoy the book");

        }
    }
    void returnBook(){
        if(isBorrow){
            this.isBorrow=false;
            System.out.println("hope you enjoyed,please leave a feedback");}
        else{
            System.out.println("this book is already in the library");
        }
    }*/
     void borrowBook(){
         if(isBorrow){
             System.out.println("book is already boorowed");}
         else{
             this.isBorrow=true;
             System.out.println("enjoy the book");

         }}
     void returnBook(){
         if(isBorrow){
             this.isBorrow=false;
             System.out.println("return the book ");
         }else{
             System.out.println("you can borrow book from library");
         }


     }

     public static void main(String[] args) {
         Book designofThings=new Book("2","Design","Author");
         Book myBook=new Book("1");
         System.out.println(Book.gettotalnoofBooks());
         designofThings.borrowBook();
         myBook.borrowBook();
         designofThings.borrowBook();
         designofThings.returnBook();
         designofThings.returnBook();
         myBook.returnBook();




     }

}





