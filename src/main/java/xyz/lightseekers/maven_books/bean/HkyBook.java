package xyz.lightseekers.maven_books.bean;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class HkyBook {
    @ApiModelProperty(value = "图书名称")
    private String name;
    @ApiModelProperty(value = "价格")
    private int price;
    @ApiModelProperty(value = "编号")
    private int ID;

    public HkyBook(String name,int price,int ID)
    {
        this.name = name;
        this.price = price;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }



}
