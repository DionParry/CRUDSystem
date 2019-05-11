import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * Enter data into Database
 * @author Dion Parry
 */

public class DBQuery extends DBManager{

    Connection con;
    PreparedStatement preparedStmt;
    ResultSet resultSet;


    /**
     *
     * @param name
     * @param surname
     * @param age
     * @throws SQLException
     */
    public void AddStudent(String name, String surname, String age) throws SQLException {
        String query = " insert into student (student_name, student_surname, student_age)"
                + " values (?, ?, ?)";

        //retreive connection details from DBManager
        con = getConnection();

        preparedStmt = con.prepareStatement(query);
        // Create string with variable parts.

        // create the mysql insert preparedstatement
        preparedStmt.setString(1, name);
        preparedStmt.setString(2, surname);
        preparedStmt.setString(3, age);

        // execute the sql query
        preparedStmt.execute();
    }
}
