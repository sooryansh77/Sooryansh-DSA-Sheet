import java.util.Scanner;
public class Patterns {
    public static void Q1(){
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Q2(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void Q3(int n){
        for(int i=0; i<n; i++){
            for(int j=1; j<=i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    public static void Q4(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

    public static void Q5(int n){
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void Q6(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n-i + 1); j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    public static void Q7(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<(2*i + 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Q8(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<(2*n - (2*i+1)); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Q9(int n){
        //Upper Triangle
        for(int i=0; i<n; i++){
            for(int j=0; j<(n-i-1); j++){
                System.out.print(" ");
            }
            for(int j=0; j<(2*i+1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Lower Triangle
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int j=0; j < (2*n - (2*i+1)); j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }

    public static void Q10(int n){
        for(int i=1; i<=(2*n-1); i++){
            int stars = i;
            if(i > n){
                stars = 2*n - i;
            }
            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Q11(int n){
        int start =1 ;
        for(int i=0; i<n; i++){
            start = i%2 == 0 ? 1 : 0;
            for(int j=0; j<=i; j++){
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    public static void Q12(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(j+1);
            }
            for(int j=0; j<((2*n -2) - (2*i)); j++){
                System.out.print(" ");
            }
            for(int j=(i); j>=0; j--){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }

    public static void Q13(int n){
        int num = 1;
        for(int i=0; i<n; i++ ){
            for(int j=0; j<=i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void Q14(int n){
        for(int i=0; i<n; i++){
            for(char c='A'; c<='A' + i; c++){
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void Q15(int n){
        for(int i=0; i<n; i++){
            for(char c='A'; c<'A' + n - i; c++){
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void Q16(int n){
        char c = 'A';
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(c);
            }
            c++;
            System.out.println();
        }
    }

    public static void Q17(int n){

        for(int i=0; i<n; i++){
            // For spaces
            for(int j=0; j<(n-i-1); j++){
                System.out.print(" ");
            }

            char c = 'A';
            int breakpoint = (2*i + 1) / 2;
            /*
            * Till half the number of elements in the row (2i + 1), increment,
            * after that decrement. (c)*/
            for(int j=1; j<=(2*i + 1); j++){
                System.out.print(c);
                if(j <= breakpoint){
                    c++;
                }
                else{
                    c--;
                }
            }
            System.out.println();
        }
    }

    public static void Q18(int n){
        char c = 'E';
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print((char)(c - i + j));
            }
            System.out.println();
        }
    }
    public static void Q18_alternate(int n){

        for(int i=0; i<n; i++){
            for(char c=(char)('E'-i); c<='E'; c++){ //Alternate loop using character as iterator itself.
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public static void Q19(int n){
        //UPPER HALF
        for(int i=0; i<n; i++){
            //LEFT STARS
            for(int j=0; j<=(n-i-1); j++){
                System.out.print("*");
            }

            //SPACES
            for(int j=0; j<(2*i); j++){
                System.out.print(" ");
            }

            //RIGHT STARS
            for(int j=0; j<=(n-i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //LOWER HALF
        for(int i=0; i<n; i++){
            //LEFT STARS
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }

            //SPACES
            for(int j=0; j<(2*n-2-2*i); j++){
                System.out.print(" ");
            }

            //RIGHT STARS
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Q20(int n){
        for(int i=0; i<n; i++){

            //LEFT STARS
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }

            //SPACES
            for(int j=0; j<(2*n - 2 - 2*i); j++){
                System.out.print(" ");
            }

            //RIGHT STARS
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

        }
        //LOWER HALF
        int spaces = 2;
        for(int i=0; i<n-1; i++){
            //LEFT STARS
            for(int j=0; j<(n-i-1); j++){
                System.out.print("*");
            }

            //SPACES
            for(int j=0; j<spaces; j++){
                System.out.print(" ");
            }
            spaces += 2;

            //RIGHT STARS
            for(int j=0; j<(n-i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Q20_alternate(int n){
        int stars;
        int spaces = 2*n - 2;
        for(int i=1; i<=(2*n-1); i++){

            if(i <= n){
                stars = i;
            }
            else{
                stars = 2*n - i;
            }
            //stars
            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }

            //spaces
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }

            System.out.println();
            if(i<n){
                spaces -= 2;
            }
            else{
                spaces += 2;
            }
        }

    }

    public static void Q21(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || i == n || j == 1 || j ==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        Q21(4);
    }
}
