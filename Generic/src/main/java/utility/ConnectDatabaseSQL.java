package utility;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by abra on 1/19/17.
 */
public class ConnectDatabaseSQL {


        Connection conn = null;
        Statement stmt = null;
        ResultSet rs=null;

        public void connectToDB() throws ClassNotFoundException, SQLException {
            String myDriver = "com.mysql.jdbc.Driver";
            Class.forName(myDriver);
            String URL = "jdbc:mysql://localhost/?useSSL=false";
            String userN = "root";
            String passW = "root";
            conn = DriverManager.getConnection(URL, userN, passW);
            // System.out.println("Connected to DB");

        }
        public void connectToDBFramework() throws ClassNotFoundException, SQLException {
            String myDriver = "com.mysql.jdbc.Driver";
            Class.forName(myDriver);
            String URL = "jdbc:mysql://localhost/web_automation?useSSL=false";
            String userN = "root";
            String passW = "root";
            conn = DriverManager.getConnection(URL, userN, passW);
            // System.out.println("Connected to Database:mentoring_java");


        }

        public void createDatabaseMySql(String sql) {
            try {
                connectToDB();
                stmt = conn.createStatement();
                stmt.executeUpdate(sql);
                System.out.println("Database created");
            } catch(SQLException se){
                //errors for JDBC
                se.printStackTrace();
            } catch(Exception e){
                e.printStackTrace();//errors for class.forname

            }finally{
                //finally block used to close resources
                try{
                    if(stmt!=null)
                        stmt.close();
                }catch(SQLException se2){
                }// nothing we can do
                try{
                    if(conn!=null)
                        conn.close();
                }catch(SQLException se){
                    se.printStackTrace();
                }//end finally try
            }//end try


        }
        public void dropDatabaseMySql(String sql) {
            try {
                connectToDB();
                stmt = conn.createStatement();
                stmt.executeUpdate(sql);
                System.out.println("Database dropped");
            } catch(SQLException se){
                //errors for JDBC
                se.printStackTrace();
            } catch(Exception e){
                e.printStackTrace();//errors for class.forname

            }finally{
                //finally block used to close resources
                try{
                    if(stmt!=null)
                        stmt.close();
                }catch(SQLException se2){
                }// nothing we can do
                try{
                    if(conn!=null)
                        conn.close();
                }catch(SQLException se){
                    se.printStackTrace();
                }//end finally try
            }//end try


        }

        public void createTableInSelectedDatabase(String sql){
            try{
                connectToDBFramework();

                stmt=conn.createStatement();

                stmt.executeUpdate(sql);


            }catch(SQLException se){
                //errors for JDBC
                se.printStackTrace();
            } catch(Exception e){
                e.printStackTrace();//errors for class.forname

            }finally{
                //finally block used to close resources
                try{
                    if(stmt!=null)
                        stmt.close();
                }catch(SQLException se2){
                }// nothing we can do
                try{
                    if(conn!=null)
                        conn.close();
                }catch(SQLException se){
                    se.printStackTrace();
                }//end finally try
            }//end try
        }
        public void DeleteTableInSelectedDatabase(String sql) {
            try {
                connectToDBFramework();

                stmt = conn.createStatement();

                stmt.executeUpdate(sql);


            } catch (SQLException se) {
                //errors for JDBC
                se.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();//errors for class.forname

            } finally {
                //finally block used to close resources
                try {
                    if (stmt != null)
                        stmt.close();
                } catch (SQLException se2) {
                }// nothing we can do
                try {
                    if (conn != null)
                        conn.close();
                } catch (SQLException se) {
                    se.printStackTrace();
                }//end finally try
            }//end try
        }
        public void insertTwoRecordsAtOnce(String sql,String sql1) {
            try {
                connectToDBFramework();

                stmt = conn.createStatement();

                stmt.executeUpdate(sql);
                stmt.executeUpdate(sql1);


            } catch (SQLException se) {
                //errors for JDBC
                se.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();//errors for class.forname

            } finally {
                //finally block used to close resources
                try {
                    if (stmt != null)
                        stmt.close();
                } catch (SQLException se2) {
                }// nothing we can do
                try {
                    if (conn != null)
                        conn.close();
                } catch (SQLException se) {
                    se.printStackTrace();
                }//end finally try
            }//end try
        }


    public List<String> retrieveDataFromTable(String tableName, String colName) {
        // String []  data = {};
        List<String> list = null;
        try {
            connectToDBFramework();

            stmt = conn.createStatement();
            rs = stmt.executeQuery("select "+colName+" from " +tableName);
            //Extract data from result set
            // System.out.println("All the First names in this record");
            list = new ArrayList<String>();
            while (rs.next()) {
                //Retrieve by column name

                list.add(rs.getString(colName));
                //list.add(rs.getString("Last"));


                // String firstName = rs.getString("Name");
                // String lastName = rs.getString("Last");

                // System.out.print("Name: " + firstName + " Surname: " + lastName+"\n");
            }
//            for(String st:list){
//                System.out.println(st);
//            }
//            int i=0;
//            for(String st:list){
//                data[i]=st;
//                i++;
//            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }//end finally try
        }//end try
        return list;
    }


    }

