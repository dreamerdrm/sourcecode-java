
public class FizzBuzz {

    public String sendAndReturn(int number) {
        String result = null;
        if((number%3==0) && (number%5==0)) {
            result = "FizzBuzz";
        }else if(number%3 == 0) {
            result = "Fizz";
        }else if(number%5 == 0) {
            result = "Buzz";
        }else {
            result = Integer.toString(number);
        }
        
        return result;
    }
}