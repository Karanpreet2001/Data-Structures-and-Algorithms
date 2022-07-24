class ContainerWithMostWater{


    public static void main(String[] args) {
        
        int height[] = {1,8,6,2,5,4,8,3,7};
        int res = maxWater(height);
        System.out.println(res);
    }

    // time complexity - O(N),  Space complexity - 0(1)
    public static int maxWater(int[] height){

        int len = height.length;
        int maxArea =0;
        int left =0, right= len-1;

        while(left < right){
            if(height[left] < height[right]){

                maxArea = Math.max(maxArea, height[left]*(right-left));
                left++;

            }else{

                maxArea = Math.max(maxArea, height[right]*(right-left));
                right--;

            }
        }

        return maxArea;
    }
}