package edu.jlxy.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;

//将时间转换成与数据库相匹配的Date类型,即将String转换成java.util.Date再转换成java.sql.Date
public class DateUtil {
	public java.sql.Date toSqlDate(String source){
		
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		java.util.Date date;
		java.sql.Date date2 = null;
		try {
			date = format.parse(source);
			date2=new java.sql.Date(date.getTime());
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
		return date2;
		
	}
}
