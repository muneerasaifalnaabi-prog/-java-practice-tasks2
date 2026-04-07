public class answerCell {
    public static void main(String[] args) {
        System.out.println(answerCell(false,false,false));
        System.out.println(answerCell(false,false,true));
        System.out.println(answerCell(true,false,true));
    }
    public  static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep){
        if (isAsleep==true){
            return false;
        }
        if (isMorning == true ){
            if ( isMom == true){
                return true;
            }

        }
        if (isMorning == false ){
            return true;
        }
        return false;

    }
}
