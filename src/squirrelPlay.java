public class squirrelPlay {
    public static void main(String[] args) {
        System.out.println(squirrelPlay(70,false));
        System.out.println(squirrelPlay(95,false));

    }
    public static boolean squirrelPlay(int temp, boolean isSummer){
        if (isSummer==false){
            if (temp>=60 && temp <=90){
                return true;
            }
        }
        if (isSummer==true){
            if (temp>=60 && temp <=100){
                return false;
            }

        }
        return false;

    }
}
