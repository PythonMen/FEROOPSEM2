import java.io.*;
import java.lang.Object;
import java.util.Random;


public class LabVj1 {


    public static void main(String[] args){
        String[] st = {"123", "456", "abcdefg", ""};
        String arr = stringFloss(st);
        System.out.println(arr);
    }

    public static String stringFloss(String[] elements){
        String array = "";
        Random rand = new Random();
        int size = elements.length;
        int index;
        int i = 0;


        while (true){
            index = rand.nextInt(elements[i].length());
            array = array + elements[i].charAt(index);

            elements[i] = elements[i].substring(0, index) + elements[i].substring(index+1);

            if (elements[i].length() == 0){
                size--;

            }

            if (size == 0) return array;
            if (i == size) i = 0;
            else i++;
        }

    }

}
