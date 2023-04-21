package com.green.java.ch04;

public class FlowEx18_gugudan2Method {
    public static void main(String[] args) {
        gugudan(4);
        gugudan(5);

        //아규먼츠, 인수값
        gugudan(2, 8); //단이 바뀌면 개행 한번 더
        gugudan(5, 7); //단이 바뀌면 개행 한번 더
    }

    public static void gugudan(int sDan, int eDan) {//매개변수(파라미터,인자값)가 gugudan 으로 보내는 값은 아규먼츠
        for (int i = sDan; i <= eDan; i++) {
            gugudan(i);

        }
    }

    public static void gugudan(int dan) {
        for(int i=1; i<10; i++) {
            System.out.printf("%d X %d = %d\n", dan, i, dan * i);
        }
        System.out.println();
    }
}