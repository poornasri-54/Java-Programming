class example3 {
    public static void main(String[] args){
        int a=2,b=3,c=4;
        if(a>b){
            if(a>c){
                System.out.println("a is the greatest :)");
            }
        }
        else if(b>a){
            if(b>c){
                System.out.println("b is the greatest :)");
            }
        }
        else{
            System.out.println("c is the greatest :)");
        }
    }
}
// output : c is the greatest :)
