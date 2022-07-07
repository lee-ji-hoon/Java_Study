package 자바의정석.ch10;

import java.text.*;

class Ex10_7 {
    public static void main(String[] args) {
        DecimalFormat df  = new DecimalFormat("#,###.##");
        DecimalFormat df2 = new DecimalFormat("#.###E0");

        try {
            Number num = df.parse("1,234,567.89");
            System.out.print("1,234,567.89" + " -> ");

            // 숫자로 변환
            double d = num.doubleValue();
            System.out.print(d + " -> "); // 1234567.89

            // 문자로 변환
            System.out.println(df2.format(num)); // 1.235E6
        } catch(Exception e) {}
    } // main
}
