package UTIL;

import java.sql.Connection;
import java.sql.DriverManager;
		//디비 접속하는 부분. 1,2부분의 수정 가능. 연결객체 부분 수정 
public class ConnectionFactory {
	public Connection getConnection() {

		Connection conn = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2.디비 접속
			String url = "jdbc:oracle:thin:@192.168.119.119:1521:dink";
			String user = "scott";
			String password = "tiger";

			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
