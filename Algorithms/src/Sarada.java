<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 55b6fee (Practiced insertion sort)
public class Sarada
{
	public static void main(String[] args) {
		int arr[]={5,3,4,1,2};
<<<<<<< HEAD
		Cyclic(arr);
=======
		selection(arr);
>>>>>>> 55b6fee (Practiced insertion sort)
		for(int x: arr)
		{
		    System.out.print(x+" ");
		}
	}
	
<<<<<<< HEAD
	// public static void selection(int arr[]){
	//     for(int i=0;i<arr.length;i++){
	//         int last=arr.length-i-1;
	//         int max=getMaxIndex(arr,0,last);
	//         swap(arr,max,last);
	//     }
	// }
	
	// public static int getMaxIndex(int arr[], int start, int end){
	//     int max=0;
	//     for(int i=start;i<=end;i++){
	//         if(arr[i]>arr[max]) max=i;
	//     }
	//     return max;
	// }

	// public static void Insertion(int arr[]){
	// 	for(int i=0;i<=arr.length-2;i++){
	// 		for(int j=i+1;j>0;j--){
	// 			if(arr[j]<arr[j-1])swap(arr,j-1,j);
	// 			else break;
	// 		}
	// 	}
	// }

	public static void Cyclic(int arr[]){
		for(int i=0;i<arr.length;){
			if(arr[i]!=i+1){
				swap(arr, i, arr[i]-1);
			}
			else i++;
		}
=======
	public static void selection(int arr[]){
	    for(int i=0;i<arr.length;i++){
	        int last=arr.length-i-1;
	        int max=getMaxIndex(arr,0,last);
	        swap(arr,max,last);
	    }
	}
	
	public static int getMaxIndex(int arr[], int start, int end){
	    int max=0;
	    for(int i=start;i<=end;i++){
	        if(arr[i]>arr[max]) max=i;
	    }
	    return max;
>>>>>>> 55b6fee (Practiced insertion sort)
	}
	
	public static void swap(int arr[],int first,int second){
	    int temp=arr[first];
	    arr[first]=arr[second];
	    arr[second]=temp;
	}
<<<<<<< HEAD
}
=======
public class Sarada {
    public static int SaradaSearch(int arr[], int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
            return i;
        }
        return -1;
    }

    static int search(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        int mid;
        while(start<=end){
            mid= (start+end)/2;
            //mid=start+(start+end)/2;

            // //array sorted in ascending order
            // if(arr[mid]==target)
            // return mid;
            // else if(arr[mid]>target)
            // end=mid-1;
            // else
            // start=mid+1;

            // //array sorted in decsending order
            // if(arr[mid]==target)
            // return mid;
            // else if(arr[mid]>target)
            // start=mid+1;
            // else
            // end=mid-1;

            //order agnostic Binary Search
            if(arr[start]>arr[end]){
                mid= (start+end)/2;
                if(arr[mid]==target)
                return mid;
                else if(arr[mid]>target)
                start=mid+1;
                else
                end=mid-1;
            }

            else{
                mid= (start+end)/2;
                if(arr[mid]==target)
                return mid;
                else if(arr[mid]>target)
                end=mid-1;
                else
                start=mid+1;
            }


        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(search(arr,5));
    }
}

