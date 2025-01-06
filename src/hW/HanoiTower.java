package hW;
import java.util.Scanner;
public class HanoiTower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please input number of disk: ");

        int n = input.nextInt();
        System.out.println("The moves are: ");
        moveDisks(n, 'A','B', 'C');
    }

    private static void moveDisks(int n, char froTower,
                                  char totower, char auxTower) {
        if (n == 1)
            System.out.println("Move the disk " + n + " from "+ froTower+ " to "+ totower);
        else {
            moveDisks(n-1, froTower, auxTower,totower);
            System.out.println("Move disk "+ n+ " from "+ froTower+ " to "+ totower);
            moveDisks(n-1, auxTower,totower,froTower);
        }
    }
}

