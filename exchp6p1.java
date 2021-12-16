public class exchp6p1 {
    public static void main(String[] args) {
        int count = 1;
        while (count <= 100) {
            System.out.println(count);
            count++;
        }
        System.out.println("Loop 1 ended");

        int count2 = 1;
        int sum = 0;
        while (count2 <= 100) {
            sum += count2;
            count2++;
        }
        System.out.println("Summation of of 1 to 100 is " + sum);
        System.out.println("Loop 2 ended");
        
    }
    
}
