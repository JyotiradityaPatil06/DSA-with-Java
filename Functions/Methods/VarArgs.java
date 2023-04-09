package Functions.Methods;

import java.util.Arrays;

public class VarArgs {

    public static void main(String[] args) {
        fun(34,245,134,56,123,65,12);
        multiple(324, 124, "sdfe","sdgsg");
    }

    static void multiple(int a, int b, String ...v){

    }

    static void fun (int ...v){
        System.out.println(Arrays.toString(v));
    }
}