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

#### JAV环境设置

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