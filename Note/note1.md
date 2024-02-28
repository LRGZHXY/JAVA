- [基础概念](#基础概念)
  - [IDEA](#idea)
    - [Scanner](#scanner)
- [运算符](#运算符)
  - [算数运算符](#算数运算符)
    - [数字的“+”操作](#数字的操作)
      - [隐式转换（自动类型提升）](#隐式转换自动类型提升)
      - [强制转换](#强制转换)
    - [字符串的“+”操作](#字符串的操作)
    - [字符的“+”操作](#字符的操作)
  - [](#)
## 基础概念

### IDEA

project->module->package->class(项目-模块-包-类)

psvm==public static void main(String[] args){ }

sout==System.out.println( );

#### Scanner

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

### 













