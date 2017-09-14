public class Boxdemo {


    public static void main(String[] args) {
        Box box = new Box(5);

        try {

            box.remove();
            System.out.println(box.toString());
        }

        catch (EmptyBoxException a){

            System.out.println("testing out");
        }


    }

}
