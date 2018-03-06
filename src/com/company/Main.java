package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] input = sc.nextLine().split(", ");
        Integer[]array = new Integer[input.length];
        for(int i =0;i < input.length;i++){
            //list.add(Integer.parseInt(input[i]));
            array[i] = Integer.parseInt(input[i]);
        }
        int[]count = new int[16];
        for(int num:array){
            for(int i = 0;i < 16;i++) {
                if ((num & (1 << i)) > 0) {
                    count[i]++;
                }
            }
        }
        for(int i = array.length - 1;i>=0;i--){
            int number = 0;
            for(int bit = 0;bit < 16;bit++){
                if(count[bit] > 0){
                    number |= (1 << bit);
                    count[bit]--;
                }
            }
            array[i] = number;
        }

//        for(int i = 0;i < array.length;i++){
//            for(int k = 0;k < 16;k++) {
//                int row = 0;
//                int mask = 1 << k;
//                while (row < array.length - 1) {
//                    //byte mask = (byte)(1 << k);
//                    Integer num = ((array[row] & mask) >> k);
//                    Integer num2 = ((array[row + 1] & mask) >> k);
//                    if (num == 1 && num2 == 0) {
//                        int numTemp1 = array[row] & ~(1 << k);
//                        //list.remove(row);
//                        array[row] =  numTemp1;
//
//                        int numTemp2 = array[row + 1] | (1 << k);
//                        //list.remove(row + 1);
//                        array[row + 1] =  numTemp2;
//                    }
//                    row++;
//                }
////                int rowLower = array.length - 1;
////                while (rowLower > 0) {
////                    Integer num2 = ((array[rowLower] & mask) >> k);
////                    Integer num = ((array[rowLower - 1] & mask) >> k);
////                    if (num == 1 && num2 == 0) {
////                        int numTemp2 = array[rowLower - 1] & ~(1 << k);
////                        array[rowLower - 1] =  numTemp2;
////                        int numTemp1 = array[rowLower] | (1 << k);
////                        array[rowLower] =  numTemp1;
////                    }
////                    rowLower--;
////                }
//            }
//        }
        for(int i =0;i < array.length;i++){
            if(i < array.length - 1) {
                System.out.print(array[i] + ", ");
            }else{
                System.out.print(array[i]);
            }
        }
    }
}
