package cn.simon.jdbc.demo03_DBUtils的使用;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.simon.jdbc.domain.Category;

/**
 *  DBUtils执行数据库查询操作
 *  	1.QueryRunner(DataSource)
 *  	2.query(String sql, ResultSetHandler<T> rsh, Object... params); // 主要执行查询
 */

public class DBUtilsDemo {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

//		queryDemo01();
//		queryDemo02();
//		queryDemo03();
//		queryDemo04();
//		queryDemo05();
		queryDemo06();
//		queryDemo07();
//		queryDemo08();
	}
	
	// ArrayHandler处理类的使用
	public static void queryDemo01() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		Object[] objs = qr.query("select * from category where cid = ?", new ArrayHandler(), 1);
		for(Object o: objs){		// object[]中保存了object对象
			System.out.println(o);
		}
	}
	
	// ArrayListHandler
	public static void queryDemo02() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		List<Object[]> objs = qr.query("select * from category ", new ArrayListHandler());
		for (Object[] objects : objs) {
			System.out.println(objects[0]+"\t"+objects[1]);
		}
	}
	
	// BeanHandler处理类的使用
	public static void queryDemo03() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Category c = qr.query(sql, new BeanHandler<Category>(Category.class));
		System.out.println(c);
	}
	
	// BeanListHandler
	public static void queryDemo04() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Category> c = qr.query(sql, new BeanListHandler<Category>(Category.class));
		for (Category category : c) {
			System.out.println(category);
		}
	}
	
	// ColumnListHandler处理类的使用
	public static void queryDemo05() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Object> c = qr.query(sql, new ColumnListHandler<Object>("cname"));
		System.out.println(c);
	}
	
	// MapHandler处理类的使用
	public static void queryDemo06() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Map<String, Object> map = qr.query(sql, new MapHandler());
		// 3.
		System.out.println(map);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo07() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Map<String, Object>> maps = qr.query(sql, new MapListHandler());
		// 3.List
		System.out.println(maps);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo08() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select count(*) from category";
		Long count = qr.query(sql, new ScalarHandler<Long>());
		// 3.List
		System.out.println(count);
	}
}
package cn.simon.jdbc.demo03_DBUtils的使用;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.simon.jdbc.domain.Category;

/**
 *  DBUtils执行数据库查询操作
 *  	1.QueryRunner(DataSource)
 *  	2.query(String sql, ResultSetHandler<T> rsh, Object... params); // 主要执行查询
 */

public class DBUtilsDemo {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

//		queryDemo01();
//		queryDemo02();
//		queryDemo03();
//		queryDemo04();
//		queryDemo05();
		queryDemo06();
//		queryDemo07();
//		queryDemo08();
	}
	
	// ArrayHandler处理类的使用
	public static void queryDemo01() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		Object[] objs = qr.query("select * from category where cid = ?", new ArrayHandler(), 1);
		for(Object o: objs){		// object[]中保存了object对象
			System.out.println(o);
		}
	}
	
	// ArrayListHandler
	public static void queryDemo02() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		List<Object[]> objs = qr.query("select * from category ", new ArrayListHandler());
		for (Object[] objects : objs) {
			System.out.println(objects[0]+"\t"+objects[1]);
		}
	}
	
	// BeanHandler处理类的使用
	public static void queryDemo03() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Category c = qr.query(sql, new BeanHandler<Category>(Category.class));
		System.out.println(c);
	}
	
	// BeanListHandler
	public static void queryDemo04() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Category> c = qr.query(sql, new BeanListHandler<Category>(Category.class));
		for (Category category : c) {
			System.out.println(category);
		}
	}
	
	// ColumnListHandler处理类的使用
	public static void queryDemo05() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Object> c = qr.query(sql, new ColumnListHandler<Object>("cname"));
		System.out.println(c);
	}
	
	// MapHandler处理类的使用
	public static void queryDemo06() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Map<String, Object> map = qr.query(sql, new MapHandler());
		// 3.
		System.out.println(map);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo07() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Map<String, Object>> maps = qr.query(sql, new MapListHandler());
		// 3.List
		System.out.println(maps);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo08() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select count(*) from category";
		Long count = qr.query(sql, new ScalarHandler<Long>());
		// 3.List
		System.out.println(count);
	}
}
package cn.simon.jdbc.demo03_DBUtils的使用;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.simon.jdbc.domain.Category;

/**
 *  DBUtils执行数据库查询操作
 *  	1.QueryRunner(DataSource)
 *  	2.query(String sql, ResultSetHandler<T> rsh, Object... params); // 主要执行查询
 */

public class DBUtilsDemo {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

//		queryDemo01();
//		queryDemo02();
//		queryDemo03();
//		queryDemo04();
//		queryDemo05();
		queryDemo06();
//		queryDemo07();
//		queryDemo08();
	}
	
	// ArrayHandler处理类的使用
	public static void queryDemo01() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		Object[] objs = qr.query("select * from category where cid = ?", new ArrayHandler(), 1);
		for(Object o: objs){		// object[]中保存了object对象
			System.out.println(o);
		}
	}
	
	// ArrayListHandler
	public static void queryDemo02() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		List<Object[]> objs = qr.query("select * from category ", new ArrayListHandler());
		for (Object[] objects : objs) {
			System.out.println(objects[0]+"\t"+objects[1]);
		}
	}
	
	// BeanHandler处理类的使用
	public static void queryDemo03() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Category c = qr.query(sql, new BeanHandler<Category>(Category.class));
		System.out.println(c);
	}
	
	// BeanListHandler
	public static void queryDemo04() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Category> c = qr.query(sql, new BeanListHandler<Category>(Category.class));
		for (Category category : c) {
			System.out.println(category);
		}
	}
	
	// ColumnListHandler处理类的使用
	public static void queryDemo05() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Object> c = qr.query(sql, new ColumnListHandler<Object>("cname"));
		System.out.println(c);
	}
	
	// MapHandler处理类的使用
	public static void queryDemo06() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Map<String, Object> map = qr.query(sql, new MapHandler());
		// 3.
		System.out.println(map);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo07() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Map<String, Object>> maps = qr.query(sql, new MapListHandler());
		// 3.List
		System.out.println(maps);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo08() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select count(*) from category";
		Long count = qr.query(sql, new ScalarHandler<Long>());
		// 3.List
		System.out.println(count);
	}
}
package cn.simon.jdbc.demo03_DBUtils的使用;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.simon.jdbc.domain.Category;

/**
 *  DBUtils执行数据库查询操作
 *  	1.QueryRunner(DataSource)
 *  	2.query(String sql, ResultSetHandler<T> rsh, Object... params); // 主要执行查询
 */

public class DBUtilsDemo {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

//		queryDemo01();
//		queryDemo02();
//		queryDemo03();
//		queryDemo04();
//		queryDemo05();
		queryDemo06();
//		queryDemo07();
//		queryDemo08();
	}
	
	// ArrayHandler处理类的使用
	public static void queryDemo01() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		Object[] objs = qr.query("select * from category where cid = ?", new ArrayHandler(), 1);
		for(Object o: objs){		// object[]中保存了object对象
			System.out.println(o);
		}
	}
	
	// ArrayListHandler
	public static void queryDemo02() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		List<Object[]> objs = qr.query("select * from category ", new ArrayListHandler());
		for (Object[] objects : objs) {
			System.out.println(objects[0]+"\t"+objects[1]);
		}
	}
	
	// BeanHandler处理类的使用
	public static void queryDemo03() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Category c = qr.query(sql, new BeanHandler<Category>(Category.class));
		System.out.println(c);
	}
	
	// BeanListHandler
	public static void queryDemo04() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Category> c = qr.query(sql, new BeanListHandler<Category>(Category.class));
		for (Category category : c) {
			System.out.println(category);
		}
	}
	
	// ColumnListHandler处理类的使用
	public static void queryDemo05() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Object> c = qr.query(sql, new ColumnListHandler<Object>("cname"));
		System.out.println(c);
	}
	
	// MapHandler处理类的使用
	public static void queryDemo06() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Map<String, Object> map = qr.query(sql, new MapHandler());
		// 3.
		System.out.println(map);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo07() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Map<String, Object>> maps = qr.query(sql, new MapListHandler());
		// 3.List
		System.out.println(maps);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo08() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select count(*) from category";
		Long count = qr.query(sql, new ScalarHandler<Long>());
		// 3.List
		System.out.println(count);
	}
}
package cn.simon.jdbc.demo03_DBUtils的使用;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.simon.jdbc.domain.Category;

/**
 *  DBUtils执行数据库查询操作
 *  	1.QueryRunner(DataSource)
 *  	2.query(String sql, ResultSetHandler<T> rsh, Object... params); // 主要执行查询
 */

public class DBUtilsDemo {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

//		queryDemo01();
//		queryDemo02();
//		queryDemo03();
//		queryDemo04();
//		queryDemo05();
		queryDemo06();
//		queryDemo07();
//		queryDemo08();
	}
	
	// ArrayHandler处理类的使用
	public static void queryDemo01() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		Object[] objs = qr.query("select * from category where cid = ?", new ArrayHandler(), 1);
		for(Object o: objs){		// object[]中保存了object对象
			System.out.println(o);
		}
	}
	
	// ArrayListHandler
	public static void queryDemo02() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		List<Object[]> objs = qr.query("select * from category ", new ArrayListHandler());
		for (Object[] objects : objs) {
			System.out.println(objects[0]+"\t"+objects[1]);
		}
	}
	
	// BeanHandler处理类的使用
	public static void queryDemo03() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Category c = qr.query(sql, new BeanHandler<Category>(Category.class));
		System.out.println(c);
	}
	
	// BeanListHandler
	public static void queryDemo04() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Category> c = qr.query(sql, new BeanListHandler<Category>(Category.class));
		for (Category category : c) {
			System.out.println(category);
		}
	}
	
	// ColumnListHandler处理类的使用
	public static void queryDemo05() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Object> c = qr.query(sql, new ColumnListHandler<Object>("cname"));
		System.out.println(c);
	}
	
	// MapHandler处理类的使用
	public static void queryDemo06() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Map<String, Object> map = qr.query(sql, new MapHandler());
		// 3.
		System.out.println(map);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo07() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Map<String, Object>> maps = qr.query(sql, new MapListHandler());
		// 3.List
		System.out.println(maps);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo08() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select count(*) from category";
		Long count = qr.query(sql, new ScalarHandler<Long>());
		// 3.List
		System.out.println(count);
	}
}
package cn.simon.jdbc.demo03_DBUtils的使用;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.simon.jdbc.domain.Category;

