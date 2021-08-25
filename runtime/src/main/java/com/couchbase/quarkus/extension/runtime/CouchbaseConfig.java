package com.couchbase.quarkus.extension.runtime;

import io.quarkus.runtime.annotations.ConfigItem;
import io.quarkus.runtime.annotations.ConfigPhase;
import io.quarkus.runtime.annotations.ConfigRoot;

@ConfigRoot(name = "couchbase", phase = ConfigPhase.BUILD_AND_RUN_TIME_FIXED)
public final class CouchbaseConfig {
    /** */
    @ConfigItem
    public String connectionString;

    /** */
    @ConfigItem
    public String username;

    /** */
    @ConfigItem
    public String password;
}
