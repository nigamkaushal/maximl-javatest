import java.util.Scanner;
import java.util.HashSet;
import java.util.Collections;

public class Main {

    static int count_dist(String x){
        HashSet<Character> hs = new HashSet<>();
        for(int i=0;i<x.length();i++){
            hs.add(x.charAt(i));
        }
        return hs.size();
    }
    static int check(String s){
        int tot_dist=count_dist(s);
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                int d_size_n = count_dist(s.substring(i,j));
                if(d_size_n==tot_dist) {
                    hs.add(s.substring(i, j).length());
                }
            }
        }
        return Collections.min(hs);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(check(s));
    }
}
