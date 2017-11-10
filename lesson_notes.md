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


Productive technics:
    pair programming;
    refactoring;
    soild argumentations;
    Design Patterns => "Language of programmers";
    
JUnit properties:
    - easy to release;
    - reliable;
    - launch via press one button;
    - run fast;
    - primary access/control to tested UoW; (pure functions);
    - isolation (from other tests);
    - if fails - easy detection of root cause and its location.
    
UoW = unit of work (like method etc.)

Unit tests:
    - automated tests to proof assumtions to expected final result.
    - they are simple, fast and can be used multiple times.


LAUNCHING time (descending):
    manual tests,
    automated GUI tests,
    integration tests [лучша защита задницы], 
    unit tests.


automated GUI tests:
     - speed up development speed;
     - they automated;
     - hard bug detection;
     
I&T , integration tests : тдельные программные модули объединяются и тестируются в группе.



Test are used on all software-development lifecycle.
types: Unit > Integration > Functional > Stress.
good self-check [keepin' calm].
simulate errors.
instead of docs (always up-to-date).



// https://ru.wikipedia.org/wiki/%D0%AD%D0%BB%D1%8C%D0%B1%D1%80%D1%83%D1%81_(%D0%BA%D0%BE%D0%BC%D0%BF%D1%8C%D1%8E%D1%82%D0%B5%D1%80)


// REPL Driven Development (LISP / Clojure), kind of testing (kills TDD).

// на Scala очень долгая компиляция (!)
// https://scanlibs.com/programming-in-scala/

Mongo DB uses UUID instead auto-increment ID.
"universally unique identifier" (UUID) is a 128-bit number used to identify information in computer systems. 





Pair programming:
    - constantly swith partners,
    - often change roles, share competence,
    
    
Benefits of pair programming:
    - keep up ordering / discipline;
    - clear code;
    - courage;
    - everyone involved in code;
    - saving money;
    - feedback / short code review;
    - better code design;
   
   
   
        LESSON  2017-11-09  Maven
 
История Maven.

javac -d ./bin ./src/MyClass.java
cd ../bin
jar cvf MyProject.jar *

Mainifest-version: 1.0
Main-Class: MyClass

засунуть сборку в bash-script  [ (?) build ssh/build cmd]
//  #!/usr/bin/env bash
javac -d ./bin -cp ./src ./src/MyClass.java
cd ../bin
jar cvmf MANIFEST.MF MyProject.jar *



Сборщики проектов
MAKE - C/C++
Maven - Java
Gradle - Groovy
Leiningen - Clojure (LISP for JVM)
set - scala


IVY - add-on to Ant (add dependency management for Ant, like in Maven),
Gradle is based on IVY/ANT ?

Ant - нет необходимости в Internet.

intstall Maven
	brew install maven	

уровни конфигурации Maven:
	<project>/pom.xml
	~/.m2/settings.xml
	{M2_HOME}/conf/settings.xml

Archetype - plug-in для генерации шаблонов проектов
	 groupid
	artifactid
	version
	package

зонтичные проекты (посмотреть про это).


Maven scope <provide> 
    закидываем war-ник и в него подгружаются сами зависимости 
    (кажется так): почитать об этом


Доступ к property ${..}



        Lesson 2017-11-10 Maven Life Cycle


Maven lifecycle:
	clean
	site
	default

phase -> goal -> 

mvn clean install // standard launching command

Profiles:
    /dev/..
    /test/... //not regular - as required testing prod
    /prod/...

Профиль - сгруппированный определенным образом набор элементов, доступных в POM-файле.


profile scope:
   <profiles>
        <profile>
            <id> development </id>
            <properties>...</properties>
            <dependencies>...</dependencies>     
        </profile>
              <profile>
                  <id> production </id>
                  ....
        </profile>        
   </profiles>
   
   
 Plugins - is the power of project constructor (Maven or Gradle).
 
 
 Add plugins:
 
   <build>
     <plugins>
       <plugin>
          ... 
       </plugin>
     </plugins>
   </build>


surefi plugin launches tests.


exec plugin - launches *.bin files (not recommended for regular usage).

checkstyle plugin - sets specified rules for whole project structure.

PMD - check project for code duplicates or bad practices (works with byte code /as results of build).
findbugs - works with source code (developed by Google).

properties plugin - provides goals to read properties from files and URLs and write properties to files,  and also to set system properties.

cobertura plugin - valuates the % of project covered by tests
    (now replaced by JaCoCo)


Maven NOT GOOD for Continious Integration! (use special tools / Jenkins ?? )

   good parctice - to clean /.m2/repository



Maven repositories are
    - remote;
    - local.
   

Use Maven Central Repository (https://search.maven.org/)
[!] beware correct properties of required plugin (mutation available).

launch in OFFLINE mode :
    mvn install -o
    mvn test -o


Night builds:
    (automated builds of all daily settings (IN LARGE PROJECTS))

Firefox nightly.



Maven IDE integration:
    
































