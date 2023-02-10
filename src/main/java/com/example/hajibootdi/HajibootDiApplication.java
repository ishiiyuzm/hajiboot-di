package com.example.hajibootdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import java.util.Scanner;

/*
* 「@EnableAutoConfiguration」がSpringBootの自動設定を有効にするためのアノテーション
* 「@Import(AppConfig.class)」はJavaConfigを読み込む為に@Importで@Configurationを付けた対象クラスを指定
*/
@EnableAutoConfiguration
@Import(AppConfig.class)
public class HajibootDiApplication {

	// エントリポイント
	public static void main(String[] args) {

		// 「SpringApplication.run」で「SpringBoot」アプリケーションを起動
		ApplicationContext context = SpringApplication.run(HajibootDiApplication.class, args);

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter 2 numbers lile 'a b':");
		ArgumentResolver argumentResolver = context.getBean(ArgumentResolver.class);
		Argument argument = argumentResolver.resolve(System.in);
		
		// 「getBean」メソッドを用いて「DIコンテナ」から「Calculator型」のインスタンスを生成
		// 「Calculator」の実体は「DIコンテナ」によって解決されapplicationは意識しない。
		Calculator calculator = context.getBean(Calculator.class);
		int result = calculator.calc(argument.getA(), argument.getB()); 

		System.out.println("result = " + result);
	}

}
