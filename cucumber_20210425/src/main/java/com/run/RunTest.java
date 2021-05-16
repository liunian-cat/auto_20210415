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
        tags = {"@Automation"},//���д��˱�ǩ�ĳ���  ��~�����ų�����
        glue = {"com.steps"}//����
)
public class RunTest extends AbstractTestNGCucumberTests {

}