/**
 *  DBUtils执行数据库查询操作
 *  	1.QueryRunner(DataSource)
 *  	2.query(String sql, ResultSetHandler<T> rsh, Object... params); // 主要执行查询
 */

public class DBUtilsDemo {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

//		queryDemo01();
//		queryDemo02();
//		queryDemo03();
//		queryDemo04();
//		queryDemo05();
		queryDemo06();
//		queryDemo07();
//		queryDemo08();
	}
	
	// ArrayHandler处理类的使用
	public static void queryDemo01() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		Object[] objs = qr.query("select * from category where cid = ?", new ArrayHandler(), 1);
		for(Object o: objs){		// object[]中保存了object对象
			System.out.println(o);
		}
	}
	
	// ArrayListHandler
	public static void queryDemo02() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		List<Object[]> objs = qr.query("select * from category ", new ArrayListHandler());
		for (Object[] objects : objs) {
			System.out.println(objects[0]+"\t"+objects[1]);
		}
	}
	
	// BeanHandler处理类的使用
	public static void queryDemo03() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Category c = qr.query(sql, new BeanHandler<Category>(Category.class));
		System.out.println(c);
	}
	
	// BeanListHandler
	public static void queryDemo04() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Category> c = qr.query(sql, new BeanListHandler<Category>(Category.class));
		for (Category category : c) {
			System.out.println(category);
		}
	}
	
	// ColumnListHandler处理类的使用
	public static void queryDemo05() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Object> c = qr.query(sql, new ColumnListHandler<Object>("cname"));
		System.out.println(c);
	}
	
	// MapHandler处理类的使用
	public static void queryDemo06() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Map<String, Object> map = qr.query(sql, new MapHandler());
		// 3.
		System.out.println(map);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo07() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Map<String, Object>> maps = qr.query(sql, new MapListHandler());
		// 3.List
		System.out.println(maps);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo08() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select count(*) from category";
		Long count = qr.query(sql, new ScalarHandler<Long>());
		// 3.List
		System.out.println(count);
	}
}
package cn.simon.jdbc.demo03_DBUtils的使用;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.simon.jdbc.domain.Category;

/**
 *  DBUtils执行数据库查询操作
 *  	1.QueryRunner(DataSource)
 *  	2.query(String sql, ResultSetHandler<T> rsh, Object... params); // 主要执行查询
 */

public class DBUtilsDemo {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

//		queryDemo01();
//		queryDemo02();
//		queryDemo03();
//		queryDemo04();
//		queryDemo05();
		queryDemo06();
//		queryDemo07();
//		queryDemo08();
	}
	
	// ArrayHandler处理类的使用
	public static void queryDemo01() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		Object[] objs = qr.query("select * from category where cid = ?", new ArrayHandler(), 1);
		for(Object o: objs){		// object[]中保存了object对象
			System.out.println(o);
		}
	}
	
	// ArrayListHandler
	public static void queryDemo02() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		List<Object[]> objs = qr.query("select * from category ", new ArrayListHandler());
		for (Object[] objects : objs) {
			System.out.println(objects[0]+"\t"+objects[1]);
		}
	}
	
	// BeanHandler处理类的使用
	public static void queryDemo03() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Category c = qr.query(sql, new BeanHandler<Category>(Category.class));
		System.out.println(c);
	}
	
	// BeanListHandler
	public static void queryDemo04() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Category> c = qr.query(sql, new BeanListHandler<Category>(Category.class));
		for (Category category : c) {
			System.out.println(category);
		}
	}
	
	// ColumnListHandler处理类的使用
	public static void queryDemo05() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Object> c = qr.query(sql, new ColumnListHandler<Object>("cname"));
		System.out.println(c);
	}
	
	// MapHandler处理类的使用
	public static void queryDemo06() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Map<String, Object> map = qr.query(sql, new MapHandler());
		// 3.
		System.out.println(map);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo07() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Map<String, Object>> maps = qr.query(sql, new MapListHandler());
		// 3.List
		System.out.println(maps);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo08() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select count(*) from category";
		Long count = qr.query(sql, new ScalarHandler<Long>());
		// 3.List
		System.out.println(count);
	}
}
package cn.simon.jdbc.demo03_DBUtils的使用;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.simon.jdbc.domain.Category;

/**
 *  DBUtils执行数据库查询操作
 *  	1.QueryRunner(DataSource)
 *  	2.query(String sql, ResultSetHandler<T> rsh, Object... params); // 主要执行查询
 */

public class DBUtilsDemo {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

//		queryDemo01();
//		queryDemo02();
//		queryDemo03();
//		queryDemo04();
//		queryDemo05();
		queryDemo06();
//		queryDemo07();
//		queryDemo08();
	}
	
	// ArrayHandler处理类的使用
	public static void queryDemo01() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		Object[] objs = qr.query("select * from category where cid = ?", new ArrayHandler(), 1);
		for(Object o: objs){		// object[]中保存了object对象
			System.out.println(o);
		}
	}
	
	// ArrayListHandler
	public static void queryDemo02() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		List<Object[]> objs = qr.query("select * from category ", new ArrayListHandler());
		for (Object[] objects : objs) {
			System.out.println(objects[0]+"\t"+objects[1]);
		}
	}
	
	// BeanHandler处理类的使用
	public static void queryDemo03() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Category c = qr.query(sql, new BeanHandler<Category>(Category.class));
		System.out.println(c);
	}
	
	// BeanListHandler
	public static void queryDemo04() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Category> c = qr.query(sql, new BeanListHandler<Category>(Category.class));
		for (Category category : c) {
			System.out.println(category);
		}
	}
	
	// ColumnListHandler处理类的使用
	public static void queryDemo05() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Object> c = qr.query(sql, new ColumnListHandler<Object>("cname"));
		System.out.println(c);
	}
	
	// MapHandler处理类的使用
	public static void queryDemo06() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Map<String, Object> map = qr.query(sql, new MapHandler());
		// 3.
		System.out.println(map);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo07() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Map<String, Object>> maps = qr.query(sql, new MapListHandler());
		// 3.List
		System.out.println(maps);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo08() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select count(*) from category";
		Long count = qr.query(sql, new ScalarHandler<Long>());
		// 3.List
		System.out.println(count);
	}
}
package cn.simon.jdbc.demo03_DBUtils的使用;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.simon.jdbc.domain.Category;

/**
 *  DBUtils执行数据库查询操作
 *  	1.QueryRunner(DataSource)
 *  	2.query(String sql, ResultSetHandler<T> rsh, Object... params); // 主要执行查询
 */

public class DBUtilsDemo {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

//		queryDemo01();
//		queryDemo02();
//		queryDemo03();
//		queryDemo04();
//		queryDemo05();
		queryDemo06();
//		queryDemo07();
//		queryDemo08();
	}
	
	// ArrayHandler处理类的使用
	public static void queryDemo01() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		Object[] objs = qr.query("select * from category where cid = ?", new ArrayHandler(), 1);
		for(Object o: objs){		// object[]中保存了object对象
			System.out.println(o);
		}
	}
	
	// ArrayListHandler
	public static void queryDemo02() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		List<Object[]> objs = qr.query("select * from category ", new ArrayListHandler());
		for (Object[] objects : objs) {
			System.out.println(objects[0]+"\t"+objects[1]);
		}
	}
	
	// BeanHandler处理类的使用
	public static void queryDemo03() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Category c = qr.query(sql, new BeanHandler<Category>(Category.class));
		System.out.println(c);
	}
	
	// BeanListHandler
	public static void queryDemo04() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Category> c = qr.query(sql, new BeanListHandler<Category>(Category.class));
		for (Category category : c) {
			System.out.println(category);
		}
	}
	
	// ColumnListHandler处理类的使用
	public static void queryDemo05() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Object> c = qr.query(sql, new ColumnListHandler<Object>("cname"));
		System.out.println(c);
	}
	
	// MapHandler处理类的使用
	public static void queryDemo06() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Map<String, Object> map = qr.query(sql, new MapHandler());
		// 3.
		System.out.println(map);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo07() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Map<String, Object>> maps = qr.query(sql, new MapListHandler());
		// 3.List
		System.out.println(maps);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo08() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select count(*) from category";
		Long count = qr.query(sql, new ScalarHandler<Long>());
		// 3.List
		System.out.println(count);
	}
}
package cn.simon.jdbc.demo03_DBUtils的使用;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.simon.jdbc.domain.Category;

/**
 *  DBUtils执行数据库查询操作
 *  	1.QueryRunner(DataSource)
 *  	2.query(String sql, ResultSetHandler<T> rsh, Object... params); // 主要执行查询
 */

public class DBUtilsDemo {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

//		queryDemo01();
//		queryDemo02();
//		queryDemo03();
//		queryDemo04();
//		queryDemo05();
		queryDemo06();
//		queryDemo07();
//		queryDemo08();
	}
	
	// ArrayHandler处理类的使用
	public static void queryDemo01() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		Object[] objs = qr.query("select * from category where cid = ?", new ArrayHandler(), 1);
		for(Object o: objs){		// object[]中保存了object对象
			System.out.println(o);
		}
	}
	
	// ArrayListHandler
	public static void queryDemo02() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		List<Object[]> objs = qr.query("select * from category ", new ArrayListHandler());
		for (Object[] objects : objs) {
			System.out.println(objects[0]+"\t"+objects[1]);
		}
	}
	
	// BeanHandler处理类的使用
	public static void queryDemo03() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Category c = qr.query(sql, new BeanHandler<Category>(Category.class));
		System.out.println(c);
	}
	
	// BeanListHandler
	public static void queryDemo04() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Category> c = qr.query(sql, new BeanListHandler<Category>(Category.class));
		for (Category category : c) {
			System.out.println(category);
		}
	}
	
	// ColumnListHandler处理类的使用
	public static void queryDemo05() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Object> c = qr.query(sql, new ColumnListHandler<Object>("cname"));
		System.out.println(c);
	}
	
	// MapHandler处理类的使用
	public static void queryDemo06() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Map<String, Object> map = qr.query(sql, new MapHandler());
		// 3.
		System.out.println(map);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo07() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Map<String, Object>> maps = qr.query(sql, new MapListHandler());
		// 3.List
		System.out.println(maps);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo08() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select count(*) from category";
		Long count = qr.query(sql, new ScalarHandler<Long>());
		// 3.List
		System.out.println(count);
	}
}
package cn.simon.jdbc.demo03_DBUtils的使用;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.simon.jdbc.domain.Category;

