package com.eqbank.designpattern.facade;

public class MySqlHelper {
    public static String getMySqlDBConnection(){
        //get MySql DB connection using connection parameters
        return "MySqlHelper";
    }

    public void generateMySqlPDFReport(String tableName, String con){
        System.out.println("Generate MySQL PDF Report from table name "+tableName+ " with connection "+con);
    }

    public void generateMySqlHTMLReport(String tableName, String con){
        System.out.println("Generate MySQL HTML Report from table name "+tableName+ " with connection "+con);
    }
}
