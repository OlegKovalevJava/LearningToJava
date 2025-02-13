package com.LearningToJava;

import java.sql.SQLData;
import java.sql.SQLException;
import java.sql.SQLInput;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        SQLData sqlData = new SQLData() {
            @Override
            public String getSQLTypeName() throws SQLException {
                return "";
            }

            @Override
            public void readSQL(SQLInput stream, String typeName) throws SQLException {

            }

            @Override
            public void writeSQL(SQLOutput stream) throws SQLException {

            }
        }
    }
}
