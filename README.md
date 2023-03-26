# 新国标GBT32960 电动汽车远程服务与管理系统技术规范 第3部分：通信协议及数据格式
<p align="center">
    <img src="https://img.shields.io/badge/JDK-1.8+-green.svg"></img>
    <img src="https://img.shields.io/badge/License-Apache 2.0-green.svg"></img>
</p>

# 项目介绍
* 基于Netty，实现GBT32960协议的消息处理，与编码解码；
* 使用SpringBoot + MyBatis；
* 最简洁、清爽、易用的部标开发框架。
* 
# 主要特性
* 代码足够精简，便于二次开发；
* 提供公共组件库；
* 适合新手学习使用。

目录结构
```
GBT32960
│      
├──common
│    └── gbt32960数据解析用到的组件库
│         
└──electrical
      ├── netty nett服务启动入口
      │     ├── codec 消息编码解码
      │     └── handler 消息处理器
      │   
      └── web 业务数据处理
          
 ```
