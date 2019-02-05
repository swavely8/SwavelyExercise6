package com.swavely.Week1;

public class Main {

    public static void main(String[] args) {

        int i = 0;
        while(i <= 9){
            System.out.println(i+1);
            i++;
        }

        for(i =1; i <= 10; i++) {
            System.out.println(i);
        }

        i=1000;
        do{
            System.out.println(i);
            i += 2;
        }while(i<10);

        int[] integers = {1,2,3,4,-1,-2,10};

    }
}
