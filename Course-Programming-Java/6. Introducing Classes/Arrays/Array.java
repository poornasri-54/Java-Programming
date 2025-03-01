//Demonstration of One Dimensional Array
class Array{
    public static void main(String[] args){
        //declaring an array even_nums
        int[] even_nums;
        even_nums = new int[10];
        even_nums[0]=2;
        even_nums[1]=4;
        even_nums[2]=6;
        even_nums[3]=8;
        even_nums[4]=10;
        even_nums[5]=12;
        even_nums[6]=14;
        even_nums[7]=16;
        even_nums[8]=18;
        even_nums[9]=20;
        //changed
        System.out.println("Fifth even number is:"+even_nums[4]);
    }
}
/*output : Fifth even number is:10 */