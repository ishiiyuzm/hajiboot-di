package com.example.hajibootdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import java.util.Scanner;

/*
*「@EnableAutoConfiguration」がSpringBootの自動設定を有効にするためのアノテーション
*「@Import(AppConfig.class)」はJavaConfigを読み込む為に@Importで@Configurationを付けた対象クラスを指定(DIコンテナに登録したいBeanを1つ1つ定義するイメージ)
*「@ComponetScan」を付けることでそのクラスのパッケージ以下を走査して「@Component」など特定のアノテーションがついてるJavaクラスを検出しそれらを「DIコンテナ」に登録する。(DIコンテナに登録したいBeanを自動で登録するイメージ)
*「@SpringBootApplication」は「@EnableAutoConfiguration」「@Configuration」「@ComponetScan」を合成したアノテーション
*「CommandLineRunner」インターフェースのrunメソッドが、Frontendクラスのrunメソッド相当の役割を担う
*/
//@EnableAutoConfiguration
//@Import(AppConfig.class)
//@ComponentScan
@SpringBootApplication
public class HajibootDiApplication implements CommandLineRunner {

	@Autowired
    ArgumentResolver argumentResolver;
    @Autowired
    Calculator calculator;

    public void run(String... Strings) throws Exception{
        System.out.print("Enter 2 number like 'a b':");
        Argument argument = argumentResolver.resolve(System.in);
        int result = calculator.calc(argument.getA(), argument.getB());
        System.out.println("result = " + result);
    }

	// エントリポイント
	public static void main(String[] args) {

		// 「SpringApplication.run」で「SpringBoot」アプリケーションを起動
		//ApplicationContext context = SpringApplication.run(HajibootDiApplication.class, args);

		// Scanner scanner = new Scanner(System.in);
		// System.out.print("Enter 2 numbers lile 'a b':");
		// ArgumentResolver argumentResolver = context.getBean(ArgumentResolver.class);
		// Argument argument = argumentResolver.resolve(System.in);
		
		// 「getBean」メソッドを用いて「DIコンテナ」から「Calculator型」のインスタンスを生成
		// 「Calculator」の実体は「DIコンテナ」によって解決されapplicationは意識しない。
		// Calculator calculator = context.getBean(Calculator.class);
		// int result = calculator.calc(argument.getA(), argument.getB()); 

		// System.out.println("result = " + result);

		/*
		 * ↑の主処理は「Frontend」クラスに集約したので以下の実装で済む(スッキリ)
		 */
		//Frontend frontend = context.getBean(Frontend.class);
		//frontend.run();

		SpringApplication.run(HajibootDiApplication.class, args);
	}

}
