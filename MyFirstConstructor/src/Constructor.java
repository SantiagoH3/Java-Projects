public class Constructor {

    private int attributeX;
    private int attributeY;
    private String attributeZ;


    public Constructor(int attr1, int attr2, String attr3)
    {
        attributeX = attr1;
        attributeY = attr2;
        attributeZ = attr3;
    }

    public static void main(String[] args)
    {
        Constructor ac = new Constructor(5, 10, "x");

        System.out.println(ac.attributeX + ", " + ac.attributeY + ", " +ac.attributeZ);

    }
}
