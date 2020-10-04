## SQL
### SQL历史
SQL由IBM开发，最早被称为Sequel。
+ 1986年ANSI和ISO发布SQL标准:SQL-86
+ 1989年ANSI发布了SQL的扩充标准:SQL-89
+ SQL-92
+ SQL-1999
+ SQL-2003
+ SQL-2006
+ SQL-2008
### SQL组成
+ 数据定义语言(data definition language DDL)
  + 提供定义关系模式
  + 删除关系
  + 修改关系模式
+ 数据操纵语言(Data Manipulation Language DML)
  + 提供从数据库中查询信息。
  + 支持对数据库插入元组、删除元组、修改元组的能力。
+ 完整性:DDL包括定义完整性约束命令，保存在数据库中的数据必须满足所定义的完整性约束，破坏完整性约束的更新是不被允许的。
+ 视图定义
+ 嵌入式SQL和动态SQL:都可以嵌入到通用编程语言中，比如C/C++Java中。
+ 授权:包括定义对关系和试图的访问权限的命令。
### SQL数据定义
数据库中的关系集合必须由数据定义语言指定给系统，SQL的DDL不但能够定义一组关系，还可以定义每个关系中的信息。
+ 每个关系的模式。
+ 每个属性的取值类型。
+ 完整性约束。
+ 每个关系维护的索引集合。
+ 每个关系的完全性和权限信息。
+ 每个关系在磁盘上的物理存储结构。 
### SQL基本类型
+ char
+ varchar
+ int
+ smallint
+ numeric
+ real
+ double
+ precision
+ float

每种类型都可能包含一个被称为空值的特殊值，空值表示一个缺失的值。
char和varchar的区别在于，char是固定长度，而varchar是固定长度，打个比方，属性A的类型是char(10)，存入一个长度为3的字符串，
char会在填充7个空格，而varchar不会。
### 基本模式定义
+ create table
+ primary key:主码属性必须非空并且唯一。
+ foreign key
+ not null
+ insert into
+ delete from
+ alter

SQL禁止破坏完整性约束的任何数据更新。
### SQL查询的基本结构
SQL查询基本结构由三个子句组成
+ select:用于列出查询结果所需要的属性。
  + distinct:去重复。
  + all:显示指明不去重复。
+ from:是一个查询求值中需要的属性。
+ where:作用在from子句中关系的属性上的谓词。

查询的输入是在from子句中列出的关系，通过select和where子句进行指定运算，然后产生一个关系作为结果。

查询分为但关系查询和多关系查询，单关系查询就一张表进行查询，多关系查询就是多张表进行查询，但是结果都是一个样子，都是返回一个关系作为结果。

查询语句顺序建议是from,where,select;from选择关系，select选择属性，where选择一个操作。

### 自然连接 natural join
自然连接运算作用于两个关系，并且产生一个关系作为结果，自然连接只考虑那些在两个关系模式中都出现的属性上取值相同的元组对。
### 附加的基本运算
+ 更名运算 as
+ 字符串运算 使用一对单引号来表示字符串
  + 在字符串上可以使用like操作符来实现模式匹配
    + 百分号(%): 匹配任意子串。
    + 下划线(_): 匹配任意一个字符。
+ 排列元组的显示次序 order by 默认为升序，使用desc为降序，排序可以在多个属性上进行。
+ where子句谓词
+ select子句属性说明
### 集合运算
+ union(并运算):自动去除重复。
+ intersect(交运算):自动去除重复。
+ except(差运算)

### 空值
null属于逻辑值，因为where子句的谓词可以使用布尔运算，所以可以处理unknow值。
+ and
  + true and unknown-----> unknown
  + false and unknown-----> false
  + unknown and unknown-----> unknown
+ or
  + true or unknown-----> true
  + false or unknown-----> unknown
  + unknown or unknown-----> unknown
+ not
  + not unknown -----> unknown

### 聚集函数
+ 平均值 avg
+ 最小值 min
+ 最大值 max
+ 总计 sum
+ 计数 count

sum和avg的输入必须是数字集，其他的运算符可以用在非数字数据类型的集合上，比如字符串。
### 分组聚集
分组聚集可以让聚集函数作用在其他元组集上，通过SQL中的group by子句实现这个功能。
group by子句中给出的一个或多个属性是用来构造分组的。
### having子句
### 嵌套子查询
### 数据库的修改
+ delete: 只能用于一个关系，如果想从多个关系中删除元组，必须在每个关系上使用一条delete。
+ inset
+ update
