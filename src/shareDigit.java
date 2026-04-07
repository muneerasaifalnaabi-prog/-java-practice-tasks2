public class shareDigit {
    public static void main(String[] args) {
        System.out.println(shareDigit(12,23));
        System.out.println(shareDigit(12,43));

    }
    public static boolean shareDigit(int a, int b){
        int leftA = a / 10;
        int rightA = a % 10;
        int leftB = b / 10;
        int rightB = b % 10;

        if( leftA == leftB || leftA == rightB || rightA == leftB || rightA == rightB){
            return true;
        }
        return false;
    }
}
