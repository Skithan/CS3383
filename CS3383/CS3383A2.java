import java.util.*; 

public class CS3383A2{

    public static void main(String[] args) {
    
        ArrayList<Integer> bookHeights = new ArrayList<Integer>();
        bookHeights.add(10); 
        bookHeights.add(9); 
        bookHeights.add(8); 
        bookHeights.add(7); 
        bookHeights.add(6); 
        bookHeights.add(5); 
        bookHeights.add(4); 
        bookHeights.add(3); 
        bookHeights.add(2); 
        bookHeights.add(1); 
        bookHeights.add(10); 
        bookHeights.add(9); 
        bookHeights.add(8); 
        bookHeights.add(7); 
        bookHeights.add(6); 
        bookHeights.add(5); 
        bookHeights.add(4); 
        bookHeights.add(3); 
        bookHeights.add(2); 
        bookHeights.add(1); 
        bookHeights.add(10); 
        bookHeights.add(9); 
        bookHeights.add(8); 
        bookHeights.add(7); 
        bookHeights.add(6); 
        bookHeights.add(5); 
        bookHeights.add(4); 
        bookHeights.add(3); 
        bookHeights.add(2); 
        bookHeights.add(1); 

        //added 30 book heights 
        
        int numBooks = bookHeights.size();
        
        
        // I expect the shelves to be ordered as follows
        // 10 10 10 9 9 9 8 8 8 7 
        // 7 7 6 6 6 5 5 5 4 4 
        // 4 3 3 3 2 2 2 1 1 1 
        //making the expected shelf height 21


        int totShelfHeight; // should be 19

        totShelfHeight = myFunc(numBooks, bookHeights);
        
        System.out.println(totShelfHeight);    
    }

    public static int myFunc(int numBooks , ArrayList <Integer> bookHeights){        


        int totalShelfHeight = 0; 
        int booksPerShelf = numBooks/10; 
        int curBook = 0;
        int isFirstOnShelf = 1; 

        
        for(int i = 0; i < booksPerShelf; i++){ 
            for(int j = 0; j < 10; j++){ 

                curBook = Collections.max(bookHeights);
                bookHeights.remove(Integer.valueOf(curBook));

                if(isFirstOnShelf == 1){                    

                    totalShelfHeight = totalShelfHeight + curBook;
                    isFirstOnShelf = 0;

                }
            }

            isFirstOnShelf = 1;     
        }      

        return totalShelfHeight;
    }    

}
