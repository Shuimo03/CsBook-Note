## 高级SQL
### 使用程序设计语言访问数据库
使用程序设计语言访问数据库的原因
+ 因为SQL没有提供通用程序设计语言那样的表达能力，所以SQL并不能表达所有查询要求。
+ 非声明动作都不能使用SQL实现。
+ 动态SQL: 通用程序设计语言可以通过方法或者函数来连接数据库服务器并且与之交互。
+ 嵌入式SQL: 嵌入式SQL必须在编译的时候确定，并且交给预处理器，预处理器程序提交SQL语句到数据库系统进行预编译和优化。
### 程序设计语言数据库API
+ JDBC
+ ODBC
## 嵌入式SQL
SQL标准定了嵌入SQL到很多不同的语言中，比如Java/C++/C，SQL查询嵌入的语言被称为宿主语言，宿主语言中使用的SQL结构时被称为嵌入式SQL。
## 函数与过程
函数和过程允许"业务逻辑"作为存储记录在数据库中，并且在数据库中执行，这样做的好处有很多，比如允许多个应用访问这些过程，
允许当业务规则发生变化的时候进行单个点的改变，而不用改变应用系统的其他部分，应用代码可以调用存储过程，而不用直接更新数据库关系。

SQL标准支持返回关系作为结果的函数被称为表函数，SQL允许多个过程同名，只要同名过程的参数个数不同，名称和参数个数可以表示一个过程，
同理SQL也允许多个函数同名。
### 支持过程和函数的语言构造
SQL所支持的构造赋予它和通用程序设计语言相当的几乎所有功能，SQL标准中处理这些构造的部分被称为持久存储模块。
SQL程序语言还支持发信号通知异常条件和声明句柄来处理异常。
## 触发器
触发器是一条语句，当对数据库进行修改的时候，它自动的被系统执行，要设置触发器机制，需要满足以下两个条件:
+ 指明什么条件下执行触发器，它被分解成一个引起触发器被检测的事件和一个触发器执行必须满足的条件。
+ 指明触发器执行时的动作。

### 对触发器的需求
触发器可以用来实现没有被SQL约束机制指定的某些完整性约束，还是一种非常有用的机制，用来满足特定条件时对用户发生警报或者自动执行某个任务。
触发器可以在事件之前激发，而不是仅在事件后发生，在事件之前被执行的触发器可以作为避免非法事件的额外约束。

为了避免执行非法动作而产生错误，触发器可以采用事件前激发，让实践操作变得合法化。
### 过渡表
过渡表时值包含所有被影响的行的临时表，过渡表不能用于before触发器，但是可以用于after触发器，无论它们是语言触发器还是行触发器，这样在过渡表的基础上，一个单独的SQL语句就可以用来
执行多个动作。
### 触发器有效性
触发器可以设置为有效或无效，默认情况下它们在创建的时候是有效的，但是可以通过使用alter trigger来设置成无效的。
设置为无效的触发器可以重新设为有效，触发器也可以被丢弃，即将永久移除。

## 查询
+ 递归查询
+ 迭代计算传递闭包

递归查询不能用于下列构造，因为这些构造会导致查询非单调:
+ 递归视图上的聚集
+ 在使用递归视图的子查询上的not exits语句
+ 右端使用递归视图的集合差操作

## 高级聚集特性
+ 排名(排序 rank)
  + order by
  + dense_rank
  + precent_rank
  + cume_dist
  + row_number
  + ntile
+ 分窗

窗口查询用来对于一定范围内的元组计算聚集函数，比如计算一个固定时间区间的聚集值，这个时间区间就是一个窗口。
窗口可以重叠，这种情况下一个元组可能对多个窗口都有贡献。
## OLAP
联机分析处理系统是一个交互式系统，它允许分析人员查看多维数据的不同种类的汇总数据。