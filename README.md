# 《大型互联网应用轻量级架构实战》示例源码

 

## 内容简介

本书主要是介绍基于Maven、Jetty、Spring框架、Spring MVC、Spring Security、MyBatis、MySQL、Angular、NGINX、Redis、Spring Boot等开源技术栈搭建应用框架并快速实现互联网应用的过程。这些技术并未完全遵守传统的JEE所提供的规范，却被广大互联网公司所采用，其原因正是一种反传统的“轻量级”开发模式深入人心。所谓轻量，指的是抛弃墨守成规、面向规范的臃肿开发方式，转而采用开源的、重视解决具体问题的技术框架。

本书将带领读者从0开始搭建一个可以实现Web互联网应用的开发框架，命名为“Lite”。通过学习Lite轻量级框架的搭建过程，便于读者深刻理解Spring、MyBatis、MySQL等技术原理及实现方式，令读者具备架构软件的能力。同时，在Lite框架的基础上，还会继续实现一个“新闻头条”大型互联网应用，真正实现技术落地。


本书主要面向对Web开发、分布式系统、微服务开发感兴趣的计算机专业的学生、软件开发人员和系统架构师。


## 写作背景

随着云计算的普及、Cloud Native应用开发模式将会深入人心，这意味着未来的应用将会朝着快速迭代、分布部署、独立运行等方面发展，敏捷、轻量的框架也必将会受到更多开发者的青睐。为此笔者开发了Lite框架，以用于简化Web开发。

Lite框架抛弃了墨守成规、面向规范的臃肿开发方式，转而采用开源的、重视解决具体问题的技术。这些技术包括了Maven、Jetty、Spring框架、Spring MVC、Spring Security、MyBatis、MySQL、Angular、NGINX、Redis、Spring Boot等等，可以说都是当今互联网公司主流应用技术，经受住了大规模商业实践的考验。

读者通过学习Lite的框架搭建以及开发基于Lite的互联网应用的过程，能够深刻领会上述技术的底层原理，掌握实现软件架构的能力，提升自己在市场的竞争力。

全书分为以下部分：

1. 基础：介绍Spring、MyBatis、MySQL等开源技术栈。涉及技术包括Maven、Jetty、Spring框架、Spring MVC、Spring Security、MyBatis、MySQL、Angular、NGINX、Redis、Spring Boot等。
2. 进阶：从0开始搭建一个可以实现Web互联网应用的开发框架“Lite”。
3. 实战：基于Lite实现一个“新闻头条”互联网应用。
4. 提升：介绍Spring Boot等技术，通过Spring Boot来继续简化Lite框架。

