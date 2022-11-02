public class Constructor {
    public static void main(String[] args) {
        Abc obj1 = new Abc(15,20);
        obj1.anc();
    }
}

class Abc{
    Abc(int a, int b){
        System.out.println("hello world");
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    }
    void anc(){

    }
}