/**
 *  DBUtils执行数据库查询操作
 *  	1.QueryRunner(DataSource)
 *  	2.query(String sql, ResultSetHandler<T> rsh, Object... params); // 主要执行查询
 */

public class DBUtilsDemo {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

//		queryDemo01();
//		queryDemo02();
//		queryDemo03();
//		queryDemo04();
//		queryDemo05();
		queryDemo06();
//		queryDemo07();
//		queryDemo08();
	}
	
	// ArrayHandler处理类的使用
	public static void queryDemo01() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		Object[] objs = qr.query("select * from category where cid = ?", new ArrayHandler(), 1);
		for(Object o: objs){		// object[]中保存了object对象
			System.out.println(o);
		}
	}
	
	// ArrayListHandler
	public static void queryDemo02() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		List<Object[]> objs = qr.query("select * from category ", new ArrayListHandler());
		for (Object[] objects : objs) {
			System.out.println(objects[0]+"\t"+objects[1]);
		}
	}
	
	// BeanHandler处理类的使用
	public static void queryDemo03() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Category c = qr.query(sql, new BeanHandler<Category>(Category.class));
		System.out.println(c);
	}
	
	// BeanListHandler
	public static void queryDemo04() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Category> c = qr.query(sql, new BeanListHandler<Category>(Category.class));
		for (Category category : c) {
			System.out.println(category);
		}
	}
	
	// ColumnListHandler处理类的使用
	public static void queryDemo05() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Object> c = qr.query(sql, new ColumnListHandler<Object>("cname"));
		System.out.println(c);
	}
	
	// MapHandler处理类的使用
	public static void queryDemo06() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Map<String, Object> map = qr.query(sql, new MapHandler());
		// 3.
		System.out.println(map);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo07() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Map<String, Object>> maps = qr.query(sql, new MapListHandler());
		// 3.List
		System.out.println(maps);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo08() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select count(*) from category";
		Long count = qr.query(sql, new ScalarHandler<Long>());
		// 3.List
		System.out.println(count);
	}
}
package cn.simon.jdbc.demo03_DBUtils的使用;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.simon.jdbc.domain.Category;

/**
 *  DBUtils执行数据库查询操作
 *  	1.QueryRunner(DataSource)
 *  	2.query(String sql, ResultSetHandler<T> rsh, Object... params); // 主要执行查询
 */

public class DBUtilsDemo {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

//		queryDemo01();
//		queryDemo02();
//		queryDemo03();
//		queryDemo04();
//		queryDemo05();
		queryDemo06();
//		queryDemo07();
//		queryDemo08();
	}
	
	// ArrayHandler处理类的使用
	public static void queryDemo01() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		Object[] objs = qr.query("select * from category where cid = ?", new ArrayHandler(), 1);
		for(Object o: objs){		// object[]中保存了object对象
			System.out.println(o);
		}
	}
	
	// ArrayListHandler
	public static void queryDemo02() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		List<Object[]> objs = qr.query("select * from category ", new ArrayListHandler());
		for (Object[] objects : objs) {
			System.out.println(objects[0]+"\t"+objects[1]);
		}
	}
	
	// BeanHandler处理类的使用
	public static void queryDemo03() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Category c = qr.query(sql, new BeanHandler<Category>(Category.class));
		System.out.println(c);
	}
	
	// BeanListHandler
	public static void queryDemo04() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Category> c = qr.query(sql, new BeanListHandler<Category>(Category.class));
		for (Category category : c) {
			System.out.println(category);
		}
	}
	
	// ColumnListHandler处理类的使用
	public static void queryDemo05() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Object> c = qr.query(sql, new ColumnListHandler<Object>("cname"));
		System.out.println(c);
	}
	
	// MapHandler处理类的使用
	public static void queryDemo06() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Map<String, Object> map = qr.query(sql, new MapHandler());
		// 3.
		System.out.println(map);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo07() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Map<String, Object>> maps = qr.query(sql, new MapListHandler());
		// 3.List
		System.out.println(maps);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo08() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select count(*) from category";
		Long count = qr.query(sql, new ScalarHandler<Long>());
		// 3.List
		System.out.println(count);
	}
}
package cn.simon.jdbc.demo03_DBUtils的使用;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.simon.jdbc.domain.Category;

/**
 *  DBUtils执行数据库查询操作
 *  	1.QueryRunner(DataSource)
 *  	2.query(String sql, ResultSetHandler<T> rsh, Object... params); // 主要执行查询
 */

public class DBUtilsDemo {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

//		queryDemo01();
//		queryDemo02();
//		queryDemo03();
//		queryDemo04();
//		queryDemo05();
		queryDemo06();
//		queryDemo07();
//		queryDemo08();
	}
	
	// ArrayHandler处理类的使用
	public static void queryDemo01() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		Object[] objs = qr.query("select * from category where cid = ?", new ArrayHandler(), 1);
		for(Object o: objs){		// object[]中保存了object对象
			System.out.println(o);
		}
	}
	
	// ArrayListHandler
	public static void queryDemo02() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		List<Object[]> objs = qr.query("select * from category ", new ArrayListHandler());
		for (Object[] objects : objs) {
			System.out.println(objects[0]+"\t"+objects[1]);
		}
	}
	
	// BeanHandler处理类的使用
	public static void queryDemo03() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Category c = qr.query(sql, new BeanHandler<Category>(Category.class));
		System.out.println(c);
	}
	
	// BeanListHandler
	public static void queryDemo04() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Category> c = qr.query(sql, new BeanListHandler<Category>(Category.class));
		for (Category category : c) {
			System.out.println(category);
		}
	}
	
	// ColumnListHandler处理类的使用
	public static void queryDemo05() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Object> c = qr.query(sql, new ColumnListHandler<Object>("cname"));
		System.out.println(c);
	}
	
	// MapHandler处理类的使用
	public static void queryDemo06() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Map<String, Object> map = qr.query(sql, new MapHandler());
		// 3.
		System.out.println(map);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo07() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Map<String, Object>> maps = qr.query(sql, new MapListHandler());
		// 3.List
		System.out.println(maps);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo08() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select count(*) from category";
		Long count = qr.query(sql, new ScalarHandler<Long>());
		// 3.List
		System.out.println(count);
	}
}
package cn.simon.jdbc.demo03_DBUtils的使用;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.simon.jdbc.domain.Category;

/**
 *  DBUtils执行数据库查询操作
 *  	1.QueryRunner(DataSource)
 *  	2.query(String sql, ResultSetHandler<T> rsh, Object... params); // 主要执行查询
 */

public class DBUtilsDemo {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

//		queryDemo01();
//		queryDemo02();
//		queryDemo03();
//		queryDemo04();
//		queryDemo05();
		queryDemo06();
//		queryDemo07();
//		queryDemo08();
	}
	
	// ArrayHandler处理类的使用
	public static void queryDemo01() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		Object[] objs = qr.query("select * from category where cid = ?", new ArrayHandler(), 1);
		for(Object o: objs){		// object[]中保存了object对象
			System.out.println(o);
		}
	}
	
	// ArrayListHandler
	public static void queryDemo02() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		List<Object[]> objs = qr.query("select * from category ", new ArrayListHandler());
		for (Object[] objects : objs) {
			System.out.println(objects[0]+"\t"+objects[1]);
		}
	}
	
	// BeanHandler处理类的使用
	public static void queryDemo03() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Category c = qr.query(sql, new BeanHandler<Category>(Category.class));
		System.out.println(c);
	}
	
	// BeanListHandler
	public static void queryDemo04() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Category> c = qr.query(sql, new BeanListHandler<Category>(Category.class));
		for (Category category : c) {
			System.out.println(category);
		}
	}
	
	// ColumnListHandler处理类的使用
	public static void queryDemo05() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Object> c = qr.query(sql, new ColumnListHandler<Object>("cname"));
		System.out.println(c);
	}
	
	// MapHandler处理类的使用
	public static void queryDemo06() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Map<String, Object> map = qr.query(sql, new MapHandler());
		// 3.
		System.out.println(map);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo07() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Map<String, Object>> maps = qr.query(sql, new MapListHandler());
		// 3.List
		System.out.println(maps);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo08() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select count(*) from category";
		Long count = qr.query(sql, new ScalarHandler<Long>());
		// 3.List
		System.out.println(count);
	}
}
package cn.simon.jdbc.demo03_DBUtils的使用;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.simon.jdbc.domain.Category;

/**
 *  DBUtils执行数据库查询操作
 *  	1.QueryRunner(DataSource)
 *  	2.query(String sql, ResultSetHandler<T> rsh, Object... params); // 主要执行查询
 */

public class DBUtilsDemo {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

//		queryDemo01();
//		queryDemo02();
//		queryDemo03();
//		queryDemo04();
//		queryDemo05();
		queryDemo06();
//		queryDemo07();
//		queryDemo08();
	}
	
	// ArrayHandler处理类的使用
	public static void queryDemo01() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		Object[] objs = qr.query("select * from category where cid = ?", new ArrayHandler(), 1);
		for(Object o: objs){		// object[]中保存了object对象
			System.out.println(o);
		}
	}
	
	// ArrayListHandler
	public static void queryDemo02() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		List<Object[]> objs = qr.query("select * from category ", new ArrayListHandler());
		for (Object[] objects : objs) {
			System.out.println(objects[0]+"\t"+objects[1]);
		}
	}
	
	// BeanHandler处理类的使用
	public static void queryDemo03() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Category c = qr.query(sql, new BeanHandler<Category>(Category.class));
		System.out.println(c);
	}
	
	// BeanListHandler
	public static void queryDemo04() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Category> c = qr.query(sql, new BeanListHandler<Category>(Category.class));
		for (Category category : c) {
			System.out.println(category);
		}
	}
	
	// ColumnListHandler处理类的使用
	public static void queryDemo05() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Object> c = qr.query(sql, new ColumnListHandler<Object>("cname"));
		System.out.println(c);
	}
	
	// MapHandler处理类的使用
	public static void queryDemo06() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Map<String, Object> map = qr.query(sql, new MapHandler());
		// 3.
		System.out.println(map);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo07() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Map<String, Object>> maps = qr.query(sql, new MapListHandler());
		// 3.List
		System.out.println(maps);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo08() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select count(*) from category";
		Long count = qr.query(sql, new ScalarHandler<Long>());
		// 3.List
		System.out.println(count);
	}
}
package cn.simon.jdbc.demo03_DBUtils的使用;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.simon.jdbc.domain.Category;

