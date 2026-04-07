//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(fizzString("fig"));
        System.out.println(fizzString("dib"));

        }
    public static String  fizzString(String str){
        if(str.startsWith("f") && str.endsWith("b")){
            return "FizzBuzz";
        } else if (str.startsWith("f")) {
            return "Fizz";

        } else if (str.endsWith("b")) {
            return "Buzz";
            
        }
        return str;
    }

    }

