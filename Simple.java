package ProjectForGit;

public class Simple {
    int c=2;
    int e=3;
    public void calc1(){
        int g =c*e;
        System.out.println(g);
    }
    public static void main(String[] args) {
        Simple simple = new Simple();
        int a = simple.c+simple.e;
        simple.calc1();
    }
}
