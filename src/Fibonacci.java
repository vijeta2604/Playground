//public class Fibonacci {
    // Java program for Fibonacci Series using Space
// Optimized Method
    public class Fibonacci {
        static int fib(int n)
        {
            int a = 0, b = 1, c;
            if (n == 0)
                return a;
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return b;
        }

        public static void main(String args[])
        {
            int n = 34;
            System.out.println(fib(n));
        }
    };


