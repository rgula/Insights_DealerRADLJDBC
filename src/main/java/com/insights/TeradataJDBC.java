package com.insights;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TeradataJDBC {

    public static void main(String[] args) throws Exception {
        String connurl = "jbdc:teradata://biwp01.monsanto.com/1443";

        Class.forName("com.teradata.jdbc.TeraDriver");
        Connection conn=DriverManager.getConnection(connurl, "INSIGHT_API_USER", "got4TEST_API_USER_2016");

        System.out.print("querying Database");
    }
}
