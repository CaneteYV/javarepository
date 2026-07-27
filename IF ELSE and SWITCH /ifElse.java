package operation;

public class ifElse {
    public static void main(String[] args) {

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
     }
    }
