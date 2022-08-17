public class Swap {
    public static void main(String arg[]){
        int numA = 4, numB = 9;
        System.out.println("NumA: " + numA);
        System.out.println("numB: " + numB);

        int before = numA;
        numA = numB;
        numB = before;
        System.out.println("After swap:");
        System.out.println("NumA: " + numA);
        System.out.println("numB: " + numB);


    }
}
