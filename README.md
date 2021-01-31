# Oauth
基于spring cloud实现一个Oauth功能模块的演示
## auth模块
- 逻辑实现利用了Mysql和Redis（本例为了简便演示，只使用一台API服务起，使用java的Map实现代替Redis）
    ### mysql来存储授权app的appKey和appSecret， Dao实现用了Mybatis
    ### redis用来存储Token和appKey的映射

## openApi拦截器

## Nacos discovery
- 服务注册发现





