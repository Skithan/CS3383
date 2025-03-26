import java.util.*; 

public class A1 {
    public static void main(String[] args) {    
        
        int[] A = {1, 2, 3, 1, 3, 6, 6}; //test array
        myFunc(A);
    }
    public static void myFunc(int[] A){        

        ArrayList<Integer> dupes = new ArrayList<Integer>();//holds duplicates
        int countMatches = 0;

        for(int i = 0; i < A.length; i++){ 

            for(int j = 0; j < A.length; j++){ //iterate through every element in the test array

                if(A[i] == A[j]){ //if there are more than 1 matches there is a dupilcate

                    countMatches++;
                }

            }  

            if(countMatches > 1 && dupes.indexOf(A[i]) == -1){ //if there is a duplicate not in the dupes arraylist add it

                dupes.add(A[i]);
                countMatches = 0;
            }
        }
        System.out.println(dupes); //print duplicates
    }    
}
