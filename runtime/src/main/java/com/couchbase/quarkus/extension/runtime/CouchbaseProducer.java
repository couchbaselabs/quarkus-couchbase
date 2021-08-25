package com.couchbase.quarkus.extension.runtime;

import com.couchbase.client.java.Cluster;

import javax.enterprise.inject.Produces;

public class CouchbaseProducer {
    private CouchbaseConfig config;

    void setConfig(CouchbaseConfig config) {
        System.out.println("CouchbaseProducer - setting config");
        this.config = config;
    }

    @Produces
    public Cluster produceCluster() throws Exception {
        System.out.println("CouchbaseProducer - connecting");
        Cluster cluster = Cluster.connect(config.connectionString, config.username, config.password);
        return cluster;
    }

}
