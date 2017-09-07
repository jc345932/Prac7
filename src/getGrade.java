import java.util.Scanner;

public class getGrade {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int m;
        try {
            System.out.println("Type your marks --> ");
            m = scanner.nextInt();
            if (m<0) {
                System.out.println("Your marks is x1. ");
            }else if (m<50) {
                System.out.println("Your grade is F");
            }else if (m<=100){
                System.out.println("Your grade is P");
            }
        }
        catch (Exception mistake){
            System.out.println("Your marks is x1. ");
        }

    }

}
