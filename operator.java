public class operator {
    //// Arithmatic operators
    // binary :- + , - , * , / , %.
    
    // unary :- ++ , --.


    // a++ or ++a
    /*    
     * a = 10
     * a++; :- a == 11;
     * 
     * 
     * pre incriment :-   ++a , post incriment :- a++
     * change value                 use value
     * use value                    update value
     * 
     * 
     * 
     */
    // BINARY NUMBER SYSTEM
 
    

    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int binary = sc.nextInt();
    //     int decimal = 0;
    //     int i = 0;
    //     while(binary > 0){
    //         decimal += (binary%10)*Math.pow(2,i);
    //         System.out.println(decimal);
    //         System.out.println(binary);
    //         i++;
    //         binary /= 10;

    //     }
    //     System.out.println(decimal);
    // }

///////////// BITWISE OPERATORS
/*
 * // & BINARY and let a = 0101 and b = 0110 a & b = 0100
 * 
 *  | Binary or a = 0101 or b = 0110 == 0111
 * 
 * ^ binary exor 00 - 0, 11- 0 ,01 - 1, 10- 1;
 * 
 * ~ binary one's = 0-1;1-0
 * 
 * <<  binary left shift = 11001100 << 10011000 ; a << 1; 0101 == 1010
 * 
 * >> binary right shift = a >> 1; a == 1010 = 0101
 */

// public static String binary(int decimal,StringBuilder bin){
//     while(decimal > 0){
//             int remainder = decimal%2;
//             bin.insert(0,remainder);
//             decimal /= 2;
       
//         }
        
//         return bin.toString();
    
//     }





// public static void main(String[] args) {
//     StringBuilder bin = new StringBuilder();
//    Scanner sc = new Scanner(System.in);
//    int decimal = sc.nextInt(); 

//    String bin2 = binary(decimal, bin);  
//     int num = Integer.parseInt(bin2);
//     StringBuilder ans = new StringBuilder();
//    while(num > 0){
//     if(num%10 == 0){
//         ans.insert(0,1);

//     }else{
//         bin.insert(0,0);
//     }
//     System.out.println(ans);

//    }

    
//    }
   

// }


// public static void main(String[] args) {
//     Scanner sc =new Scanner(System.in);
//     int des = sc.nextInt();

//     while(des>0){
//         int rem = des %2;
//         if(rem == 0){
//             System.out.print(0);
           
//         }
//         else{
//             System.out.print(1);
//         }
//         des /= 2;  
//     }

// get bit 


// get the 3rd bit (position = 2) of a number n.  (n = 0101)


// bit mask : 1 << i
// operation : AND


// public static void main(String[] args) {
//     int n = 5;
//     int pos = 2;
//     int bitMask = 1 << pos;

//     if (((bitMask & n) == 0)){
//         System.out.println("bit was 0");

//     }
//     else{
//         System.out.println("Bit was 1");
//     }







}







