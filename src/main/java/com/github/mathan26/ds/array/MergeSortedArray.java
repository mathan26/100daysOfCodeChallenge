package com.github.mathan26.ds.array;


        /*
        Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        Output: [1,2,2,3,5,6]
        Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
        The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

        */

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int last = m + n -1;

        // Merge in reverse order
        while(m > 0 && n > 0){

            if(nums1[m-1] < nums2[n-1]) {
                nums1[last] = nums2[n-1];
                n--;
            }else {
                nums1[last] = nums1[m-1];
                m--;
            }

            last--;
        }


        //fill the remaining leftover num2 elements

        while(n > 0){
            nums1[last] = nums2[n-1];
            last--;
            n--;
        }


        // Using extra space


        // [1,2,3,0,0,0]
        // 3
        // [2,5,6]
        // 3

//         int[] temp = new int[m + n];
//         int m2 = 0;
//         int n2 = 0;
//         int start = 0;
//         while(m > m2  && n > n2) {
//             if(nums1[m2]<nums2[n2]){
//                 temp[start] = nums1[m2];
//                 start++;
//                 m2++;
//             } else {
//                 temp[start] = nums2[n2];
//                 start++;
//                 n2++;
//             }
//         }

//         while(m > m2){
//             temp[start] = nums1[m2];
//             m2++;
//             start++;
//         }

//           while(n > n2){
//             temp[start] = nums2[n2];
//             n2++;
//             start++;
//         }

//         for(int i : temp){
//             System.out.print(i + " ");
//         }
    }
}
