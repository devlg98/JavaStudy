package com.company;

public class Main {

    public static void main(String[] args) {
        int j = 0;

        for(int i=10; i <=1000; i++){
            if(isPrime(i)){
                j++;
                System.out.println(isPrime(i) + " Number is: "+ i);
                if(j == 3){
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n){
        if (n == 1){
            return false;
        }

        for(int i=2; i <=n/2; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }
}
