package com.example.hajibootdi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 * JavaConfig(Bean(実装)定義ファイル)
 */

// @Configurationをつけることで「JavaConfig」用のクラスであることを示す。
@Configuration
public class AppConfig {

    /*
     * 「DIコンテナ」に管理させたい実装クラスを生成するメソッドに「@Bean」を付ける。
     * デフォルトでは「メソッド名」が「Bean名」になる。
     * また、デフォルトではこのメソッドで生成されたインスタンスはsingletonとして管理され
     * 「DIコンテナ」につき「1つのインスタンス」のみ生成される。
     */
    @Bean
    Calculator calculator() {
        // AddCalculatorインスタンスがCalculator型でCalculatorという名前で
        // 「DIコンテナ」にsingletonとして管理される。
        return new AddCalculator();
    }

    @Bean
    ArgumentResolver argumentResolver() {
        return new ScannerArgumentResolver();
    }

}
