package operations;

import java.util.Scanner;

public class Operations {

    
    public static void main(String[] args) {
        int n;
        int sum = 0;
        float average;
        
        Scanner sc = new Scanner(System.in);
        do{
        System.out.print("Enter no. of elements you want in array:");
        while (!sc.hasNextInt()){
            System.out.println("Please enter a valid number");
            sc.next();
        }
        n = sc.nextInt();
        }while (n<=0);
        
        int a[] = new int[n];   
        
      
        
        for(int i = 0; i < n ; i++)
        {
            sc=new Scanner(System.in);
            try{
            System.out.println("Enter number:");
            a[i] = sc.nextInt();
            sum = sum + a[i];
            }catch(Exception x){
                System.out.println("Invalid element");
                i--;
            }
        }
       
        
        System.out.println("Average is: "+ getMean(a));
    }
        
    
    public static float getMean(int[] m) {
    float sum = 0;
    for (int i = 0; i < m.length; i++) {
        sum += m[i];
    }
    
    return sum / m.length;
    
}
    
    
    
    
    
}
