import java.util.*;
public class convert {
    public static int ConvertToNumber(String x){
        int i=Integer.parseInt(x);
        return i;
    }
    public static void main(String[] args) {
      String name="400";
    int Change=  ConvertToNumber(name);
        System.out.println(Change);
    }
}
