package Day34_JDBC_Emp_Payroll_Program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCEmpPayRollPrograms {

	public static void main(String[] args) throws SQLException {
		Connection connection = null;

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/payrollService", "root", "12345");

			Statement stmt = connection.createStatement();

			stmt.execute("insert into employeePayroll value(10,'Rakesh','180000','1995-10-01','R')");

		} catch (SQLException e) {

			System.out.println("Unable to connect to DB...");
			
			listDrivers();

		} finally {

			connection.close();
		}

	}

	private static void listDrivers() {
		// TODO Auto-generated method stub
		
	}

}
