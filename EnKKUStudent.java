package exercise;

class EnKKUStudent extends KKUStudent {
    protected int gear;

    EnKKUStudent(String name) {
        super(name);
    }

    public void setGearNumber(int gearFromOtherFile) {
        gear = gearFromOtherFile;
    }

    public int getGearNumber() {
        return gear;
    }

    public String toString() {
        return name + " is a KKU Engineering student with gear number as " + gear;
    }
}
