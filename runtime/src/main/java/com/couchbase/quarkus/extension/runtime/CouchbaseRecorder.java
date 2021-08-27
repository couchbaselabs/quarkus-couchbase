package com.couchbase.quarkus.extension.runtime;

import com.couchbase.client.java.Cluster;
import io.quarkus.runtime.annotations.Recorder;

import java.util.function.Supplier;

@Recorder
public class CouchbaseRecorder {

    public Supplier<Cluster> getCluster(CouchbaseConfig config) {
        return () -> Cluster.connect(config.connectionString, config.username, config.password);
    }
}
