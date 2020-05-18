package academy.learnprograming;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int integral = kiloBytes / 1024;
            int  theRemainder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + integral + " MB and " + theRemainder + " KB");
        }
    }
}
