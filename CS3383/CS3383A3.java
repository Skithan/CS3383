import java.util.*; 

public class CS3383A3{

    public static void main(String[] args) {

        ArrayList<Integer> array1 = new ArrayList<Integer>();
        array1.add(5);
        array1.add(10);
        array1.add(20);
        array1.add(15);

        System.out.println("\nThe peaks in array 1 are: ");

        printPeaks(array1);


        ArrayList<Integer> array2 = new ArrayList<Integer>();
        array2.add(10);
        array2.add(20);
        array2.add(15);
        array2.add(2);
        array2.add(23);
        array2.add(90);
        array2.add(67);


        System.out.println("\nThe peaks in array 2 are: ");

        printPeaks(array2);

        System.out.println("\n\n");


        ArrayList<Integer> significantInversions = new ArrayList<Integer>();
        int numInversions = 0;

        significantInversions.add(10);
        significantInversions.add(20);
        significantInversions.add(30);
        significantInversions.add(40);
        significantInversions.add(15);
        significantInversions.add(50);
        significantInversions.add(10);

        numInversions = printSigInvs(significantInversions);

        System.out.printf("the total number of inversions is: %d\n", numInversions);

    }


    public static int printSigInvs(ArrayList <Integer> array){

        int count = 0; 

        for(int i = 0; i < array.size(); i++){

            for(int j = i+1; j < array.size(); j++){

                if(array.get(i) > (2 * array.get(j))){

                    System.out.printf("%d at index %d is a significant inversion to %d at %d\n", array.get(i), i, array.get(j), j);
                    count++;
                }
            }
        }

        
        return count;

    }









    public static void printPeaks(ArrayList <Integer> array){        

        int prev = array.get(0);
        int next = array.get(0);//just initializing next

        for(int i = 1; i < array.size(); i++){

            //set the next val
            if(i != array.size() -1){

                //if not at end of the list 
                next = array.get(i + 1);
            }

            if(i == 1 && prev > array.get(i)){

                //first elem is a peak
                System.out.println(prev);

            }else if(prev < array.get(i) && array.get(i) > next){

                //currrent elem is a peak
                System.out.println(array.get(i));

            }else if(i == array.size() - 1 && array.get(i) < next){

                //last elem is a peak
                System.out.println(next);
            }

            prev = array.get(i); //reset the prev val  

        }

    }
}