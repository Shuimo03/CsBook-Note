# chapter1引言

## 什么是设计模式

每一个模式都在描述不断重复发生的问题，以及解决该问题的解决方案核心，这样的话，就能一次又一次的使用该方案，而不用做重复的劳动。

举个栗子来说，就是一直重复的开发，可以用一套设计模式来解决。

一个模式有四个基本元素

1. 模式名
2. 问题
3. 解决方案
4. 效果

## MVC模式

MVC包括三类对象

- Model 模型是应用对象
- View 是显示出来的对象
- Controller 定义用户界面对用户输入响应方式

![Model–view–controller - Wikipedia](https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/MVC-Process.svg/1200px-MVC-Process.svg.png)

如果应用在web当中，view可以理解成为前端页面，也就是见到的东西，model是模型，解决问题的模型，controller是后端，view对应model的输出，controller对应的model的输入，举个栗子，随便打开一个网站，网站显示出来的就是view，如果这个时候需要去改变一些数据，只需要去改变controller就行了。

## 描述设计模式

首先需要同时记录设计产生的决定过程，选择过程和权衡过程，同时也需要一些具体例子。

1. 模式名和分类
2. 意图
3. 别名
4. 动机
5. 适用性
6. 结构
7. 参与者
8. 协作
9. 效果
10. 实现
11. 代码示例
12. 已知应用
13. 相关模式

## 23种设计模式

1. Abstract Factory
2. Adapter
3. Bridge
4. Builder
5. Chain of Responsibility
6. Command
7. Composite
8. Decorator
9. Facade
10. Factory Method
11. Flyweight
12. Interpreter
13. Iterator
14. Mediator
15. Memento
16. Observer
17. Prototype
18. Proxy
19. Singleton
20. State
21. Strategy
22. Template Method
23. Visitor