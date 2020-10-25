package home.work;

public class lesson3 {
    public static void main(String[] args) {
        //Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int f = a * (b + (c / d));
        System.out.println(f);
    }
}
