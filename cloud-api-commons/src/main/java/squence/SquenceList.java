package squence;

public class SquenceList<T> {
    private  T[] eles;

    private int N;

    public SquenceList(int capacity){
        this.eles=(T[]) new Object[capacity];
        this.N=0;
    }

    public void clear(){
        this.N=0;
    }

    public boolean isEmpty(){
        return  N==0;
    }

    public int length(){
        return N;
    }

    public T get(int i){
        return eles[i];
    }

    public void insert(T t){
        eles[N++]=t;
    }

}
