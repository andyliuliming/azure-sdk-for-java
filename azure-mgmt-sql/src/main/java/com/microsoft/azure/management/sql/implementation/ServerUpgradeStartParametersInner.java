/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.implementation;

import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.sql.RecommendedDatabaseProperties;
import com.microsoft.azure.management.sql.UpgradeRecommendedElasticPoolProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Start Azure SQL Server Upgrade parameters.
 */
@JsonFlatten
public class ServerUpgradeStartParametersInner {
    /**
     * The version for the Azure SQL Server being upgraded.
     */
    @JsonProperty(value = "serverUpgradeProperties.Version", required = true)
    private String version;

    /**
     * The earliest time to upgrade the Azure SQL Server (ISO8601 format).
     */
    @JsonProperty(value = "serverUpgradeProperties.ScheduleUpgradeAfterUtcDateTime")
    private DateTime scheduleUpgradeAfterUtcDateTime;

    /**
     * The collection of recommended database properties to upgrade the Azure
     * SQL Server.
     */
    @JsonProperty(value = "serverUpgradeProperties.DatabaseCollection")
    private List<RecommendedDatabaseProperties> databaseCollection;

    /**
     * The collection of recommended elastic pool properties to upgrade the
     * Azure SQL Server.
     */
    @JsonProperty(value = "serverUpgradeProperties.ElasticPoolCollection")
    private List<UpgradeRecommendedElasticPoolProperties> elasticPoolCollection;

    /**
     * Creates an instance of ServerUpgradeStartParametersInner class.
     */
    public ServerUpgradeStartParametersInner() {
        version = "12.0";
    }

    /**
     * Get the version value.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version value.
     *
     * @param version the version value to set
     * @return the ServerUpgradeStartParametersInner object itself.
     */
    public ServerUpgradeStartParametersInner withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the scheduleUpgradeAfterUtcDateTime value.
     *
     * @return the scheduleUpgradeAfterUtcDateTime value
     */
    public DateTime scheduleUpgradeAfterUtcDateTime() {
        return this.scheduleUpgradeAfterUtcDateTime;
    }

    /**
     * Set the scheduleUpgradeAfterUtcDateTime value.
     *
     * @param scheduleUpgradeAfterUtcDateTime the scheduleUpgradeAfterUtcDateTime value to set
     * @return the ServerUpgradeStartParametersInner object itself.
     */
    public ServerUpgradeStartParametersInner withScheduleUpgradeAfterUtcDateTime(DateTime scheduleUpgradeAfterUtcDateTime) {
        this.scheduleUpgradeAfterUtcDateTime = scheduleUpgradeAfterUtcDateTime;
        return this;
    }

    /**
     * Get the databaseCollection value.
     *
     * @return the databaseCollection value
     */
    public List<RecommendedDatabaseProperties> databaseCollection() {
        return this.databaseCollection;
    }

    /**
     * Set the databaseCollection value.
     *
     * @param databaseCollection the databaseCollection value to set
     * @return the ServerUpgradeStartParametersInner object itself.
     */
    public ServerUpgradeStartParametersInner withDatabaseCollection(List<RecommendedDatabaseProperties> databaseCollection) {
        this.databaseCollection = databaseCollection;
        return this;
    }

    /**
     * Get the elasticPoolCollection value.
     *
     * @return the elasticPoolCollection value
     */
    public List<UpgradeRecommendedElasticPoolProperties> elasticPoolCollection() {
        return this.elasticPoolCollection;
    }

    /**
     * Set the elasticPoolCollection value.
     *
     * @param elasticPoolCollection the elasticPoolCollection value to set
     * @return the ServerUpgradeStartParametersInner object itself.
     */
    public ServerUpgradeStartParametersInner withElasticPoolCollection(List<UpgradeRecommendedElasticPoolProperties> elasticPoolCollection) {
        this.elasticPoolCollection = elasticPoolCollection;
        return this;
    }

}