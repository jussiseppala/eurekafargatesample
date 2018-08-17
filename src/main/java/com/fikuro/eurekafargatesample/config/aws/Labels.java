package com.fikuro.eurekafargatesample.config.aws;

import com.fasterxml.jackson.annotation.*;

public class Labels {
    private String comAmazonawsEcsCluster;
    private String comAmazonawsEcsContainerName;
    private String comAmazonawsEcsTaskArn;
    private String comAmazonawsEcsTaskDefinitionFamily;
    private String comAmazonawsEcsTaskDefinitionVersion;

    @JsonProperty("com.amazonaws.ecs.cluster")
    public String getCOMAmazonawsEcsCluster() { return comAmazonawsEcsCluster; }
    @JsonProperty("com.amazonaws.ecs.cluster")
    public void setCOMAmazonawsEcsCluster(String value) { this.comAmazonawsEcsCluster = value; }

    @JsonProperty("com.amazonaws.ecs.container-name")
    public String getCOMAmazonawsEcsContainerName() { return comAmazonawsEcsContainerName; }
    @JsonProperty("com.amazonaws.ecs.container-name")
    public void setCOMAmazonawsEcsContainerName(String value) { this.comAmazonawsEcsContainerName = value; }

    @JsonProperty("com.amazonaws.ecs.task-arn")
    public String getCOMAmazonawsEcsTaskArn() { return comAmazonawsEcsTaskArn; }
    @JsonProperty("com.amazonaws.ecs.task-arn")
    public void setCOMAmazonawsEcsTaskArn(String value) { this.comAmazonawsEcsTaskArn = value; }

    @JsonProperty("com.amazonaws.ecs.task-definition-family")
    public String getCOMAmazonawsEcsTaskDefinitionFamily() { return comAmazonawsEcsTaskDefinitionFamily; }
    @JsonProperty("com.amazonaws.ecs.task-definition-family")
    public void setCOMAmazonawsEcsTaskDefinitionFamily(String value) { this.comAmazonawsEcsTaskDefinitionFamily = value; }

    @JsonProperty("com.amazonaws.ecs.task-definition-version")
    public String getCOMAmazonawsEcsTaskDefinitionVersion() { return comAmazonawsEcsTaskDefinitionVersion; }
    @JsonProperty("com.amazonaws.ecs.task-definition-version")
    public void setCOMAmazonawsEcsTaskDefinitionVersion(String value) { this.comAmazonawsEcsTaskDefinitionVersion = value; }
}
