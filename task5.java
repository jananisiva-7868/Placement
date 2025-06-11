public class OverloadExample {

    
    public int sum(int a, int b) {
        return a + b;
    }

    
    public double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();

       
        int intResult = obj.sum(10, 20);
        System.out.println("Sum of integers: " + intResult);

        
        double doubleResult = obj.sum(10.5, 20.75);
        System.out.println("Sum of doubles: " + doubleResult);
    }
}
