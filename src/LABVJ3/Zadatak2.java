package LABVJ3;

public class Zadatak2 {

    class SimpleArrayList<T> {

        private T[] arr;
        private int size;

        @SuppressWarnings("unchecked")
        public SimpleArrayList() {
            arr = (T[]) new Object[2];
            size = 0; // Was not necessary
        }

        // Appends the specified element to the end of this list.
        public boolean add(T o) {
            ensureCapacity(size + 1);
            arr[size++] = o;
            return true;
        }

        // Returns the number of elements in this list.
        public int size() {
            return size;
        }

        // Returns the element at the specified position in this list.
        public T get(int index) {
            T found = null;
            if (index < size) {
                found = arr[index];
            }
            return found;
        }


        // Increases the capacity of this SimpleArrayList instance, if
        // necessary, to ensure that it can hold at least the number of elements
        // specified by the minimum capacity argument.
        @SuppressWarnings("unchecked")
        private void ensureCapacity(int minCapacity) {
            int current = arr.length;
            if (minCapacity > current) {
                // Ensure some extra space so as not to copy too many times
                Object[] newData = new Object[Math.max(current * 2, minCapacity)];
                System.arraycopy(arr, 0, newData, 0, size);
                arr = (T[]) newData;
            }

        }
    }
    // Partial Credit
    class SortedArrayList1 <T> {
        private T[] arr;
        private int size;

        @SuppressWarnings("unchecked")
        public SortedArrayList1 () {
            arr = (T[]) new Comparable<?>[2];
            size = 0;
        }

        public boolean add(T o) {
            ensureCapacity(size + 1);
            arr[size++] = o;
            return true;
        }

        public int size() {
            return size;
        }

        public T get(int index) {
            T found = null;
            if (index < size) {
                found = arr[index];
            }
            return found;
        }

        @SuppressWarnings("unchecked")
        private void ensureCapacity(int minCapacity) {
            int current = arr.length;
            if (minCapacity > current) {
                // Ensure some extra space so as not to copy too many times
                Object[] newData = new Object[Math.max(current * 2, minCapacity)];
                System.arraycopy(arr, 0, newData, 0, size);
                arr = (T[]) newData;
            }

        }

    }

    class SortedArrayList <T> {
        private T[] arr;
        private int size;

        @SuppressWarnings("unchecked")
        public SortedArrayList() {
            arr = (T[]) new Comparable<?>[2];
            size = 0;
        }

        public boolean add(T o) {
            ensureCapacity(size + 1);
            arr[size++] = o;
            int i,j,temp;
            Integer[] arrTemp = new Integer[size()];

            for (i=0;i<arrTemp.length;i++){
                for(j=0;j<arrTemp.length;j++){
                    if(arrTemp[i]<arrTemp[j]) {
                        temp = arrTemp[i];
                        arrTemp[i] = arrTemp[j];
                        arrTemp[j] = temp;
                    }
                }
            }
            this.arr = (T[]) arrTemp;
            return true;
        }

        public int size() {
            return size;
        }

        public T get(int index) {
            T found = null;
            if (index < size) {
                found = arr[index];
            }
            return found;
        }

        @SuppressWarnings("unchecked")
        private void ensureCapacity(int minCapacity) {
            int current = arr.length;
            if (minCapacity > current) {
                // Ensure some extra space so as not to copy too many times
                Object[] newData = new Object[Math.max(current * 2, minCapacity)];
                System.arraycopy(arr, 0, newData, 0, size);
                arr = (T[]) newData;
            }
        }

    }

    public static void main (String[] args){
        int[] arr = {1,6,7,1,-5,3,2};
        int i,j,temp;

        for (i=0;i<arr.length;i++){
            for(j=0;j<arr.length;j++){
                if(arr[i]<arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int a:arr)System.out.println(a + ", ");
    }
}
