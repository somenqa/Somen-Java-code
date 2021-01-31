package secondpractice;

    public class MethodOverloading {
        public static void main(String[] args) {

            sugarcane2();
            sugarcane2(78, 62);
            sugarcane2(120, 225, 123);

        }

        public static void sugarcane2() {
            int new1 = 80;
            System.out.println(new1);

        }

        public static void sugarcane2(int x, int y) {

            int result = (x + y);
            System.out.println(result);

        }

        public static void sugarcane2(int a, int b, int c) {
            int total = (a - b + c);
            System.out.println(total);
        }
    }
