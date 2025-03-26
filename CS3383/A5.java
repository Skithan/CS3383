import java.util.*;
import java.io.*;


public class A5 {
    
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> partitions = new ArrayList<>();
        ArrayList<String> curPart = new ArrayList<>();        
        String s = "aab";
        int index = 0;
   
        partition(s, index, partitions, curPart);
        System.out.println(partitions);

    }


    public static void partition(String s, int index, ArrayList<ArrayList<String>> partitions, ArrayList<String> curPart) {
       
        String currentPart = "";
        int n = s.length();

        if(index == n) {
            partitions.add(new ArrayList<String>(curPart));
            return;
        }
  
        for(int i = index; i < n; i++) {

            currentPart += s.charAt(i);            

            if(isPal(currentPart)){

                curPart.add(currentPart);
                partition(s, i++,partitions, curPart);
                curPart.remove(curPart.size()-1);
            }
        }
        

    }
    public static boolean isPal(String s) {
        int n = s.length();
        int start = 0;
        int end = n-1;
        while(start < end) {
            if(s.charAt(start) != s.charAt(end))
                return false;

            start++;
            end--;
        }
        return true;
    }

}
    
