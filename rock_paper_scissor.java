import java.util.*;

public class rock_paper_scissor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 0 for rock\n Enter 1 for paper\n Enter 2 for scissor");
        int userinput;
        userinput = sc.nextInt();

        Random rd = new Random();
        int computerinput;
        computerinput = rd.nextInt(3);


        if (userinput == computerinput) {
            System.out.println("match draw!");
        } else if (userinput == 0 && computerinput == 2 || userinput == 1 && computerinput == 0 || userinput == 2 && computerinput == 1) {
            System.out.println("you win!");
        } else {
            System.out.println("computer win!");
        }

        System.out.println("computer choice:" + computerinput);
        sc.close();
    }
}
