#language: zh-CN
功能: 163登录功能

  @Automation @p0
  场景: 测试正确的账号登录
    当打开163网站
    并且在email文本框中输入"meyoungtester"
    并且在密码框输入"meyoung123"
    当点击登录按钮
    那么登录成功

  @p2  @no
  场景: 测试正确的账号登录2
    假如打开163网站
    假如用"xxx"账号，密码"XXX"登录
    那么登录成功

  @p0
   场景大纲: 登录2
     当打开163网站
     当在email文本框中输入"<username>"
     而且在密码框输入"<pwd>"
     那么登录成功

     例子:
       | username | pwd  |
       |   test1  | pwd1 |
       |   test2  | pwd2 |
       |   test3  | pwd3 |
       |   test4  | pwd4 |

  场景: 关闭网站
    当关闭网站