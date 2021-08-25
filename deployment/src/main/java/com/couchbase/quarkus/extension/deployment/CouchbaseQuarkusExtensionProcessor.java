package com.couchbase.quarkus.extension.deployment;

import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;

class CouchbaseQuarkusExtensionProcessor {

    private static final String FEATURE = "couchbase-quarkus-extension";

    @BuildStep
    FeatureBuildItem feature() {

        System.out.println("CouchbaseQuarkusExtensionProcessor - feature");
        return new FeatureBuildItem(FEATURE);
    }
}
