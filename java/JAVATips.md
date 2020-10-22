#### 名词解释

JAVA 介于编译型语言和解释型语言之间

代码--->字节码--->(*虚拟机*)--->机器码

<img src="pics\structure1.png" width = "50%"  alt="2" align=left />

- Java SE：Standard Edition
- Java EE：Enterprise Edition
- Java ME：Micro Edition

<img src="pics\structure2.png" width = "50%"  alt="1" />

JDK: Java Development Kit

JRE：Java Runtime Environment

JSR规范: JAV Specification Request

JCP规范: JAVA Community Process

JSR是一系列的规范，从JVM的内存模型到Web程序接口，全部都标准化了。而负责审核JSR的组织就是JCP。

RI：Reference Implementation

TCK：Technology Compatibility Kit

有人提议要搞一个基于Java开发的消息服务器，这个提议很好啊，但是光有提议还不行，得贴出真正能跑的代码，这就是RI。如果有其他人也想开发这样一个消息服务器，如何保证这些消息服务器对开发者来说接口、功能都是相同的？所以还得提供TCK。

#### JAVA环境设置

https://www.runoob.com/java/java-environment-setup.html

`JAVA_HOME` `PATH` ` CLASSPATH`三个环境变量

在`JAVA_HOME`的`bin`目录下找到很多可执行文件：

- java：这个可执行程序其实就是JVM，运行Java程序，就是启动JVM，然后让JVM执行指定的编译后的代码；

- javac：这是Java的编译器，它用于把Java源码文件（以`.java`后缀结尾）编译为Java字节码文件（以`.class`后缀结尾）；

- jar：用于把一组`.class`文件打包成一个`.jar`文件，便于发布；

- javadoc：用于从Java源码中自动提取注释并生成文档；

- jdb：Java调试器，用于开发阶段的运行调试。
  <img src="pics\runjava1.png" width ="50%" alt="runjava"/>

  

Java规定，某个类定义的`public static void main(String[] args)`是Java程序的固定入口方法，因此，Java程序总是从`main`方法开始执行。

Java入口程序规定的方法必须是静态方法，方法名必须为`main`，括号内的参数必须是String数组。

Java源码的缩进不是必须的。

当我们把代码保存为文件时，文件名必须是`Hello.java`，而且文件名也要注意大小写，因为要和我们定义的类名`Hello`完全保持一致。

Java 11后可以直接运行一个单文件源码，但在实际项目重，需要依赖第三方库，所以，绝大多数情况下，我们无法直接运行一个Java源码文件

JAVA的基本单位是`class`,在class内部，可以定义若干方法(method)

类名要求：

- 类名必须以英文字母开头，后接字母，数字和下划线的组合
- 习惯以大写字母开头

基本数据类型

- 整数类型：byte(-128-127)，short(-32768-32767)，int(-2147483648-2147483647)，long( -9223372036854775808 ~ 9223372036854775807)
- 浮点数类型：float，double
- 字符类型：char
- 布尔类型：boolean

<img src="pics\datastructure1.png" width="50%" alt="datastructure1" />

note:int a=2_000_000表示2000000，可以被识别 

0x表示十六进制，ob表示二进制,long型结尾需要加L，float型结尾需要加f

f浮点数可以用科学计数法进行表示，例如

```java
float f1 = 3.14f;
float f2 = 3.14e38f; // 科学计数法表示的3.14x10^38
double d = 1.79e308;
double d2 = -1.79e308;
double d3 = 4.9e-324; // 科学计数法表示的4.9x10^-324
```

浮点数可表示的范围非常大，`float`类型可最大表示3.4x1038，而`double`类型可最大表示1.79x10308

Java的`char`类型除了可表示标准的ASCII外，还可以表示一个Unicode字符：单引号

引用类型

String 字符串

常量 关键字`final`，常量初始化后不可再赋值，常量名字通常大写

`var` 关键字 ，自动推断变量类型

（1）只能用于局部变量上；

（2）声明时必须初始化；

