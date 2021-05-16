package com.run;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * @author liangjunjun
 * @date 2021-04-27-22:11
 **/
@CucumberOptions(
        features = "src/test/features/first_cucumber.feature",
        format = {"pretty",
                    "html:target/site/cucumber-pretty",
                "rerun:target/site/return.txt",
                "json:target/cucumberjson.json"
        },
        tags = {"@Automation"},//运行带此标签的场景  “~”：排除符号
        glue = {"com.steps"}//包名
)
public class RunTest extends AbstractTestNGCucumberTests {

}
