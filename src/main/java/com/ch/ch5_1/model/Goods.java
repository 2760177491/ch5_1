package com.ch.ch5_1.model;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
@Data
public class Goods {
    //add组
    public interface Add{}
    //update组
    public interface Update{}
    @NotBlank(groups = {Add.class, Update.class}, message="商品名必须输入")
    @Length(groups = {Add.class} ,min=1, max=5, message="商品名长度在1到5之间")
    private String gname;
    @Range(groups = {Add.class}, min=0, max=100, message="商品价格在0到100之间")
    private double gprice;
}
