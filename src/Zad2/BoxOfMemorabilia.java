package Zad2;

public class BoxOfMemorabilia<T> {

    private T[] ts;
    private int i;

    public void add (T ... ts){
        for (T t:ts){
            try{
                this.ts[this.i] = t;
                this.i++;
            }
            catch (NullPointerException e){
                continue;
            }
        }
    }

    public T[] getItems(){
        return ts;
    }

    public int getNumberOfItems(){
        return this.ts.length;
    }
}
