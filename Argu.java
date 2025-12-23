public class Argu {
    public static void update(int mark[],int nonchangeble) { //Call by reference
        nonchangeble = 10;
        for(int i=0;i<mark.length;i++){
            mark[i] = mark[i]+1;
        }
    }
    public static void main(String[] args) {
        int mark[] = {97,98,99};
        int nonchangeble = 5;
        update(mark,nonchangeble);
        System.out.println(nonchangeble);
        
        //Print our mark
        for(int i=0;i<mark.length;i++){
            System.out.print(mark[i]+" ");
        }
        System.out.println();
    }
}
