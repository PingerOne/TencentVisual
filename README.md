## 腾讯MTA可视化埋点框架
> 官方提供的依赖包中添加了`slf4j-api-1.7.24`这个jar包，但是android官方也依赖这个包，导致依赖冲突，使用exclude并不能解决这个问题。这里自己重新添加依赖包。


### 使用
* 直接添加依赖即可：

        dependencies {
             implementation 'com.github.PingerOne:TencentVisual:1.0.1'
        }

