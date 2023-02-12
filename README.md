# hajiboot-di
DIコンテナを使ってみる。

DIコンテナとは・・・  
「Dependency Injection」(依存性の注入)の略で「Spring Framework」の根幹となる技術。  
「DI」によってクラス間の依存関係が自動で解決される。  
「インスタンス」の管理は「DIコンテナ」が行う。  
「DIコンテナ」が「インスタンス」を生成し、その「インスタンス」に必要な「インスタンス」を設定した状態で、アプリケーションに返却する。  

**「DIコンテナ」経由で「インスタンス」を生成することで以下のメリットが存在する。**  
* インスタンスの「スコープ」を制御できる。
* インスタンスの「ライフ・サイクル」イベント制御できる。
* 共通的な処理を埋め込める  

また、オブジェクト間が疎結合になるため、「ユニットテスト(単体テスト)」がしやすくなる。 