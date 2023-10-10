public class Allat {
 int szemekszama= 0;
 int labakszama= 0;
 String nev = "";

 //get, set | method
    public void printAllat(){
        System.out.printf("Név: %S %d %d ", nev , labakszama , szemekszama);
    }

    public int getSzemekszama() {
        return szemekszama;
    }

    public void setSzemekszama(int szemekszama) {
        this.szemekszama = szemekszama;
    }

    public int getLabakszama() {
        return labakszama;
    }

    public void setLabakszama(int labakszama) {
        this.labakszama = labakszama;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }


}