public class Trapping {
    public static int TrappingWater(int height[]) {
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for(int i=1;i<height.length;i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        int rightMax[] = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWatter = 0;
        for(int i=0;i<height.length;i++){
            int waterLavel = Math.min(leftMax[i], rightMax[i]);
            trappedWatter +=waterLavel-height[i];
        }
        return trappedWatter;
    }
    public static void main(String[] args) {
        int height[] = {4,3,1,5,7,2,6};
        System.out.println(TrappingWater(height));
    }
}
