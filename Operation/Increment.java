package Operation;

public class Increment {
    public static void main(String[] args) {
        System.out.println(
        "Incrementing an integer:");
        int x = 5;
        System.out.println(
            "Initial value of x:" + ++x);
        System.out.println(x);
        System.out.println(x++);
        System.out.println(x);
        System.out.println(--x);
        System.out.println(x);
        System.out.println(x--);
        System.out.println(x);
        int y = 10;
        System.out.println(
            "Combine operation: "+ (x + y))       ;
            System.out.println(++x + y); // 6 + 10
            System.out.println(x + ++y); // 6 + 11
            System.out.println(x++ + y++); // 7 + 12
            System.out.println(x + y); // 7 + 12
            System.out.println(--x + y); // 6 + 12
            System.out.println(x + y--); // 6 + 11
            System.out.println(--x + ++y); // 5 + 12
            System.out.println(--y + x); 
            System.out.println(x + ++y);
            System.out.println(x-- + y);
            System.out.println(--y + y);
            System.out.println(y - ++y);
            System.out.println(--x - --y);//
            System.out.println(x);
            System.out.println(y);
            System.out.println(x + ++y); //
            System.out.println(x=x+1);
            System.out.println(x); //x=3 y=
             
    }
}
