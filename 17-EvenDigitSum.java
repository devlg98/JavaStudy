public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if(number<0){
            return -1;
        }
        int sum =0;
        while(number>0){
            int digit = number % 10;
            if(number%2==0){
                sum+= digit;
                System.out.println(digit);
            }
            number /=10;
        }
        return sum;
    }
}