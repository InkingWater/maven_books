package xyz.lightseekers.maven_books.web.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.lightseekers.maven_books.bean.Wqrbook;
import xyz.lightseekers.maven_books.util.Message;
import xyz.lightseekers.maven_books.util.MessageUtil;

@RestController
@RequestMapping("/wqr1")
@Api(description = "王秋润1号的图书管理控制器")
public class WqrController_first {
    //添加
    @PostMapping("/add")
    @ApiOperation(value = "添加图书")
    public Message add(Wqrbook wqrbook){
        return MessageUtil.success("添加成功");
    }
    //删除
    @GetMapping("/delete")
    @ApiOperation(value = "删除图书")
    public Message delete(Wqrbook wqrbook){
        return MessageUtil.success("删除成功");
    }
    //修改
    @PostMapping("/change")
    @ApiOperation(value = "修改图书")
    public Message change(Wqrbook wqrbook){
        return MessageUtil.success("修改成功");
    }
    //查询
    @GetMapping("/search")
    @ApiOperation(value = "查询图书")
    public Message search(Wqrbook wqrbook){
        return MessageUtil.success("查询成功");
    }
}
