/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import static java.lang.Math.E;

/**
 *
 * @author apple
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {

        //task 1
        Tree<String> tree = new Tree<String>("D");
        tree.addChild(tree.root, "B");
        tree.addChild(tree.root, "E");
        tree.addChild(tree.root, "F");
        tree.addChild(tree.root.children.get(0), "A");
        tree.addChild(tree.root.children.get(0), "C");
        tree.addChild(tree.root.children.get(2), "G");
        tree.order();

        //task 2
        Double[] array1 = RandomArray.fillArray(10);
        Double[] array2 = RandomArray.fillArray(10);

        QuickSort.sort(array1);
        Heapsort.sort(array2);

        System.out.println("\nThe array is sorted by QuickSort:" + QuickSort.isSorted(array1) + "\nThe array is sorted by Heapsort: " + QuickSort.isSorted(array2) + "\n ");

        //Compare the performance of your Heapsort and Quicksort
        long start1, start2;
        long stop1, stop2;
        long elapsedTime1, elapsedTime2;

        long sum1, sum2;
        sum1 = sum2 = 0;
        long avg1, avg2;
        avg1 = avg2 = 0;

        int measurements = 50;
        int arrlen = 10000;

        for (int i = 0; i < measurements; i++) {
            
            array1 = RandomArray.fillArray(arrlen);
            start1 = System.nanoTime();
            QuickSort.sort(array1);//test QuickSort
            stop1 = System.nanoTime();
            elapsedTime1 = stop1 - start1;
            sum1 += elapsedTime1;

            array2 = RandomArray.fillArray(arrlen);
            start2 = System.nanoTime();
            Heapsort.sort(array2);//test HeapSort
            stop2 = System.nanoTime();
            elapsedTime2 = stop2 - start2;
            sum2 += elapsedTime2;

        }
        avg1 = sum1 / measurements;
        avg2 = sum2 / measurements;
        System.out.println("\n Time Performance of QuickSort algorithm:\n " + avg1);
        System.out.println("\n Time Performance of HeapSort algorithm:\n " + avg2);
    }

}
