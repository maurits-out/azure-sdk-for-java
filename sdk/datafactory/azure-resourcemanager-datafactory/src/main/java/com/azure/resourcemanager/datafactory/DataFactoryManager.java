// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.BearerTokenAuthenticationPolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Configuration;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.DataFactoryManagementClient;
import com.azure.resourcemanager.datafactory.implementation.ActivityRunsImpl;
import com.azure.resourcemanager.datafactory.implementation.DataFactoryManagementClientBuilder;
import com.azure.resourcemanager.datafactory.implementation.DataFlowDebugSessionsImpl;
import com.azure.resourcemanager.datafactory.implementation.DataFlowsImpl;
import com.azure.resourcemanager.datafactory.implementation.DatasetsImpl;
import com.azure.resourcemanager.datafactory.implementation.ExposureControlsImpl;
import com.azure.resourcemanager.datafactory.implementation.FactoriesImpl;
import com.azure.resourcemanager.datafactory.implementation.IntegrationRuntimeNodesImpl;
import com.azure.resourcemanager.datafactory.implementation.IntegrationRuntimeObjectMetadatasImpl;
import com.azure.resourcemanager.datafactory.implementation.IntegrationRuntimesImpl;
import com.azure.resourcemanager.datafactory.implementation.LinkedServicesImpl;
import com.azure.resourcemanager.datafactory.implementation.ManagedPrivateEndpointsImpl;
import com.azure.resourcemanager.datafactory.implementation.ManagedVirtualNetworksImpl;
import com.azure.resourcemanager.datafactory.implementation.OperationsImpl;
import com.azure.resourcemanager.datafactory.implementation.PipelineRunsImpl;
import com.azure.resourcemanager.datafactory.implementation.PipelinesImpl;
import com.azure.resourcemanager.datafactory.implementation.PrivateEndPointConnectionsImpl;
import com.azure.resourcemanager.datafactory.implementation.PrivateEndpointConnectionOperationsImpl;
import com.azure.resourcemanager.datafactory.implementation.PrivateLinkResourcesImpl;
import com.azure.resourcemanager.datafactory.implementation.TriggerRunsImpl;
import com.azure.resourcemanager.datafactory.implementation.TriggersImpl;
import com.azure.resourcemanager.datafactory.models.ActivityRuns;
import com.azure.resourcemanager.datafactory.models.DataFlowDebugSessions;
import com.azure.resourcemanager.datafactory.models.DataFlows;
import com.azure.resourcemanager.datafactory.models.Datasets;
import com.azure.resourcemanager.datafactory.models.ExposureControls;
import com.azure.resourcemanager.datafactory.models.Factories;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeNodes;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeObjectMetadatas;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimes;
import com.azure.resourcemanager.datafactory.models.LinkedServices;
import com.azure.resourcemanager.datafactory.models.ManagedPrivateEndpoints;
import com.azure.resourcemanager.datafactory.models.ManagedVirtualNetworks;
import com.azure.resourcemanager.datafactory.models.Operations;
import com.azure.resourcemanager.datafactory.models.PipelineRuns;
import com.azure.resourcemanager.datafactory.models.Pipelines;
import com.azure.resourcemanager.datafactory.models.PrivateEndPointConnections;
import com.azure.resourcemanager.datafactory.models.PrivateEndpointConnectionOperations;
import com.azure.resourcemanager.datafactory.models.PrivateLinkResources;
import com.azure.resourcemanager.datafactory.models.TriggerRuns;
import com.azure.resourcemanager.datafactory.models.Triggers;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Entry point to DataFactoryManager. The Azure Data Factory V2 management API provides a RESTful set of web services
 * that interact with Azure Data Factory V2 services.
 */
public final class DataFactoryManager {
    private Operations operations;

    private Factories factories;

    private ExposureControls exposureControls;

    private IntegrationRuntimes integrationRuntimes;

    private IntegrationRuntimeObjectMetadatas integrationRuntimeObjectMetadatas;

    private IntegrationRuntimeNodes integrationRuntimeNodes;

    private LinkedServices linkedServices;

    private Datasets datasets;

    private Pipelines pipelines;

    private PipelineRuns pipelineRuns;

    private ActivityRuns activityRuns;

    private Triggers triggers;

    private TriggerRuns triggerRuns;

    private DataFlows dataFlows;

    private DataFlowDebugSessions dataFlowDebugSessions;

    private ManagedVirtualNetworks managedVirtualNetworks;

    private ManagedPrivateEndpoints managedPrivateEndpoints;

    private PrivateEndPointConnections privateEndPointConnections;

    private PrivateEndpointConnectionOperations privateEndpointConnectionOperations;

    private PrivateLinkResources privateLinkResources;

    private final DataFactoryManagementClient clientObject;

