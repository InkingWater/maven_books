package xyz.lightseekers.maven_books.bean;

public class WcyBook {
    private String name;
    private String ID;
    private double val;
    private int num;

    public String getName() {
        return name;
    }

    public WcyBook(String name, String ID, double val) {
        this.name = name;
        this.ID = ID;
        this.val = val;
        this.num = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getVal() {
        return val;
    }

    public void setVal(double val) {
        this.val = val;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
