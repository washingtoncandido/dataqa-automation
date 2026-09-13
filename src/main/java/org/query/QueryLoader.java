package org.query;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class QueryLoader {

    public String load(String path) {

        try (InputStream inputStream = getClass()
                .getClassLoader()
                .getResourceAsStream(path)) {

            if (inputStream == null) {
                throw new IllegalArgumentException(
                        "SQL file not found: " + path
                );
            }

            return new String(
                    inputStream.readAllBytes(),
                    StandardCharsets.UTF_8
            );

        } catch (IOException e) {
            throw new IllegalStateException(
                    "Error loading SQL file: " + path,
                    e
            );
        }
    }
}