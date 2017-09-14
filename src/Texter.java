import java.io.*;


public class Texter {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("input.txt");
            BufferedReader br = new BufferedReader(fr);


            int total = 0;
            int i = 0;
            while(br.readLine() != null){
                String a = br.readLine();

                int x = Integer.parseInt(a);
                total += x;
                i++;
            }
            System.out.println("Total: " + total/i);
        }

        catch (FileNotFoundException f) {
            System.out.print(f.getMessage());

        }

        catch (IOException i){

            System.out.print(i.getMessage());
        }



    }

}
