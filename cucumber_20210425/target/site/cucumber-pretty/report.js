$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/features/first_cucumber.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: zh-CN"
    }
  ],
  "line": 2,
  "name": "163登录功能",
  "description": "",
  "id": "163登录功能",
  "keyword": "功能"
});
formatter.scenario({
  "line": 5,
  "name": "测试正确的账号登录",
  "description": "",
  "id": "163登录功能;测试正确的账号登录",
  "type": "scenario",
  "keyword": "场景",
  "tags": [
    {
      "line": 4,
      "name": "@Automation"
    },
    {
      "line": 4,
      "name": "@p0"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "打开163网站",
  "keyword": "当"
});
formatter.step({
  "line": 7,
  "name": "在email文本框中输入\"meyoungtester\"",
  "keyword": "并且"
});
formatter.step({
  "line": 8,
  "name": "在密码框输入\"meyoung123\"",
  "keyword": "并且"
});
formatter.step({
  "line": 9,
  "name": "点击登录按钮",
  "keyword": "当"
});
formatter.step({
  "line": 10,
  "name": "登录成功",
  "keyword": "那么"
});
formatter.match({
  "location": "Steps1.openUrl()"
});
formatter.result({
  "duration": 6591321601,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "meyoungtester",
      "offset": 13
    }
  ],
  "location": "Steps1.inputEmail(String)"
});
formatter.result({
  "duration": 2709800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "meyoung123",
      "offset": 7
    }
  ],
  "location": "Steps1.inputPwd(String)"
});
formatter.result({
  "duration": 65600,
  "status": "passed"
});
formatter.match({
  "location": "Steps1.clickLoginButton()"
});
formatter.result({
  "duration": 41200,
  "status": "passed"
});
formatter.match({
  "location": "Steps1.loginSuccess()"
});
formatter.result({
  "duration": 60500,
  "status": "passed"
});
});