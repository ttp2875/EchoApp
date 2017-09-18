import java.util.Scanner;
import javax.swing.JOptionPane;

public class EchoApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println ("Enter a byte value ");
        byte byteInput=keyboard.nextByte();

        System.out.println ("Enter a short value ");
        short shortInput=keyboard.nextShort();

        System.out.println ("Enter an interger value ");
        int intInput=keyboard.nextInt();

        System.out.println ("Enter a float value ");
        float floatInput=keyboard.nextFloat();

        System.out.println ("Enter a double value ");
        double doubleInput=keyboard.nextDouble();

        System.out.println ("Enter a character value ");
        char charInput=keyboard.next().charAt(0);

        System.out.println ("Enter a boolean value ");
        boolean booleanInput=keyboard.nextBoolean();

        JOptionPane.showMessageDialog(null, "The byte value is " + byteInput + "\n"
                + "The short value is " + shortInput + "\n"
                + "The interger value is " + intInput + "\n"
                + "The float value is " + floatInput + "\n"
                + "The double value is " + doubleInput + "\n"
                + "The character value is " + charInput + "\n"
                + "The boolean value is " + booleanInput + "\n");
    }
}
