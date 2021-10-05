package com.github.mathan26.ds.array;

/*
Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
Note that elements beyond the length of the original array are not written.
Do the above modifications to the input array in place and do not return anything.

Example 1:

Input: arr = [1,0,2,3,0,4,5,0]
Output: [1,0,0,2,3,0,0,4]
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
*/

import java.util.ArrayList;
import java.util.List;

public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {




        // Inline operation

        int possibleDups = 0;
        int length = arr.length - 1;

        for (int left = 0; left <= length - possibleDups; left++) {  // length - possibleDups No need to check after this condition
            if(arr[left] == 0){
                //edge case if last element is 0 don't have space
                // so just copy it without duplication.
                if(left == length - possibleDups){
                    arr[length] = 0;
                    length -=1;   // reduce the length
                    break;
                }
                possibleDups++;
            }

        }

        // start backwards from the last element which would be part of new array.

        int last = length - possibleDups;

        for (int i = last; i >= 0; i--) {
            if(arr[i] == 0) {
                arr[i + possibleDups] = 0;
                possibleDups--; // reduce it
                arr[i + possibleDups] = 0;
            }else {
                arr[i + possibleDups] = arr[i];
            }
        }



        // Using extra space

//         int[] dest = new int[arr.length];
//         int d=0;
//         for (int i = 0; d < arr.length; i++) {
//             if(arr[i] == 0){
//                 dest[d]=0;
//                 d +=1;
//                 dest[d]=0;
//             }else{
//                 dest[d]=arr[i];
//             }
//             d +=1;
//         }


//         for(int r:dest){
//             System.out.print(r +" ");
//         }


    }
}
