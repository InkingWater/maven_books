package xyz.lightseekers.maven_books.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @Author: ZhiliangJia
 * @Description:
 * @Date:Create in 16:58 2019/12/24
 * @Modified User:
 */
@ApiModel
public class JzlBook implements Serializable {
    @ApiModelProperty(value = "图书编号")
    private String id;
    @ApiModelProperty(value = "图书名")
    private String name;

    @Override
    public String toString() {
        return "JzlBook{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
