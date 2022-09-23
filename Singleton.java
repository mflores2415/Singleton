public class Singleton {

    private static Singleton instance;
    private String fileName = "CFile.dat";
    private int numberOfUsers = 27;
    private boolean soundOn = false;

    private Singleton () {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String getFilename() {
        return this.fileName;
    }

    public int getNumberOfUsers() {
        return this.numberOfUsers;
    }

    public boolean soundIsOn() {
        return this.soundOn;
    }
    public void setSoundOn() {
        soundOn = true;
    }

    public void setSoundOff() {
        soundOn = false;
    }

    public void setFileName(String fN){
        fileName = fN;
    }

    public void setNumberOfUsers(int nU) {
        numberOfUsers = nU;
    }
}
