class binary {
    public static void binarySearch(int arr[], int first, int last, int key){
        int mid = (first + last)/2;
        while( first <= last ){
            if ( arr[mid] < key ){
                first = mid + 1;
            }else if ( arr[mid] == key ){
                System.out.println("Element Ditemukan Pada Index Ke : " + mid);
                break;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if ( first > last ){
            System.out.println("Element Tidak Ditemukan!");
        }
    }
    public static void main(String args[]){
        int arr[] = {21,45,27,66,78};
        int key = 66;
        int last=arr.length-1;
        binarySearch(arr,0,last,key);
    }
}  