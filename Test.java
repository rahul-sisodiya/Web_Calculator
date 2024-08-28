
import java.util.*;
public class Test {
    
// public static void main(String[] args) {
    
//     Scanner sc = new Scanner(System.in);
//     int des = sc.nextInt();

//     while(des > 0){

//         if(des%2 == 1){
//             System.out.print("0");
//             des /=2;
//         }
//         else{
//             System.out.print("1");
//             des /=2;
//         }
        
//     }





// public static void main(String[] args) {
//     char ch='a';

//     for(int i = 1; i <= 26; i++){
//         System.out.println((char)(i+ch));
//         // ch++;
//     }
    // while(ch>0){
    //     System.out.println((char)ch);
    //     ch++;
    // }


// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);   
//     System.out.print("Eneter no. of charactors: ");
//     int n = sc.nextInt();

//     char arr[] = new char[n];
//      for(int i = 0; i < arr.length; i++){
//         arr[i] = sc.next().charAt(0);
//     }

//     for(int i = 0; i < arr.length-1; i++){
//         for(int j = 0; j < arr.length-i-1;j++){
//             if((arr[j])>(arr[j+1])){
//                 char temp = arr[j];
//                 arr[j] = arr[j+1];
//                 arr[j+1] = temp;

//             }
//         }
//     }
//     for(int i = 0; i < arr.length; i++){
//         System.out.print(arr[i]+" ");
//     }
// }


// public static void main(String[] args) {
//  Scanner sc = new Scanner(System.in);
//  System.out.println("Enter the number of elements : ");
//  int n = sc.nextInt();
//  int arr[] = new int[n];
//  for(int i = 0; i < arr.length; i++){
//      arr[i] = sc.nextInt();
// }
// for(int i = 0; i < arr.length; i++){
//     for(int j = 0; j < arr.length;j++){
//             System.out.print("("+arr[i]+","+arr[j]+") ");
//     }









// }
// }

public static void main(String[] args) {
//  Scanner sc = new Scanner(System.in);
//  System.out.print("Enter the digit : ");
//  int n = sc.nextInt();
//  int count = 0;
// for(int i=1;i<=n;i++){
//     System.out.print(i+" ");
//     count++;
//     if(count==10){
//         System.out.println();
//         count=0;
//     }
// }


//================================================================================+

Scanner sc=new Scanner(System.in);
String ch=sc.next();
int count = 0;
StringBuilder s = new StringBuilder(ch);
for(int i = 0; i < s.length(); i++){
    for(int j = i+1; j < s.length();j++){
        if (s.charAt(i) == s.charAt(j)){
            count++;
        }

    }}
    System.out.println(count);
    System.out.println(s.length()/2);
if((count+1 != s.length()/2)){
    System.out.println("Not Palindrome");
}else if( (count != s.length()/2)){
    System.out.println("Not Palindrome");
}else{
    System.out.println("Palindrone");
}
// else{
//     System.out.println("Not Palindrome");
// }





}
}

























    







































































