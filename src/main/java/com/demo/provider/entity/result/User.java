package com.demo.provider.entity.result;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.demo.provider.annotation.EncryptTransaction;
import com.demo.provider.annotation.SensitiveData;
import lombok.Data;

@Data
@TableName(value = "users")
@SensitiveData
public class User {

    @TableId(type = IdType.AUTO)
    private Integer id;
    private String userName;
    @EncryptTransaction
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
