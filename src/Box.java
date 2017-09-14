public class Box {
    private int numberOfItems;

    public Box(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public void remove() throws  EmptyBoxException
    {numberOfItems -=1;}


    @Override
    public String toString() {
        return "Box{" +
                "numberOfItems=" + numberOfItems +
                '}';
    }
}
