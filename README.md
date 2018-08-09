# java study

在运行实例程序时，经常出现HelloDate.java:3: error: package net.mindview.util does not exist的问题，

这个主要时环境变量中classpath设定导致的。

我的环境时ubuntu，使用javac和java命令运行，解决方法是：

export JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64
export JRE_HOME=${JAVA_HOME}/jre
export CLASSPATH=.:${JAVA_HOME}/lib:${JRE_HOME}/lib:/home/XXX/study-java

即把代码的根目录添加到CLASSPATH里面去。我把解压后的代码都放到了study-java目录下。