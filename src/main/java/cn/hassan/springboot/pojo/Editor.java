package cn.hassan.springboot.pojo;

import lombok.Data;

/**
 * Created with idea
 * Author: hss
 * Date: 2019/10/28 15:43
 * Description:
 */
@Data
public class Editor {
	private String name;
	private int age;

	public void init() {
		System.out.println("start init editor ...");
	}

	public void destroy() {
		System.out.println("destroy current bean ...");
	}
}
