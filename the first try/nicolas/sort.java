class sort{
public static int findMin(int[] array, int index)
{
    int min = index - 1;
    if (index < array.length - 1)
        min = findMin(array, index + 1);
    if (array[index] < array[min])
        min = index;
    return min;
}

public static void selectionSort(int[] array)
{
    selectionSort(array, 0);
}

public static void selectionSort(int[] array, int left)
{
    if (left < array.length - 1)
    {
        swap(array, left, findMin(array, left));
        selectionSort(array, left+1);
    }
}

public static void swap(int[] array, int index1, int index2)
{
    int temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
}

//bubble sort
public static int[] bubblesort(int[] numbers) {
    boolean swapped = true;
    for(int i = numbers.length - 1; i > 0 && swapped; i--) {
        swapped = false;
        for (int j = 0; j < i; j++) {
            if (numbers[j] > numbers[j+1]) {
                int temp = numbers[j];
                numbers[j] = numbers[j+1];
                numbers[j+1] = temp;
                swapped = true;
            }
        }
    }
    return numbers;
}

//merge sort
public int[] mergeSort(int array[])
//pre: array is full, all elements are valid integers (not null)
//post: array is sorted in ascending order (lowest to highest)
{
     // if the array has more than 1 element, we need to split it and merge the sorted halves
     if(array.length > 1)
     {
             // number of elements in sub-array 1
             // if odd, sub-array 1 has the smaller half of the elements
             // e.g. if 7 elements total, sub-array 1 will have 3, and sub-array 2 will have 4
             int elementsInA1 = array.length / 2;
             // we initialize the length of sub-array 2 to
             // equal the total length minus the length of sub-array 1
             int elementsInA2 = array.length - elementsInA1;
             // declare and initialize the two arrays once we've determined their sizes
             int arr1[] = new int[elementsInA1];
             int arr2[] = new int[elementsInA2];
             // copy the first part of 'array' into 'arr1', causing arr1 to become full
             for(int i = 0; i < elementsInA1; i++)
                     arr1[i] = array[i];
             // copy the remaining elements of 'array' into 'arr2', causing arr2 to become full
             for(int i = elementsInA1; i < elementsInA1 + elementsInA2; i++)
                     arr2[i - elementsInA1] = array[i];
             // recursively call mergeSort on each of the two sub-arrays that we've just created
             // note: when mergeSort returns, arr1 and arr2 will both be sorted!
             // it's not magic, the merging is done below, that's how mergesort works :)
             arr1 = mergeSort(arr1);
             arr2 = mergeSort(arr2);
             
             // the three variables below are indexes that we'll need for merging
             // [i] stores the index of the main array. it will be used to let us
             // know where to place the smallest element from the two sub-arrays.
             // [j] stores the index of which element from arr1 is currently being compared
             // [k] stores the index of which element from arr2 is currently being compared
             int i = 0, j = 0, k = 0;
             // the below loop will run until one of the sub-arrays becomes empty
             // in my implementation, it means until the index equals the length of the sub-array
             while(arr1.length != j && arr2.length != k)
             {
                     // if the current element of arr1 is less than current element of arr2
                     if(arr1[j] < arr2[k])
                     {
                             // copy the current element of arr1 into the final array
                             array[i] = arr1[j];
                             // increase the index of the final array to avoid replacing the element
                             // which we've just added
                             i++;
                             // increase the index of arr1 to avoid comparing the element
                             // which we've just added
                             j++;
                     }
                     // if the current element of arr2 is less than current element of arr1
                     else
                     {
                             // copy the current element of arr1 into the final array
                             array[i] = arr2[k];
                             // increase the index of the final array to avoid replacing the element
                             // which we've just added
                             i++;
                             // increase the index of arr2 to avoid comparing the element
                             // which we've just added
                             k++;
                     }
             }
             // at this point, one of the sub-arrays has been exhausted and there are no more
             // elements in it to compare. this means that all the elements in the remaining
             // array are the highest (and sorted), so it's safe to copy them all into the
             // final array.
             while(arr1.length != j)
             {
                     array[i] = arr1[j];
                     i++;
                     j++;
             }
             while(arr2.length != k)
             {
                     array[i] = arr2[k];
                     i++;
                     k++;
             }
     }
     // return the sorted array to the caller of the function
     return array;
}

}
