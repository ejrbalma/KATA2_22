package javaapplication1;

import java.util.HashMap;

public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Integer[] vector = {1, 1, 1, 3, 4, 5, 6, 9, 100,100,-4,-4};

        String [] vector1 = {"Ana", "Juan", "Pedro", "Lucia","Ana", "Juan","Ana", "Juan"};
        
        
        //Histogram histo = new Histogram(vector1);
Histogram <String> histogram = CalculaHistogram.computeHisto(vector1);
        


   

        for (Object key : histogram.keySet()) {
            System.out.println(key+ " : "+ histogram.get(key));
        }
        // TODO code application logic here
    }
}
