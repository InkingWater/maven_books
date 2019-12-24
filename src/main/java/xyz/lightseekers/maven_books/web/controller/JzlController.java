package xyz.lightseekers.maven_books.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.lightseekers.maven_books.bean.JzlBook;
import xyz.lightseekers.maven_books.util.Message;
import xyz.lightseekers.maven_books.util.MessageUtil;

/**
 * @Author: ZhiliangJia
 * @Description:
 * @Date:Create in 16:57 2019/12/24
 * @Modified User:
 */
@RestController
@RequestMapping("/jzl")
@Api(description = "贾志亮的图书管理系统")
public class JzlController {
    @PostMapping("/add")
    @ApiOperation(value = "添加图书")
    public Message add(JzlBook jzlBook){
        return MessageUtil.success("添加成功");
    }
}
