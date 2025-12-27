/*Write a proogram to swap the number using temp variable.... */
public class SwapNumber {
    public static void main(String[] args) {
        int a  = 10;
        int b = 20; 
        System.out.println("Before Swaping->: ");
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
        int temp = a;
            a = b;
            b = temp;
            System.out.println("After Swaping->: ");
            System.out.println("a = " + a);
            System.out.println("b = " ~+ b);

    }
    
}
