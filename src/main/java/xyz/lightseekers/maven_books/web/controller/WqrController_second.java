package xyz.lightseekers.maven_books.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.lightseekers.maven_books.util.Message;
import xyz.lightseekers.maven_books.util.MessageUtil;

@RestController
@RequestMapping("Wqr2")
@Api(description = "王秋润2号的图书管理控制器")
public class WqrController_second {
    //添加
    @PostMapping("/add")
    @ApiOperation(value = "添加图书")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "图书编号", paramType = "query", dataType = "int", required = true),
            @ApiImplicitParam(name = "name", value = "图书名称", paramType = "query", dataType = "String", required = true)
    })
    public Message add(int id,String name) {
        return MessageUtil.success("添加成功");
    }
    //修改
    @PostMapping("/change")
    @ApiOperation(value = "修改图书")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "图书编号", paramType = "query", dataType = "int", required = true),
            @ApiImplicitParam(name = "name", value = "图书名称", paramType = "query", dataType = "String", required = true)
    })
    public Message change(int id,String name) {
        return MessageUtil.success("修改成功");
    }
    //删除
    @GetMapping("/delete")
    @ApiOperation(value = "删除图书")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "图书编号", paramType = "query", dataType = "int", required = true),
            @ApiImplicitParam(name = "name", value = "图书名称", paramType = "query", dataType = "String", required = true)
    })
    public Message delete(int id,String name) {
        return MessageUtil.success("删除成功");
    }
    //查询
    @GetMapping("/search")
    @ApiOperation(value = "查询图书")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "图书编号", paramType = "query", dataType = "int", required = true),
            @ApiImplicitParam(name = "name", value = "图书名称", paramType = "query", dataType = "String", required = true)
    })
    public Message search(int id,String name) {
        return MessageUtil.success("查询成功");
    }
}