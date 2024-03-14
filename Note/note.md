- [基础概念](#基础概念)
  - [关键字](#关键字)
  - [字面量](#字面量)
  - [\\t:制表符](#t制表符)
  - [进制转换](#进制转换)
    - [任意进制转十进制](#任意进制转十进制)
    - [十进制转其他进制](#十进制转其他进制)
  - [计算机存储规则](#计算机存储规则)
  - [基本数据类型](#基本数据类型)
  - [标识符命名规则](#标识符命名规则)
    - [小驼峰命名法](#小驼峰命名法)
    - [大驼峰命名法](#大驼峰命名法)
  - [IDEA](#idea)
    - [快捷键](#快捷键)
  - [Scanner](#scanner)
  - [键盘录入](#键盘录入)
  - [Random](#random)
    - [生成任意数到任意数之间的随机数](#生成任意数到任意数之间的随机数)
- [运算符](#运算符)
  - [算数运算符](#算数运算符)
    - [数字的“+”操作](#数字的操作)
      - [隐式转换（自动类型提升）](#隐式转换自动类型提升)
      - [强制转换](#强制转换)
    - [字符串的“+”操作](#字符串的操作)
    - [字符的“+”操作](#字符的操作)
  - [关系运算符](#关系运算符)
  - [逻辑运算符](#逻辑运算符)
  - [其他运算符](#其他运算符)
  - [原码、反码、补码](#原码反码补码)
- [判断和循环](#判断和循环)
  - [switch case语句](#switch-case语句)
    - [default的位置和省略](#default的位置和省略)
    - [case穿透](#case穿透)
    - [JDK12新特性](#jdk12新特性)
  - [do...while循环](#dowhile循环)
- [数组](#数组)
  - [数组介绍](#数组介绍)
  - [数组的定义](#数组的定义)
  - [静态初始化](#静态初始化)
  - [数组的地址值](#数组的地址值)
  - [数组遍历](#数组遍历)
  - [动态初始化](#动态初始化)
    - [数组默认初始化值的规律](#数组默认初始化值的规律)
  - [数组内存图](#数组内存图)
  - [二维数组](#二维数组)
    - [二维数组的静态初始化](#二维数组的静态初始化)
    - [二维数组的动态初始化](#二维数组的动态初始化)
- [方法](#方法)
  - [方法的定义和调用](#方法的定义和调用)
  - [方法的重载](#方法的重载)
  - [方法的值传递](#方法的值传递)
- [面向对象](#面向对象)
  - [类和对象](#类和对象)
    - [类的定义](#类的定义)
    - [创建类的对象](#创建类的对象)
    - [使用对象](#使用对象)
  - [封装](#封装)
    - [private关键字](#private关键字)
  - [this关键字（就近原则）](#this关键字就近原则)
  - [构造方法](#构造方法)
    - [执行时机](#执行时机)
  - [标准的JavaBean类](#标准的javabean类)
  - [对象的内存图](#对象的内存图)
    - [一个对象的内存图](#一个对象的内存图)
      - [创建对象](#创建对象)
    - [两个对象的内存图](#两个对象的内存图)
    - [两个引用指向同一个对象](#两个引用指向同一个对象)
    - [基本数据类型](#基本数据类型-1)
    - [引用数据类型](#引用数据类型)
    - [this的内存原理](#this的内存原理)
    - [成员和局部](#成员和局部)
      - [成员变量](#成员变量)
      - [局部变量](#局部变量)
- [字符串](#字符串)
  - [API](#api)
  - [String](#string)
    - [创建String对象](#创建string对象)
    - [常用方法](#常用方法)
      - [比较：==](#比较)
        - [字符串内容比较](#字符串内容比较)
      - [遍历字符串](#遍历字符串)
  - [StringBuilder](#stringbuilder)
    - [StringBuilder源码分析](#stringbuilder源码分析)
  - [StringJoiner](#stringjoiner)
  - [字符串拼接的底层原理](#字符串拼接的底层原理)
## 基础概念

### 关键字

被java赋予了特定含义的英文单词，字母全部小写，有特殊颜色标记

class表示一个类，后面跟随类名

### 字面量

数据在程序中的书写格式

字符串类型：用双引号括起来的内容

字符类型：用单引号括起来的，内容只有一个

空类型:一个特殊的值->NULL(null不能直接打印，只能以字符串的形式进行打印->System.out.println("null");)

### \t:制表符

在打印的时候，把<u>前面</u>字符串的长度补齐到8或8的整数倍，最少补1个空格，最多补8个空格

```java
System.out.println("abc"+'\t');//补5个空格
```

对齐作用

```java
System.out.println("abcd"+'\t'+"efg");
System.out.println("xyz"+'\t'+"12");
```

> abcd    efg(中间有4个空格)
>
> xyz     12(中间有5个空格)

### 进制转换

JDK7以上：二进制：0b  八进制：0  十六进制：0x  

#### 任意进制转十进制

系数*基数的权次幂再相加（权：从右往左，依次为0 1 2 3...）

例：abc(十六进制转十进制)：10&times;16<sup>2</sup>+11&times;16<sup>1</sup>+12&times;16<sup>0</sup>=2748

#### 十进制转其他进制

除基取余法：不断的除以基数（几进制，基数就是几）得到余数，直到商为0，再将余数倒着拼接起来即可

### 计算机存储规则

汉字

1.GB2312编码：1981.5.1 简体中文汉字

2.BIG5:1984 台湾地区繁体中文

3.GBK编码：2000.3.17 中日韩汉字和BIG5编码中的所有汉字

4.Unicode编码

图片：通过每一个像素点中的RGB三原色来存储

声音：对声音的波形图进行采样再存储

### 基本数据类型

整数：byte(-128~127)(1)  short(2)  int(4)  long(8)

字符串：String

浮点数：float(4)  double(8)

字符：char(2)

布尔：boolean(true false)

如果要定义long类型的变量，在数据值的后面e需要加一个L作为后缀（L可以大写，也可以小写） 

```java
long a=999L;
```

定义float类型的变量时，数据值的后面需要加一个F作为后缀

```java
float b=3.14F;
```

### 标识符命名规则

1.由数字、字母、下划线（_）和美元符（$）组成

2.不能以数字开头

3.不能是关键字

4.区分大小写

#### 小驼峰命名法

常用于方法、变量

1.标识符是一个单词时，全部小写（name）

2.标识符由多个单词组成时，第一个单词首字母小写，其他单词首字母大写(firstName)

#### 大驼峰命名法

常用于类名

1.标识符是一个单词时，首字母大写（Name）

2.标识符由多个单词组成时，首字母全部大写(FirstName)

### IDEA

project->module->package->class(项目-模块-包-类)

1.psvm==public static void main(String[] args){ }

2.sout==System.out.println( );

3.100.fori==for(int i=0;i<100;i++){ }

4.

```java
System.out.println("abc");//先打印abc,再做换行处理
System.out.print("abc");//只打印abc,不换行
System.out.println();//不打印任何数据，只做换行处理
```

#### 快捷键

- shift+alt+L：自动格式化代码

- Ctrl+alt+M：自动抽取方法（可以自动识别代码中相似的部分并生成一个方法）
- 选中重复项+shift+F6:变量的批量修改
- Ctrl+alt+T:给选中的代码块添加包围代码,比如`if`、`while`等结构。
- alt+insert:快速生成标准的javabean

### Scanner

Scanner可以接受键盘录入的数字

1.导包（找到这个类在哪）：import java.util.Scanner;

2.创建对象（表示要开始使用这个类）：Scanner sc=new Scanner(System.in);

3.接受数据（真正开始使用）：int i=sc.nextInt();

### 键盘录入

第一套体系：遇到空格，制表符，回车就停止接收，这些符号后面的数据就不会接收了

nextInt();接收整数

nextDouble();接收小数

next();接收字符串

第二套体系：可以接收空格，制表符，遇到回车才停止接收

nextLine();接收字符串

### Random

Random可以生成一个随机数

1.导包：import java.util.Random;

2.创建对象：Random r=new Random();

3.接受数据：int i=r.nextInt(随机数的范围);

包头不包尾，包左不包右（若括号内是10，则范围为0~9）

#### 生成任意数到任意数之间的随机数

例：生成7~15之间的随机数

1.将这个范围头尾都减去一个值，让其范围从0开始  -7  0~8

2.右边界加一  8+1=9

3.加上第一步减去的值

```java
Random r=new Random();
int number=r.nextInt(9)+7;//7~15
// 0~8+7
```

## 运算符

### 算数运算符

<u>取值范围：byte<short<int<long<float<double</u>

#### 数字的“+”操作

##### 隐式转换（自动类型提升）

1.取值范围小的和取值范围大的进行计算，小的会先提升为大的，再进行计算；

2 .byte short char三种类型的数据在运算的时候，都会先提升为int，再进行计算

##### 强制转换

取值范围大的->取值范围小的

 例：int a=200; byte b=(byte)a;

#### 字符串的“+”操作

当“+”操作中出现字符串时，这个“+”会将前后数据进行**拼接**，产生一个新的字符串

例：System.out.println(1+2+"abc"+2+1);->"3abc21"

#### 字符的“+”操作

<u>ASCII码表：A:65    a:97</u>

例：（数字+字符）System.out.println(1+'a');->98

### 关系运算符

关系运算符(==、!=、>、>=、<、<=)的结果都是boolean类型(true,false)

### 逻辑运算符

^:逻辑异或 相同为false,不同为true

短路逻辑运算符:1.短路与：&&   2.短路或： ||

&|:无论左边true false,右边都要执行

&&||:如果左边能确定整个表达式的结果，右边不执行

### 其他运算符

左移（<<）: 向左移动，低位补0  ，相当于*2

右移（>>）: 向右移动，高位补0或1（正数补0，负数补1），相当于/2

无符号右移（>>>）：不管是正数还是负数，高位都补0

### 原码、反码、补码

正数的原码、反码、补码都相同

反码的弊端：负数运算的时候，如果结果不跨0，是没有任何问题的，但是如果结果跨0，跟实际结果会有1的偏差  +0:00000000  -0:11111111

补码：解决负数计算时跨0的问题  

补码能多记录一个特殊的值128，该数在1个字节下，没有原码和反码

计算机中的存储和计算都是以补码的形式进行的

## 判断和循环

如果对一个布尔类型的变量进行判断，尽量不要用==号，直接把变量写在小括号里即可

例: boolean flag=true;  if(flag){ ...}

### switch case语句

switch(表达式){case.....;}  表达式取值为byte、short、 int、 char,JDK5以后可以是枚举,JDK7以后可以是String（字符串）.

#### default的位置和省略

1.default不一定是写在最下面的，可以写在任意位置

2.default可以省略，语法不会有问题，但不建议省略

#### case穿透

表达式跟每一个case进行匹配，如果匹配上了，就会执行对应语句体，如果这个语句体中没有break，程序会执行下一个的case语句体，直到遇到break或者大括号为止

#### JDK12新特性

```java
int number=1;
switch(number){
    case 1-> System.out.println("1");
    case 2-> System.out.println("2");
    default -> System.out.println("error");
}
```

```java
public static String changeLuoMa(char numnber){
    String str=switch(number){
        case'0'->"";
        case'1'->"I";
        case'2'->"II";
        default->str="";
    };
    return str;
}
```

### do...while循环

先执行，后判断

ps:1.continue:跳过本次循环，继续执行下次循环

2.break:结束整个循环

## 数组

### 数组介绍

数组容器在存储数据的时候，需要结合隐式转换考虑

int类型的容器数组：byte short int

double类型的容器数组：byte short int long float double

### 数组的定义

格式一：数据类型 [ ]数组名 (int []array)

格式二：数据类型 数组名[ ]  (int array[])

### 静态初始化

手动指定数组元素，系统会根据元素个数，计算出数组的长度

完整格式：数据类型 [ ]数组名=new 数据类型[]{元素1，元素2，...}

```java
int[] array=new int[]{1,2,3};
```

简化格式：数据类型 [ ]数组名={元素1，元素2，...}

```java
int[] array={1,2,3};
```

### 数组的地址值

```java
double[] arr={1.2,3.2,3.4};
System.out.println(arr);//[D@8efb846
```

[D@8efb846

1.[:表示当前是一个数组

2.D:表示当前数组里面的类型都是double类型的

3.@：表示一个间隔符号（固定格式）

4.8efb846:数组真正的地址值（十六进制）

平时我们会习惯把这个整体叫做数组的地址值

数组的元素访问：数组名[索引]（arr[0]）

### 数组遍历

在java中，有一个关于数组的长度属性length

调用方式：数组名.length

```java
System.out.println(arr.length);//打印数组长度
```

扩展：自动快速生成数组的遍历方式（idea提供的）

数组名.fori->

```java
for (int i = 0; i < arr.length; i++) {
    
}
```

### 动态初始化

手动指定数组长度，由系统给出默认初始化值

格式：数据类型[] 数组名=new 数据类型[数组长度]；

```java
int[] arr=new int[3]; 
```

#### 数组默认初始化值的规律

1.整数类型（byte short int long）：默认初始化为0

2.小数类型：默认初始化为0.0

3.字符类型：默认初始化为'/u0000'(打印出来是一个空格)

4.布尔类型：默认初始化为false

5.引用数据类型：默认初始化值null（引用数据类型中存储的是<u>地址值</u>）

### 数组内存图

java内存分配

- 栈：方法运行时使用的内存，比如`main方法`运行，进入方法栈中执行

- 堆：存储对象或者`数组`，`new`来创建的，都存储在堆内存

- 方法区：存储可以运行的class文件

- 本地方法栈:JVM（虚拟机）在使用操作系统功能的时候使用，和开发无关

- 寄存器：给CPU使用，和开发无关

  

当两个数组指向同一个小空间时，其中一个数组对小空间中的值做出了改变，那么其他数组再次访问的时候都是修改之后的结果

### 二维数组

#### 二维数组的静态初始化

格式：

```java
数据类型[][] 数组名=new 数据类型[][]{{元素1,元素2},{元素3,元素4}};
int[][] arr=new int[][]{{1,2},{3,4}};
```

简化格式：

```java
数据类型[][] 数组名={{元素1,元素2},{元素3,元素4}};
int[][] arr={{1,2},{3,4}};
int arr[][]={{1,2},{3,4}};
```

建议：定义的时候把每一个一维数组单独写成一行

#### 二维数组的动态初始化

```java
数据类型[][] 数组名=new 数据类型[m][n];
//m表示这个二维数组可以存放多少个一维数组
//n表示每一个一维数组可以存放多少个元素
```

```java
//创建一维数组长度不一样的二维数组
int[][] arr=new int[2][];
int[] arr1={1,2};
int[] arr2={3,4,5};
arr[0]=arr1;
arr[1]=arr2;
```

## 方法

方法是程序中最小的执行单元

方法与方法之间是平级关系，不能互相嵌套定义

### 方法的定义和调用

定义在main方法的外面，类的里面

```java
//最简单的方法定义
public static void main(String[] args) {
    playGame();//调用
}
public static void playGame(){
    System.out.println("play");
}
```

```java
//带参数的方法定义
public static void main(String[] args) {
    getsum(1,2);//实参
}
public static void getsum(int num1,int num2)/*形参*/{
    int result=num1+num2;
    System.out.println(result);
}
```

形参：形式参数，是指方法`定义`中的参数

实参：实际参数，方法`调用`中的参数

```java
//带返回值的方法定义
public static void main(String[] args) {
    //直接调用
    getsum(1,2);
    //赋值调用
    int sum=getsum(1,2);
    System.out.println(sum);
    //输出调用
    System.out.println(getsum(1,2));
}
public static int getsum(int num1,int num2){
    int result=num1+num2;
    return result;
}
```

方法的返回值为void,表示该方法没有返回值，没有返回值的方法可以省略return语句不写，如果要编写return,后面不能跟具体的数据(return; )

return表示结束方法

### 方法的重载

在`同一个类`中，定义了`多个同名的方法`，这些同名的方法具有`同种的功能`

每个方法具有`不同的参数类型或参数个数`，这些同名的方法，就构成了重载关系（与返回值无关！）

### 方法的值传递

传递基本数据类型时，传递的是真实的数据，形参的改变，不影响实际参数的值

传递引用数据类型（数组）时，传递的是地址值，形参的改变，影响实际参数的值

## 面向对象

面向：拿、找

对象：能干活的东西

面向对象编程：拿东西过来做对应的事情

### 类和对象

类（设计图）：是对象共同特征的描述

对象：是真是存在的具体东西

在java中，必须先设计类，才能获得对象

#### 类的定义

```java
public class 类名{
        //1.成员变量（代表属性，一般是名词）(例如手机的品牌，价格）；
        // 2.成员方法（代表行为，一般是动词）（例如手机能打电话，玩游戏）；
        //3.构造器
        //4.代码块
        //5.内部类
}
```

- Javabean类：用来描述一类事物的类，在Javabean类中，不写main方法

- 编写main方法的类，叫做测试类，可以在测试类中创建Javabean类的对象并进行赋值调用
- 一个java文件中可以定义多个class类，且只能一个类是public修饰，而且public修饰的类名必须成为代码文件名
- 定义成员变量的完整格式：修饰符 数据类型 变量名称=初始化值

#### 创建类的对象

类名 对象名=new 类名( )；

```java
Phone p=new Phone();
```

```java
public class Phone{
    //属性
    String brand;
    double price;
    //行为
    public void call(){
        System.out.println("打电话");
    }
    public void playGame(){
        System.out.println("玩游戏");
    }
}
```

#### 使用对象

- 访问属性：对象名.成员变量
- 访问行为：对象名.方法名（ ）

对象的成员变量的默认值:

引用类型：类、接口、数组、String ->null

基本类型：boolean->false

### 封装

对象代表什么，就得封装对应的数据，并提供数据的对应行为

#### private关键字

（保证数据的安全性）

- 是一个权限修饰符
- 可以修饰成员（成员变量和成员方法）
- 被private修饰的成员只能在本类中才能访问

“set..(参数)”方法：给成员变量赋值

“get..()”方法：获取成员变量的值



### this关键字（就近原则）

如果成员变量和局部变量重名，会默认使用局部变量的值，加上`this关键字`之后，会使用成员变量的值

```java
public class Person {
    private int age;//0

    public void method(){
        int age=10;
        System.out.println(age);//10
        System.out.println(this.age);//0
    }
}
```

### 构造方法

作用：在创建对象的时候给成员变量进行赋值

没有返回值类型，没有void

```java
//格式
修饰符 类名（参数）{
    方法体；
}
```

#### 执行时机

1.创建对象的时候由虚拟机调用，不能手动调用构造方法

2.每创建一次对象，就会调用一次构造方法

构造方法的重载：带参构造方法和无参构造方法，两者方法名相同，但是参数不同，这叫做构造方法的重载

### 标准的JavaBean类

1.类名要见名知意

2.成员变量使用private修饰

3.至少提供两个构造方法（无参构造方法+带全部参数的构造方法）

4.成员方法

- 提供每一个成员变量对应的set...()/get...()
- 如果还有其他行为，也需要写上

```java
public class User {

    //属性
    private String username;
    private String password;
    private String email;
    private String gender;
    private int age;
    
    //快捷键：alt+insert
    //插件ptg:1秒生成标准JavaBean
    
    //空参
    public User() {
    }

    //带全部参数构造
    public User(String username, String password, String email, String gender, int age) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }
	//get和set方法
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
```

### 对象的内存图

字节码文件(.class)加载时进入<u>**方法区**</u>

当方法被调用时要进**<u>栈</u>**执行（方法里面定义的变量也是在栈内存中）（执行完之后出栈）

<u>**堆**</u>内存：new出来的东西会在堆中开辟空间并产生地址

#### 一个对象的内存图

##### 创建对象

1.加载class文件（方法区）

2.申明局部变量（栈）

3.在堆内存中开辟一个空间（有成员变量和成员方法的地址）

4.默认初始化（null/0）

5.显示初始化（int age=23;）

6.构造方法初始化（有参构造）

7.将堆内存中的地址赋值给左边的局部变量

#### 两个对象的内存图

第二次创建对象时不需要再次加载.class字节码文件

两个对象new创建的空间是相互独立的

#### 两个引用指向同一个对象

```java
Student stu1=new Student();
Student stu2=stu1;
```

当两个变量指向同一块空间时，只要有其中一个变量改变了这块空间中的值，当另一个变量再次访问这块空间时，就是改变之后的结果

#### 基本数据类型

变量中存储真实的数据值（int a=10;），赋值给其他变量时，赋的是真实的值

#### 引用数据类型

对象中真实的数据存储在堆中，变量（栈）记录其他空间的地址值，赋值给其他变量时，赋的是地址值

#### this的内存原理

this的作用：区分局部变量和成员变量

this的本质：代表方法调用者的地址值

#### 成员和局部

##### 成员变量

- 类中方法外的变量
- 有默认初始化值
- 在堆（对象）内存中

##### 局部变量

- 方法内的变量或形参
- 没有初始化值，使用前需要赋值
- 在栈（方法）内存中

## 字符串

### API

API:应用程序编程接口

Java API:JDK中提供的各种功能的java类

### String

String是Java定义好的一个类，定义在java.lang包中，使用的时候不需要导包

字符串的内容是不会发生改变的，它的对象在创建之后不能被修改

#### 创建String对象

1.直接赋值

```java
String name="abc";
```

2.new

```java
public String()//创建空白字符串，不含任何内容
public String(String original)//根据传入的字符串，创建字符串对象
public String(char[] chs)//根据字符数组，创建字符串对象
public String(byte[] chs)//根据字节数组，创建字符串对象
```

- 当使用双引号**直接赋值**时，系统会检查该字符串在**串池**(StringTable，在堆内存中)中是否存在（不存在：创建新的；存在：复用）

- new每次都会在堆里创建一块新的小空间

#### 常用方法

##### 比较：==

基本数据类型：比较数据值

引用数据类型：比较地址值

###### 字符串内容比较

boolean equals方法（要比较的字符串）-完全一样结果才是true,否则为false

```java
boolean result=s1.equals(s2);
```

boolean equalsIgnoreCase（要比较的字符串）-忽略英文状态下大小写的比较

- 键盘录入的字符串是new出来的

##### 遍历字符串

```java
for(int i=0;i<str.length();i++){}//str.length().fori
```

```java
public char charAT(int index)//根据索引返回字符
    
public int length()//返回此字符串的长度
    
String substring(int beginIndex,int endIndex)//截取（包头不包尾，包左不包右）
String substring(int beginIndex)//截取到末尾
    
String replace(旧值，新值)//替换
```

### StringBuilder

StringBuilder可以看成一个容器，创建之后里面的内容可以改变

作用：提高字符串的操作效率

```java
//构造方法
public StringBuilder()
public StringBuilder(String str)
    
//成员方法
public StringBuilder append(任意类型)//添加数据，并返回对象本身
public StringBuilder reverse()//反转容器中的内容
public int length()//返回长度（字符出现的个数）
public String toString()//通过toString()就可以实现把StringBuilder转换成String
```

StringBuilder打印对象不是地址值而是属性值

> 链式编程（当我们在调用一个方法的时候，不需要用变量接收它的结果，可以继续调用其他方法）

```java
int len=getString().substring(1).replace(
        "A","Q"
).length();
```

**StringBuilder提高效率原理**

所有要拼接的字符串都会往StringBuilder中放，不会创建很多无用的空间，节约内存

#### StringBuilder源码分析

- 默认创建一个长度为16的字节数组
- 添加的内容长度小于16，直接存
- 添加的容量大于16会扩容（16*2+2=34）
- 如果扩容之后还不够，以实际长度为准

```java
StringBuilder sb=new StringBuilder();
System.out.println(sb.capacity());//16
```

### StringJoiner

```java
StringJoiner sj=new StringJoiner(",","[","]");
```

StringJoiner跟StringBuilder一样，也可以看成是一个容器，创建之后里面的内容是可变的（JDK8出现的）

```java
//构造方法
public StringJoiner(间隔符号)//创建一个StingJoiner对象，指定拼接时的间隔符号
public StringJoiner(间隔符号，开始符号，结束符号)//创建一个StingJoiner对象，指定拼接时的间隔符号、开始符号、结束符号
    
//成员方法
public StringJoiner add(添加的内容)//添加数据，并返回对象本身
public int length()//返回长度（字符出现的个数）
public String toString()//返回一个字符串（该字符串是拼接之后的结果）
```

### 字符串拼接的底层原理

- 如果没有变量参与，都是字符串直接相加，编译之后就是拼接之后的结果，会复用串池中的字符串

```java
String s="a"+"b"+"c";
```

- 如果有变量参与，每一行拼接的代码，都会在内存中创建新的字符串，浪费内存

```java
String s1="a";
String s2=s1+"b";
//相当于 new StringBuilder().append(s1).append("b").toString();
```

> 字符串拼接时，如果有变量：
>
> JDK8以前：系统底层会自动创建一个StringBuilder对象，然后再调用其append方法完成拼接，拼接后，再调用其toString方法转换为String类型，而toString方法的底层是直接newe了一个字符串对象
>
> JDK8以后：系统会预估字符串要拼接的总大小，把要拼接的内容都放在数组中，此时也是产生了一个新的字符串

## 集合

- 集合可以存引用数据类型，基本数据类型需要变成**包装类**再存储
- 集合长度可变

### ArrayList

泛型：<E>限定集合中存储数据的类型

```java
ArrayList<String> list=new ArrayList<String>();//JDK7以前

ArrayList<String> list=new ArrayList<>();//JDK7以后
```
