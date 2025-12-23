public class AlternatingBlockPattern {
    public static void main(String[] args){
        int n=19;
        int i=1;

        while(i <= n){
            int block=(i-1)/5;

            if(block % 2 == 0){
                System.out.print(i + " ");
            }else{
                System.out.print("* ");
            }
            i++;
        }
    }
}