package com.yzm.safety_protection.config;

import com.baomidou.mybatisplus.core.toolkit.AES;

public class RandomKey {

    private static final String url = "jdbc:mysql://192.168.145.11:3306/demo?useUnicode=true&characterEncoding=utf8&useSSL=false&allowMultiQueries=true&zeroDateTimeBehavior=convertToNull&serverTimezone=Asia/Shanghai";
    private static final String username = "root";
    private static final String password = "1234";

    public static void main(String[] args) {
        // 生成秘钥
        String randomKey = AES.generateRandomKey();
        System.out.println("秘钥：" + randomKey);
        // 加密
        System.out.println("加密的url：" + AES.encrypt(url, randomKey));
        System.out.println("加密的username：" + AES.encrypt(username, randomKey));
        System.out.println("加密的password：" + AES.encrypt(password, randomKey));

        //秘钥：9c1542e995619930
        //加密的url：KD6cCIsiOCpZKFciVXEjrMNltsTwvwytxLNk/X+zIvqunyZ7cwv8mwezvp0pKJ/0kWTA4qufpJJ41TCsKl6VS4sPAzeSrjCldAQtvg97u0FXNeFxvetsOnDJOzx/KxFeracbzpKk+PNrMOaqAglbeEDE4+6uqGPull+3iTISpb/FWQAEHqZWF/OTF2R84tMQ/7quJ7RCWqZ3JctmociEndyNApW6peWtuvZtXdY/KXQ9DPhbBk+NnlcQP6UbWyiW
        //加密的username：2by98mD+a42CcDI4ADFY0A==
        //加密的password：YBpc8qKII2CBDJIsYE82jw==

    }

}
