public class EX1 {
    public static void main (String[] args) {
        RunTimeParameters obj1 = RunTimeParameters.getInstance();
        System.out.println("Initial Values: ");
        System.out.println("File name = " + obj1.getFilename());
        System.out.println("Number of users = " + obj1.getNumberOfUsers());
        System.out.println("Sound is on = " + obj1.soundIsOn());
        System.out.println("Values after change: ");
        obj1.setSoundOn();
        obj1.setFileName("newfile.dat");
        obj1.setNumberOfUsers(23);
        System.out.println("File name = " + obj1.getFilename());
        System.out.println("Number of users = " + obj1.getNumberOfUsers());
        System.out.println("Sound is on = " + obj1.soundIsOn());
    }
}
