# hilt_test
## 检查自己是否掌握了Hilt的使用方法
完成以下目标
- 把**StringUtil**变为单例，即每次注入的都是同一个对象，不需要反复创建对象
- 注入**StringUtil**到**QQLoginService**、**WechatLoginService**、**MainViewModel**和**MainActivity**中
- 注入类型为**Application**的**context**到**QQLoginService**中，注入类型为**Activity**的**context**到**WechatLoginService**中
- 把**LoginService**的两个实现类同时注入到**MainViewModel**中，属性的类型必须是**LoginService**接口，也就是如何区分两个类型都是**LoginService**的注入对象
- 在**DetailViewModel**中拿到**Activity**的**intent**里面key为*EXTRA_KEY_UUID*、类型为*String*的属性
- 在**DetailActivity**中使用经过Hilt注入的**DetailViewModel**对象
- app依赖了一个名为**wechat**的第三方库（在本demo中为项目内部的module），我们无法对**wechat**库里面的类进行修改。现在在**wechat**库中有一个**WechatShareService**接口和对应的**WechatShareServiceImpl**实现类，把实现类注入到**DetailActivity**中，但类型要声明为**WechatShareService**