/**
 *  DBUtils执行数据库查询操作
 *  	1.QueryRunner(DataSource)
 *  	2.query(String sql, ResultSetHandler<T> rsh, Object... params); // 主要执行查询
 */

public class DBUtilsDemo {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

//		queryDemo01();
//		queryDemo02();
//		queryDemo03();
//		queryDemo04();
//		queryDemo05();
		queryDemo06();
//		queryDemo07();
//		queryDemo08();
	}
	
	// ArrayHandler处理类的使用
	public static void queryDemo01() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		Object[] objs = qr.query("select * from category where cid = ?", new ArrayHandler(), 1);
		for(Object o: objs){		// object[]中保存了object对象
			System.out.println(o);
		}
	}
	
	// ArrayListHandler
	public static void queryDemo02() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		List<Object[]> objs = qr.query("select * from category ", new ArrayListHandler());
		for (Object[] objects : objs) {
			System.out.println(objects[0]+"\t"+objects[1]);
		}
	}
	
	// BeanHandler处理类的使用
	public static void queryDemo03() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Category c = qr.query(sql, new BeanHandler<Category>(Category.class));
		System.out.println(c);
	}
	
	// BeanListHandler
	public static void queryDemo04() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Category> c = qr.query(sql, new BeanListHandler<Category>(Category.class));
		for (Category category : c) {
			System.out.println(category);
		}
	}
	
	// ColumnListHandler处理类的使用
	public static void queryDemo05() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Object> c = qr.query(sql, new ColumnListHandler<Object>("cname"));
		System.out.println(c);
	}
	
	// MapHandler处理类的使用
	public static void queryDemo06() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Map<String, Object> map = qr.query(sql, new MapHandler());
		// 3.
		System.out.println(map);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo07() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Map<String, Object>> maps = qr.query(sql, new MapListHandler());
		// 3.List
		System.out.println(maps);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo08() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select count(*) from category";
		Long count = qr.query(sql, new ScalarHandler<Long>());
		// 3.List
		System.out.println(count);
	}
}
package cn.simon.jdbc.demo03_DBUtils的使用;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.simon.jdbc.domain.Category;

/**
 *  DBUtils执行数据库查询操作
 *  	1.QueryRunner(DataSource)
 *  	2.query(String sql, ResultSetHandler<T> rsh, Object... params); // 主要执行查询
 */

public class DBUtilsDemo {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

//		queryDemo01();
//		queryDemo02();
//		queryDemo03();
//		queryDemo04();
//		queryDemo05();
		queryDemo06();
//		queryDemo07();
//		queryDemo08();
	}
	
	// ArrayHandler处理类的使用
	public static void queryDemo01() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		Object[] objs = qr.query("select * from category where cid = ?", new ArrayHandler(), 1);
		for(Object o: objs){		// object[]中保存了object对象
			System.out.println(o);
		}
	}
	
	// ArrayListHandler
	public static void queryDemo02() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		List<Object[]> objs = qr.query("select * from category ", new ArrayListHandler());
		for (Object[] objects : objs) {
			System.out.println(objects[0]+"\t"+objects[1]);
		}
	}
	
	// BeanHandler处理类的使用
	public static void queryDemo03() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Category c = qr.query(sql, new BeanHandler<Category>(Category.class));
		System.out.println(c);
	}
	
	// BeanListHandler
	public static void queryDemo04() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Category> c = qr.query(sql, new BeanListHandler<Category>(Category.class));
		for (Category category : c) {
			System.out.println(category);
		}
	}
	
	// ColumnListHandler处理类的使用
	public static void queryDemo05() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Object> c = qr.query(sql, new ColumnListHandler<Object>("cname"));
		System.out.println(c);
	}
	
	// MapHandler处理类的使用
	public static void queryDemo06() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Map<String, Object> map = qr.query(sql, new MapHandler());
		// 3.
		System.out.println(map);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo07() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Map<String, Object>> maps = qr.query(sql, new MapListHandler());
		// 3.List
		System.out.println(maps);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo08() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select count(*) from category";
		Long count = qr.query(sql, new ScalarHandler<Long>());
		// 3.List
		System.out.println(count);
	}
}
package cn.simon.jdbc.demo03_DBUtils的使用;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.simon.jdbc.domain.Category;

/**
 *  DBUtils执行数据库查询操作
 *  	1.QueryRunner(DataSource)
 *  	2.query(String sql, ResultSetHandler<T> rsh, Object... params); // 主要执行查询
 */

public class DBUtilsDemo {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

//		queryDemo01();
//		queryDemo02();
//		queryDemo03();
//		queryDemo04();
//		queryDemo05();
		queryDemo06();
//		queryDemo07();
//		queryDemo08();
	}
	
	// ArrayHandler处理类的使用
	public static void queryDemo01() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		Object[] objs = qr.query("select * from category where cid = ?", new ArrayHandler(), 1);
		for(Object o: objs){		// object[]中保存了object对象
			System.out.println(o);
		}
	}
	
	// ArrayListHandler
	public static void queryDemo02() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		List<Object[]> objs = qr.query("select * from category ", new ArrayListHandler());
		for (Object[] objects : objs) {
			System.out.println(objects[0]+"\t"+objects[1]);
		}
	}
	
	// BeanHandler处理类的使用
	public static void queryDemo03() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Category c = qr.query(sql, new BeanHandler<Category>(Category.class));
		System.out.println(c);
	}
	
	// BeanListHandler
	public static void queryDemo04() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Category> c = qr.query(sql, new BeanListHandler<Category>(Category.class));
		for (Category category : c) {
			System.out.println(category);
		}
	}
	
	// ColumnListHandler处理类的使用
	public static void queryDemo05() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Object> c = qr.query(sql, new ColumnListHandler<Object>("cname"));
		System.out.println(c);
	}
	
	// MapHandler处理类的使用
	public static void queryDemo06() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Map<String, Object> map = qr.query(sql, new MapHandler());
		// 3.
		System.out.println(map);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo07() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Map<String, Object>> maps = qr.query(sql, new MapListHandler());
		// 3.List
		System.out.println(maps);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo08() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select count(*) from category";
		Long count = qr.query(sql, new ScalarHandler<Long>());
		// 3.List
		System.out.println(count);
	}
}
package cn.simon.jdbc.demo03_DBUtils的使用;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.simon.jdbc.domain.Category;

/**
 *  DBUtils执行数据库查询操作
 *  	1.QueryRunner(DataSource)
 *  	2.query(String sql, ResultSetHandler<T> rsh, Object... params); // 主要执行查询
 */

public class DBUtilsDemo {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

//		queryDemo01();
//		queryDemo02();
//		queryDemo03();
//		queryDemo04();
//		queryDemo05();
		queryDemo06();
//		queryDemo07();
//		queryDemo08();
	}
	
	// ArrayHandler处理类的使用
	public static void queryDemo01() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		Object[] objs = qr.query("select * from category where cid = ?", new ArrayHandler(), 1);
		for(Object o: objs){		// object[]中保存了object对象
			System.out.println(o);
		}
	}
	
	// ArrayListHandler
	public static void queryDemo02() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		List<Object[]> objs = qr.query("select * from category ", new ArrayListHandler());
		for (Object[] objects : objs) {
			System.out.println(objects[0]+"\t"+objects[1]);
		}
	}
	
	// BeanHandler处理类的使用
	public static void queryDemo03() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Category c = qr.query(sql, new BeanHandler<Category>(Category.class));
		System.out.println(c);
	}
	
	// BeanListHandler
	public static void queryDemo04() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Category> c = qr.query(sql, new BeanListHandler<Category>(Category.class));
		for (Category category : c) {
			System.out.println(category);
		}
	}
	
	// ColumnListHandler处理类的使用
	public static void queryDemo05() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Object> c = qr.query(sql, new ColumnListHandler<Object>("cname"));
		System.out.println(c);
	}
	
	// MapHandler处理类的使用
	public static void queryDemo06() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Map<String, Object> map = qr.query(sql, new MapHandler());
		// 3.
		System.out.println(map);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo07() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Map<String, Object>> maps = qr.query(sql, new MapListHandler());
		// 3.List
		System.out.println(maps);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo08() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select count(*) from category";
		Long count = qr.query(sql, new ScalarHandler<Long>());
		// 3.List
		System.out.println(count);
	}
}
package cn.simon.jdbc.demo03_DBUtils的使用;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.simon.jdbc.domain.Category;

/**
 *  DBUtils执行数据库查询操作
 *  	1.QueryRunner(DataSource)
 *  	2.query(String sql, ResultSetHandler<T> rsh, Object... params); // 主要执行查询
 */

