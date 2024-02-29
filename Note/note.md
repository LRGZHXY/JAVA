## 基础概念

### IDEA

project->module->package->class(项目-模块-包-类)

psvm==public static void main(String[] args){ }

sout==System.out.println( );

#### 快捷键

Ctrl+alt+L：自动格式化代码

### Scanner

1.导包：import java.util.Scanner;

2.创建对象：Scanner sc=new Scanner(System.in);

3.接受数据：int i=sc.nextInt();

Scanner可以接受键盘录入的数字

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

短路逻辑运算符:1.短路与：&& 

​			      2.短路或： ||

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

switch case语句：switch(表达式){case.....;}  表达式取值为byte、short、 int、 char,JDK5以后可以是枚举,JDK7以后可以是String（字符串）.













