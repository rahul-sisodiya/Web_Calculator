import java.util.*;
public class Pattern {



    
// ******
// ******
// ******
// ******

    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     for(int i = 0; i < a; i++){
    //         for(int j = 0; j < b; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }



//     // }
//         int n = 4;
//         int m = 5;
//         public static void main(String[] args){
//             int n = 4;
//             int m = 5;
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= m; j++){
//                 if(i == 1 || j == 1 || i == n || j == m){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }

    
//         public static void main(String[] args){
//             int n = 5;

//             for(int i = 1 ; i <= n; i++){
//                 for( int j = 1; j <= i; j++){
//                     System.out.print("*");
//                 }
//                 System.out.println();
//             }
//         }
    

            // public static void main(String[] args) {
            //     int n = 5;

            //     for(int i = n; i>=1; i--){
            //         for(int j = 1; j <= i ; j++){
            //             System.out.print("*");
            //         }
            //         System.out.println();
            //     }
                
            // }

    //     public static void main(String[] args){
    //         Scanner sc = new Scanner(System.in);
    //         int n = sc.nextInt();

    //         for(int i=1; i <= n; i++){
    //             for(int j = 1 ; j<= n-i ; j++){
    //                 System.out.print(" ");
    //             }
    //             for(int k = 1; k <= i;k++){
    //                 System.out.print("*");
    //             }
                
    //             System.out.println();

    //     }


    // }


        // public static void main(String[] args) {
        //     Scanner sc = new Scanner(System.in);
        //     int n = sc.nextInt();

        //     for(int i = 1; i <= n ; i++){
        //         for(int j = 1 ; j <= (n-i+1) ; j++){
        //             System.out.print(j + " ");
        //         }
        //         System.out.println();
        //     }
        // }


        // public static void main(String[] args) {
        //     Scanner sc = new Scanner(System.in);
        //     int n = sc.nextInt();
        //     int sum = 0;
        //     for(int i = 1 ; i <= n ; i++){
        //         for (int j = 1 ; j <= i; j++){
        //             sum++;
        //             System.out.print(sum+" ");
                    
        //         }
        //     System.out.println();
        //     }


        // // }
        // public static void main(String[] args) {
        //  Scanner sc = new Scanner(System.in);
        //  int n = sc.nextInt();
        //  for(int i =1 ; i <= n; i++){
        //     for(int j = 1; j<= i; j++){
        //         if((i+j)%2 == 0){
        //             System.out.print("1"+" ");
        //         }else{
        //             System.out.print("0"+" ");
        //         }

        //     }
        //     System.out.println();
        //  }   
        // }


        // public static void main(String[] args) {
        //  Scanner sc = new Scanner(System.in);
        //  int n = sc.nextInt();
        //  for(int i = 1; i <= n; i++){
        //     for(int j= 1 ; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     for( int k = 1 ; k <= (n-i)*2;k++){
        //         System.out.print(" ");
        //     }
        //     for(int j= 1 ; j <= i; j++){
        //         System.out.print("*");
        //  }
        //  System.out.println();   
        // }
        // for(int i = n; i >= 1; i--){
        //     for(int j= 1 ; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     for( int k = 1 ; k <= (n-i)*2;k++){
        //         System.out.print(" ");
        //     }
        //     for(int j= 1 ; j <= i; j++){
        //         System.out.print("*");
        //  }
        //  System.out.println();   
        // }

        

        // public static void main(String[] args){
        //     Scanner sc = new Scanner(System.in);
        //     int n = sc.nextInt();
        //     for(int i = 1; i <= n; i++){
        //         for(int j = 1; j <= n-i; j++){
        //             System.out.print(" ");
        //         }
        //         for(int k = 1; k <= n; k++){
        //             System.out.print("*");
        //         }
        //         System.out.println();
        //     }
        
        // }
        // public static void main(String[] args){
        //     Scanner sc = new Scanner(System.in);
        //     int n = sc.nextInt(); 
        //     for(int i = 1; i <= n; i++){
        //             for(int j = 1; j <=n-i; j++ ){
        //                 System.out.print(" ");
        //             }
        //             for(int j = 1; j <= i; j++){
        //                 System.out.print(i+" ");
        //             }
        //             System.out.println();

        //     }
        // }
        // public static void main(String[] args) {
        //   Scanner sc = new Scanner(System.in);
        //   int n = sc.nextInt();
        //   for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = i; j >= 1 ; j--){
        //         System.out.print(j);
        //     }
        //     for(int j =2; j <=i; j++){
        //         System.out.print(j);
        //     }
        //    System.out.println();
        //   }
         

        // }

        // public static void main(String[] args) {
        //     Scanner sc = new Scanner(System.in);
        //     int n = sc.nextInt();
        //     for(int i = 1; i <= n; i++){
        //         for( int j = 1; j <=n-i ; j++){
        //             System.out.print(" ");
        //         }
        //         for(int j = 1; j<= i; j++){
        //             System.out.print("*");
        //         }
        //         for(int j = 2; j <= i; j++){
        //             System.out.print("*");
        //         }
        //     System.out.println();
        //     }
        //     for(int i = n; i >=1 ; i--){
        //         for( int j = 1; j <=n-i ; j++){
        //             System.out.print(" ");
        //         }
        //         for(int j = 1; j<= i; j++){
        //             System.out.print("*");
        //         }
        //         for(int j = 2; j <= i; j++){
        //             System.out.print("*");
        //         }
        //     System.out.println();
        //     }
        // }



}