public class DBUtilsDemo {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

//		queryDemo01();
//		queryDemo02();
//		queryDemo03();
//		queryDemo04();
//		queryDemo05();
		queryDemo06();
//		queryDemo07();
//		queryDemo08();
	}
	
	// ArrayHandler处理类的使用
	public static void queryDemo01() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		Object[] objs = qr.query("select * from category where cid = ?", new ArrayHandler(), 1);
		for(Object o: objs){		// object[]中保存了object对象
			System.out.println(o);
		}
	}
	
	// ArrayListHandler
	public static void queryDemo02() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		List<Object[]> objs = qr.query("select * from category ", new ArrayListHandler());
		for (Object[] objects : objs) {
			System.out.println(objects[0]+"\t"+objects[1]);
		}
	}
	
	// BeanHandler处理类的使用
	public static void queryDemo03() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Category c = qr.query(sql, new BeanHandler<Category>(Category.class));
		System.out.println(c);
	}
	
	// BeanListHandler
	public static void queryDemo04() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Category> c = qr.query(sql, new BeanListHandler<Category>(Category.class));
		for (Category category : c) {
			System.out.println(category);
		}
	}
	
	// ColumnListHandler处理类的使用
	public static void queryDemo05() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Object> c = qr.query(sql, new ColumnListHandler<Object>("cname"));
		System.out.println(c);
	}
	
	// MapHandler处理类的使用
	public static void queryDemo06() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Map<String, Object> map = qr.query(sql, new MapHandler());
		// 3.
		System.out.println(map);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo07() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Map<String, Object>> maps = qr.query(sql, new MapListHandler());
		// 3.List
		System.out.println(maps);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo08() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select count(*) from category";
		Long count = qr.query(sql, new ScalarHandler<Long>());
		// 3.List
		System.out.println(count);
	}
}
package cn.simon.jdbc.demo03_DBUtils的使用;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.simon.jdbc.domain.Category;

/**
 *  DBUtils执行数据库查询操作
 *  	1.QueryRunner(DataSource)
 *  	2.query(String sql, ResultSetHandler<T> rsh, Object... params); // 主要执行查询
 */

public class DBUtilsDemo {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

//		queryDemo01();
//		queryDemo02();
//		queryDemo03();
//		queryDemo04();
//		queryDemo05();
		queryDemo06();
//		queryDemo07();
//		queryDemo08();
	}
	
	// ArrayHandler处理类的使用
	public static void queryDemo01() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		Object[] objs = qr.query("select * from category where cid = ?", new ArrayHandler(), 1);
		for(Object o: objs){		// object[]中保存了object对象
			System.out.println(o);
		}
	}
	
	// ArrayListHandler
	public static void queryDemo02() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		List<Object[]> objs = qr.query("select * from category ", new ArrayListHandler());
		for (Object[] objects : objs) {
			System.out.println(objects[0]+"\t"+objects[1]);
		}
	}
	
	// BeanHandler处理类的使用
	public static void queryDemo03() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Category c = qr.query(sql, new BeanHandler<Category>(Category.class));
		System.out.println(c);
	}
	
	// BeanListHandler
	public static void queryDemo04() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Category> c = qr.query(sql, new BeanListHandler<Category>(Category.class));
		for (Category category : c) {
			System.out.println(category);
		}
	}
	
	// ColumnListHandler处理类的使用
	public static void queryDemo05() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Object> c = qr.query(sql, new ColumnListHandler<Object>("cname"));
		System.out.println(c);
	}
	
	// MapHandler处理类的使用
	public static void queryDemo06() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Map<String, Object> map = qr.query(sql, new MapHandler());
		// 3.
		System.out.println(map);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo07() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Map<String, Object>> maps = qr.query(sql, new MapListHandler());
		// 3.List
		System.out.println(maps);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo08() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select count(*) from category";
		Long count = qr.query(sql, new ScalarHandler<Long>());
		// 3.List
		System.out.println(count);
	}
}
package cn.simon.jdbc.demo03_DBUtils的使用;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.simon.jdbc.domain.Category;

/**
 *  DBUtils执行数据库查询操作
 *  	1.QueryRunner(DataSource)
 *  	2.query(String sql, ResultSetHandler<T> rsh, Object... params); // 主要执行查询
 */

public class DBUtilsDemo {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

//		queryDemo01();
//		queryDemo02();
//		queryDemo03();
//		queryDemo04();
//		queryDemo05();
		queryDemo06();
//		queryDemo07();
//		queryDemo08();
	}
	
	// ArrayHandler处理类的使用
	public static void queryDemo01() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		Object[] objs = qr.query("select * from category where cid = ?", new ArrayHandler(), 1);
		for(Object o: objs){		// object[]中保存了object对象
			System.out.println(o);
		}
	}
	
	// ArrayListHandler
	public static void queryDemo02() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		List<Object[]> objs = qr.query("select * from category ", new ArrayListHandler());
		for (Object[] objects : objs) {
			System.out.println(objects[0]+"\t"+objects[1]);
		}
	}
	
	// BeanHandler处理类的使用
	public static void queryDemo03() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Category c = qr.query(sql, new BeanHandler<Category>(Category.class));
		System.out.println(c);
	}
	
	// BeanListHandler
	public static void queryDemo04() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Category> c = qr.query(sql, new BeanListHandler<Category>(Category.class));
		for (Category category : c) {
			System.out.println(category);
		}
	}
	
	// ColumnListHandler处理类的使用
	public static void queryDemo05() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Object> c = qr.query(sql, new ColumnListHandler<Object>("cname"));
		System.out.println(c);
	}
	
	// MapHandler处理类的使用
	public static void queryDemo06() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Map<String, Object> map = qr.query(sql, new MapHandler());
		// 3.
		System.out.println(map);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo07() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Map<String, Object>> maps = qr.query(sql, new MapListHandler());
		// 3.List
		System.out.println(maps);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo08() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select count(*) from category";
		Long count = qr.query(sql, new ScalarHandler<Long>());
		// 3.List
		System.out.println(count);
	}
}
package cn.simon.jdbc.demo03_DBUtils的使用;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.simon.jdbc.domain.Category;

/**
 *  DBUtils执行数据库查询操作
 *  	1.QueryRunner(DataSource)
 *  	2.query(String sql, ResultSetHandler<T> rsh, Object... params); // 主要执行查询
 */

public class DBUtilsDemo {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

//		queryDemo01();
//		queryDemo02();
//		queryDemo03();
//		queryDemo04();
//		queryDemo05();
		queryDemo06();
//		queryDemo07();
//		queryDemo08();
	}
	
	// ArrayHandler处理类的使用
	public static void queryDemo01() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		Object[] objs = qr.query("select * from category where cid = ?", new ArrayHandler(), 1);
		for(Object o: objs){		// object[]中保存了object对象
			System.out.println(o);
		}
	}
	
	// ArrayListHandler
	public static void queryDemo02() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		List<Object[]> objs = qr.query("select * from category ", new ArrayListHandler());
		for (Object[] objects : objs) {
			System.out.println(objects[0]+"\t"+objects[1]);
		}
	}
	
	// BeanHandler处理类的使用
	public static void queryDemo03() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Category c = qr.query(sql, new BeanHandler<Category>(Category.class));
		System.out.println(c);
	}
	
	// BeanListHandler
	public static void queryDemo04() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Category> c = qr.query(sql, new BeanListHandler<Category>(Category.class));
		for (Category category : c) {
			System.out.println(category);
		}
	}
	
	// ColumnListHandler处理类的使用
	public static void queryDemo05() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Object> c = qr.query(sql, new ColumnListHandler<Object>("cname"));
		System.out.println(c);
	}
	
	// MapHandler处理类的使用
	public static void queryDemo06() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Map<String, Object> map = qr.query(sql, new MapHandler());
		// 3.
		System.out.println(map);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo07() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Map<String, Object>> maps = qr.query(sql, new MapListHandler());
		// 3.List
		System.out.println(maps);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo08() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select count(*) from category";
		Long count = qr.query(sql, new ScalarHandler<Long>());
		// 3.List
		System.out.println(count);
	}
}
package cn.simon.jdbc.demo03_DBUtils的使用;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.simon.jdbc.domain.Category;

/**
 *  DBUtils执行数据库查询操作
 *  	1.QueryRunner(DataSource)
 *  	2.query(String sql, ResultSetHandler<T> rsh, Object... params); // 主要执行查询
 */

public class DBUtilsDemo {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

//		queryDemo01();
//		queryDemo02();
//		queryDemo03();
//		queryDemo04();
//		queryDemo05();
		queryDemo06();
//		queryDemo07();
//		queryDemo08();
	}
	
	// ArrayHandler处理类的使用
	public static void queryDemo01() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		Object[] objs = qr.query("select * from category where cid = ?", new ArrayHandler(), 1);
		for(Object o: objs){		// object[]中保存了object对象
			System.out.println(o);
		}
	}
	
	// ArrayListHandler
	public static void queryDemo02() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		List<Object[]> objs = qr.query("select * from category ", new ArrayListHandler());
		for (Object[] objects : objs) {
			System.out.println(objects[0]+"\t"+objects[1]);
		}
	}
	
	// BeanHandler处理类的使用
	public static void queryDemo03() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Category c = qr.query(sql, new BeanHandler<Category>(Category.class));
		System.out.println(c);
	}
	
	// BeanListHandler
	public static void queryDemo04() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Category> c = qr.query(sql, new BeanListHandler<Category>(Category.class));
		for (Category category : c) {
			System.out.println(category);
		}
	}
	
	// ColumnListHandler处理类的使用
	public static void queryDemo05() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Object> c = qr.query(sql, new ColumnListHandler<Object>("cname"));
		System.out.println(c);
	}
	
	// MapHandler处理类的使用
	public static void queryDemo06() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Map<String, Object> map = qr.query(sql, new MapHandler());
		// 3.
		System.out.println(map);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo07() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Map<String, Object>> maps = qr.query(sql, new MapListHandler());
		// 3.List
		System.out.println(maps);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo08() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select count(*) from category";
		Long count = qr.query(sql, new ScalarHandler<Long>());
		// 3.List
		System.out.println(count);
	}
}
package cn.simon.jdbc.demo03_DBUtils的使用;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.simon.jdbc.domain.Category;

/**
 *  DBUtils执行数据库查询操作
 *  	1.QueryRunner(DataSource)
 *  	2.query(String sql, ResultSetHandler<T> rsh, Object... params); // 主要执行查询
 */

