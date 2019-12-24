package xyz.lightseekers.maven_books.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel
public class MjxBook  implements Serializable {

    @ApiModelProperty(name = "bookID",value = "图书编号")
    private int bookID;
    @ApiModelProperty(name = "bookName",value = "图书名称")
    private String bookName;

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }


    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "MjxBook{" +
                "bookID=" + bookID +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
