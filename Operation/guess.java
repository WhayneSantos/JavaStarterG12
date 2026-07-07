package Operation;

public class guess {
    public static void main(String[] args) {

        int x = 8;
        int y = 3;

        System.out.println(++x + y--);
        System.out.println(x-- * ++y);
        System.out.println(--x + y++);
        System.out.println(++y + x--);
        System.out.println(y-- * ++x);
        System.out.println(--y + x++);
        System.out.println(++x - --y);
        System.out.println(x++ + y--);
        System.out.println(--x * ++y);
        System.out.println(y / x++);
    }
}
