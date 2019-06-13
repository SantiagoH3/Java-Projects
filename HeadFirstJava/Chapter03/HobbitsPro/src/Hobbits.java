public class Hobbits {
    String name;

    public static void main(String[] args) {

        Hobbits [] hob = new Hobbits[3];

        int z = -1;

        while (z < 2) {

            z = z + 1;

            hob[z] = new Hobbits();
            hob[z].name = "Bilbo";

            if (z == 1) {
                hob[z].name = "Frodo";
            }

            if (z == 2){
                hob[z].name = "Sam";
            }

            System.out.print(hob[z].name + " is a " );
            System.out.println("good Hobbit name");

        }
    }
}