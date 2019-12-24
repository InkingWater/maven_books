package xyz.lightseekers.maven_books.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class Wqrbook {
    @ApiModelProperty(value = "图书编号",required = true)
    private int id;
    @ApiModelProperty(value = "图书名称",required = true)
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Wqrbook{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
