package Operation;
public class operation {
    public static void main(String[] args) {
        int addend1 = 10, addend2 = 5;
        int sum = addend1 + addend2;
        System.out.println("The sum of " + addend1 + " and " + addend2 + " is " + sum);
        
        int minuend = 10, subtrahend = 5; int difference;
        difference = minuend - subtrahend;
        System.out.println("The difference of " + minuend + " and " + subtrahend + " is " + difference);

        addend1 = 10; addend2 = 5; sum = addend1 * addend2;
        System.out.println("The product of " + addend1 + " and " + addend2 + " is " + sum);

        float dividend = 10.0f, divisor = 5.0f;
        float quotient = dividend / divisor;
        float remainder = dividend % divisor;
        System.out.println("The quotient of " + dividend + " and " + divisor + " is " + quotient);
        System.out.println("The remainder of " + dividend + " and " + divisor + " is " + remainder);
    }
}