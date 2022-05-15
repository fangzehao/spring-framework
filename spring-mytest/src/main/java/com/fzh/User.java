package com.fzh;

import org.springframework.stereotype.Component;

/**
 * @Author fangzehao
 * @Date 2022/5/15 12:49
 */
@Component
public class User {
	public String name = "ZoharFang";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
