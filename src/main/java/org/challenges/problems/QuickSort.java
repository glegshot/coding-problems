/*
package org.challenges.problems;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {

    public void sortEfficient(int[] array, int low, int high){

        int pivot = array[high-1];

        int i = low - 1;
        for(int j = 0;j<high-1;j++){
            if(array[j] < array[pivot]){
                i++;
                swap(array[i],array[j]);
            }
        }
        swap(array[i+1],array[pivot]);

        sortEfficient(array,low,i+1);
        sortEfficient(array,i+2,high);


    }


    public List<Integer> sort(List<Integer> array, int low, int high){

        if(array.size() <= 1){
            return array;
        }

        int pivotIndex = high-1;
        List<Integer> array2 = new ArrayList<>();
        List<Integer> array1 = new ArrayList<>();

        for(int i = 0;i<high;i++){
            if(array.get(i) < array.get(pivotIndex)){
                array1.add(array.get(i));
            }else if(array.get(i) > array.get(pivotIndex)){
                array2.add(array.get(i));
            }
        }

        array1 = sort(array1,0,array1.size());
        array2 = sort(array2,0,array2.size());

        array1.add(array.get(pivotIndex));
        for(int i = 0;i<array2.size();i++){
            array1.add(array2.get(i));
        }

        return array1;

    }



}
*/
