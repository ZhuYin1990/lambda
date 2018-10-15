package com.jdk.lambda;
/**
 * <p>Title: LambdaTest.java</p>
 * <p>Description: 执行多线程任务</p>
 * <p>Company: http://www.jingdaka.com</p>
 * @author ZY
 * <p> Just go on !!!</p>
 * @date 2018年10月14日  下午4:32:13 
 * @version v1.0
 */
public class LambdaTest1 {

	public static void main(String[] args) {
		
		new Thread(new Runnable() {
			
			public void run() {
				System.out.println("执行输出的线程");
			}
		}).start();
		
		new Thread(()->{shuchu1("输出1");shuchu2("输出2");}).start();
	
	}
	
	public static void shuchu1(String a) {
		System.out.println(a);
	}
	public static void shuchu2(String a) {
		System.out.println(a);
	}
}

