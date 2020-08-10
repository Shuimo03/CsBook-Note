# chapter1 spring的核心

## 名词解释

1. Java数据对象 JDO Java Data Object
2. 企业级JavaBean Enterprise JavaBean
3. 简单老式Java对象 Plan Old Java Object POJO

## spring的两个核心内容

1. DI 依赖注入
2. AOP 面向切面编程

## spring降低java开发的复杂性使用的关键策略

1. 基于pojo的轻量级和最小侵入编程
2. 通过依赖注入和面向接口实现松耦合
3. 基于切面和惯例进行声明式编程
4. 通过切面和模板减少样板式代码

## 控制反转IOC



## 依赖注入DI

依赖注入设计目的是为了分离关注点，分离调用方和依赖，从而提高可读性以及代码重用性，依赖注入属于控制反转最常用的技术。

### 依赖注入实现

### 注入方式

- 构造器注入
- setter方法注入
- 接口注入

## 面向切面编程AOP

AOP允许你把遍布应用各处的功能分离出来形成可重用的组件，

## 耦合

### 紧耦合

### 松耦合

## spring工作流程

## 模板消除样式代码

## bean容器

### bean的生命周期

## bean工厂

## 应用上下文

## spring模块

- 数据访问与集成
  - JDBC
  - ORM
  - OXM
  - JMS
  - Transaction
  - Messaging
- web与远程调用
  - web
  - web servlet
  - web portlet
  - webSocket
- 面向切面编程
  - AOP
  - Aspects
- instrumentation(为JVM添加代理 )
  - instrument
  - instrument Tomcat
- spring核心容器
  - Beans
  - Core
  - Context
  - Expression
  - Context support
- 测试
  - Test

spring的ORM模块是建立在对DAO的支持之上，并且多个ORM框架提供了一种构建DAO的简便方法。

## spring5.x新特性

