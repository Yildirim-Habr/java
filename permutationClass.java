static class Permutation {
		   public static int[] swap(int data[], int left, int right) {
		 
			    int temp = data[left];
		        data[left] = data[right];
		        data[right] = temp;
		 
		        return data;
		    }
		 
		    public static int[] reverse(int data[], int left, int right) {
		 
		        while (left < right) {
		        	int temp = data[left];
		            data[left++] = data[right];
		            data[right--] = temp;
		        }
		 
		        return data;
		    }
		 
		    public static boolean nextPermutation(int data[]) {
		        if (data.length <= 1)
		            return false;
		 
		        int last = data.length - 2;
		 
		        while (last >= 0) {
		            if (data[last] < data[last + 1]) {
		                break;
		            }
		            last--;
		        }
		 
		        if (last < 0)
		            return false;
		 
		        int nextGreater = data.length - 1;
		 
		        for (int i = data.length - 1; i > last; i--) {
		            if (data[i] > data[last]) {
		                nextGreater = i;
		                break;
		            }
		        }
		 
		        data = swap(data, nextGreater, last);
		        data = reverse(data, last + 1, data.length - 1);
		        return true;
		    }
		    static boolean prev_permutation(int[] arr) {
			    
			    // Find the non-increasing suffix
				  int n = arr.length;
				  int i = n - 2;
				  while (i >= 0 && arr[i] <= arr[i + 1]) {
				      i--;
				  }
				 
				    // If the entire array is non-increasing, it's the last permutation
				  if (i < 0) {
				      return false;
				  }
				 
				    // Find the rightmost element that's smaller than the pivot
				  int j = n - 1;
				  while (j > i && arr[j] >= arr[i]) {
				      j--;
				  }
				 
				    // Swap the pivot with the rightmost element that's smaller than the pivot
				  swap(arr, i, j);
			 
				  // Reverse the suffix
			      reverse(arr, i + 1, n - 1);
			      return true;
			}
    }
