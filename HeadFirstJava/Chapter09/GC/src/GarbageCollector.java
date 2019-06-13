public class GarbageCollector {
    public static GarbageCollector  doStuff() {
        GarbageCollector newGC = new GarbageCollector();
        doStuff2(newGC);
        return newGC;
    }

    public static void main(String[] args) {
        GarbageCollector gc1;
        GarbageCollector gc2 = new GarbageCollector();
        GarbageCollector gc3 = new GarbageCollector();
        GarbageCollector gc4 = gc3;
        gc1 = doStuff();

        // place for one statement from the list

        // call more methods

    }

    public static void doStuff2(GarbageCollector copyGC) {
        GarbageCollector localGC = copyGC;
    }
}
