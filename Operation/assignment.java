package Operation;
public class assignment {
    public static void main(String[] args) {

        Integer y = 200, z = 200;

        System.out.println(y == z || y > z);           
        System.out.println(z >= y && z <= y);
        System.out.println(y != z && y >= z);
        System.out.println(y != z || y == z || y >= z);
        System.out.println(y != z && y > z && y < z && y == z);
    }
}