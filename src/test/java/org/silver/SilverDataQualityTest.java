package org.silver;

import org.assertions.ResultSetAssertions;
import org.client.DatabricksClient;
import org.config.DataQaConfig;
import org.database.DatabricksConnection;
import org.junit.jupiter.api.Test;
import org.query.QueryLoader;

import java.sql.Connection;
import java.sql.ResultSet;

public class SilverDataQualityTest {

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
                    "queries/renner/vendas/silver/duplicate_venda_id.sql"
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
                    "queries/renner/vendas/silver/null_produto_id.sql"
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
                    "queries/renner/vendas/silver/invalid_quantidade.sql"
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
                    "queries/renner/vendas/silver/invalid_valor_unitario.sql"
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
                    "queries/renner/vendas/silver/invalid_status.sql"
            );

            ResultSet resultSet =
                    client.executeQuery(sql);

            ResultSetAssertions.assertEmpty(resultSet);
        }
    }

    @Test
    void shouldHaveSaleDate() throws Exception {

        DataQaConfig config = new DataQaConfig();

        try (Connection connection =
                     new DatabricksConnection(config).connect()) {

            DatabricksClient client =
                    new DatabricksClient(connection);

            QueryLoader queryLoader =
                    new QueryLoader();

            String sql = queryLoader.load(
                    "queries/renner/vendas/silver/null_data_venda.sql"
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
                    "queries/renner/vendas/silver/invalid_desconto.sql"
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
                    "queries/renner/vendas/silver/invalid_valor_liquido.sql"
            );

            ResultSet resultSet =
                    client.executeQuery(sql);

            ResultSetAssertions.assertEmpty(resultSet);
        }
    }

    @Test
    void shouldReconcileBronzeAndSilver() throws Exception {

        DataQaConfig config = new DataQaConfig();

        try (Connection connection =
                     new DatabricksConnection(config).connect()) {

            DatabricksClient client =
                    new DatabricksClient(connection);

            QueryLoader queryLoader =
                    new QueryLoader();

            String sql = queryLoader.load(
                    "queries/renner/vendas/silver/bronze_silver_reconciliation.sql"
            );

            ResultSet resultSet =
                    client.executeQuery(sql);

            ResultSetAssertions.assertEmpty(resultSet);
        }
    }
}