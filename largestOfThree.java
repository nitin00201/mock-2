public class largestOfThree {
    public static void checkMax(int a, int b,int c){
        if(a<b &&b<c){
            System.out.println(c +" is the largest ");
        }
        else if(b<c &&c<a){
            System.out.println(a +" is the largest");
        }
        else{
            System.out.println(b +" is the largest");
        }
    }
    public static void main(String[] args) {
        checkMax(11,12 , 13);
    }
    
}
