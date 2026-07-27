package operation;

public class SwitchExample {
    public static void main(String[] args) {
        int drink = 1;
        switch (drink) {
            case 1:
                System.out.println("Tea");
                break;
            case 2:
                System.out.println("Coffee");
                break;
            case 3:
                System.out.println("Juice");
                break;
            case 4:
                System.out.println("Milk tea");
                break;
            default:
                System.out.println("Water");
                break;
        }
    }
}
