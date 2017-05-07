package com.springbook.biz.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by Jun Ho Park on 2017-05-03.
 */
public class JDBCUtil {
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("try안쪽");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/spring","park","wnsgh93!");
        } catch (Exception e) {e.printStackTrace();}
        System.out.println("여기찍히면 안되는데");
        return null;
    }

    public static void close(PreparedStatement stmt, Connection conn) {
        if(stmt!=null) {
            try {
                stmt.close();
            } catch (Exception e) {

            } finally {
                stmt = null;
            }
        }

        if(conn != null) {
            try {
                if(!conn.isClosed()) {
                    conn.close();
                }
            } catch (Exception e) {

            } finally {
                conn = null;
            }
        }
    }

    public static void close(ResultSet rs, PreparedStatement stmt, Connection conn) {
        if(rs != null) {
            try {
                rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                rs = null;
            }
        }

        if(stmt != null) {
            try {
                stmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                stmt = null;
            }
        }

        if(conn != null) {
            try {
                if(!conn.isClosed()) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                conn = null;
            }
        }
    }
}
