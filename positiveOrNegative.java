public class positiveOrNegative{
    public static void check(int n){
        if(n>0){
            System.out.println("positive Number");
        }
        else if(n<0){
            System.out.println("negative number");
        }
        else{
            System.out.println("Zero");
        }
    }
    public static void main(String[] args) {
        check(0);
    }
}