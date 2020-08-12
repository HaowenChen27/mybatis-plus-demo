# mybatis-plus-demo
springboot整合mybatisplus

### 遇到的问题记录
1.启动类放在其他目录下去加载
造成的后果：Failed to load ApplicationContext
加上mybatis starter依赖不报这个错了  改为Invalid bound statement (not found)
排查一天 发现是因为启动类扫包路径问题

2.一般xml文件需要放到resources里，但是特殊需求需要把xml放在代码目录里
需要在pom.xml添加如下配置
``` xml
<build>
        <resources>
            <resource>
                <directory>src/main/java</directory>
                <includes>
                    <include>**/*.xml</include>
                </includes>
            </resource>
            <resource>
                <directory>src/main/resources</directory>
            </resource>
        </resources>
    </build>
```
@ComponentScan 注解可以使用通配符 但是注意 \* 只匹配包 \**才会匹配到包下的文件
不能直接使用'com.\**' 会不生效
