package org.assertions;

import org.junit.jupiter.api.Assertions;

import java.sql.ResultSet;
import java.sql.SQLException;

public final class ResultSetAssertions {

    private ResultSetAssertions() {
    }

    public static void assertEmpty(ResultSet resultSet) throws SQLException {
        Assertions.assertFalse(
                resultSet.next(),
                "O resultado deveria estar vazio, mas foram encontradas violações."
        );
    }
}
