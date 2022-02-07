public class MegaBytesConverter {
 
 
    public static void printMegaBytesAndKiloBytes(int kiloByte){

        if (kiloByte < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaByteInKB = 1024;
            int remainingKiloByte = kiloByte % megaByteInKB;
            int megaByte = (kiloByte - remainingKiloByte) / 1000;
            System.out.println(kiloByte + " KB = " +megaByte + " MB and "+ remainingKiloByte + " KB");
        }
    }
 
 

 
}