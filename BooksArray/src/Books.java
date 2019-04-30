public class Books {
    String title;
    String author;
}

class BooksTestDrive {
    public static void main(String[] args) {

        Books [] myBooks = new Books[3];
        int x = 0;


        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();

        myBooks[0].title = "Remote Office not Required";
        myBooks[1].title = "The Java Cookbook";
        myBooks[2].title = "El mundo segun Rick";

        myBooks[0].author = "Jason";
        myBooks[1].author = "Sue";
        myBooks[2].author = "Rick Sanchez";


        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);

            x = x + 1;
        }
    }
}