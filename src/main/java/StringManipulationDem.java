public class StringManipulationDem {
    public static void main (String[] args){
        String text = "The quick brown fox jumps over lazy dogs.";
        String upperCase = text.toUpperCase();
        System.out.println("Upper case text: " + upperCase);
        System.out.println("Replacing fox with wolf: " + text.replace("fox", "wolf"));
        int position = text.indexOf("quick");
        System.out.println("quick starts at index: " + position);
        System.out.println(text.substring(position, position + 15));
        System.out.println("Original: " + text);
    }
}