![](https://wx4.sinaimg.cn/mw690/7e3647b2gy1gan6po9cc5j20u0140e84.jpg)


## 源代码

本书提供源代码下载，下载地址为<https://github.com/waylau/lite-book-demos> `samples`目录下。

## 本书所涉及的技术和相关版本

技术的版本是非常重要的，因为不同版本之间存在兼容性问题，而且不同版本的软件所对应的功能也是不同的。本书所列出的技术在版本上相对较新，都是经过笔者大量测试的。这样读者在自行编写代码时，可以参考本书所列出的版本，从而避免版本兼容性所产生的问题。建议读者将相关开发环境设置得跟本书一致，或者不低于本书所列的配置。详细的版本配置如下：

* JDK 9
* Eclipse Java EE IDE for Web Developers 4.8.0
* Tomcat 9.0.13
* Servlet 4.0.1
* Jetty 9.4.14.v20181114
* Spring 5.1.5.RELEASE
* Spring Web MVC 5.1.5.RELEASE
* Jackson JSON 2.9.7
* Spring Security 5.2.0.BUILD-SNAPSHOT
* MyBatis 3.4.6
* Mybatis Spring 1.3.2
* MySQL Community Server 8.0.12
* Apache Commons DBCP 2.5.0
* JUnit Jupiter Engine 5.3.2
* logback 1.2.3
* SLF4J 1.7.25
* NGINX 1.15.8
* Angular 7.0.6
* Redis 3.2.100
* Spring Data Redis 2.1.4.RELEASE
* Jedis 2.10.2
* Spring Boot 2.1.2.RELEASE
* MyBatis Spring Boot Starter 2.0.0



本书示例采用Eclipse编写，但示例源码与具体的IDE无关，读者可以选择适合自己的IDE，如IntelliJ IDEA、NetBeans等。运行本书示例，请确保JDK版本不低于 JDK 9。

## 勘误和交流

与该源码配套的书籍《大型互联网应用轻量级架构实战》已经出版，内容详见全书[目录](SUMMARY.md)。


本书如有勘误，会在<https://github.com/waylau/lite-book-demos/issues>上进行发布。笔者在编写本书的过程中，已竭尽所能地为读者呈现最好、最全的实用功能，但错漏之处在所难免，欢迎读者批评指正，也可以通过以下方式直接联系我们。

您也可以上[豆瓣](https://book.douban.com/subject/30476287/)给老卫打Call。



## 致谢

感谢北京大学出版社的各位工作人员为本书的出版所做的努力。

感谢我的父母、妻子和两个女儿。由于撰写本书，牺牲了很多陪伴家人的时间，在此感谢家人对我工作的理解和支持。

感谢广大读者一如既往的支持。
 


## 如何获取本书

实体店及各大网店有售。据我所知有如下网站供应：

* [京东](https://search.jd.com/Search?keyword=%E6%9F%B3%E4%BC%9F%E5%8D%AB%20%E5%A4%A7%E5%9E%8B%E4%BA%92%E8%81%94%E7%BD%91%E5%BA%94%E7%94%A8%E8%BD%BB%E9%87%8F%E7%BA%A7%E6%9E%B6%E6%9E%84%E5%AE%9E%E6%88%98&enc=utf-8&wq=%E6%9F%B3%E4%BC%9F%E5%8D%AB%20%E5%A4%A7%E5%9E%8B%E4%BA%92%E8%81%94%E7%BD%91%E5%BA%94%E7%94%A8%E8%BD%BB%E9%87%8F%E7%BA%A7%E6%9E%B6%E6%9E%84%E5%AE%9E%E6%88%98&pvid=c5f3b7b1bc664bbbbbe5c79c46538a1f)
* [1号店](https://search.yhd.com/c0-0/k%25E6%259F%25B3%25E4%25BC%259F%25E5%258D%25AB%2520%25E5%25A4%25A7%25E5%259E%258B%25E4%25BA%2592%25E8%2581%2594%25E7%25BD%2591%25E5%25BA%2594%25E7%2594%25A8%25E8%25BD%25BB%25E9%2587%258F%25E7%25BA%25A7%25E6%259E%25B6%25E6%259E%2584%25E5%25AE%259E%25E6%2588%2598/)
* [淘宝](https://s.taobao.com/search?q=%E6%9F%B3%E4%BC%9F%E5%8D%AB+%E5%A4%A7%E5%9E%8B%E4%BA%92%E8%81%94%E7%BD%91%E5%BA%94%E7%94%A8%E8%BD%BB%E9%87%8F%E7%BA%A7%E6%9E%B6%E6%9E%84%E5%AE%9E%E6%88%98&imgfile=&js=1&stats_click=search_radio_all%3A1&initiative_id=staobaoz_20200106&ie=utf8)
* [当当](http://search.dangdang.com/?key=%C1%F8%CE%B0%CE%C0%20%B4%F3%D0%CD%BB%A5%C1%AA%CD%F8%D3%A6%D3%C3%C7%E1%C1%BF%BC%B6%BC%DC%B9%B9%CA%B5%D5%BD&act=input)
* [亚马逊](https://www.amazon.cn/s?k=%E6%9F%B3%E4%BC%9F%E5%8D%AB+%E5%A4%A7%E5%9E%8B%E4%BA%92%E8%81%94%E7%BD%91%E5%BA%94%E7%94%A8%E8%BD%BB%E9%87%8F%E7%BA%A7%E6%9E%B6%E6%9E%84%E5%AE%9E%E6%88%98&__mk_zh_CN=%E4%BA%9A%E9%A9%AC%E9%80%8A%E7%BD%91%E7%AB%99&ref=nb_sb_noss)


也可以直接关注我博客（<https://waylau.com/>）或者我的开源书（<https://waylau.com/books/>）。


## 联系作者

您也可以直接联系我：

* 博客：https://waylau.com
* 邮箱：[waylau521(at)gmail.com](mailto:waylau521@gmail.com)
* 微博：http://weibo.com/waylau521
* 开源：https://github.com/waylau

## 其他书籍

若您对本书不感冒，笔者还写了其他方面的超过一打的书籍（可见<https://waylau.com/books/>），多是开源电子书。

本人也维护了一个[books-collection](https://github.com/waylau/books-collection)项目，里面提供了优质的专门给程序员的开源、免费图书集合。

## 开源捐赠


![开源捐赠](https://waylau.com/images/showmethemoney-sm.jpg)

捐赠所得所有款项将用于开源事业！见[捐赠列表](https://waylau.com/donate/)。
