package com.fzh;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author fangzehao
 * @Date 2022/5/15 12:49
 */
public class FirstSpringTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		User user = (User) context.getBean("user");
		System.out.println(user.getName());
	}
}
