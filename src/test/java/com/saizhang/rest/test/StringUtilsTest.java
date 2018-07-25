package com.saizhang.rest.test;

import org.junit.Test;

import com.saizhang.rest.logic.StringUtils;

public class StringUtilsTest {
	
	@Test
	public void test1() {
		System.out.println("[" + StringUtils.stringClean(null) + "]");
		System.out.println("[" + StringUtils.stringClean("") + "]");
		System.out.println("[" + StringUtils.stringClean("yyzzza") + "]");
		System.out.println("[" + StringUtils.stringClean("abbbcdd") + "]");
		System.out.println("[" + StringUtils.stringClean("Hello") + "]");
	}
	
	@Test
	public void test2() {
		System.out.println("[" + StringUtils.maxBlock(null) + "]");
		System.out.println("[" + StringUtils.maxBlock("") + "]");
		System.out.println("[" + StringUtils.maxBlock("hoopla") + "]");
		System.out.println("[" + StringUtils.maxBlock("abbCCCddBBBxx") + "]");
		System.out.println("[" + StringUtils.maxBlock("aaaaaaaaaaaaa") + "]");
		System.out.println("[" + StringUtils.maxBlock("abcdefghi") + "]");
	}
	
	@Test
	public void test3() {
		System.out.println("[" + StringUtils.reorderBlock(null) + "]");
		System.out.println("[" + StringUtils.reorderBlock("") + "]");
		System.out.println("[" + StringUtils.reorderBlock("bbAAccAadF") + "]");
		System.out.println("[" + StringUtils.reorderBlock("hoopla") + "]");
		System.out.println("[" + StringUtils.reorderBlock("fsdfajldsflasdf") + "]");
	}
}
