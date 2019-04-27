import static org.junit.Assert.*;

import org.junit.Test;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.dbunit.DBTestCase;
import org.dbunit.DatabaseTestCase;
import org.dbunit.PropertiesBasedJdbcDatabaseTester;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.junit.Test;
/*
public class DBUnitTest extends DBTestCase{

	private Connection jdbcConnection;
	private JdbcController controller = new JdbcController("root" , "root");
	private FlatXmlDataSet loadedDataSet;
	
    public DBUnitTest(String name)
    {
        super( name );
        System.setProperty( PropertiesBasedJdbcDatabaseTester.DBUNIT_DRIVER_CLASS, "com.mysql.cj.jdbc.Driver" );
        System.setProperty( PropertiesBasedJdbcDatabaseTester.DBUNIT_CONNECTION_URL, "jdbc:mysql://localhost:3306" );
        System.setProperty( PropertiesBasedJdbcDatabaseTester.DBUNIT_USERNAME, "root" );
        System.setProperty( PropertiesBasedJdbcDatabaseTester.DBUNIT_PASSWORD, "root" );
	    System.setProperty( PropertiesBasedJdbcDatabaseTester.DBUNIT_SCHEMA, "Mojo");
    }
	
	@Test
	public void testFindTasks() {
		String expected = "Combat";
		String test = controller.findTasks("Seadoo Spark2");
		controller.cleanUp();
		assertTrue(test.equals(expected));
	}
	
	@Test
	public void testFindVehicle() {
		String expected = "Honda Civic\n";
		String test = controller.findVehicleFromModel("civic");
		controller.cleanUp();
		assertTrue(test.equals(expected));
	}

	@Override
	protected IDataSet getDataSet() throws Exception {
		//xml dataset implementation is not used yet
		return new FlatXmlDataSetBuilder().build(new FileInputStream("testData.xml"));
	}

}
*/
