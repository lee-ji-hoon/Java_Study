package 자바의정석.문제풀이.ch5;

class Exercise5_6 {
    public static void main(String args[]) {
        // . 큰 금액의 동전을 우선적으로 거슬러 줘야한다
        int[] coinUnit = {500, 100, 50, 10};
        int money = 2680;

        System.out.println("money=" + money);
        for (int i = 0; i < coinUnit.length; i++) {
            /*
            (1) . 알맞은 코드를 넣어 완성하시오
            */
            System.out.println(coinUnit[i] + "원 : " + money / coinUnit[i] + "개");
            money = money % coinUnit[i];
        }
    } // main
}