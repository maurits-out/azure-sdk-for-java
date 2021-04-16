/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_12_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a virtual machines scale sets network configuration's DNS
 * settings.
 */
public class VirtualMachineScaleSetNetworkConfigurationDnsSettings {
    /**
     * List of DNS servers IP addresses.
     */
    @JsonProperty(value = "dnsServers")
    private List<String> dnsServers;

    /**
     * Get list of DNS servers IP addresses.
     *
     * @return the dnsServers value
     */
    public List<String> dnsServers() {
        return this.dnsServers;
    }

    /**
     * Set list of DNS servers IP addresses.
     *
     * @param dnsServers the dnsServers value to set
     * @return the VirtualMachineScaleSetNetworkConfigurationDnsSettings object itself.
     */
    public VirtualMachineScaleSetNetworkConfigurationDnsSettings withDnsServers(List<String> dnsServers) {
        this.dnsServers = dnsServers;
        return this;
    }

}