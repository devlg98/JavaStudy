public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number <0){
            return -1;
        }
        int lastNum = number%10;
        while(number>9){
            number /= 10;
        }
        return lastNum + number;
    }
}