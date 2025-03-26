

public class A4 {
    public static void main(String[] args) {
        
        String s = "rabbbit";
        String t = "rabbit";

                
        // String s = "ABCDE";
        // String t = "ACE";
        // int sL = s.length();
        // int tL = t.length();

        int num = myFunc(s, t);

        System.out.printf("\nThe number of distinct subsequences of %s in %s is %d", t, s, num);

       
    }

    public static int myFunc(String s, String t){

        int sL = s.length();
        int tL = t.length();
        //set up the array 
        int[][] array = new int[sL + 1][tL + 1];
    
        //fill the first column with zeros
        for (int i = 0; i <= sL; i++) {
            array[i][0] = 1;
        }
        
        //compare strings
        for (int i = 1; i <= sL; i++) {
          for (int j = 1; j <= tL; j++) {

            if (s.charAt(i - 1) == t.charAt(j - 1)) {

                array[i][j] = array[i - 1][j - 1] + array[i - 1][j];

            }
            else {

                array[i][j] = array[i - 1][j];

            }
          }
        }

        return array[sL][tL];
    }
}