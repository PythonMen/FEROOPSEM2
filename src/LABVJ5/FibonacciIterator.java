package LABVJ5;

import java.util.*;

class FibonacciIterator implements Iterator<Integer> {
    private int number,i;
    private int newNum,prevNum1,prevNum2;

    public FibonacciIterator(int number){
        if (number<0) throw new IllegalArgumentException();
        this.number = number;
        this.i = 0;
        this.prevNum1 = 1;
        this.prevNum2 = 0;
    }

    @Override
    public boolean hasNext(){
        if (number > i) return true;
        else return false;
    }

    @Override
    public Integer next(){
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        if (i==0){
            i+=1;
            return 0;
        }
        else if (i==1){
            i+=1;
            return 1;
        }
        newNum = prevNum1 + prevNum2;
        prevNum2 = prevNum1;
        prevNum1 = newNum;
        i+=1;
        return newNum;
    }
}
