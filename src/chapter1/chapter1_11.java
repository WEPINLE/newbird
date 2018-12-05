package chapter1;

public class chapter1_11 {
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            System.out.println("第"+i+"年"+(310032486+(i*365*24*60*60/7)-(i*365*24*60*60/13)+(i*365*24*60*60/45))+"人");
        }
    }
}