public class DBUtilsDemo {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

//		queryDemo01();
//		queryDemo02();
//		queryDemo03();
//		queryDemo04();
//		queryDemo05();
		queryDemo06();
//		queryDemo07();
//		queryDemo08();
	}
	
	// ArrayHandler处理类的使用
	public static void queryDemo01() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		Object[] objs = qr.query("select * from category where cid = ?", new ArrayHandler(), 1);
		for(Object o: objs){		// object[]中保存了object对象
			System.out.println(o);
		}
	}
	
	// ArrayListHandler
	public static void queryDemo02() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		List<Object[]> objs = qr.query("select * from category ", new ArrayListHandler());
		for (Object[] objects : objs) {
			System.out.println(objects[0]+"\t"+objects[1]);
		}
	}
	
	// BeanHandler处理类的使用
	public static void queryDemo03() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Category c = qr.query(sql, new BeanHandler<Category>(Category.class));
		System.out.println(c);
	}
	
	// BeanListHandler
	public static void queryDemo04() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Category> c = qr.query(sql, new BeanListHandler<Category>(Category.class));
		for (Category category : c) {
			System.out.println(category);
		}
	}
	
	// ColumnListHandler处理类的使用
	public static void queryDemo05() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Object> c = qr.query(sql, new ColumnListHandler<Object>("cname"));
		System.out.println(c);
	}
	
	// MapHandler处理类的使用
	public static void queryDemo06() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Map<String, Object> map = qr.query(sql, new MapHandler());
		// 3.
		System.out.println(map);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo07() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Map<String, Object>> maps = qr.query(sql, new MapListHandler());
		// 3.List
		System.out.println(maps);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo08() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select count(*) from category";
		Long count = qr.query(sql, new ScalarHandler<Long>());
		// 3.List
		System.out.println(count);
	}
}
package cn.simon.jdbc.demo03_DBUtils的使用;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.simon.jdbc.domain.Category;

/**
 *  DBUtils执行数据库查询操作
 *  	1.QueryRunner(DataSource)
 *  	2.query(String sql, ResultSetHandler<T> rsh, Object... params); // 主要执行查询
 */

public class DBUtilsDemo {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

//		queryDemo01();
//		queryDemo02();
//		queryDemo03();
//		queryDemo04();
//		queryDemo05();
		queryDemo06();
//		queryDemo07();
//		queryDemo08();
	}
	
	// ArrayHandler处理类的使用
	public static void queryDemo01() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		Object[] objs = qr.query("select * from category where cid = ?", new ArrayHandler(), 1);
		for(Object o: objs){		// object[]中保存了object对象
			System.out.println(o);
		}
	}
	
	// ArrayListHandler
	public static void queryDemo02() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		List<Object[]> objs = qr.query("select * from category ", new ArrayListHandler());
		for (Object[] objects : objs) {
			System.out.println(objects[0]+"\t"+objects[1]);
		}
	}
	
	// BeanHandler处理类的使用
	public static void queryDemo03() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Category c = qr.query(sql, new BeanHandler<Category>(Category.class));
		System.out.println(c);
	}
	
	// BeanListHandler
	public static void queryDemo04() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Category> c = qr.query(sql, new BeanListHandler<Category>(Category.class));
		for (Category category : c) {
			System.out.println(category);
		}
	}
	
	// ColumnListHandler处理类的使用
	public static void queryDemo05() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Object> c = qr.query(sql, new ColumnListHandler<Object>("cname"));
		System.out.println(c);
	}
	
	// MapHandler处理类的使用
	public static void queryDemo06() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Map<String, Object> map = qr.query(sql, new MapHandler());
		// 3.
		System.out.println(map);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo07() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Map<String, Object>> maps = qr.query(sql, new MapListHandler());
		// 3.List
		System.out.println(maps);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo08() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select count(*) from category";
		Long count = qr.query(sql, new ScalarHandler<Long>());
		// 3.List
		System.out.println(count);
	}
}
package cn.simon.jdbc.demo03_DBUtils的使用;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.simon.jdbc.domain.Category;

/**
 *  DBUtils执行数据库查询操作
 *  	1.QueryRunner(DataSource)
 *  	2.query(String sql, ResultSetHandler<T> rsh, Object... params); // 主要执行查询
 */

public class DBUtilsDemo {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

//		queryDemo01();
//		queryDemo02();
//		queryDemo03();
//		queryDemo04();
//		queryDemo05();
		queryDemo06();
//		queryDemo07();
//		queryDemo08();
	}
	
	// ArrayHandler处理类的使用
	public static void queryDemo01() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		Object[] objs = qr.query("select * from category where cid = ?", new ArrayHandler(), 1);
		for(Object o: objs){		// object[]中保存了object对象
			System.out.println(o);
		}
	}
	
	// ArrayListHandler
	public static void queryDemo02() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		List<Object[]> objs = qr.query("select * from category ", new ArrayListHandler());
		for (Object[] objects : objs) {
			System.out.println(objects[0]+"\t"+objects[1]);
		}
	}
	
	// BeanHandler处理类的使用
	public static void queryDemo03() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Category c = qr.query(sql, new BeanHandler<Category>(Category.class));
		System.out.println(c);
	}
	
	// BeanListHandler
	public static void queryDemo04() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Category> c = qr.query(sql, new BeanListHandler<Category>(Category.class));
		for (Category category : c) {
			System.out.println(category);
		}
	}
	
	// ColumnListHandler处理类的使用
	public static void queryDemo05() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Object> c = qr.query(sql, new ColumnListHandler<Object>("cname"));
		System.out.println(c);
	}
	
	// MapHandler处理类的使用
	public static void queryDemo06() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Map<String, Object> map = qr.query(sql, new MapHandler());
		// 3.
		System.out.println(map);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo07() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Map<String, Object>> maps = qr.query(sql, new MapListHandler());
		// 3.List
		System.out.println(maps);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo08() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select count(*) from category";
		Long count = qr.query(sql, new ScalarHandler<Long>());
		// 3.List
		System.out.println(count);
	}
}
package cn.simon.jdbc.demo03_DBUtils的使用;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.simon.jdbc.domain.Category;

/**
 *  DBUtils执行数据库查询操作
 *  	1.QueryRunner(DataSource)
 *  	2.query(String sql, ResultSetHandler<T> rsh, Object... params); // 主要执行查询
 */

public class DBUtilsDemo {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

//		queryDemo01();
//		queryDemo02();
//		queryDemo03();
//		queryDemo04();
//		queryDemo05();
		queryDemo06();
//		queryDemo07();
//		queryDemo08();
	}
	
	// ArrayHandler处理类的使用
	public static void queryDemo01() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		Object[] objs = qr.query("select * from category where cid = ?", new ArrayHandler(), 1);
		for(Object o: objs){		// object[]中保存了object对象
			System.out.println(o);
		}
	}
	
	// ArrayListHandler
	public static void queryDemo02() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		List<Object[]> objs = qr.query("select * from category ", new ArrayListHandler());
		for (Object[] objects : objs) {
			System.out.println(objects[0]+"\t"+objects[1]);
		}
	}
	
	// BeanHandler处理类的使用
	public static void queryDemo03() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Category c = qr.query(sql, new BeanHandler<Category>(Category.class));
		System.out.println(c);
	}
	
	// BeanListHandler
	public static void queryDemo04() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Category> c = qr.query(sql, new BeanListHandler<Category>(Category.class));
		for (Category category : c) {
			System.out.println(category);
		}
	}
	
	// ColumnListHandler处理类的使用
	public static void queryDemo05() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Object> c = qr.query(sql, new ColumnListHandler<Object>("cname"));
		System.out.println(c);
	}
	
	// MapHandler处理类的使用
	public static void queryDemo06() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Map<String, Object> map = qr.query(sql, new MapHandler());
		// 3.
		System.out.println(map);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo07() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Map<String, Object>> maps = qr.query(sql, new MapListHandler());
		// 3.List
		System.out.println(maps);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo08() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select count(*) from category";
		Long count = qr.query(sql, new ScalarHandler<Long>());
		// 3.List
		System.out.println(count);
	}
}
package cn.simon.jdbc.demo03_DBUtils的使用;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.simon.jdbc.domain.Category;

/**
 *  DBUtils执行数据库查询操作
 *  	1.QueryRunner(DataSource)
 *  	2.query(String sql, ResultSetHandler<T> rsh, Object... params); // 主要执行查询
 */

public class DBUtilsDemo {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

//		queryDemo01();
//		queryDemo02();
//		queryDemo03();
//		queryDemo04();
//		queryDemo05();
		queryDemo06();
//		queryDemo07();
//		queryDemo08();
	}
	
	// ArrayHandler处理类的使用
	public static void queryDemo01() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		Object[] objs = qr.query("select * from category where cid = ?", new ArrayHandler(), 1);
		for(Object o: objs){		// object[]中保存了object对象
			System.out.println(o);
		}
	}
	
	// ArrayListHandler
	public static void queryDemo02() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		List<Object[]> objs = qr.query("select * from category ", new ArrayListHandler());
		for (Object[] objects : objs) {
			System.out.println(objects[0]+"\t"+objects[1]);
		}
	}
	
	// BeanHandler处理类的使用
	public static void queryDemo03() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Category c = qr.query(sql, new BeanHandler<Category>(Category.class));
		System.out.println(c);
	}
	
	// BeanListHandler
	public static void queryDemo04() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Category> c = qr.query(sql, new BeanListHandler<Category>(Category.class));
		for (Category category : c) {
			System.out.println(category);
		}
	}
	
	// ColumnListHandler处理类的使用
	public static void queryDemo05() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Object> c = qr.query(sql, new ColumnListHandler<Object>("cname"));
		System.out.println(c);
	}
	
	// MapHandler处理类的使用
	public static void queryDemo06() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Map<String, Object> map = qr.query(sql, new MapHandler());
		// 3.
		System.out.println(map);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo07() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Map<String, Object>> maps = qr.query(sql, new MapListHandler());
		// 3.List
		System.out.println(maps);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo08() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select count(*) from category";
		Long count = qr.query(sql, new ScalarHandler<Long>());
		// 3.List
		System.out.println(count);
	}
}
package cn.simon.jdbc.demo03_DBUtils的使用;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.simon.jdbc.domain.Category;

/**
 *  DBUtils执行数据库查询操作
 *  	1.QueryRunner(DataSource)
 *  	2.query(String sql, ResultSetHandler<T> rsh, Object... params); // 主要执行查询
 */

