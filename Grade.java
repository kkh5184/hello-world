import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        
      	Scanner a = new Scanner(System.in);
		System.out.println("Enter grade: ");
		int n = a.nextInt();        
        if (n >= 90) {
            System.out.println("A");
        }
        if (n < 90) {
        	if (n >= 80){
            System.out.println("B");
        	}
        }
        if (n < 80){
        	if (n >= 70){
        	System.out.println("C");
        	}
        }
        if (n < 70) {
        	if (n >= 60) {
        		System.out.println("D");
        	}
        }
        if (n < 60) {
        	System.out.println("F");
        }

    }
}