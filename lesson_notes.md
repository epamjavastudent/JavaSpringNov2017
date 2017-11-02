(epamjavastudent kia j8)

    Lesson 001, Nov 01 2017

 Лектор: Вячеслав Лапин



junit 5 (вышел 5 sept 2017)
 	тест не всегда может быть написан
 	тест должен решать одну задачу
	тест нужно показать второй/третьей стороне (collective code ownership - Agile)

тест:
	маркируется  @Test
	каждый тест запускается в отдельном экземпляре класса
	тест выполняется с помощью Test-Runner’a
	тест можно игнорировать @Ignore
	результат проверяется с помощью методов  assertXXX


DSL - domain specific language
 (узкоспециализированный языка в какой-либо предметной области)
 
 
 import static - 
 
  junit hamcrest  
http://hamcrest.org/

surefire plugin for harmcrest

Assert.assetThat(
  [text],
  actual,
  org.harmcrest.Matcher  
);



    
// interface tv console based on Opera (old)

// https://ru.wikipedia.org/wiki/%D0%A2%D0%B5%D0%BE%D1%80%D0%B5%D0%BC%D0%B0_%D0%93%D1%91%D0%B4%D0%B5%D0%BB%D1%8F_%D0%BE_%D0%BD%D0%B5%D0%BF%D0%BE%D0%BB%D0%BD%D0%BE%D1%82%D0%B5

test in groovy [ http://spockframework.org/ ]

JUnit (5) - jupiter
https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api
   
   
MAVEN scopes - какие классы на каком этапе сборки будут видны:
compile, provided, runtime, test
[https://maven.apache.org/guides/introduction/introduction-to-dependency-mechanism.html]


GRADLE vs MAVEN 
( ручная настройка vs автоматизированная ), декларативность vs процедурность
gradle - 

jvm - 3 уровня проверки наследования generic'ов.


// транзитивная зависимость - нужна всегда.
// опциональная зависимость - нужна по случаю (if.. )
 
 
@AfterEach, @BeforeEach,
@AfterAll, @BeforeAll

Exeptions (можно запускать через  lambda): 
    public interface Executable{
        void execute() throws Throwable;
    }

кидается
Failure - ошибка логики (связаная со сравнениями)
Error - не связано с логикой


Группировать тесты - в отдельном классе для всех тестов
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
   TestFeatureLogin.class,
   TestFeatureLogout.class
})
public class FeatureTestSuit{
}



       Lesson 002, Nov 02 2017

Писать код понятный другим людям.

TDD:
Write test - run test - refactor test - then refactor code 
if tests run ok.


Kent Beck (TDD book)
http://www.eecs.yorku.ca/course_archive/2003-04/W/3311/sectionM/case_studies/money/KentBeck_TDD_byexample.pdf

Cucumber (behaviour driven development (aka BDD) - bad practice) 













