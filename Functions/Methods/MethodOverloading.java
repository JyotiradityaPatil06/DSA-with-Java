package Functions.Methods;

public class MethodOverloading {

    public static void main(String[] args) {
        fun(34);
        fun("Jyotya");
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
}