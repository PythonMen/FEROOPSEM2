public class Main {
    public static void main (String[] args){

        String cd1 = "Foo Fighters";
        String cd2 = "In Your Honor";
        String vinyl1 ="The Black Keys";
        String tshirt1 = "Foo Fighters";
        BoxOfMemorabilia<String> box = new BoxOfMemorabilia<String>();
        box.add(cd1, cd2, vinyl1, tshirt1, null);
        String[] itemsInBox = box.getItems();
        System.out.println("I own " + box.getNumberOfItems() + " memorabilia items.");

    }
}
