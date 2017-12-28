(epamjavastudent kia j8 Zaal2017bio )

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


Основные понятия АОП:

Аспект (англ. aspect) — модуль или класс, реализующий сквозную функциональность. Аспект изменяет поведение остального кода, применяя совет в точках соединения, определённых некоторым срезом.
Совет (англ. advice) — средство оформления кода, которое должно быть вызвано из точки соединения. Совет может быть выполнен до, после или вместо точки соединения.
Точка соединения (англ. join point) — точка в выполняемой программе, где следует применить совет. Многие реализации АОП позволяют использовать вызовы методов и обращения к полям объекта в качестве точек соединения.
Срез (англ. pointcut) — набор точек соединения. Срез определяет, подходит ли данная точка соединения к данному совету. Самые удобные реализации АОП используют для определения срезов синтаксис основного языка (например, в AspectJ применяются Java-сигнатуры) и позволяют их повторное использование с помощью переименования и комбинирования.
Внедрение (англ. introduction, введение) — изменение структуры класса и/или изменение иерархии наследования для добавления функциональности аспекта в инородный код. Обычно реализуется с помощью некоторого метаобъектного протокола (англ. metaobject protocol, MOP).



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



BeanFactory - базовый интерфейс представляющий IoC контейнер Spring(без лишних движений).
ApplicationContext - интерфейс, раштряет BeanFactory (лучше использовать его, особенно для Web приложений).

ClassPathXmlApplicationContext - самая удорбная реализация интерфейса ApplicationContext (другие: GenericXmlApplicationContext, FileSystemXmlAPplicationContext, WebAPplicationContext,)

Конфигурация контейнера кроме Xml возможна также через аннотации, Java-, Groovy-код.
Можно просто и быстрее  конфигурировать контейнер с помощью аннотаций (не забыть про доп зависимости в код) - но, конфигурации имеют свои ограничения.
Основные  Spring IoC-контейнеры уже реализованы.
 
 
            Lesson 2017-11-15. Spring day2
download materials for Spring:
   https://yadi.sk/i/zhOIa4GH3NEacA
   https://yadi.sk/i/QLyr4u-W3NEayZ
   https://yadi.sk/d/G_5HuWnt3NEa5H
   https://yadi.sk/d/lR_T8xJu3NEZqz
   


Nullability (Kotlin main trick) released in Java by annotations using harm crest (view Nikolai Chashnikov - Joker 2014).
    @Test
    Person person = ... 
    assertThat(person, is(getExpectedPerson()));



/.setting //Eclipse settings - like /.idea

in Spring property means setter,
<bean p:name/> 

   (!) ПРОЧИТАТЬ ПРО 
            kava bean p: namespace,
            reflection
    
ClassWork:
    download 
    https://github.com/Vyacheslav-Lapin/spring5-labs.git
    
   do 
    lesson 3 from labguide,
    (!) enable annotation precessing for Lombok.

Clone    https://github.com/Vyacheslav-Lapin/spring5-labs.git to my repo, perform all 9 exercises as homework.




            Lesson  2017-11-16. Spring (day 3)

подключение свойств через тег <properties> в Xml.


Dependency injection (DI) - setting dependencies via constructor.

   reflection - достать информацию об объекте получить из runtime'а (Reflection API).
      без reflection невозможно узнать имена параметров методов (более глубокий уровень рефлексии - debug info).

Setter DI


Autowiring (автосвязывание),
   фишка IoC.  Используется с полиморфизмом.
   
   <bean id=".." class=".." autowire="no|byName|byType|constructor" />
   <bean id="manger" class="Manager" autowire="byName">
   
   autowire="byType" // использовать с осторожностью.
   'no' - запрет автосвязывание, использовать значение по умолчанию.
  
   
