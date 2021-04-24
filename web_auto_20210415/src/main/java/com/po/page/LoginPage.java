package com.po.page;

import org.openqa.selenium.By;

/**
 * @author liangjunjun
 * @date 2021-04-22-19:42
 * 163����
 **/
public class LoginPage {
    //����email�ı���Ķ�λ��ʽ
    public static By emailInput = By.name("email");
    //�������������Ķ�λ��ʽ
    public static By pwdInput = By.name("password");
    //�����¼��ť�Ķ�λ��ʽ
    public static By loginButton = By.id("dologin");
    //ע��
    public static By zhuceButton = By.id("changepage");
}
