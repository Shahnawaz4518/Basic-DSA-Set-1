public class PrimeNumberCheck {
    public static void main(String[] args) {

        int n=6;
        boolean isPrime=true;

        if(n <= 1){
            isPrime = false;  
        }else{
            int i=2;
            while(i * i <= n){
                if(n % i == 0) {
                    isPrime = false;
                    break;
                } 
                i++;                                                      
            }
        }
        System.out.println(n +" is Prime Number: "+ isPrime);
    }
}