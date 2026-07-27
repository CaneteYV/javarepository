package operation;

public class ifElse {
    public static void main(String[] args) {


    System.out.println("Volume Control");
    int volume = 85;

        if (volume == 0) {
            System.out.println("Muted");
        } else if (volume <= 20) {
            System.out.println("Quiet");
        } else if (volume <= 50) {
            System.out.println("Moderate");
        } else if (volume <= 80) {
            System.out.println("Loud");
        } else {
            System.out.println("Warning: Volume level out of bounds!");
        }

    System.out.println("------------------------");
    System.out.println("Drink Selection");
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
