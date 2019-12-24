package xyz.lightseekers.maven_books.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

public class WcyBook {
    @ApiModelProperty(value = "图书名称")
    private String name;
    @ApiModelProperty(value = "图书编号")
    private String ID;
    @ApiModelProperty(value = "图书价格")
    private double val;
    @ApiModelProperty(value = "图书数量")
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
