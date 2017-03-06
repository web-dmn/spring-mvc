# Spring Framework
## 概要
- SpringFrameworkの最新バージョン  
 [UP : 2017/1/25]  
4.3.6.RELEASE
- Springのサイト  
https://spring.io/

| Item| Name | Version |
|---|---|---|
|ビルド管理 | Maven | 3.3.9|



## 処理フロー
[SpringMVCの処理フロー]  

1. DispatcherServletがすべてのリクエストを受け取りHandlerMappingを介してControllerへ振り分ける。
2. ControllerでValidationチェックを行い結果を返す。
3. Controllerからビジネスロジック層のServiceを呼び出す。
4. Serviceからデータアクセス層のDAOを呼び出す。
5. ビジネスロジック層で処理したデータとView情報をDispatcherServletへ返す。
6. ViewResolverから該当するViewを見つける。
7. 該当したViewへ結果を出力する。

## Maven(pom.xml)の設定

| groupId| artifactId | Version |
|---|---|---|
|org.springframework | spring-webmvc | 4.3.6.RELEASE|
|javax.servlet|servlet-api|2.5|
