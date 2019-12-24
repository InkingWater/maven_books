package xyz.lightseekers.maven_books.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.lightseekers.maven_books.bean.HkyBook;
import xyz.lightseekers.maven_books.util.Message;
import xyz.lightseekers.maven_books.util.MessageUtil;

@RestController
@RequestMapping("/hky")
@Api(description = "何恺越的图书管理系统")
public class HkyController {
     @PostMapping("/add")
     @ApiOperation(value = "添加书籍")
         public Message add(HkyBook hkybook)
        {
            return MessageUtil.success("添加成功");
        }

    @PostMapping("/del")
    @ApiOperation(value = "删除书籍")
    public Message del(String id)
    {
        return MessageUtil.success("删除成功");
    }

    @PostMapping("/update")
    @ApiOperation(value = "更新信息")
    public Message update(HkyBook hkybook)
    {
        return MessageUtil.success("更新成功");
    }

    @PostMapping("/check")
    @ApiOperation(value = "查询书籍信息")
    public Message search(String id)
    {
        return MessageUtil.success("查询书籍成功");
    }
}
