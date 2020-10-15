package com.sap.xsk.hdb.ds.processors.hdbtablefunction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sap.xsk.hdb.ds.model.hdbprocedure.XSKDataStructureHDBProcedure;
import com.sap.xsk.hdb.ds.model.hdbtablefunction.XSKDataStructureHDBTableFunction;

public class HDBTableFunctionDropProcessor {

    private HDBTableFunctionDropProcessor() {}

    private static final Logger logger = LoggerFactory.getLogger(HDBTableFunctionDropProcessor.class);

    public static void execute(Connection connection, List<XSKDataStructureHDBTableFunction> hdbTableFunction) throws SQLException {
        for (XSKDataStructureHDBTableFunction func : hdbTableFunction) {
            executeSingle(connection, func);
        }
    }

    private static void executePreparedStatement(Connection connection, String sql) throws SQLException {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(sql);
            logger.info(sql);
            statement.executeUpdate();
        } catch (SQLException e) {
            logger.error(sql);
            logger.error(e.getMessage(), e);
        } finally {
            if (statement != null) {
                statement.close();
            }
        }
    }

    public static void executeSingle(Connection connection, XSKDataStructureHDBTableFunction hdbTableFunction) throws SQLException {
        String sql = "DROP FUNCTION " + hdbTableFunction.getName();
        executePreparedStatement(connection, sql);
    }
    
}
