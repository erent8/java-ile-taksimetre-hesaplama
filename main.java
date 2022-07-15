import java.util.Scanner;

public class Taksimetre
{
    public static void main(String[] args)
    {
        float km, total = 10;
        Scanner inp = new Scanner(System.in);

        System.out.println("Gidilen km =>");
        km = inp.nextFloat();
        total = ((total + (km * 2.20)) < 20) ? 20 : (float) (total + (km * 2.20));

        System.out.println("Total ücret =>" + total);
    }
}
