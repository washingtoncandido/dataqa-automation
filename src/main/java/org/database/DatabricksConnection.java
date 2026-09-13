package org.database;

import org.config.DataQaConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabricksConnection {

    private final DataQaConfig config;

    public DatabricksConnection(DataQaConfig config) {
        this.config = config;
    }

    public Connection connect() throws SQLException {

        String url =
                "jdbc:databricks://" +
                        config.getServerHostname() +
                        ":443";

        Properties properties = new Properties();

        properties.setProperty("httpPath", config.getHttpPath());
        properties.setProperty("AuthMech", "3");
        properties.setProperty("UID", "token");
        properties.setProperty("PWD", config.getAccessToken());
        properties.setProperty("UseSystemTrustStore", "1");
        properties.setProperty("AllowSelfSignedCerts", "1");
        return DriverManager.getConnection(url, properties);
    }
}