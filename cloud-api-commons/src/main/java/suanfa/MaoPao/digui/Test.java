package suanfa.MaoPao.digui;

public class Test {

    public static void main(String[] args) {
        int f = f(7);
        System.out.println(f);
    }



    private static int f(int n){
        if(n==1){
            return 1;
        }
        return n*f(n-1);
    }
}
