package xyz.lightseekers.maven_books.web.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.lightseekers.maven_books.bean.WcyBook;
import xyz.lightseekers.maven_books.util.Message;
import xyz.lightseekers.maven_books.util.MessageUtil;

@RestController
@RequestMapping("/Wcy")
@Api(description = "图书信息控制")
public class WcyController {
    @PostMapping("/add")
    @ApiOperation(value = "添加图书信息")
    public Message add(WcyBook wcyBook){
        return MessageUtil.success("添加成功");
    }

    public Message del(String id){
        return MessageUtil.success("删除id为"+id+"成功");
    }

    public Message update(WcyBook wcyBook){
        return MessageUtil.success("更新成功");
    }

    public Message query(String id){
        return MessageUtil.success("查询id为"+id+"的书籍成功");
    }



}
