public class Matrix{
 
    public static int[][] transpose(int[][] matrix){
        if (matrix ==null || matrix.length==0){ 
            return null;
        }
        int Zeile=matrix.length;
        int Spalte=matrix[0].length;
        int [][]NewMatrix= new int [Spalte][Zeile];
        for (int i=0;i<Zeile;i++){
            for (int j=0;j<Spalte; j++){
                NewMatrix[j][i]=matrix[i][j];
            }
        }
        return NewMatrix;
    }

     /**
     * diese Methode macht die Multiplikation
     * @param matrixA 
     * @param matrixB
     * @return
     */
    public static int [][] mult(int [][] matrixA,int [][]matrixB){
        int [][] tab=new int [matrixA.length][matrixB[0].length];
        if(matrixA[0].length!=matrixB.length){ 
            System.out.println("die Dimensionen passen nicht zusammen");
            return null; // wenn die Dimensionen nicht zusammen passen , geben wir eine Null Matrix zurueck
        }
        else {
            System.out.println("das ist die Multiplikation beide Matrizen:"); // wenn alles richtig ist , drueckt die Methode die multiplizierende Matrix
            for(int i=0;i<matrixA.length;i++){
                for (int j=0;j<matrixB[0].length;j++){
                    for(int k=0;k<matrixB.length;k++){
                        tab[i][j] += matrixA[i][k] * matrixB[k][j]; // nach der Definition der Multiplikation zweien Matrizen
                    }
                }
            }
            return tab;
        }
    }
    /**
     * diese Methode drueckt jede Matrix , die in Parameter ist 
     */
    public static void printMatrix(int [][]matrix){
        if (matrix == null) {
            System.out.println("keine Matrix zu geben"); 
            return;
        }else {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println(); //println macht einen Zeilenumbruch
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int [][] A=  {{1,2},
                      {4,5},
                      {6,7}};
        int [][] B=  {{1,2,4,6},
                      {5,6,7,1},
                      {1,1,1,1},
                      {2,2,2,2}};
        int [][] C=  {{1,2,4,6},
                      {5,6,7,1}};
                      
        System.out.println("hier sehen Sie die Transpose von A:");
        printMatrix(transpose(A));
        printMatrix(mult(A,B));
        printMatrix(mult(A,C));
    }
}