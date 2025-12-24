public class PairOfNumbers {
    public static void PrintPairs(int number[]) {
        int TotalPairs = 0;
        for(int i=0;i<number.length;i++){
            int curr = number[i];  //2,4,6,8,10
            for(int j=i+1;j<number.length;j++){
                System.out.print("(" + curr + "," + number[j] + ")");
                TotalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs = " +TotalPairs);
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        PrintPairs(number);
    }
}
