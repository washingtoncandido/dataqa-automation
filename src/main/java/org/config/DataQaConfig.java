package org.config;

public class DataQaConfig {

    private final Environment environment;
    private final String serverHostname;
    private final String httpPath;
    private final String accessToken;

    public DataQaConfig() {
        this.environment = Environment.valueOf(
                System.getenv().getOrDefault("DATAQA_ENV", "TST")
        );

        this.serverHostname = getRequiredEnvironmentVariable("DATABRICKS_SERVER_HOSTNAME");
        this.httpPath = getRequiredEnvironmentVariable("DATABRICKS_HTTP_PATH");
        this.accessToken = getRequiredEnvironmentVariable("DATABRICKS_ACCESS_TOKEN");
    }

    public Environment getEnvironment() {
        return environment;
    }

    public String getServerHostname() {
        return serverHostname;
    }

    public String getHttpPath() {
        return httpPath;
    }

    public String getAccessToken() {
        return accessToken;
    }

    private String getRequiredEnvironmentVariable(String name) {
        String value = System.getenv(name);

        if (value == null || value.isBlank()) {
            throw new IllegalStateException(
                    "Environment variable not configured: " + name
            );
        }

        return value;
    }
}