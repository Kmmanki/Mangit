package org.kakarrot.contoller;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class MySQLConnectTEst {

	@Test
	public void testConnect() throws Exception {

		// mtsql 5.6 com.mysql.jdbc.Driver
		// mysql 6 over com.mysql.cj.jdbc.Driver
		Class<?> clz = Class.forName("com.mysql.cj.jdbc.Driver");
		
//		jdbc:mysql://ip:port/TestDB?characterEncoding=UTF-8&serverTimezone=UTC
		log.info(clz);

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bitdb?characterEncoding=UTF-8&serverTimezone=Asia/Seoul&useSSL=false",
				"bit04", "bit04");
		con.close();
	}
}
