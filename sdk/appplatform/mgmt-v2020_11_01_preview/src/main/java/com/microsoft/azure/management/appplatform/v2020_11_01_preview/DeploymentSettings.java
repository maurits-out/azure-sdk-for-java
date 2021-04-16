/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2020_11_01_preview;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Deployment settings payload.
 */
public class DeploymentSettings {
    /**
     * Required CPU, basic tier should be 1, standard tier should be in range
     * (1, 4).
     */
    @JsonProperty(value = "cpu")
    private Integer cpu;

    /**
     * Required Memory size in GB, basic tier should be in range (1, 2),
     * standard tier should be in range (1, 8).
     */
    @JsonProperty(value = "memoryInGB")
    private Integer memoryInGB;

    /**
     * JVM parameter.
     */
    @JsonProperty(value = "jvmOptions")
    private String jvmOptions;

    /**
     * The path to the .NET executable relative to zip root.
     */
    @JsonProperty(value = "netCoreMainEntryPath")
    private String netCoreMainEntryPath;

    /**
     * Collection of environment variables.
     */
    @JsonProperty(value = "environmentVariables")
    private Map<String, String> environmentVariables;

    /**
     * Runtime version. Possible values include: 'Java_8', 'Java_11',
     * 'NetCore_31'.
     */
    @JsonProperty(value = "runtimeVersion")
    private RuntimeVersion runtimeVersion;

    /**
     * Get required CPU, basic tier should be 1, standard tier should be in range (1, 4).
     *
     * @return the cpu value
     */
    public Integer cpu() {
        return this.cpu;
    }

    /**
     * Set required CPU, basic tier should be 1, standard tier should be in range (1, 4).
     *
     * @param cpu the cpu value to set
     * @return the DeploymentSettings object itself.
     */
    public DeploymentSettings withCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * Get required Memory size in GB, basic tier should be in range (1, 2), standard tier should be in range (1, 8).
     *
     * @return the memoryInGB value
     */
    public Integer memoryInGB() {
        return this.memoryInGB;
    }

    /**
     * Set required Memory size in GB, basic tier should be in range (1, 2), standard tier should be in range (1, 8).
     *
     * @param memoryInGB the memoryInGB value to set
     * @return the DeploymentSettings object itself.
     */
    public DeploymentSettings withMemoryInGB(Integer memoryInGB) {
        this.memoryInGB = memoryInGB;
        return this;
    }

    /**
     * Get jVM parameter.
     *
     * @return the jvmOptions value
     */
    public String jvmOptions() {
        return this.jvmOptions;
    }

    /**
     * Set jVM parameter.
     *
     * @param jvmOptions the jvmOptions value to set
     * @return the DeploymentSettings object itself.
     */
    public DeploymentSettings withJvmOptions(String jvmOptions) {
        this.jvmOptions = jvmOptions;
        return this;
    }

    /**
     * Get the path to the .NET executable relative to zip root.
     *
     * @return the netCoreMainEntryPath value
     */
    public String netCoreMainEntryPath() {
        return this.netCoreMainEntryPath;
    }

    /**
     * Set the path to the .NET executable relative to zip root.
     *
     * @param netCoreMainEntryPath the netCoreMainEntryPath value to set
     * @return the DeploymentSettings object itself.
     */
    public DeploymentSettings withNetCoreMainEntryPath(String netCoreMainEntryPath) {
        this.netCoreMainEntryPath = netCoreMainEntryPath;
        return this;
    }

    /**
     * Get collection of environment variables.
     *
     * @return the environmentVariables value
     */
    public Map<String, String> environmentVariables() {
        return this.environmentVariables;
    }

    /**
     * Set collection of environment variables.
     *
     * @param environmentVariables the environmentVariables value to set
     * @return the DeploymentSettings object itself.
     */
    public DeploymentSettings withEnvironmentVariables(Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }

    /**
     * Get runtime version. Possible values include: 'Java_8', 'Java_11', 'NetCore_31'.
     *
     * @return the runtimeVersion value
     */
    public RuntimeVersion runtimeVersion() {
        return this.runtimeVersion;
    }

    /**
     * Set runtime version. Possible values include: 'Java_8', 'Java_11', 'NetCore_31'.
     *
     * @param runtimeVersion the runtimeVersion value to set
     * @return the DeploymentSettings object itself.
     */
    public DeploymentSettings withRuntimeVersion(RuntimeVersion runtimeVersion) {
        this.runtimeVersion = runtimeVersion;
        return this;
    }

}