## 代码描述：
- 模拟并发抢红包，模拟 30000 用户同时抢 5000 红包
- SSM + Redis

## 分支介绍：
- master，无锁情况，会出现超发情况，数据库中会扣发超过 5000 个红包

## 环境：
- jdk-8
- tomcat-8
- redis
- win10

## 运行
- maven 下载 pom 中的 jar 包
- 在 mysql 中运行 db_red_packet.sql
- 在火狐浏览器中测试，不要用谷歌浏览器中测试，单位时间内 post 请求太多时，谷歌浏览器会丢失 post 请求。