public class ex5_13 {


    public static void main(String args[]){
        long i,fact=1;
        int number=20;//It is the number to calculate factorial
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}