public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();

        one.title = "Star Wars The Empire Strikes Back";
        one.genre = "Science Fiction";
        one.rating = 10;
        one.playIt();

        Movie two = new Movie();

        two.title = "Pulp Fiction";
        two.genre = "Drama";
        two.rating = 9;
        two.playIt();

        Movie three = new Movie();

        three.title = "Donnie Darko";
        three.genre = "Drama";
        three.rating = 10;
    }
}
