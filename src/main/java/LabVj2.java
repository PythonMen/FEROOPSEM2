import java.util.Random;

public class LabVj2 {

    static boolean isPerfect(long number){
        long i;
        long sum = 0;
        for (i = 1; i<=number/2; i++){
            if (number % i == 0){
                sum += i;
            }
        }
        if (sum == number) return true;
        else return false;
    }

    static void increasing(int[] arr){
        Random rand = new Random();
        //int randomNum = rand.nextInt((max-min)+1) + min;
        int i;
        int number;
        arr[0] = rand.nextInt(5) + 1;
        for (i=1;i< arr.length;i++){
            arr[i] = rand.nextInt((2*arr[i-1]-arr[i-1])+1) + arr[i-1];
        }
    }

    public static void main (String[] args){
        System.out.println(isPerfect(33550336));
    }

}