Контейнер можно собирать через аннотации
<context:annotation-config />

   @Required, ставится над setter (запрещает сборку без вызова)
   @Autowired (самая популярная), используется с 
        setters, 
        constructors, 
        methods() with multi params, 
        fields (even private), 
        arrays, collections with typed variables (с типизированными коллекциями)
   @Resource , часть JSR-330, defined at javax.annotation (standard pack in JDK), близкий 
   аналог аннотаций.    
   @Value (не как в Lombok), подставляет значения, исопльзуется там же где @Autowired и @Resource.
   
 

   @Component, создает Spring компоненты без Xml, используется с классами .(@Service, @Repository, @Controller)
   
   (!)для автоматизации регистрации bean'ов через аннотации необходимо указать инструкцию в конфигурации контейнар
   <context:component-scan base-package="org.example"/>
   
   
? аннотации как-то отображаются в Application-Context.Xml
   
Singleton (double check locking)   - проверить, что он не null, зайти в него и проверить повторно.
   решение проблемы двойной проверки блокировки  (double check locking) 
     <bean name="single" class="Single" scope="singleton />
   
 Bean life-cycle:
    definition;
    pre-initialization;
    ready;
    destroyed; (Disposable ("одноразовый") Bean)

   <bean   ... init-method="init"  destroy-method="destroy" />

 (!) Spring has backword compatibility.
   
получить доступ к контексту в bean достаточно implement ApplicationContextAware (bad practice - inside there could be all Spring).

Получение событий
  implement ApplicationListener,
  implement ApplicationEvent



Локализация
    interface MessageSource 
    
(!!)in AOT (ahead of time) compilation in JDK 9, compilates executable file ( JUG, Чуйко 2016/2017 зима)


Инициализация коллекций
<list>
    <value> .. </value>
    <ref />
    <bean class=".." />
        <property name=".." value=".." />
    
</list>

<map>
    <entry>
    ...
</map>

<properties>
    <props>
    ...
    
(см. населодование типов в  scope тегов) map ->hashtable -> properties


Наследование конфигурации Bean'ов (не путать с наследованием классов).
Для избежания дублирвоания кода.


Объединение коллекуий (возможно, редко используется).


p-namespace (properties for Xml)
c-namespace (constructor args)


Профили конфигурации
    <bean profile="dev">
        ...
    </beans>
    
   <bean profile="production">
        ...
    </beans>




Java-based configuration

@Configuration
@Profile("dev")  ?




Groovy:
    beans{
        framework Spring, 'Grails"
        foo String, "hello"
        bar(Bar,s:'hello',i:123)
    }


  (!) HW - lesson 4  + read reflection API


/// IDEA : Alt+Enter - context menu



            Lesson 2017-11-17. Spring AOP.

DTO - data transfer object.

AOP = вынос ортогональной функциональности в отдельные классы ("сервисная связь" между объектами).
(функциональные вспомогательные операции, проходящие через весь код выносится в отдельные классы).

в СУБД ортогональность реализуется через триггеры.

иньекция - авто-подстановка объектов Spring'ом (через аннотации или иначе)
аспекты - это связи между объектами (например proxy-класс/оболочка вокруг класса)
    Interface -> proxy {class}  //by default

CGLIB (сторонняя библиотека) proxy. реализует AOP без Interface, но Performance  медленный


java.lang.reflect.Proxy (JDK 6 >)



AOP requires 3 dependencies:

 'org.aspectj:aspectjrt:+'
 'aopalliance:aopalliance:+'
 'org.aspectj:aspectjweaver"+'


@Pointcut  - язык, который применяет поиск RegEx по всему проекту,
 чтобы к подходящим объектам применить необходимые аспекты.
 


   LePUS 3 диаграмма (scheme on page 125 of Spring-Workbook).
 
 инициирование динамических proxy в config-файле 
   <aop:aspectj-autoproxy/>

   Join Point - место применения @Pointcut'а 
   
   в  Pointcut type относится к  class, interface, enum, abstract class
   






            Lesson 2017-11-20. Groovy

Groovy programming language (Михаил Денисов).

Groovy - чистая java, на JVM. (Java -> Reflection -> ByteCode -> ? -> Groovy)
(написан 60% java, 40% groovy)

