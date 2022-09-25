public class RunTimeParameters {

    private static RunTimeParameters instance;
    private String fileName = "CFile.dat";
    private int numberOfUsers = 27;
    private boolean soundOn = false;

    private RunTimeParameters() {
    }

    public static RunTimeParameters getInstance() {
        if (instance == null) {
            instance = new RunTimeParameters();
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
