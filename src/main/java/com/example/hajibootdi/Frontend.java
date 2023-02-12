package com.example.hajibootdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Frontend {
    /*
     * 「@Autowire」を付け「DIコンテナ」がインジェクションすべきフィールドであることを示す。
     * DIコンテナは「@Autowire」を付けたフィールドに対して合致する型のオブジェクトを管理内のオブジェクトから探し出してインジェクション(依存性注入)する。(オートワイヤリング)
     */
    //@Autowired
    //ArgumentResolver argumentResolver;
    //@Autowired
    //Calculator calculator;

    //public void run() {
    //    System.out.print("Enter 2 number like 'a b':");
    //    Argument argument = argumentResolver.resolve(System.in);
    //    int result = calculator.calc(argument.getA(), argument.getB());
    //    System.out.println("result = " + result);
    //}

}
