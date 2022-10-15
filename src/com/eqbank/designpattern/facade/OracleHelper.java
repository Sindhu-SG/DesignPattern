package com.eqbank.designpattern.facade;

public class OracleHelper {

    public static String getOracleDBConnection(){
        //get Oracle DB connection using connection parameters
        return "OracleHelper";
    }

    public void generateOraclePDFReport(String tableName, String con){
       System.out.println("Generate Oracle PDF Report from table name "+tableName+ " with connection "+con);
    }

    public void generateOracleHTMLReport(String tableName, String con){
        System.out.println("Generate Oracle HTML Report from table name "+tableName+ " with connection "+con);
    }
}
