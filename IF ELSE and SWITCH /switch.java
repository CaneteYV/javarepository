package operation;

public class Switch {
    
    public static void main(String[] args) {
        int areYouHungry = 1;
        switch (areYouHungry) {
            case 1:
                System.out.println("Yes, I'm hungry!");
                break;
            case 2:
                System.out.println("No, I'm not hungry.");
                break;
            default:
                System.out.println("Invalid input. Please enter 1 for Yes or 2 for No.");
                break;
        }
    }
}
