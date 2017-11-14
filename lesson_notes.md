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
    
    
   version : RELEASE (LTS), LATEST (for the beginning, before test), 
    * - LATEST version don't work with plugins.
  good practice - download all dependencies from Spring BOM
  
  
  
  if we don't have Main() in *.jar (requires MANIFEST), use 
  java -cp ./path/to/class Class.java
    instead of 
  java -jar ./path/to/class/Class.java
  
  
 
We cab set dependecies in <plugin>, they will be used only for plugin.
if we got <dependencies> - <dependecy> is used for the project.


    Lesson 2017-11-13  Maven (end)


MOJO (Maven Old Java Objects) - for building your own Maven plugins

CI (Continuos Integration) - постоянная и непрерывная сборка и тестирование 
разрабатываемого ПО в максимально приближенной к боевой среде 
    = Jenkins (open-source Hudson), TeamCity, Bamboo (Atlassian), 
        TeamFoundationServer (TFS) for .NET

1) устанавливается как WAR, или утилита командной строки
( скачать Hudson.war, запустить на сервере. Запуск на сервере ./catalina.sh run ).
Jenkins  на сервере не знает, что произошел push (об этом его должен уведомить git)
В  Hudson это есть.

2) создается Job'а 

Manage Hudson -> Configure Sysytem -> add Maven -> new Job -> Build project.
Build now -> .. 

Best practice:
    всегда указывать версию plug-in'ов

<dependencyManagement>
    <dependencies>
        ..
    </dependencies>

Стандартная структура папок предпочтительней
    /src/main/java
    /src/main/recources
    /src/man/webapp
    /src/test/java
    /src/test/resources

Комментарий    TODO сопровождать датой {!}



    CI.
 
JavaRebel (запихивает новый класс в готовый проект), open-source - Spring Loaded.

CI principles:
   * Each change (should be) auto build and deployed.
   * test on prod
   * highest priority issues to fix failed build
Benefits:
   * each change guaranties working code
   * no delay for epic merge
   * less bugs
   * allows ready to go
Challenges:
   * requires build complex running infrastructure
   * requires inner-team culture
   * 

  Continuous delivery - like CI, but linear.
automate tests are essential,
automate everything,
done = release on project,


    GRADLE.
Ant - императивная сборка
Maven - декларативня сборка
Gradle -  императивно/деларативная сборка (используется Groovy).

Gradle use build-by-convention: 
    most commonly used specs are set by default.



    Groovy.
declarative type.

gradle tasks
apply plugin: java



                Lesson 2017-11-14. SPRING
install work environment on Docker.

план курса:
- разделение инициализации и бизнес-логики
расслаивание логики (AOP, AspectJ)
- взаимодействи с legacy Java EE
- взаимодействие с БД (JDBC/Hibernate/JPA)
...


Spring решает проблему сложной разработки J2EE приложений.
    На JavaEE - тяжело писать (сложная платформа).

Spring
    легкий, гибкий,
    open-source,
    фреймвор целого приложения,
    содержит несколько framework'ов.
    

Философия Spring :
* минимальное воздействие на код (Spring Core), но не Spring MVC etc
* соглашения по конфигурации (неявно присутствует много чего по default)
* минимазация связанности (Loose coupling)
* аспектно-ориентрованное программирование (ортогональная функциональность не смешивается).
    AOP philosophy
        //(Аристотель - )
        //(Гегегль - системный подход окружающего мира (диалектика) 
            - см на требования системы к изучаемой подсистеме)
    Не всё можно разделить,  чтобы понять.

* checked-exception в Java - ошибка; Spring оборачивает все checked в unchecked exception'ы.




Spring заменяет EJB (Enterprise Java Beans)
    EJB - стандарт
    EJB поддерживают многие вендоры
    EJB распространен среди разработчиков
    в EJB много вспомогательных стредств разработки
  
Для транзакция лучше EJB.

  spring.io
  spring.io/blog
   @springcentral (twitter)
   @springframework
  infoq.com/spring


<a src="https://www.google.ru/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwiSjKuPmb7XAhVZOMAKHf-ADTsQjRwIBw&url=https%3A%2F%2Fdocs.spring.io%2Fspring%2Fdocs%2F3.1.x%2Fspring-framework-reference%2Fhtmlsingle%2Fspring-framework-reference.html&psig=AOvVaw01qCwNty2Say-NCxx65UOg&ust=1510753395310746
"> Spring runtime scheme </a>


IoC (Inversion of control).
Инверсия управления - ключевое отличие фреймворка от библиотеки.
Framework работает сам, использует/вызывает библиотеки.

IoC говорит, как отвечать на запросы пользователя.

В Spring классы просто описываются, а связи между объектами прописываются в config'е (прим. XML).

 (!)по умолчанию все объекты в Spring - Singleton'ы

в XML
контейнер создает необходимые объекты и управляет их временем жизни.


IoC {
    Dependency Injection (DI) is the release of IoC.
    (Бизнес-логика прописывается в классах, а вся инициализация вынесена в config) {
        Setter dependency injection;
        Constructor Dependency Injection;
        Field Dependency Injection(bad practice!)
    }

   Dependency Lookup (old school) {
            dependenct pill; 
            contextualized dependency lookup (CDL)
            }
}


IoC уменьшает связанность модулей (развитие можели Factory Method).
(!)Spring имеет ссылку типа interface (а не class).



BeanFactory - базовый интерфейс представляющий IoC контейнер Spring.
ApplicationContext - интерфейс, раштряет BeanFactory (лучше использовать его, особенно для Web приложений).

ClassPathXmlApplicationContext - самая удорбная реализация интерфейса ApplicationContext (другие: GenericXmlApplicationContext, FileSystemXmlAPplicationContext, WebAPplicationContext,)

Конфигурация контейнера кроме Xml возможна также через аннотации, Java-, Groovy-код.
Можно просто и быстрее  конфигурировать контейнер с помощью аннотаций (не забыть про доп зависимости в код) - но, конфигурации имеют свои ограничения.
Основные  Spring IoC-контейнеры уже реализованы.
 
 








