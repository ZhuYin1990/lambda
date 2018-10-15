package com.jdk.lambda;

import java.math.BigDecimal;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.IsoChronology;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * <p>Title: App.java</p>
 * <p>Description: </p>
 * <p>Company: http://www.jingdaka.com</p>
 * @author ZY
 * <p> Just go on !!!</p>
 * @date 2018年10月14日  下午3:45:12 
 * @version v1.0
 */
public class App {

	public static void main(String[] args) {
		
		//不可变的对象(比如String) new出来后其值不会发生改变
		BigDecimal a = new BigDecimal("100");
		System.out.println(a);
		
		BigDecimal b = a.add(new BigDecimal("200"));
		System.out.println(b);
		System.out.println(a); //a值为100 没有改变
		
		System.out.println("==========");
		
		String aa = new String("你好");
		System.out.println(aa);
		
		String bb = aa + new String("中国");
		System.out.println(bb);
		System.out.println(aa); //aa值未改变
		
		System.out.println("==========");
		
		Date d1 = new Date(60 * 1000L);
		System.out.println(d1);
		
		d1.setYear(d1.getYear() + 1);
		
		System.out.println(d1); // d 加上1年后值改变了
		
		System.out.println("==========");
		
		LocalDate d2 = LocalDate.now();
		System.out.println(d2);
		
		LocalDate d3 = d2.plusDays(15);	
		System.out.println(d3);
		System.out.println(d2);
		
		System.out.println("==========");
		
		LocalDateTime time = LocalDateTime.now();
		System.out.println(time);
		
		LocalDate min = LocalDate.MIN;
		LocalDate max = LocalDate.MAX;
		System.out.println(min);
		System.out.println(max);
		
		LocalDate date = LocalDate.of(2018, 8, 8);
		System.out.println(date);
		
		//判断某个数被4整除的余数
		System.out.println(23 & 3);
		
		//判断某个年份是否是闰年
		System.out.println(IsoChronology.INSTANCE.isLeapYear(2000));
	}
	
}