    private DataFactoryManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new DataFactoryManagementClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of DataFactory service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the DataFactory service API instance.
     */
    public static DataFactoryManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Gets a Configurable instance that can be used to create DataFactoryManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new DataFactoryManager.Configurable();
    }

    /** The Configurable allowing configurations to be set. */
    public static final class Configurable {
        private final ClientLogger logger = new ClientLogger(Configurable.class);

        private HttpClient httpClient;
        private HttpLogOptions httpLogOptions;
        private final List<HttpPipelinePolicy> policies = new ArrayList<>();
        private RetryPolicy retryPolicy;
        private Duration defaultPollInterval;

        private Configurable() {
        }

        /**
         * Sets the http client.
         *
         * @param httpClient the HTTP client.
         * @return the configurable object itself.
         */
        public Configurable withHttpClient(HttpClient httpClient) {
            this.httpClient = Objects.requireNonNull(httpClient, "'httpClient' cannot be null.");
            return this;
        }

        /**
         * Sets the logging options to the HTTP pipeline.
         *
         * @param httpLogOptions the HTTP log options.
         * @return the configurable object itself.
         */
        public Configurable withLogOptions(HttpLogOptions httpLogOptions) {
            this.httpLogOptions = Objects.requireNonNull(httpLogOptions, "'httpLogOptions' cannot be null.");
            return this;
        }

        /**
         * Adds the pipeline policy to the HTTP pipeline.
         *
         * @param policy the HTTP pipeline policy.
         * @return the configurable object itself.
         */
        public Configurable withPolicy(HttpPipelinePolicy policy) {
            this.policies.add(Objects.requireNonNull(policy, "'policy' cannot be null."));
            return this;
        }

        /**
         * Sets the retry policy to the HTTP pipeline.
         *
         * @param retryPolicy the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryPolicy(RetryPolicy retryPolicy) {
            this.retryPolicy = Objects.requireNonNull(retryPolicy, "'retryPolicy' cannot be null.");
            return this;
        }

        /**
         * Sets the default poll interval, used when service does not provide "Retry-After" header.
         *
         * @param defaultPollInterval the default poll interval.
         * @return the configurable object itself.
         */
        public Configurable withDefaultPollInterval(Duration defaultPollInterval) {
            this.defaultPollInterval = Objects.requireNonNull(defaultPollInterval, "'retryPolicy' cannot be null.");
            if (this.defaultPollInterval.isNegative()) {
                throw logger.logExceptionAsError(new IllegalArgumentException("'httpPipeline' cannot be negative"));
            }
            return this;
        }

        /**
         * Creates an instance of DataFactory service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the DataFactory service API instance.
         */
        public DataFactoryManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.datafactory")
                .append("/")
                .append("1.0.0-beta.1");
            if (!Configuration.getGlobalConfiguration().get("AZURE_TELEMETRY_DISABLED", false)) {
                userAgentBuilder
                    .append(" (")
                    .append(Configuration.getGlobalConfiguration().get("java.version"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.name"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.version"))
                    .append("; auto-generated)");
            } else {
                userAgentBuilder.append(" (auto-generated)");
            }

            if (retryPolicy == null) {
                retryPolicy = new RetryPolicy("Retry-After", ChronoUnit.SECONDS);
            }
            List<HttpPipelinePolicy> policies = new ArrayList<>();
            policies.add(new UserAgentPolicy(userAgentBuilder.toString()));
            policies.add(new RequestIdPolicy());
            HttpPolicyProviders.addBeforeRetryPolicies(policies);
            policies.add(retryPolicy);
            policies.add(new AddDatePolicy());
            policies
                .add(
                    new BearerTokenAuthenticationPolicy(
                        credential, profile.getEnvironment().getManagementEndpoint() + "/.default"));
            HttpPolicyProviders.addAfterRetryPolicies(policies);
            policies.add(new HttpLoggingPolicy(httpLogOptions));
            HttpPipeline httpPipeline =
                new HttpPipelineBuilder()
                    .httpClient(httpClient)
                    .policies(policies.toArray(new HttpPipelinePolicy[0]))
                    .build();
            return new DataFactoryManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /** @return Resource collection API of Operations. */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /** @return Resource collection API of Factories. */
    public Factories factories() {
        if (this.factories == null) {
            this.factories = new FactoriesImpl(clientObject.getFactories(), this);
        }
        return factories;
    }

    /** @return Resource collection API of ExposureControls. */
    public ExposureControls exposureControls() {
        if (this.exposureControls == null) {
            this.exposureControls = new ExposureControlsImpl(clientObject.getExposureControls(), this);
        }
        return exposureControls;
    }

    /** @return Resource collection API of IntegrationRuntimes. */
    public IntegrationRuntimes integrationRuntimes() {
        if (this.integrationRuntimes == null) {
            this.integrationRuntimes = new IntegrationRuntimesImpl(clientObject.getIntegrationRuntimes(), this);
        }
        return integrationRuntimes;
    }

    /** @return Resource collection API of IntegrationRuntimeObjectMetadatas. */
    public IntegrationRuntimeObjectMetadatas integrationRuntimeObjectMetadatas() {
        if (this.integrationRuntimeObjectMetadatas == null) {
            this.integrationRuntimeObjectMetadatas =
                new IntegrationRuntimeObjectMetadatasImpl(clientObject.getIntegrationRuntimeObjectMetadatas(), this);
        }
        return integrationRuntimeObjectMetadatas;
    }

    /** @return Resource collection API of IntegrationRuntimeNodes. */
    public IntegrationRuntimeNodes integrationRuntimeNodes() {
        if (this.integrationRuntimeNodes == null) {
            this.integrationRuntimeNodes =
                new IntegrationRuntimeNodesImpl(clientObject.getIntegrationRuntimeNodes(), this);
        }
        return integrationRuntimeNodes;
    }

    /** @return Resource collection API of LinkedServices. */
    public LinkedServices linkedServices() {
        if (this.linkedServices == null) {
            this.linkedServices = new LinkedServicesImpl(clientObject.getLinkedServices(), this);
        }
        return linkedServices;
    }

    /** @return Resource collection API of Datasets. */
    public Datasets datasets() {
        if (this.datasets == null) {
            this.datasets = new DatasetsImpl(clientObject.getDatasets(), this);
        }
        return datasets;
    }

    /** @return Resource collection API of Pipelines. */
    public Pipelines pipelines() {
        if (this.pipelines == null) {
            this.pipelines = new PipelinesImpl(clientObject.getPipelines(), this);
        }
        return pipelines;
    }

    /** @return Resource collection API of PipelineRuns. */
    public PipelineRuns pipelineRuns() {
        if (this.pipelineRuns == null) {
            this.pipelineRuns = new PipelineRunsImpl(clientObject.getPipelineRuns(), this);
        }
        return pipelineRuns;
    }

    /** @return Resource collection API of ActivityRuns. */
    public ActivityRuns activityRuns() {
        if (this.activityRuns == null) {
            this.activityRuns = new ActivityRunsImpl(clientObject.getActivityRuns(), this);
        }
        return activityRuns;
    }

    /** @return Resource collection API of Triggers. */
    public Triggers triggers() {
        if (this.triggers == null) {
            this.triggers = new TriggersImpl(clientObject.getTriggers(), this);
        }
        return triggers;
    }

    /** @return Resource collection API of TriggerRuns. */
    public TriggerRuns triggerRuns() {
        if (this.triggerRuns == null) {
            this.triggerRuns = new TriggerRunsImpl(clientObject.getTriggerRuns(), this);
        }
        return triggerRuns;
    }

    /** @return Resource collection API of DataFlows. */
    public DataFlows dataFlows() {
        if (this.dataFlows == null) {
            this.dataFlows = new DataFlowsImpl(clientObject.getDataFlows(), this);
        }
        return dataFlows;
    }

    /** @return Resource collection API of DataFlowDebugSessions. */
    public DataFlowDebugSessions dataFlowDebugSessions() {
        if (this.dataFlowDebugSessions == null) {
            this.dataFlowDebugSessions = new DataFlowDebugSessionsImpl(clientObject.getDataFlowDebugSessions(), this);
        }
        return dataFlowDebugSessions;
    }

    /** @return Resource collection API of ManagedVirtualNetworks. */
    public ManagedVirtualNetworks managedVirtualNetworks() {
        if (this.managedVirtualNetworks == null) {
            this.managedVirtualNetworks =
                new ManagedVirtualNetworksImpl(clientObject.getManagedVirtualNetworks(), this);
        }
        return managedVirtualNetworks;
    }

    /** @return Resource collection API of ManagedPrivateEndpoints. */
    public ManagedPrivateEndpoints managedPrivateEndpoints() {
        if (this.managedPrivateEndpoints == null) {
            this.managedPrivateEndpoints =
                new ManagedPrivateEndpointsImpl(clientObject.getManagedPrivateEndpoints(), this);
        }
        return managedPrivateEndpoints;
    }

    /** @return Resource collection API of PrivateEndPointConnections. */
    public PrivateEndPointConnections privateEndPointConnections() {
        if (this.privateEndPointConnections == null) {
            this.privateEndPointConnections =
                new PrivateEndPointConnectionsImpl(clientObject.getPrivateEndPointConnections(), this);
        }
        return privateEndPointConnections;
    }

    /** @return Resource collection API of PrivateEndpointConnectionOperations. */
    public PrivateEndpointConnectionOperations privateEndpointConnectionOperations() {
        if (this.privateEndpointConnectionOperations == null) {
            this.privateEndpointConnectionOperations =
                new PrivateEndpointConnectionOperationsImpl(
                    clientObject.getPrivateEndpointConnectionOperations(), this);
        }
        return privateEndpointConnectionOperations;
    }

    /** @return Resource collection API of PrivateLinkResources. */
    public PrivateLinkResources privateLinkResources() {
        if (this.privateLinkResources == null) {
            this.privateLinkResources = new PrivateLinkResourcesImpl(clientObject.getPrivateLinkResources(), this);
        }
        return privateLinkResources;
    }

    /**
     * @return Wrapped service client DataFactoryManagementClient providing direct access to the underlying
     *     auto-generated API implementation, based on Azure REST API.
     */
    public DataFactoryManagementClient serviceClient() {
        return this.clientObject;
    }
}