public class Knapsack {
    private static int [] weights;
    private static int [] values;
    private static int capacity;
    static int [][]opt;

    public static int knapsack(int []weights, int []values, int capacity){
        Knapsack.weights=weights;
        Knapsack.values=values;
        Knapsack.capacity=capacity;
        Knapsack.opt=new int[values.length+1][capacity+1];
        return knapsackSolver(values.length,capacity); //wir rufen KnapsackSolver auf
    }

    public static int  knapsackSolver(int i, int x){
        if (i==0){ //base case (ohne diese Kondition kriegen wir unendliche Schleife also das Programm hoert nie auf)
            return 0;
        }
        //nach opt Definition in der Aufgabe
        if(opt[i][x]!=0){
            return opt[i][x];
        }
        if (weights[i-1]>x){
            opt[i][x]= knapsackSolver(i-1,x);
        }
        else {
            opt[i][x]= Math.max(knapsackSolver(i-1,x), knapsackSolver(i-1,x-weights[i-1])+values[i-1]);
        }
        return opt[i][x];
    }

    public static void main (String[]args){
        int[]weights={9,15,16,10,12,10,30,13,17,20,10,16,15,9,6,11,1};
        int[]values={10,9,6,4,4,4,10,6,8,7,8,5,6,3,2,4,4};
        capacity=96;
        System.out.println( "die optimale Wert ist "+knapsack(weights,values,capacity));
    }
}
