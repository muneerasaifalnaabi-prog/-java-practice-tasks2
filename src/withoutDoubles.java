public class withoutDoubles {
    public static void main(String[] args) {
        System.out.println(withoutDoubles(2,3,true));
        System.out.println(withoutDoubles(3,3,true));
        System.out.println(withoutDoubles(3,3,false));

    }
    public static  int withoutDoubles(int die1, int die2, boolean noDoubles){
       int sum=die1+die2;
        if (noDoubles==false){
            return die1+die2;
        }
        if (noDoubles == true && die1 != die2  ){
            return sum;
        }
        if (noDoubles == true && die1 == die2) {
            die1++;
            if (die1 > 6) {
                die1 = 1;
            }
            return die1 + die2;
        }

        return sum;
    }

    }

