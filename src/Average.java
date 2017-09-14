import java.io.*;

public class Average {

    public static void main(String args[])  throws IOException
    {
        FileReader fr = new FileReader("src//input.txt");
        BufferedReader br = new BufferedReader(fr);
        String s;

        float total = 0;
        int count = 0, age;
        while((s = br.readLine())!= null){
            count++;
            age = Integer.parseInt(s);
            total += age;
        }

        System.out.println("Total: " + total/count);


    }

}