самый известный продкут на Groovy - (Gradle) , эволюционирует в Kotlin.

Groovy is a powerful, optionally typed and dynamic language, with static-typing 
and static compilation capabilities, for the Java platform aimed at improving 
developer productivity thanks to a concise, familiar and easy to learn syntax.

Скриптовый язык (прототип Java XXI века).
println 'Hello world!'


дерево трансформаций в Runtime,  чтобы преобразовать скрипт в Java код.


def - ключевое слово для переменной
'java string'
new Class()


''' 
    multi-line string
'''

def gs = "groovy.lang.GString" // groovy-line string, accepts ${placeholder}


assert 


RegEx in /([A-Z][a-z]+)/  , не нужно экранировать  / через /\
Matcher m = 'StringSomeText' =~ /([A-Z][a-z]+)/

//проверить на соответствие строки
assert 'sdf' ==~ /\w+/



для строк == это equals()



// Collection
def list = [] //we get ArrayList


// create array
def array = [] as String[]


обращение к атрибутам (неявный метод get() для name)
assert list.getClass().name = ..... 


Map map = [:]  //linked has map

map = ['str':1 , date:day ]


в Groovy все исколючения Runtime , нет try{} catch(){}  и т.п.





замыкание — 
    функция, которая ссылается на свободные переменные в своём контексте. 
    Замыкание, также как и экземпляр объекта, есть способ представления функциональности 
    и данных, связанных и упакованных вместе. 

Синтаксически это выглядит как функция, находящаяся целиком в теле другой функции. 
При этом вложенная внутренняя функция содержит ссылки на локальные переменные внешней функции. 

Замыкание подобно lambda, но
    в lambda - нет доступа к внешнему контектсту, а в замыкании оно есть


функциональные программирование удобно для распараллеливания (передать функцию в качестве аргумента 
в другую функцию).


def closure= { имя ->  исполняемый блок кода}

замыкание вызывается как функция 

closure(arg)


invoke methods with closures:
assert myFunc ( 'epam', {it.toUpperCase()} )  == 'EPAM'
    //it - параметр замыкания , означает it -> it...



AST Transformations:
    @TypeChecked, @CompileStatic, @Immutable ...



groovy floating numbers, java.math.BigDecimal


map keys are all strings

return в замыкании = выход, а в цикле = continue

*. для элементов списка вызовется метод (справа от точки)

замыкание всегда послежнее в теле функции



Chuck Norris jokes in JSON:
    http://www.icndb.com/api/
    http://www.icndb.com/the-jokes-2/



Ant - библиотека Java-классов,  который может выполнять "задачки"




            Lesson 2017-11-21. Groovy (day 2)

=~ проверка на соответсиве RegEx

последняя операция каждого метода автоматически будет возвращена (return можно опустить)


Пример - как записать свой DSL (data specific language)
//исходная задача 
println Math.sqrt(100)

//как человек напишет запрос
please show the square root of 100

//преобразуем зарпос с абстрактные логические сущности
please(show).the(square_root).of(100)

