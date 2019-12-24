package xyz.lightseekers.maven_books.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.lightseekers.maven_books.bean.JzlBook;
import xyz.lightseekers.maven_books.util.Message;
import xyz.lightseekers.maven_books.util.MessageUtil;

import java.util.HashMap;
import java.util.Map;

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
    public Message add(JzlBook jzlBook) {
        return MessageUtil.success("添加成功");
    }

    @GetMapping("/delete")
    @ApiOperation(value = "删除图书")
    @ApiImplicitParam(name = "id", value = "图书编号", required = true, paramType = "query", dataType = "int")
    public Message delete(int id) {
        return MessageUtil.success("删除成功");
    }

    @PostMapping("/edit")
    @ApiOperation(value = "编辑图书")
    public Message edit(JzlBook jzlBook) {
        return MessageUtil.success("修改成功");
    }

    @GetMapping("/search")
    @ApiOperation(value = "查找图书")
    public Message search() {
        return MessageUtil.success(returnData());
    }

    public Map<String, JzlBook> returnData() {
        Map<String, JzlBook> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(String.valueOf(i), new JzlBook("Book" + i, "Java" + i));
        }
        return map;
    }
}
