import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class JdbcController {
static final String JDBC_Driver = "com.mysql.cj.jdbc.Driver";

ResultSet rs = null;
Statement stmt = null;
Connection conn = null;

public JdbcController(String s1, String s2) {

	try {
		// Step 1: Load the JDBC driver
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

		// Step 2: make a connection
		//conn = DriverManager.getConnection(_url, args[1], args[2]);
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mojo?user="+ s1 + "&password=" + s2 + "&useSSL=false");

		// Step 3: Create a statement
		stmt = conn.createStatement();
		
		
		// Step 4: Make a query
	/*	rs = stmt.executeQuery("Select * from Ground_Company");

		// Step 5: Display the results
		while (rs.next()) {
			System.out.print(rs.getString(1) + "\t");
			System.out.print(rs.getString(2) + "\t ");
			System.out.print(rs.getString(3) + "\t ");
			System.out.println("");
		} */
	} catch (Exception exc){
		exc.printStackTrace();
	}
	finally {  // ALWAYS clean up your DB resources
		//cleanUp();
	}
}

public void resetrs() {
	this.rs = null;
}

public String showGC() {
	String ret = "";
	try {
		rs = stmt.executeQuery("Select * from Ground_Company");
		
		while (rs.next()) {
			ret = ret + rs.getString(1) + " ";
			ret = ret + rs.getString(2) + " ";
			ret = ret + rs.getString(3) + " ";
			ret = ret + "\n";
		}
		return ret;
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return "Could not find Ground Companies";
}
public String findVehicleFromModel(String model) {
	
	String ret = "";
	try {
		rs = stmt.executeQuery("Select make, model from Ground_Transportation where model = \"" + model + "\"");
		
		while (rs.next()) {
			ret = ret + rs.getString(1) + " " +  rs.getString(2) + "\n";
		}
		return ret;
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return "Could not find vehicle with specified model";
	
}

public String findTasks(String vehicle) {
	String[] arr = vehicle.split("\\s+");
	String make = arr[0];
	String model = arr[1];
	String ret = "";
	try {
		rs = stmt.executeQuery("Select purpose from Transportation_Purpose where make = \"" + make + "\" and model = \"" + model +"\"");
		
		while (rs.next()) {
			ret = ret + rs.getString(1);
		}
		return ret;
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return "Could not find tasks";
	
}
public void cleanUp() {
	try {
		if (rs != null)
			rs.close();
		if (stmt != null)
			stmt.close();
		if (conn != null)
			conn.close();
	}
	catch (SQLException se) {
		se.printStackTrace();
	}
	
}
}
