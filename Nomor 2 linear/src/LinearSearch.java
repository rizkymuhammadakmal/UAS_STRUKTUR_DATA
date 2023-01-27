public class LinearSearch {
    public static void main(String[] args) {
        int[] intArray = {12,34,-67,44,66,35,-92,76,62,-99,18,60,56,-97};

        if(liniearSearch(intArray,18) == -1){
            System.out.println("Data tidak ditemukan");
        } else{
            System.out.println("Data ditemukan pada index ke " + liniearSearch(intArray, 18));
        }

    }

    public static int liniearSearch(int[] input, int value){
        for(int i=0; i < input.length; i++){
            if(input[i] == value) {
                return i;
            }
        }
        return -1;
    }
}