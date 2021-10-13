public class Leti {
    public static int[] ParniArray(int[] array) {
        int i, j;
        j = 0;
        int[] parniArray = new int[array.length];

        for (i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) parniArray[j++] = array[i];
        }
        int[] parniArrayKratki = new int[j-1];
        parniArrayKratki = parniArray.clone();
        return parniArrayKratki;
    }

    public static void Main(String[] args){
        int[] array = {10,1,2,3,5,155,100,140,120};
        System.out.println(ParniArray(array));
    }
}
