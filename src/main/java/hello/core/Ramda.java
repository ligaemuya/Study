package hello.core;

@FunctionalInterface
interface RamdaRegexp {
    int calculate(int a, int b);

}
@FunctionalInterface
interface RamdaRegexp2 {
    String soutv(String a);
}


class Test {
    public int plus(RamdaRegexp calc, int a, int b) {
        int num = calc.calculate(a, b);
        return num;
    }
    /*
    public String outString(RamdaRegexp2 text, String a){
        int result = text.soutv(a);
        return result;
    }
     */
}


public class Ramda {

    public static void main(String[] args) {
        Test test = new Test();
        int result = test.plus((a,b)-> {
           return a + b;
        }, 15, 15);
        System.out.println("result = " + result);


        /*
        test.outString((a) -> {
         return System.out.println("a = " + a);
        }, result);
        */


    }

}
