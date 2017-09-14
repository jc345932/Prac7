
import java.io.*;
import java.util.Scanner;

public class Text {

    public static void main(String args[])  throws IOException
    {
        Scanner file = new Scanner(new File("input.txt"));

        int numTimes = file.nextInt();
        file.nextLine();
        int total = 0;
        int i = 0;
        while(file.nextLine() != null){
            String a = file.nextLine();
            total += Integer.parseInt(a);
            i++;
        }
        System.out.println("Total: " + total/i);

//        for(int i = 0; i < numTimes; i++);
//        {
//            int sum = 0;
//            int count = 0;
//            Scanner split = new Scanner(file.nextLine());
//            while(split.hasNextInt())
//            //for (int a = 0; a < 4 ; a++)
//            {
//                sum += split.nextInt();
//                count++;
//            }
//            System.out.println("the average is = " + ((double)sum / count));
//
//        }
    }

}
