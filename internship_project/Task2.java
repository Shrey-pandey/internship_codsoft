
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {

        byte  m1,m2,m3,m4,m5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mark of English :");
        m1= sc.nextByte();
        System.out.println("Enter the mark of Hindi :");
        m2 = sc.nextByte();
        System.out.println("Enter the mark of Mathematics :");
        m3 = sc.nextByte();
        System.out.println("Enter the mark of Science :");
        m4 = sc.nextByte();
        System.out.println("Enter the mark of Social Science :");
        m5 = sc.nextByte();
        int Total= m1+m2+m3+m4+m5;
        System.out.println("Total Mark obtained is :"+Total);
        float avg=(m1+m2+m3+m4+m5)/5.0f;
        System.out.println("Your over all Percentage is : "+avg);
        if(avg<33){
            System.out.println("Grade is F");
        }
        else if( avg <=40){
            System.out.println("Grade is D");
        }
        else if( avg <=60){
            System.out.println("Gradde is C");
        }
        else if(avg<=80){
            System.out.println("Grade is B");
        }
        else if(avg<=100){
            System.out.println("Grade is A");
        }
    }

}
