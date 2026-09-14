package org.bronze;

import org.assertions.ResultSetAssertions;
import org.client.DatabricksClient;
import org.config.DataQaConfig;
import org.database.DatabricksConnection;
import org.junit.jupiter.api.Test;
import org.query.QueryLoader;

import java.sql.Connection;
import java.sql.ResultSet;

public class BronzeDataQualityTest {

    @Test
    void shouldHaveUniqueSaleId() throws Exception {

        DataQaConfig config = new DataQaConfig();

        try (Connection connection =
                     new DatabricksConnection(config).connect()) {

            DatabricksClient client =
                    new DatabricksClient(connection);

            QueryLoader queryLoader =
                    new QueryLoader();

            String sql = queryLoader.load(
                    "queries/renner/bronze/duplicate_venda_id.sql"
            );

            ResultSet resultSet =
                    client.executeQuery(sql);

            ResultSetAssertions.assertEmpty(resultSet);
        }
    }

    @Test
    void shouldHaveValidQuantity() throws Exception {

        DataQaConfig config = new DataQaConfig();

        try (Connection connection =
                     new DatabricksConnection(config).connect()) {

            DatabricksClient client =
                    new DatabricksClient(connection);

            QueryLoader queryLoader =
                    new QueryLoader();

            String sql = queryLoader.load(
                    "queries/renner/bronze/invalid_quantidade.sql"
            );

            ResultSet resultSet =
                    client.executeQuery(sql);

            ResultSetAssertions.assertEmpty(resultSet);
        }
    }

    @Test
    void shouldHaveValidUnitPrice() throws Exception {

        DataQaConfig config = new DataQaConfig();

        try (Connection connection =
                     new DatabricksConnection(config).connect()) {

            DatabricksClient client =
                    new DatabricksClient(connection);

            QueryLoader queryLoader =
                    new QueryLoader();

            String sql = queryLoader.load(
                    "queries/renner/bronze/invalid_valor_unitario.sql"
            );

            ResultSet resultSet =
                    client.executeQuery(sql);

            ResultSetAssertions.assertEmpty(resultSet);
        }
    }

    @Test
    void shouldHaveValidDiscount() throws Exception {

        DataQaConfig config = new DataQaConfig();

        try (Connection connection =
                     new DatabricksConnection(config).connect()) {

            DatabricksClient client =
                    new DatabricksClient(connection);

            QueryLoader queryLoader =
                    new QueryLoader();

            String sql = queryLoader.load(
                    "queries/renner/bronze/invalid_desconto.sql"
            );

            ResultSet resultSet =
                    client.executeQuery(sql);

            ResultSetAssertions.assertEmpty(resultSet);
        }
    }

    @Test
    void shouldHaveProductId() throws Exception {

        DataQaConfig config = new DataQaConfig();

        try (Connection connection =
                     new DatabricksConnection(config).connect()) {

            DatabricksClient client =
                    new DatabricksClient(connection);

            QueryLoader queryLoader =
                    new QueryLoader();

            String sql = queryLoader.load(
                    "queries/renner/bronze/null_produto_id.sql"
            );

            ResultSet resultSet =
                    client.executeQuery(sql);

            ResultSetAssertions.assertEmpty(resultSet);
        }
    }

    @Test
    void shouldHaveValidStatus() throws Exception {

        DataQaConfig config = new DataQaConfig();

        try (Connection connection =
                     new DatabricksConnection(config).connect()) {

            DatabricksClient client =
                    new DatabricksClient(connection);

            QueryLoader queryLoader =
                    new QueryLoader();

            String sql = queryLoader.load(
                    "queries/renner/bronze/invalid_status.sql"
            );

            ResultSet resultSet =
                    client.executeQuery(sql);

            ResultSetAssertions.assertEmpty(resultSet);
        }
    }

    @Test
    void shouldHaveValidNetValue() throws Exception {

        DataQaConfig config = new DataQaConfig();

        try (Connection connection =
                     new DatabricksConnection(config).connect()) {

            DatabricksClient client =
                    new DatabricksClient(connection);

            QueryLoader queryLoader =
                    new QueryLoader();

            String sql = queryLoader.load(
                    "queries/renner/bronze/invalid_valor_liquido.sql"
            );

            ResultSet resultSet =
                    client.executeQuery(sql);

            ResultSetAssertions.assertEmpty(resultSet);
        }
    }

    @Test
    void shouldHaveValidSaleDate() throws Exception {

        DataQaConfig config = new DataQaConfig();

        try (Connection connection =
                     new DatabricksConnection(config).connect()) {

            DatabricksClient client =
                    new DatabricksClient(connection);

            QueryLoader queryLoader =
                    new QueryLoader();

            String sql = queryLoader.load(
                    "queries/renner/bronze/invalid_data_venda.sql"
            );

            ResultSet resultSet =
                    client.executeQuery(sql);

            ResultSetAssertions.assertEmpty(resultSet);
        }
    }
}