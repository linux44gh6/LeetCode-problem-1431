import java.awt.datatransfer.FlavorListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class solution {
  public static void solve(int a[],int extraCandies){
      int greatest=0;
      List<Boolean>list=new ArrayList<>();
      for (int i=0;i<a.length;i++){
          greatest=Math.max(a[i],greatest);
      }
      for (int i=0;i<a.length;i++){
         if (a[i]+extraCandies>=greatest){
             list.add(true);
         }
         else {
             list.add(false);
         }
      }

     System.out.println(list);
  }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int extraCandies=sc.nextInt();
        int n=sc.nextInt();
        int []a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        solve(a,extraCandies);
    }

}
