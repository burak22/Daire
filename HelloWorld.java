import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Yarıçap Giriniz: ");
        float r = input.nextFloat();
        System.out.print("Merkez Açı Giriniz: ");
        float a = input.nextFloat();

        float alan = (3.14*r*r*a)/360;
        System.out.println("Daire Diliminin - Dairenin Alanı:" + alan);
    }


}
