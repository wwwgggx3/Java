package com.green.java.ch05;

public class MultiArrayStudy2 {
    public static void main(String[] args) {
        int[][] mArr = new int[4][3];

//        for(int i=0;i<mArr.length;i++) {
//            for(int z=0;z<mArr[i].length;z++) {
//                mArr[i][z] = i*mArr[i].length+(z+1);
//            }
//        }
        //7~11줄을 더 간단하게
        int num = 1;
        for(int i=0;i<mArr.length;i++) {
            for(int z=0;z<mArr[i].length;z++) {
                mArr[i][z] = num++;
            }
        }

        for(int i=0;i<mArr.length;i++) {
            System.out.printf("{ %d", mArr[i][0]);
            for(int z=1;z<mArr[i].length;z++) {
                System.out.printf(", %d", mArr[i][z]);
            }
            System.out.println(" }");
        }
    }
}
