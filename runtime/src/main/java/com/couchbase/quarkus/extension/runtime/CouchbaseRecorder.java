package com.couchbase.quarkus.extension.runtime;

import com.couchbase.client.java.Cluster;
import io.quarkus.arc.runtime.BeanContainerListener;
import io.quarkus.runtime.annotations.Recorder;

import java.util.function.Supplier;

@Recorder
public class CouchbaseRecorder {

//    public BeanContainerListener setConfig(CouchbaseConfig Config) {
//        System.out.println("CouchbaseRecorder - setConfig");
//        return beanContainer -> {
//            CouchbaseProducer producer = beanContainer.instance(CouchbaseProducer.class);
//            producer.setConfig(Config);
//        };
//    }

    public Supplier<Cluster> getCluster(CouchbaseConfig config) {
        System.out.println("CouchbaseRecorder - getCluster " + config.connectionString);
        return () -> Cluster.connect(config.connectionString, config.username, config.password);
    }
}
