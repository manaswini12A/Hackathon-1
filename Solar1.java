import java.util.Scanner;

class Solar1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double energy = sc.nextDouble();

        if (energy >= 10)
            System.out.println("Good Energy Generation");
        else
            System.out.println("Low Energy Generation");
    }
}

