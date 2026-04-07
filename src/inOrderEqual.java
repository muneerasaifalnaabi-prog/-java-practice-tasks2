public class inOrderEqual {
    public static void main(String[] args) {
        System.out.println(inOrderEqual(2,5,11,false));
        System.out.println(inOrderEqual(5,7,6,false));


    }
    public  static boolean inOrderEqual(int a, int b, int c, boolean equalOk){
        if (equalOk==false){
            if (a < b && b < c ){
                return true;
            }
        }
        if (equalOk == true){
            if ( a <= b && b <= c  ){
                return true;
            }
        }
        return false;
    }
}
