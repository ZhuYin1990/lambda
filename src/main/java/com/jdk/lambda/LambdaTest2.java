package com.jdk.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * <p>Title: LambdaTest2.java</p>
 * <p>Description: 对list进行排序</p>
 * <p>Company: http://www.jingdaka.com</p>
 * @author ZY
 * <p> Just go on !!!</p>
 * @date 2018年10月14日  下午4:39:08 
 * @version v1.0
 */
public class LambdaTest2 {
	
	public static void main(String[] args) {
		
		//曾经的排序方式
		List<String> list1 = Arrays.asList("zhangsan","lisi","wangwu","zhaoliu","1234567");
		Collections.sort(list1, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		});
		System.out.println(list1);
		
		//Lambda表达式的运用
		List<String>list2 = Arrays.asList("12d3","43asd43","5s6874","dsafsdsd"); 
		Collections.sort(list2,(a,b) -> a.length() - b.length());
		Collections.sort(list2,(a,b) -> compare(a,b));
		System.out.println(list2);
	}

	private static int compare(String a, String b) {
		return a.length() - b.length();
	}
	
	
	
}

