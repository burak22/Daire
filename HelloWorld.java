import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float Pi = 3.14f;

        System.out.print("Yarıçap Giriniz: ");
        float r = input.nextFloat();
        System.out.print("Merkez Açı Giriniz: ");
        float a = input.nextFloat();

        float alan = (Pi*r*r*a)/360;
        System.out.println("Daire Diliminin - Dairenin Alanı:" + alan);
    }


}