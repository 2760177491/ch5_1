package com.ch.ch5_1.controller;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.ch.ch5_1.model.Goods;
@Controller
public class TestValidatorController {
    @GetMapping("/testValidator")
    public String testValidator(@ModelAttribute("goodsInfo") Goods goods){
        goods.setGname("商品名初始化");
        goods.setGprice(0.0);
        return "testValidator";
    }
    @PostMapping(value="/add")
    //@Validated({Goods.Add.class})验证add组，可以同时验证多组@Validated({Goods.Add.class, Goods.Update.class})
    public String add(@Validated({Goods.Add.class}) @ModelAttribute("goodsInfo")  Goods goods,BindingResult rs){
        //@ModelAttribute("goodsInfo")与th:object="${goodsInfo}"相对应
        if(rs.hasErrors()){//验证失败
            return "testValidator";
        }
        //验证成功，可以到任意地方，在这里直接到testValidator界面
        return "testValidator";
    }
}
