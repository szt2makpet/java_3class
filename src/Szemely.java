public class Szemely {
    String keresztnev;
    String vezeteknev;
    int szulev = 0;
    int szulhonap = 0;
    int szulnap = 0;

    public void printSzemely(){
        System.out.printf("Név: %S %S %d %d %d", keresztnev , vezeteknev , szulev, szulhonap, szulnap);

    }

    public String getKeresztnev() {
        return keresztnev;
    }

    public void setKeresztnev(String keresztnev) {
        this.keresztnev = keresztnev;
    }

    public String getVezeteknev() {
        return vezeteknev;
    }

    public void setVezeteknev(String vezeteknev) {
        this.vezeteknev = vezeteknev;
    }

    public int getSzulev() {
        return szulev;
    }

    public void setSzulev(int szulev) {
        this.szulev = szulev;
    }

    public int getSzulhonap() {
        return szulhonap;
    }

    public void setSzulhonap(int szulhonap) {
        this.szulhonap = szulhonap;
    }

    public int getSzulnap() {
        return szulnap;
    }

    public void setSzulnap(int szulnap) {
        this.szulnap = szulnap;
    }
}
