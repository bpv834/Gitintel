import java.util.Scanner;

public class GDSC4_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]<m)
                System.out.println(arr[i]);
        }
    }
}
