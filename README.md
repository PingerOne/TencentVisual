## 腾讯MTA可视化埋点框架
 [ ![Download](https://api.bintray.com/packages/fungo/maven/tencent-visual/images/download.svg) ](https://bintray.com/fungo/maven/tencent-visual/_latestVersion)



官方提供的依赖包中添加了`slf4j-api-1.7.24`这个jar包，但是android官方也依赖这个包，导致依赖冲突，使用exclude并不能解决这个问题。这里自己重新添加依赖包。


### 使用
* 添加依赖

        dependencies {
             implementation 'com.pingerx:tencent-visual:1.0.0'
        }

* 按照文档进行配置

### 官方文档
* [腾讯MTA可视化埋点](https://mta.qq.com/docs/app_advance_access_visual_burial.html)