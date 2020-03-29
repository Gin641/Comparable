import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        comparable[] circles = new comparable[3];
        circles[0] = new comparable(4.2);
        circles[1] = new comparable(6.2, "blue", false);
        circles[2] = new comparable();
        System.out.println("pre-sorted");
        for (comparable circle : circles){
            System.out.println(circle);
        }

        Arrays.sort(circles);
        System.out.println("after - sorted: ");
        for (comparable circle : circles){
            System.out.println(circle);
        }
    }
}
