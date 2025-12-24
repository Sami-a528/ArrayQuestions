public class LinearSearch {
    public static int Search(int number[],int key) {
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10,12,14,16};
        int key = 10;
        int idx = Search(number, key);
        if(idx==-1){
            System.out.println("Not Found");
        }else{
            System.out.println("key is found at idx : " +idx);
        }
    }
}
