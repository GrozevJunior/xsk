/*
 * Copyright (c) 2019-2020 SAP SE or an SAP affiliate company and XSK contributors
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, v2.0
 * which accompanies this distribution, and is available at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * SPDX-FileCopyrightText: 2019-2020 SAP SE or an SAP affiliate company and XSK contributors
 * SPDX-License-Identifier: Apache-2.0
 */
package com.sap.xsk.hdb.ds.processors.hdbschema;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sap.xsk.hdb.ds.model.hdbschema.XSKDataStructureHDBSchemaModel;

public class HDBSchemaDropProcessor {

    private HDBSchemaDropProcessor(){}

    private static final Logger logger = LoggerFactory.getLogger(HDBSchemaDropProcessor.class);

    public static void execute(Connection connection, List<XSKDataStructureHDBSchemaModel> hdbSchemas) throws SQLException {
        for (XSKDataStructureHDBSchemaModel schema : hdbSchemas) {
            executeSingle(connection, schema);
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

    public static void executeSingle(Connection connection, XSKDataStructureHDBSchemaModel hdbSchema) throws SQLException {
        String sql = "DROP SCHEMA " + hdbSchema.getName();
        executePreparedStatement(connection, sql);
    }
}
