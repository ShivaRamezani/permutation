import java.util.Scanner;

public class lab02 {
    public static void main(String[] args) {
        
        System.out.print("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        displayPermutation(s);
        int numbers = s.length();
        System.out.print("Number of permutations: " + factorial(numbers));
        
        
    }
    
    public static void displayPermutation(String s) {
        displayPermutation("", s);


    }
    
    public static void displayPermutation(String s1, String s2) {
        
        if (s2.isEmpty()) {
            System.out.println(s1);
        }
            
        else {

            for(int i =0; i< s2.length(); i++) {
                displayPermutation(s1 + s2.charAt(i), s2.substring(0, i) + s2.substring(i + 1));
                
            }
        }       
        

    }
    public static long factorial(int n) {
        if(n==0)
            return 1;
        else {
            return (n * factorial(n-1));
        }
    }

}