public class DBUtilsDemo {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

//		queryDemo01();
//		queryDemo02();
//		queryDemo03();
//		queryDemo04();
//		queryDemo05();
		queryDemo06();
//		queryDemo07();
//		queryDemo08();
	}
	
	// ArrayHandler处理类的使用
	public static void queryDemo01() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		Object[] objs = qr.query("select * from category where cid = ?", new ArrayHandler(), 1);
		for(Object o: objs){		// object[]中保存了object对象
			System.out.println(o);
		}
	}
	
	// ArrayListHandler
	public static void queryDemo02() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		List<Object[]> objs = qr.query("select * from category ", new ArrayListHandler());
		for (Object[] objects : objs) {
			System.out.println(objects[0]+"\t"+objects[1]);
		}
	}
	
	// BeanHandler处理类的使用
	public static void queryDemo03() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Category c = qr.query(sql, new BeanHandler<Category>(Category.class));
		System.out.println(c);
	}
	
	// BeanListHandler
	public static void queryDemo04() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Category> c = qr.query(sql, new BeanListHandler<Category>(Category.class));
		for (Category category : c) {
			System.out.println(category);
		}
	}
	
	// ColumnListHandler处理类的使用
	public static void queryDemo05() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Object> c = qr.query(sql, new ColumnListHandler<Object>("cname"));
		System.out.println(c);
	}
	
	// MapHandler处理类的使用
	public static void queryDemo06() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Map<String, Object> map = qr.query(sql, new MapHandler());
		// 3.
		System.out.println(map);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo07() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Map<String, Object>> maps = qr.query(sql, new MapListHandler());
		// 3.List
		System.out.println(maps);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo08() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select count(*) from category";
		Long count = qr.query(sql, new ScalarHandler<Long>());
		// 3.List
		System.out.println(count);
	}
}
package cn.simon.jdbc.demo03_DBUtils的使用;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.simon.jdbc.domain.Category;

/**
 *  DBUtils执行数据库查询操作
 *  	1.QueryRunner(DataSource)
 *  	2.query(String sql, ResultSetHandler<T> rsh, Object... params); // 主要执行查询
 */

public class DBUtilsDemo {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

//		queryDemo01();
//		queryDemo02();
//		queryDemo03();
//		queryDemo04();
//		queryDemo05();
		queryDemo06();
//		queryDemo07();
//		queryDemo08();
	}
	
	// ArrayHandler处理类的使用
	public static void queryDemo01() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		Object[] objs = qr.query("select * from category where cid = ?", new ArrayHandler(), 1);
		for(Object o: objs){		// object[]中保存了object对象
			System.out.println(o);
		}
	}
	
	// ArrayListHandler
	public static void queryDemo02() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		List<Object[]> objs = qr.query("select * from category ", new ArrayListHandler());
		for (Object[] objects : objs) {
			System.out.println(objects[0]+"\t"+objects[1]);
		}
	}
	
	// BeanHandler处理类的使用
	public static void queryDemo03() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Category c = qr.query(sql, new BeanHandler<Category>(Category.class));
		System.out.println(c);
	}
	
	// BeanListHandler
	public static void queryDemo04() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Category> c = qr.query(sql, new BeanListHandler<Category>(Category.class));
		for (Category category : c) {
			System.out.println(category);
		}
	}
	
	// ColumnListHandler处理类的使用
	public static void queryDemo05() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Object> c = qr.query(sql, new ColumnListHandler<Object>("cname"));
		System.out.println(c);
	}
	
	// MapHandler处理类的使用
	public static void queryDemo06() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Map<String, Object> map = qr.query(sql, new MapHandler());
		// 3.
		System.out.println(map);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo07() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Map<String, Object>> maps = qr.query(sql, new MapListHandler());
		// 3.List
		System.out.println(maps);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo08() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select count(*) from category";
		Long count = qr.query(sql, new ScalarHandler<Long>());
		// 3.List
		System.out.println(count);
	}
}
package cn.simon.jdbc.demo03_DBUtils的使用;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.simon.jdbc.domain.Category;

/**
 *  DBUtils执行数据库查询操作
 *  	1.QueryRunner(DataSource)
 *  	2.query(String sql, ResultSetHandler<T> rsh, Object... params); // 主要执行查询
 */

public class DBUtilsDemo {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

//		queryDemo01();
//		queryDemo02();
//		queryDemo03();
//		queryDemo04();
//		queryDemo05();
		queryDemo06();
//		queryDemo07();
//		queryDemo08();
	}
	
	// ArrayHandler处理类的使用
	public static void queryDemo01() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		Object[] objs = qr.query("select * from category where cid = ?", new ArrayHandler(), 1);
		for(Object o: objs){		// object[]中保存了object对象
			System.out.println(o);
		}
	}
	
	// ArrayListHandler
	public static void queryDemo02() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		List<Object[]> objs = qr.query("select * from category ", new ArrayListHandler());
		for (Object[] objects : objs) {
			System.out.println(objects[0]+"\t"+objects[1]);
		}
	}
	
	// BeanHandler处理类的使用
	public static void queryDemo03() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Category c = qr.query(sql, new BeanHandler<Category>(Category.class));
		System.out.println(c);
	}
	
	// BeanListHandler
	public static void queryDemo04() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Category> c = qr.query(sql, new BeanListHandler<Category>(Category.class));
		for (Category category : c) {
			System.out.println(category);
		}
	}
	
	// ColumnListHandler处理类的使用
	public static void queryDemo05() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Object> c = qr.query(sql, new ColumnListHandler<Object>("cname"));
		System.out.println(c);
	}
	
	// MapHandler处理类的使用
	public static void queryDemo06() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Map<String, Object> map = qr.query(sql, new MapHandler());
		// 3.
		System.out.println(map);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo07() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Map<String, Object>> maps = qr.query(sql, new MapListHandler());
		// 3.List
		System.out.println(maps);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo08() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select count(*) from category";
		Long count = qr.query(sql, new ScalarHandler<Long>());
		// 3.List
		System.out.println(count);
	}
}
package cn.simon.jdbc.demo03_DBUtils的使用;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.simon.jdbc.domain.Category;

/**
 *  DBUtils执行数据库查询操作
 *  	1.QueryRunner(DataSource)
 *  	2.query(String sql, ResultSetHandler<T> rsh, Object... params); // 主要执行查询
 */

public class DBUtilsDemo {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

//		queryDemo01();
//		queryDemo02();
//		queryDemo03();
//		queryDemo04();
//		queryDemo05();
		queryDemo06();
//		queryDemo07();
//		queryDemo08();
	}
	
	// ArrayHandler处理类的使用
	public static void queryDemo01() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		Object[] objs = qr.query("select * from category where cid = ?", new ArrayHandler(), 1);
		for(Object o: objs){		// object[]中保存了object对象
			System.out.println(o);
		}
	}
	
	// ArrayListHandler
	public static void queryDemo02() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		List<Object[]> objs = qr.query("select * from category ", new ArrayListHandler());
		for (Object[] objects : objs) {
			System.out.println(objects[0]+"\t"+objects[1]);
		}
	}
	
	// BeanHandler处理类的使用
	public static void queryDemo03() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Category c = qr.query(sql, new BeanHandler<Category>(Category.class));
		System.out.println(c);
	}
	
	// BeanListHandler
	public static void queryDemo04() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Category> c = qr.query(sql, new BeanListHandler<Category>(Category.class));
		for (Category category : c) {
			System.out.println(category);
		}
	}
	
	// ColumnListHandler处理类的使用
	public static void queryDemo05() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Object> c = qr.query(sql, new ColumnListHandler<Object>("cname"));
		System.out.println(c);
	}
	
	// MapHandler处理类的使用
	public static void queryDemo06() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Map<String, Object> map = qr.query(sql, new MapHandler());
		// 3.
		System.out.println(map);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo07() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Map<String, Object>> maps = qr.query(sql, new MapListHandler());
		// 3.List
		System.out.println(maps);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo08() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select count(*) from category";
		Long count = qr.query(sql, new ScalarHandler<Long>());
		// 3.List
		System.out.println(count);
	}
}
package cn.simon.jdbc.demo03_DBUtils的使用;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.simon.jdbc.domain.Category;

/**
 *  DBUtils执行数据库查询操作
 *  	1.QueryRunner(DataSource)
 *  	2.query(String sql, ResultSetHandler<T> rsh, Object... params); // 主要执行查询
 */

public class DBUtilsDemo {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

//		queryDemo01();
//		queryDemo02();
//		queryDemo03();
//		queryDemo04();
//		queryDemo05();
		queryDemo06();
//		queryDemo07();
//		queryDemo08();
	}
	
	// ArrayHandler处理类的使用
	public static void queryDemo01() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		Object[] objs = qr.query("select * from category where cid = ?", new ArrayHandler(), 1);
		for(Object o: objs){		// object[]中保存了object对象
			System.out.println(o);
		}
	}
	
	// ArrayListHandler
	public static void queryDemo02() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		List<Object[]> objs = qr.query("select * from category ", new ArrayListHandler());
		for (Object[] objects : objs) {
			System.out.println(objects[0]+"\t"+objects[1]);
		}
	}
	
	// BeanHandler处理类的使用
	public static void queryDemo03() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Category c = qr.query(sql, new BeanHandler<Category>(Category.class));
		System.out.println(c);
	}
	
	// BeanListHandler
	public static void queryDemo04() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Category> c = qr.query(sql, new BeanListHandler<Category>(Category.class));
		for (Category category : c) {
			System.out.println(category);
		}
	}
	
	// ColumnListHandler处理类的使用
	public static void queryDemo05() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Object> c = qr.query(sql, new ColumnListHandler<Object>("cname"));
		System.out.println(c);
	}
	
	// MapHandler处理类的使用
	public static void queryDemo06() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Map<String, Object> map = qr.query(sql, new MapHandler());
		// 3.
		System.out.println(map);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo07() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Map<String, Object>> maps = qr.query(sql, new MapListHandler());
		// 3.List
		System.out.println(maps);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo08() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select count(*) from category";
		Long count = qr.query(sql, new ScalarHandler<Long>());
		// 3.List
		System.out.println(count);
	}
}
package cn.simon.jdbc.demo03_DBUtils的使用;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.simon.jdbc.domain.Category;

/**
 *  DBUtils执行数据库查询操作
 *  	1.QueryRunner(DataSource)
 *  	2.query(String sql, ResultSetHandler<T> rsh, Object... params); // 主要执行查询
 */

