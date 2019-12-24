package xyz.lightseekers.maven_books.web.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.lightseekers.maven_books.bean.MjxBook;
import xyz.lightseekers.maven_books.util.Message;
import xyz.lightseekers.maven_books.util.MessageUtil;

@RestController
@Api(description = "马嘉星的图书管理系统")
@RequestMapping("/mjx")
public class MjxController {

    @PostMapping("/add")
    public Message add(MjxBook mjxBook){
            return MessageUtil.success("图书添加成功");
    }


    @GetMapping("/delete")
    @ApiOperation(value = "删除图书")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "bookID",value = "图书编号",paramType = "query",dataType = "int"),
            @ApiImplicitParam(name = "bookName",value = "图书名称",paramType = "query",dataType = "string")
    })
    public Message delete(int bookID, String bookName){
          return MessageUtil.success("图书删除成功");
    }

    @PostMapping("/modify")
    @ApiOperation(value = "修改学生信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "bookID",value = "图书编号",paramType = "query",dataType = "int"),
            @ApiImplicitParam(name = "bookName",value = "图书名称",paramType = "query",dataType = "string")
    })
    public Message modify(int bookID, String bookName){
        return MessageUtil.success("图书信息修改成功");
    }

    @GetMapping("/search")
    public Message search(MjxBook mjxBook){
        return MessageUtil.success("图书查询成功");
    }
}
