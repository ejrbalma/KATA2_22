package javaapplication1;

import java.util.HashMap;

public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] vector = {1, 1, 1, 3, 4, 5, 6, 9, 100,100,-4,-4};

        Histogram histo = new Histogram(vector);
        HashMap<Integer, Integer> histogram = histo.getHito();


   

        for (Integer key : histogram.keySet()) {
            System.out.println(key+ " : "+ histogram.get(key));
        }
        // TODO code application logic here
    }
}