public class DBUtilsDemo {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

//		queryDemo01();
//		queryDemo02();
//		queryDemo03();
//		queryDemo04();
//		queryDemo05();
		queryDemo06();
//		queryDemo07();
//		queryDemo08();
	}
	
	// ArrayHandler处理类的使用
	public static void queryDemo01() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		Object[] objs = qr.query("select * from category where cid = ?", new ArrayHandler(), 1);
		for(Object o: objs){		// object[]中保存了object对象
			System.out.println(o);
		}
	}
	
	// ArrayListHandler
	public static void queryDemo02() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		List<Object[]> objs = qr.query("select * from category ", new ArrayListHandler());
		for (Object[] objects : objs) {
			System.out.println(objects[0]+"\t"+objects[1]);
		}
	}
	
	// BeanHandler处理类的使用
	public static void queryDemo03() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Category c = qr.query(sql, new BeanHandler<Category>(Category.class));
		System.out.println(c);
	}
	
	// BeanListHandler
	public static void queryDemo04() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Category> c = qr.query(sql, new BeanListHandler<Category>(Category.class));
		for (Category category : c) {
			System.out.println(category);
		}
	}
	
	// ColumnListHandler处理类的使用
	public static void queryDemo05() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Object> c = qr.query(sql, new ColumnListHandler<Object>("cname"));
		System.out.println(c);
	}
	
	// MapHandler处理类的使用
	public static void queryDemo06() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Map<String, Object> map = qr.query(sql, new MapHandler());
		// 3.
		System.out.println(map);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo07() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Map<String, Object>> maps = qr.query(sql, new MapListHandler());
		// 3.List
		System.out.println(maps);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo08() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select count(*) from category";
		Long count = qr.query(sql, new ScalarHandler<Long>());
		// 3.List
		System.out.println(count);
	}
}
package cn.simon.jdbc.demo03_DBUtils的使用;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.simon.jdbc.domain.Category;

/**
 *  DBUtils执行数据库查询操作
 *  	1.QueryRunner(DataSource)
 *  	2.query(String sql, ResultSetHandler<T> rsh, Object... params); // 主要执行查询
 */

public class DBUtilsDemo {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

//		queryDemo01();
//		queryDemo02();
//		queryDemo03();
//		queryDemo04();
//		queryDemo05();
		queryDemo06();
//		queryDemo07();
//		queryDemo08();
	}
	
	// ArrayHandler处理类的使用
	public static void queryDemo01() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		Object[] objs = qr.query("select * from category where cid = ?", new ArrayHandler(), 1);
		for(Object o: objs){		// object[]中保存了object对象
			System.out.println(o);
		}
	}
	
	// ArrayListHandler
	public static void queryDemo02() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		List<Object[]> objs = qr.query("select * from category ", new ArrayListHandler());
		for (Object[] objects : objs) {
			System.out.println(objects[0]+"\t"+objects[1]);
		}
	}
	
	// BeanHandler处理类的使用
	public static void queryDemo03() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Category c = qr.query(sql, new BeanHandler<Category>(Category.class));
		System.out.println(c);
	}
	
	// BeanListHandler
	public static void queryDemo04() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Category> c = qr.query(sql, new BeanListHandler<Category>(Category.class));
		for (Category category : c) {
			System.out.println(category);
		}
	}
	
	// ColumnListHandler处理类的使用
	public static void queryDemo05() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Object> c = qr.query(sql, new ColumnListHandler<Object>("cname"));
		System.out.println(c);
	}
	
	// MapHandler处理类的使用
	public static void queryDemo06() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Map<String, Object> map = qr.query(sql, new MapHandler());
		// 3.
		System.out.println(map);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo07() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Map<String, Object>> maps = qr.query(sql, new MapListHandler());
		// 3.List
		System.out.println(maps);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo08() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select count(*) from category";
		Long count = qr.query(sql, new ScalarHandler<Long>());
		// 3.List
		System.out.println(count);
	}
}
package cn.simon.jdbc.demo03_DBUtils的使用;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.simon.jdbc.domain.Category;

/**
 *  DBUtils执行数据库查询操作
 *  	1.QueryRunner(DataSource)
 *  	2.query(String sql, ResultSetHandler<T> rsh, Object... params); // 主要执行查询
 */

public class DBUtilsDemo {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

//		queryDemo01();
//		queryDemo02();
//		queryDemo03();
//		queryDemo04();
//		queryDemo05();
		queryDemo06();
//		queryDemo07();
//		queryDemo08();
	}
	
	// ArrayHandler处理类的使用
	public static void queryDemo01() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		Object[] objs = qr.query("select * from category where cid = ?", new ArrayHandler(), 1);
		for(Object o: objs){		// object[]中保存了object对象
			System.out.println(o);
		}
	}
	
	// ArrayListHandler
	public static void queryDemo02() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		List<Object[]> objs = qr.query("select * from category ", new ArrayListHandler());
		for (Object[] objects : objs) {
			System.out.println(objects[0]+"\t"+objects[1]);
		}
	}
	
	// BeanHandler处理类的使用
	public static void queryDemo03() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Category c = qr.query(sql, new BeanHandler<Category>(Category.class));
		System.out.println(c);
	}
	
	// BeanListHandler
	public static void queryDemo04() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Category> c = qr.query(sql, new BeanListHandler<Category>(Category.class));
		for (Category category : c) {
			System.out.println(category);
		}
	}
	
	// ColumnListHandler处理类的使用
	public static void queryDemo05() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Object> c = qr.query(sql, new ColumnListHandler<Object>("cname"));
		System.out.println(c);
	}
	
	// MapHandler处理类的使用
	public static void queryDemo06() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Map<String, Object> map = qr.query(sql, new MapHandler());
		// 3.
		System.out.println(map);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo07() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Map<String, Object>> maps = qr.query(sql, new MapListHandler());
		// 3.List
		System.out.println(maps);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo08() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select count(*) from category";
		Long count = qr.query(sql, new ScalarHandler<Long>());
		// 3.List
		System.out.println(count);
	}
}
package cn.simon.jdbc.demo03_DBUtils的使用;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.simon.jdbc.domain.Category;

/**
 *  DBUtils执行数据库查询操作
 *  	1.QueryRunner(DataSource)
 *  	2.query(String sql, ResultSetHandler<T> rsh, Object... params); // 主要执行查询
 */

public class DBUtilsDemo {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

//		queryDemo01();
//		queryDemo02();
//		queryDemo03();
//		queryDemo04();
//		queryDemo05();
		queryDemo06();
//		queryDemo07();
//		queryDemo08();
	}
	
	// ArrayHandler处理类的使用
	public static void queryDemo01() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		Object[] objs = qr.query("select * from category where cid = ?", new ArrayHandler(), 1);
		for(Object o: objs){		// object[]中保存了object对象
			System.out.println(o);
		}
	}
	
	// ArrayListHandler
	public static void queryDemo02() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		List<Object[]> objs = qr.query("select * from category ", new ArrayListHandler());
		for (Object[] objects : objs) {
			System.out.println(objects[0]+"\t"+objects[1]);
		}
	}
	
	// BeanHandler处理类的使用
	public static void queryDemo03() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Category c = qr.query(sql, new BeanHandler<Category>(Category.class));
		System.out.println(c);
	}
	
	// BeanListHandler
	public static void queryDemo04() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Category> c = qr.query(sql, new BeanListHandler<Category>(Category.class));
		for (Category category : c) {
			System.out.println(category);
		}
	}
	
	// ColumnListHandler处理类的使用
	public static void queryDemo05() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Object> c = qr.query(sql, new ColumnListHandler<Object>("cname"));
		System.out.println(c);
	}
	
	// MapHandler处理类的使用
	public static void queryDemo06() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Map<String, Object> map = qr.query(sql, new MapHandler());
		// 3.
		System.out.println(map);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo07() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Map<String, Object>> maps = qr.query(sql, new MapListHandler());
		// 3.List
		System.out.println(maps);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo08() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select count(*) from category";
		Long count = qr.query(sql, new ScalarHandler<Long>());
		// 3.List
		System.out.println(count);
	}
}
package cn.simon.jdbc.demo03_DBUtils的使用;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.simon.jdbc.domain.Category;

/**
 *  DBUtils执行数据库查询操作
 *  	1.QueryRunner(DataSource)
 *  	2.query(String sql, ResultSetHandler<T> rsh, Object... params); // 主要执行查询
 */

public class DBUtilsDemo {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

//		queryDemo01();
//		queryDemo02();
//		queryDemo03();
//		queryDemo04();
//		queryDemo05();
		queryDemo06();
//		queryDemo07();
//		queryDemo08();
	}
	
	// ArrayHandler处理类的使用
	public static void queryDemo01() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		Object[] objs = qr.query("select * from category where cid = ?", new ArrayHandler(), 1);
		for(Object o: objs){		// object[]中保存了object对象
			System.out.println(o);
		}
	}
	
	// ArrayListHandler
	public static void queryDemo02() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		List<Object[]> objs = qr.query("select * from category ", new ArrayListHandler());
		for (Object[] objects : objs) {
			System.out.println(objects[0]+"\t"+objects[1]);
		}
	}
	
	// BeanHandler处理类的使用
	public static void queryDemo03() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Category c = qr.query(sql, new BeanHandler<Category>(Category.class));
		System.out.println(c);
	}
	
	// BeanListHandler
	public static void queryDemo04() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Category> c = qr.query(sql, new BeanListHandler<Category>(Category.class));
		for (Category category : c) {
			System.out.println(category);
		}
	}
	
	// ColumnListHandler处理类的使用
	public static void queryDemo05() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Object> c = qr.query(sql, new ColumnListHandler<Object>("cname"));
		System.out.println(c);
	}
	
	// MapHandler处理类的使用
	public static void queryDemo06() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		Map<String, Object> map = qr.query(sql, new MapHandler());
		// 3.
		System.out.println(map);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo07() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select * from category";
		List<Map<String, Object>> maps = qr.query(sql, new MapListHandler());
		// 3.List
		System.out.println(maps);
	}
	
	// MapListHandler处理类的使用
	public static void queryDemo08() throws SQLException{
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 2.执行查询
		String sql = "select count(*) from category";
		Long count = qr.query(sql, new ScalarHandler<Long>());
		// 3.List
		System.out.println(count);
	}
}

