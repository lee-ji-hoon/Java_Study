package 자바의정석.ch13;

class Ex13_2 {
    public static void main(String args[]) {
        long startTime = System.currentTimeMillis();

        for(int i=0; i < 50; i++)
            System.out.print("-");

        System.out.print("소요시간 1:" +(System.currentTimeMillis()- startTime));

        System.out.println();
        for(int i=0; i < 50; i++)
            System.out.print("-");

        System.out.print("소요시간 2:"+(System.currentTimeMillis() - startTime));
        //--------------------------------------------------소요시간 1:1
        //--------------------------------------------------소요시간 2:45
    }
}
