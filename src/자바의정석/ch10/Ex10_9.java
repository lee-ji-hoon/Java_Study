package 자바의정석.ch10;

import java.util.*;
import java.text.*;

class Ex10_9 {
    public static void main(String[] args) {
        DateFormat df  = new SimpleDateFormat("yyyy년 MM월 dd일");
        DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");

        try {
            Date d = df.parse("2022년 07월 07일");
            System.out.println(df2.format(d));
        } catch(Exception ignored) {}
    } // main
}
