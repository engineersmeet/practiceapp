package sonali;

public class Test {

    // non-static method
   static int multiply(int a, int b){
        return a * b;
    }

    // static method
    static int add(int a, int b){
        return a + b;
    }
}

    class Main {

        public static void main( String[] args ) {

            // create an instance of the StaticTest class
            Test st = new Test();

            // call the nonstatic method
            System.out.println(" 2 * 2 = " + st.multiply(2,2));

            // call the static method
            System.out.println(" 2 + 3 = " + Test.add(2,3));
        }
    }

