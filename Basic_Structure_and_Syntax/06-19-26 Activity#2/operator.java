package operation;

public class operator {
    // public static void main (String[] args){
        
        int addend1 = 10;
        int addend2 = 20;
        int sum = addend1 + addend2;
        System.out.println("The sum of " + addend1 + " and " + addend2 + " is: " + sum);

        int minuend = 30;
        int subtrahend = 15;
        int difference = minuend - subtrahend;
        System.out.println("The difference of " + minuend + " and " + subtrahend + " is: " + difference);

        int multiplicand = 5;
        int multiplier = 4; 
        int product = multiplicand * multiplier;
        System.out.println("The product of " + multiplicand + " and " + multiplier + " is: " + product);

        float dividend = 70;
        int divisor = 4;
        float quotient = dividend / divisor;
        System.out.println("The quotient of " + dividend + " and " + divisor + " is: " + quotient);

        int remainder = (int)dividend % divisor;
        System.out.println("The remainder of " + dividend + " and " + divisor + " is: " + remainder);


        
    }
    
}
