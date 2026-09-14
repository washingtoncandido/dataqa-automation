package org.base;

import org.assertions.ResultSetAssertions;
import org.client.DatabricksClient;
import org.config.DataQaConfig;
import org.database.DatabricksConnection;
import org.query.QueryLoader;

import java.sql.Connection;
import java.sql.ResultSet;

public abstract class DataQualityTest {

    private final DataQaConfig config = new DataQaConfig();
    private final QueryLoader queryLoader = new QueryLoader();

    protected void assertQueryReturnsEmpty(String queryPath) throws Exception {

        try (Connection connection =
                     new DatabricksConnection(config).connect()) {

            DatabricksClient client =
                    new DatabricksClient(connection);

            String sql = queryLoader.load(queryPath);

            ResultSet resultSet = client.executeQuery(sql);

            ResultSetAssertions.assertEmpty(resultSet);
        }
    }
}