package com.couchbase.quarkus.extension.deployment;

import com.couchbase.client.java.Cluster;
import com.couchbase.quarkus.extension.runtime.CouchbaseConfig;
import com.couchbase.quarkus.extension.runtime.CouchbaseRecorder;
import io.quarkus.arc.deployment.BeanArchiveIndexBuildItem;
import io.quarkus.arc.deployment.SyntheticBeanBuildItem;
import io.quarkus.deployment.annotations.BuildProducer;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.annotations.ExecutionTime;
import io.quarkus.deployment.annotations.Record;

import javax.enterprise.context.ApplicationScoped;

public class CouchbaseProcessor {

    @BuildStep
    @Record(ExecutionTime.RUNTIME_INIT)
    public void produceCouchbaseClient(CouchbaseRecorder recorder,
                                       CouchbaseConfig config,
                                       BuildProducer<SyntheticBeanBuildItem> syntheticBeans) {
        syntheticBeans.produce(SyntheticBeanBuildItem
                        .configure(Cluster.class)
                        .scope(ApplicationScoped.class)
                        .unremovable()
                        .supplier(recorder.getCluster(config))
                        .setRuntimeInit()
                    .done());

    }


}