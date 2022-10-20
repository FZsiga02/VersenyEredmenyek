package hu.petrik.oop.versenyeredmenyek;

public class Eredmeny implements Comparable<Eredmeny>{
    private String reszIdo;
    private String nev;

    public Eredmeny(String reszIdo, String nev) {
        this.reszIdo = reszIdo;
        this.nev = nev;
    }

    public String getReszIdo() {
        return reszIdo;
    }

    public String getNev() {
        return nev;
    }

    @Override
    public int compareTo(Eredmeny other) {
        String[] thisReszIdok = reszIdo.split(":");
        String[] otherReszIdok = reszIdo.split(":");
        Integer thisPerc = Integer.parseInt(thisReszIdok[0]);
        Integer thisMasodPerc = Integer.parseInt(thisReszIdok[1]);
        Integer otherPerc = Integer.parseInt(otherReszIdok[0]);
        Integer otherMasodPerc = Integer.parseInt(otherReszIdok[1]);

        if (thisPerc.compareTo(otherPerc) == 0){
            return thisMasodPerc.compareTo(otherMasodPerc);
        }
        return thisPerc.compareTo(otherPerc);
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.nev, this.reszIdo);
    }
}