（3）不能用作方法参数。

 note: 定义变量时，要遵循作用域最小化原则，尽量将变量定义在尽可能小的作用域，并且，不要重复使用变量名。

整除`/`取余`%` 自增`++` 自增`--`

移位操作 `<<n`左移n位,，乘2的n次方；`>>n`右移n位除以2的n次方，注意数据长度限制

无符号右移`>>>`

溢出，数据超出范围限制

对`byte`和`short`类型进行移位时，会首先转换为`int`再进行位移

位运算

`&`按位与`|`按位或`~`按位非`^`按位异或

<img src="pics\priority.png" width="300" alt="priority"/>

类型自动提升和强制转换

在运算过程中，如果参与运算的两个数类型不一致，那么计算结果为较大类型的整型。例如，`short`和`int`计算，结果总是`int`，原因是`short`首先自动被转型为`int`：

将大范围的整数转型为小范围的整数，强制转型使用`(类型)`，例如，将`int`强制转型为`short`但是有可能出错

浮点数不能做位运算和以为运算。浮点数是不精确的。

如何比较两个浮点数是否相等？判断两个浮点数之差的绝对值是否小于一个很小的数。

Java的浮点数完全遵循[IEEE-754](https://web.archive.org/web/20070505021348/http://babbage.cs.qc.edu/courses/cs341/IEEE-754references.html)标准

布尔运算

`>` `>=` `<` `<=` `==` `!=` `&&` `||` `!`

<img src="pics\boolpriority.png" width="50%" alt="boolpriority"/>

如果一个布尔运算的表达式能提前确定结果，则后续的计算不再执行，直接返回结果。

`? :运算符 `三元运算`b ? x : y`后面的类型必须相同



转义符`\u`将unicode编码表示一个字符。

```java
char c = ‘\u0041’\\'A'
```

<img src="pics\translate1.png" width="50%" alt="boolpriority"/>

多行字符串

```java
“”“...”""
```

字符串的不可变特性：Java的字符串除了是一个引用类型外，还有个重要特点，就是字符串不可变。

null表示不存在，，即变量不指向任何对象，“”表示空字符串

Java的数组：

- 数组所有元素初始化为默认值，整型都是`0`，浮点型是`0.0`，布尔型是`false`；
- 数组一旦创建后，大小就不可改变。

数组是**引用类型**，在使用索引访问数组元素时，如果索引超出范围，运行时将报错

```java
int[] ns=new int[5];
int[] ns=new int[]{1,2,3,4,5};
int[] ns = {1,2,3,4,5};
```

字符串数组

```java
String[] = {"ds","we","dw"}
```

输入和输出

```java
System.out.println()//输出并换行
System.out.print()//输出不换行
System.out.printf()//参数格式化
```

格式化输出

| 占位符 | 说明                             |
| ------ | -------------------------------- |
| %d     | 格式化输出整数                   |
| %x     | 格式化输出十六进制整数           |
| %f     | 格式化输出浮点数                 |
| %e     | 格式化输出科学计数法表示的浮点数 |
| %s     | 格式化字符串                     |

note:%%表示一个%字符，两个%占位符必须传入两个数

```java
int n = 12345000;
System.out.printf("n=%d, hex=%08x", n, n); // 注意，两个%占位符必须传入两个数
```

标准输入流`system.in`标准输出流`system.out`

scanner.nextline()和scanner.nextInt()分别读取用户读取的整数和int

条件语句

判断引用类型的变量内容是否相等，用`equals()`方法，注意避免`NullPointerException`。

if 语句

switch语句

yield关键字

循环语句

`for each`循环

遍历数组，除了常用的方法也可以用`Arrays.toString()方法。`

```java
int ns[] = {1,2,3,4,5}; 
System.out.println(Arrays.toString(ns))
```

二维数组中每个数组元素的长度不要求相同，打印二维数组可以用`Arrays.deepToString()`方法。

#### 面向对象

##### 重载

##### 继承

子类继承父类，自动获得父类的所有字段，子类不能定义与父类重名的字段。

任何类，除了`object`，都会继承自某个类。java只允许一个class继承一个类，一个类有且只有一个父类。`object`没有父类。

父类字段被`private`修饰的，不能被子类所访问。被`protected`修饰的，可以被子类以及子类的子类访问。

`super`表示父类(超类)，子类引用父类的字段时，可以用`super.fieldName`

子类不会继承任何父类的构造方法。如果父类没有默认的构造方法，子类必须显式调用`super`并给出参数以便让编译器定位到弗雷德一个合适的构造方法。

正常情况下，只要一个class没有`final`关键字，任何类都可以继承该class。

java15后，可以用`sealed`修饰class,，并通过`permits`明确写出能够从该类继承的子类名称。

```java
public sealed class Shape permits Rect, Circle, Triangle {
    ...
}
public final class Rect extends Shape {...}
public final class Ellipse extends Shape {...}
// Compile error: class is not allowed to extend sealed class: Shape
//sealed类在Java 15中目前是预览状态，要启用它，必须使用参数--enable-preview和--source 15
```

如果一个引用类型是超类，它也可以指向自己子类的实例。

```java
//向上转型
class Student extends Person{ ... }
Person p = new Student();

```

如果把一个父类类型强制转型为子类类型，即向下转型，有可能失败。

```java
Person p1 = new Student()；
Person p2 = new Person();
Student s1 = (Student) p1;
Student s2 = (Student) p2;//runtime error!ClassCastException
```

`instanceof`用来判断一个实例是不是某种类型。，如果一个引用类型位null，那么对任何`instanceof`的判断都为`false`。

继承的关系是IS，组合的关系是HAS

##### 多态

`@Override`关键字表示多态，override和overload不同的地方在于，如果方法签名不同，就是重载，如果相同，返回值也相同，就是多态。

如果在类方法或者类之前加`abstract`关键字，表示抽象方法和抽象类。包含抽象方法的类必须加`abstract`类。

面向抽象编程的本质就是：

- 上层代码只定义规范（例如：`abstract class Person`）；
- 不需要子类就可以实现业务逻辑（正常编译）；
- 具体的业务逻辑由不同的子类实现，调用者并不关心。

##### 接口

如果一个抽象类没有字段，所有方法全部都是抽象方法，就可以把该抽象类改写为接口：`interface`。

`interface`，就是比抽象类还要抽象的纯抽象接口，因为它连字段都不能有。

当一个具体的`class`去实现一个`interface`时，需要使用`implements`关键字。

一个类可以实现多个`interface`

<img src="pics/interface1.png" width = "100%" alt="interface1"/>

<img src="pics/interfacestructure.png" width = "100%" alt = "interfacestructure1" />

```java
List list = new ArrayList(); // 用List接口引用具体子类的实例
Collection coll = list; // 向上转型为Collection接口
Iterable it = coll; // 向上转型为Iterable接口
```

一般来说，公共逻辑适合放在`abstract class`中，具体逻辑放到各个子类，而接口层次代表抽象程度。

在接口中,`default`修饰的方法无法访问字段,实现类可以不必覆写`default`修饰的方法

`default`方法的目的是，当我们需要给接口新增一个方法时，会涉及到修改全部子类。如果新增的是`default`方法，那么子类就不必全部修改，只需要在需要覆写的地方去覆写新增方法。

`static`字段不属于任何一个实例.

*不推荐用`实例变量.静态字段`去访问静态字段，因为在Java程序中，实例对象并没有静态字段。在代码中，实例对象能访问静态字段只是因为编译器可以根据实例类型自动转换为`类名.静态字段`来访问静态对象。推荐用类名来访问静态字段。可以把静态字段理解为描述`class`本身的字段（非实例字段）*。

通常情况下，通过实例变量访问静态字段和静态方法，会得到一个编译警告.

`interface`的静态字段必须为`final`类型：

`package`没有父子关系,包名不同,即使类名相同也是不同的类。

==<u>编译语言注意</u>==

```java
javac -d ../bin ming/Person.java hong/Person.java mr/jun/Arrays.java
```

https://www.liaoxuefeng.com/wiki/1252599548343744/1260467032946976