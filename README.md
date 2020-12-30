#Yandex Speller wrapper
####Easy way to use this service

#How to use
Just include dependency and repository in your project pom file:
```
        <dependency>
            <groupId>ru.mike.yandex-speller</groupId>
            <artifactId>YandexSpellerWrapper</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>

        <repository>
               <id>yandex-speller-java-mvn-repo</id>
               <url>https://raw.github.com/M1keM1ke/YandexSpeller-java/</url>
               <snapshots>
                   <enabled>true</enabled>
                   <updatePolicy>always</updatePolicy>
               </snapshots>
           </repository>
``` 
#Quick Start
- Create YandexSpeller object
- Create any Service object
- Choose needful function
- Send request
- Congratulations! You're great!

###Simple example
```
       YandexSpeller yandexSpeller = new YandexSpeller();
           CheckTextService checkTextService = yandexSpeller.checkTextService();
           
           try {
               Response<List<CheckTextResult>> listResponse = checkTextService
                       .checkText("sample text", "en", 4, null, null).execute();
           } catch (IOException e) {
               e.printStackTrace();
           }
```

#Useful links
You can visit the official website for more information about current methods of this API
[https://yandex.ru/dev/speller/doc/dg/concepts/api-overview.html](https://yandex.ru/dev/speller/doc/dg/concepts/api-overview.html)