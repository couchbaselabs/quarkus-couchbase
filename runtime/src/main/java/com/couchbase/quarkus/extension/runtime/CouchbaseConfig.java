package com.couchbase.quarkus.extension.runtime;

import io.quarkus.runtime.annotations.ConfigItem;
import io.quarkus.runtime.annotations.ConfigPhase;
import io.quarkus.runtime.annotations.ConfigRoot;

@ConfigRoot(name = "couchbase", phase = ConfigPhase.BUILD_AND_RUN_TIME_FIXED)
public final class CouchbaseConfig {
    /**
     * The connection string, e.g. "couchbase://10.202.32.32" or "localhost".
     */
    @ConfigItem
    public String connectionString;

    /**
     * The username to authenticate with.
     */
    @ConfigItem
    public String username;

    /**
     * The password to authenticate with.
     */
    @ConfigItem
    public String password;
}
