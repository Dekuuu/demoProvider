package com.demo.provider.entity.result;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "users")
public class User {

    @TableId(type = IdType.AUTO)
    private Integer id;
    private String userName;
    private String userPassword;
    private int age;

    /**
     * 对象被GC时，会调用finalized方法
     *
     * @throws Throwable
     */
    @Override
    protected void finalize() throws Throwable {
        System.out.println("user recycle due to GC");
    }
}
