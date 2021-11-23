
package bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class RunMain {
        static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
           Book book = new Book();
          ArrayList<Book> books = new ArrayList<>();
          int select;
          do{
            System.out.println("1.Add book");
            System.out.println("2.Edit book by id");
            System.out.println("3.Delete book by id");
            System.out.println("4.Sort books by name(asc)");
            System.out.println("5.Sort books by price(desc)");
            System.out.println("6.show all book");
            System.out.println("7.Exit");
            System.out.println("Moi ban chon: ");
            select = sc.nextInt();
            switch(select){
                case 1:
                    addBook(book, books);
                    break;
                case 2:
                    editBookById(book, books);
                    break;
                case 3:
                    deleteById(book, books);
                    break;
                case 4:
                    sortName(book, books);
                    break;
                case 5:
                    sortPrice(book, books);
                    break;
                case 6:
                    show(book, books);
                    break;
                case 7:
                    System.out.println("Exit");
                    break;
                    
                default:
                     System.out.println("mời bạn nhập lại");
            }
        }while(true);
    }
    public static void addBook(Book book, ArrayList<Book> books){
        sc.nextLine();
        System.out.println("Enter id: ");
        book.setId(sc.nextLine());
        System.out.println("Enter name: ");
        book.setName(sc.nextLine());
        System.out.println("Enter publisher: ");
        book.setPublisher(sc.nextLine());
        System.out.println("Enter price: ");
        book.setPrice(sc.nextFloat());
        System.out.println("Enter number of page: ");
        book.setNumberOfPage(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter Author");
        book.setAuthor(sc.nextLine());
        books.add(book);
    }
    public static void editBookById(Book book, ArrayList<Book> books){
    
    }
    public static void deleteById(Book book, ArrayList<Book> books){
        String id;
        System.out.println("Enter id want delete: ");
        id = sc.nextLine();
        for(int i=0;i<books.size();i++){
            if(books.get(i).getId().equals(id)){
                books.remove(i);
            }
        }
    }
     public static void sortName(Book book, ArrayList<Book> books){
         for(int i=0;i<books.size();i++){
             for(int j=i+1;j<books.size();j++){
                 if(books.get(i).getName().compareToIgnoreCase(books.get(j).getName())>0)
                     Collections.swap(books, i, j);
             }
         }
     }
      public static void sortPrice(Book book, ArrayList<Book> books){
          for(int i=0;i<books.size();i++){
             for(int j=i+1;j<books.size();j++){
                 if(books.get(i).getPrice()<books.get(j).getPrice()){
                     Collections.swap(books, i, j);
                 }
             }
        }
    }
      public static void show(Book book, ArrayList<Book> books){
          System.out.printf("%20s %20s %20s %20s %20s %20s \n", "ID","Name","Publisher","Price","Number of page","Author");
          for(int i=0;i<books.size();i++)
          System.out.printf("%20s %20s %20s %20f %20d %20s \n", books.get(i).getId(),books.get(i).getName(),books.get(i).getPublisher(),books.get(i).getPrice(),books.get(i).getNumberOfPage(),books.get(i).getAuthor());
      }
}
