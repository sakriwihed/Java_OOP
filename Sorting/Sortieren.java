public class Sortieren{
    public static void sort(int[] A) {
        if (A == null || A.length <= 1) { // Nichts zu sortieren, wenn das Array leer oder nur ein Element hat
            return;
        }
        else{
        int n = A.length;
            for (int i = n-1; i>=0; i--) { 
                for (int j =0; j <= i-1; j++) {
                    if (A[j] > A[j+1]) {
                        //machen wir eine Permutation
                        int temp =A[j];
                        A[j] =A[j+1];
                        A[j+1] =temp;
                    }
                }
            }
        }
    }
    

    public static void main(String[] args) {
        int[] array={9,2,7,0,1,4,5,7,6,3,9,11};
        System.out.println("vor dem Sortieren:");
        for(int counter_1 : array){ // to run the array
            System.out.print(counter_1+" ");
        }
        System.out.println();

        sort(array);
        System.out.println("nach dem Sortieren:");
        for(int counter_2 : array){
            System.out.print(counter_2 +" ");
        }
        System.out.println();
    }
}