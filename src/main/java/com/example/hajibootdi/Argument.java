package com.example.hajibootdi;

import lombok.Data;

/*
 * 「@Data」を付けることで、コンパイル時(classファイル生成時)に、
 * 各フィールドの「getter/setterメソッド」「toStringメソッド」「equalsメソッド」「hashCode」が生成される。
 * (簡潔でスッキリだね)
 * 今回の例では、finalだからsetterは作成されない。
 */
@Data
public class Argument {
    private final int a;
    private final int b;
}
