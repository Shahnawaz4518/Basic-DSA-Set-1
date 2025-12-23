import java.util.*;
public class OddEvenList {
    public static void main(String [] args){
        int n=10;

        List<Integer> even=new ArrayList<>();
        List<Integer> odd=new ArrayList<>();

        for(int i=1;i<=n;i++){
            if(i%2==0){
                even.add(i);
            }else{
                odd.add(i);
            }
        }
        System.out.println("even numbers: "+even);
        System.out.println("odd numbers: "+odd);
    }
}