//зададим значения ключевым словам
def show = {println it}
def square_ROOT = {MATH.SQRT(IT)}
def please = { action ->
                [ the : {what -> 
                             [ of : { n -> action(what(n)) }]
                ]
             }



def binding = new Binding()
binding.show=show1
binding.square_root=square_root
binding.please=please
bindinf.shout=shout

def shell = new GroovyShell(binding)

shell.evaluate('show the square_root of 100')




gpars библиотека - The Concurrency and Parallelism Framework for Groovy
groovyx.gpars.GPars.Pool.withPool(20);

   SOAP service (parent) -  RESTful веб-API.


можно смотреть примеры на 
    git.epam.com/mikhail_denisov/projects

?. ("Elvis") - безопасный доступ к узлу (защита от NPE, вернет null)



            Lesson 2017-11-22.  Spring (day 5)


AOP в Spring работает через @annotation (из коробки).

в @Before @After нельзя ничего отменить.

если получен результат, сработает @AfterReturning, @AfterThrowing - если исключение.



параметр value есть по умолчанию у всех аннотаций, его не пишут, если он единственный параметр.
value - alias of pointcut,
pointcut - значение которое мапит логику на кодовую базу.


AOP не приспособлен для debug-режима (breakpoint надо статвить в классе, куда ведет логика, а не в том, который тестируем).



В языке C есть механизмы прямой работы с оперативной памятью.

JNI - java native interface - для работы с памятью,
(очень медленный по performance из-за конвертации из Java в С).


intrinsics methods in java -  библиотека на C для прямой работы Java с  памятью,
нужно зарегистрировать перед использованием.

см. Faulker Simons  (JPoint 2016)



см видео "Нужен ли нам Unsafe в Java?" 
Андрей Паньгин
https://www.youtube.com/watch?v=moHNujaeD2I

ORACLE пытается/хочет отказались от sun.misc.unsafe (для защиты Инкапсуляции в Java),  начиная с Java 8.
    https://habrahabr.ru/post/322840/


        Lesson 2017-11-23. Spring (day 6) JDBC

(копия)
Основные понятия АОП:

Аспект (англ. aspect) — модуль или класс, реализующий сквозную функциональность. 
Аспект изменяет поведение остального кода, применяя совет в точках соединения, 
определённых некоторым срезом.
-сам класс с @Aspect


Совет (англ. advice) — средство оформления кода, которое должно быть вызвано из точки соединения. 
Совет может быть выполнен до, после или вместо точки соединения.
-аннтоации @Before, @After

Точка соединения (англ. join point) — точка в выполняемой программе, где следует применить совет. 
Многие реализации АОП позволяют использовать вызовы методов и обращения к полям объекта 
в качестве точек соединения.
-указывается как параметр в  @Before @After (Advice)

Срез (англ. pointcut) — набор точек соединения. Срез определяет, подходит ли данная точка 
соединения к данному совету. Самые удобные реализации АОП используют для определения срезов 
синтаксис основного языка (например, в AspectJ применяются Java-сигнатуры) и позволяют 
их повторное использование с помощью переименования и комбинирования.
-совокупность всех @Before @After

Внедрение (англ. introduction, введение) — изменение структуры класса и/или изменение 
иерархии наследования для добавления функциональности аспекта в инородный код. 
Обычно реализуется с помощью некоторого метаобъектного протокола (англ. metaobject protocol, MOP).




см. видео канал TDD - лекции Антона Шапина (сильный тестировщик, BDD, Cucumber)
https://www.youtube.com/watch?v=tX3V90K8VIU
https://www.youtube.com/watch?v=1MY2xTND5oY



sonarlint - полезный plug-in ......
https://www.sonarlint.org/


    основы JDBC

много данных сериализуются,
чтобы их прочесть - нужно Десериализовать.
На больших объемах - это проблема

JDBC - стандартный  JAVA-интерфейс для работы с СУБД.

модели доступа к БД
  -двузвенная: app(jdbc)-db
  -трехзвенная: app(jdbc)-clint-db
  
драйвера JDBC:
   мост JDBC-ODBC;
   native API (pure Java driver);
   networking protocol / "pure" java driver;
   native protocol / "pure" java driver;
   
//NoSQL база пишет для себя свой драйвер (не стандартизированно)


Компоненты JDBC:
   Driver Manager(средство управления набором драйверов БД, для выбора БД и соединения с ней)
   Driver (реализует интерфейс для конкретной СУБД и конкретных протоколов)
   Connection(сессия медлц приложением и драйвером базы данных)
   Statement (Запрос)
   ResultSet (результат)
   ResultSetMetaData, DataBaseMetaData(метаданные)

регистрация драйвера происходит в 
static block (который загружается при начале работы с классом)

Последователдьность использования JDBC:
     -загрузка драйверов БД
     -установиь соединение с БД
     -соединение объекта для передачи данных
     -выполнение запроса
     -обработка результатов выполнения запросов
     -закрытие соединения





В интерфейсе Closable метод close() можно вызвать только один раз,
а в интерфейсе AutoСloseable  метод close() можно вызывать несколько раз.

в try(;;;;){} может быть много ресурсов, разделяемых ';'


Установление связи с БД:

java.sql.*;
   DriverManager.getConnection(URL,USER,PASS); 
//JDBC объходит с полученными параметрами все базы данных по списку 
   
   
   SQL-запросов:
   Statement - создается методом createStatement (для простых SQL-запросов),
   PreparedStatement - создается методом prepareStatement (для подготовденных SQL-запросов),
   CallableStatement - создается методом prepareCall (используются для хранимых процедур - 
   именованных групп  SQL-запросов, на подобие вызова подпрограмы (PL SQL в Oracle) ~  язык программирования внутри самой БД для 
   генерации SQL-запросов )
   
   
   
   Во многих случаях Enterprise-приложения тормозят из-за базы-данных (бизнес-логика 30%, БД - 70%). 
   
   
   послушать
        podcast (Холодный) "The Art Of Programming" (по БД)
        podcast (Java) "разбор полётов"
   
   
   
   
   
        Lesson 2017-11-24. Spring (day 7)   JDBC continue

в JDBC все индексы с 1....., а не с 0.


ResultSet (идеологический тип Iterator'а, имеет теже методы) через  next() переключается на след. строку
в ответ на запрос изначально приходит часть ответов на запрос (в процессе прохождения по ResultSet результаты 
могут подтягиваться из БД), по этому не стоит закрывать соединение после того, как получили ResultSet.
На практике невозможно узнать количество ответов из БД до тех пор, пока мы не прошли до конца.

параметр ResultSet'а:
TYPE_FORWARD_ONLY (без прокуртки)
TYPE_SCROLL_INSENSITIVE (с прокруткой без обновления из БД)
TYPE_SCROLL_SENSITIVE с прокруткой с обновлением из БД (дорогая по performance операция) 



проблемы JDBC
    1) атака типа  SQL-иньекция ( user = */ 1=1 ; password = /* )
    2) .....


PrepareStatement решает эти проблемы.


По окончании использования (!) Необходимо последовательно закрывать используемые ресурсы 
методом close()  - ResultSet, Prepared Statement (?), Connection.





       Lesson 2017-12-22. Spring (day 8)   JDBC continue.

Я пропустил





       Lesson 2017-12-28. Spring (day 9)   JDBC continue?

Junior не знает что такое BestPractices, он изобретает велосипед вместо них. (для него - это Design Patterns)
Middle просто их использует.
Senior применяет BestPractice с умом.

Каждый код как правило всегда говно.

Senior помимо правки кода, занимается его  refactoring’ом


   "Realize It" - book of IT, в 2017 году написал специалист по судебным искам к IT компаниям, по причинам отказа сервисов .




Connection Pool - его основной минус : ????


@DisplayName // JUnit 5 annotation - allows to set name with spaces.


jitpack.io - альтернатива  MavenCentral (аналог на Gradle "Maven Publish") 
- выкачивает, собирает проект по указанному адресу, собирает его и отправляет его готовый как зависимость
- позволяет использовать  GitHub как MavenCentral
https://jitpack.io/



(!) начинаем использовать в качестве примера другой проект (по теме рефакторинг)
вместо
    https://github.com/Vyacheslav-Lapin/spring5-labs

используем этот
    https://github.com/Vyacheslav-Lapin/refactoring
    
    

@Log4j2 - удобный Логгер!




Ипользуя interface AutoCloseable можно вызывать метод close() сколько угодно раз.
Но в interface AutoCloseable  можно вызвать  close() только один раз.


В Lombok есть правило использования  type inference : если в правой части есть выражение в
тип которого нельзя явно определить, нужно явно писать тип в левой части.
Иначе можно сократить запись в левой части, используя var/val.


   мульти-каретка:   
   alt+leftt click(HOLD) и вести в нужно направление
 или 
   double alt (HOLD) + arrow up/down/left/right  







