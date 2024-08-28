
import java.util.*;
public class practiceset {
// public static void main(String[] args){
//     System.out.print("Hello World!");
// }


// public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     System.out.print("sum:"+(a+b));
// }


// public static void main(String[] args) {
//  Scanner sc = new Scanner(System.in);
//  System.out.print("Enter any number: ");
//  int n = sc.nextInt();
//  if(n%2==0){
//     System.out.print(n+" is even.");
//  }else{
//     System.out.print(n+" is odd.");
//  }
// }




// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter a no. : ");
//     int n = sc.nextInt();
//     int fact = 1;
//     while(n > 0){
//         fact *= n;
//         n--;
//     }
//     System.out.print("The Factorial is "+fact);
// }




// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the number : ");
//     int n = sc.nextInt();
//     int a = 0;
//     int b = 1;
//     System.out.print(a+" "+b);
//     while(n > 0){
//         int temp = a+b;
//         System.out.print(" "+temp);
        
//         a = b;
//         b = temp;
//         n--;
//     }
// }




// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter your string : ");
//     String s = sc.nextLine();
//     String reversed = new StringBuilder(s).reverse().toString();
//     System.out.print("Reversed string: "+ reversed);

// }



// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter your string : ");
//     String s = sc.nextLine();
//     String reversed = new StringBuilder().reverse().toString();
//     if(s.equals(reversed)){
//         System.out.print("Palindrome");

//     }else{
//         System.out.print("Not Palindrome");
//     }
// }




// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter any number: ");
//     int n = sc.nextInt();
//     int i = 2;
//     int sum = 0;
//     while( i <= n ){
//         if (n % i == 0){
//             sum += 1;
//         }
//         i++;
//     }
//     if(sum == 1){
//     System.out.print("prime");
// }
// else{
//     System.out.print("Not Prime");
// }
// }





// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter any three numbers: ");
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     int c = sc.nextInt();
//     System.out.print("largest integer: "+Math.max(a,Math.max(b,c)));




// }



// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the digit: ");
//     int n = sc.nextInt();
//     int sum = 0;
//     while(n > 0){
//         sum += n;
//         n--;
//     }
//     System.out.print(sum);
// }



// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the number : ");
//     int n = sc.nextInt();
//     int c = 0;
//     int sum = 0;
//     int num = n;
//     int res = num;
//     while(n > 0){
//         n/=10;
//         c += 1;
//     }
//     while(num > 0){
//         sum += Math.pow((num%10),c);
//         num /=10;
//     }
//     if(res == sum){
//         System.out.print("Armstrong");
//     }
//     else{
//         System.out.print("Not Armstrong");
//     }




//     }

//==============================================================================================================================================
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter any number : ");
//     int n = sc.nextInt();
//     if( n > 0){
//         System.out.println("Positive");
//     }else if(n == 0){
//         System.out.println("Zero");
//     }else{
//         System.out.println("Negative");
//     }
// }
//==============================================================================================================================================

// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter any two numbers : ");
//     int a = sc.nextInt();   
//     int b = sc.nextInt();   

//     if((a%10)== (b%10)){
//         System.out.println("True");
//     }else{
//         System.out.println("False");
//     }
// }

//==============================================================================================================================================


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any two characters : ");
    char a = sc.next().charAt(0);
    char b = sc.next().charAt(0);
    
    if (a > b){
        System.out.print(b+" "+a);
    }else{
        System.out.print(a+" "+b);
    }

}



















}


























