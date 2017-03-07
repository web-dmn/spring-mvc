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

## Maven(pom.xml) Setting

| groupId| artifactId | Version |
|---|---|---|
|org.springframework | spring-webmvc | 4.3.6.RELEASE|
|javax.servlet|servlet-api|2.5|

## Bean Definition
[SpringMVCのBean定義]

```xml:servlet-context.xml
    <!-- コンポーネント読み込み設定 -->
    <context:component-scan base-package="Xxx" />

    <!-- アノテーションの設定 -->
    <mvc:annotation-driven />

    <!-- 静的ファイルの設定 -->
    <mvc:resources mapping="/css/**" location="/WEB-INF/resources/css/" />

    <!-- Viewの設定 -->
    <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver" >
        <property name="prefix" value="/WEB-INF/views/" />
        <property name="suffix" value=".jsp" />
    </bean>
```


## Controller
フロー１：HandlerMappingを介してControllerへ振り分ける  

- HandlerMappingは `@RequestMapping` のアノテーションを使用して定義可能。
- コントローラクラスには`@Controller` アノテーションを付ける。


```java
@Controller
public class SampleController {
    
    @RequestMapping("/")
    public ModelAndView home() {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("msg" , "Hello World" );
        
        return mav;
    }
}
```

[@RequestMappingの引数]

| name | value | desc |
|--------|--------|----|
| value | "URL" | 指定されたURLへのリクエストに対して処理を実施 |
| method | RequestMethod.GET(POST) | リクエストがGET(POST)の場合に処理を実施 |


[メソッドの引数と戻り値]

- 単純遷移  
 戻り値：String(viewの倫理名)  
 引数：なし  
 備考：なし
 
- データありの遷移  
戻り値：ModelAndView  
引数：なし  
備考：インスタンス名.addObject("キー名", データ)

- フォワード  
戻り値：String(forward:viewの倫理名)  
引数：なし  
備考：リクエストがPOSTの場合、フォワード先もPOSTとなる

- リダイレクト  
戻り値：String(redirect:viewの倫理名)  
引数：なし  
備考：リクエストがPOSTの場合、リダイレクト先もPOSTとなる

- クエリストリング  
戻り値：ModelAndView  
引数：@RequestParam(value = "キー名") Integer 変数  
備考：URL?キー名=値のリクエストで値を受け取る

