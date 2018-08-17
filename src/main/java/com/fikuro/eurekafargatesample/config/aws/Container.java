package com.fikuro.eurekafargatesample.config.aws;

import com.fasterxml.jackson.annotation.*;

public class Container {
    private String dockerID;
    private String name;
    private String dockerName;
    private String image;
    private String imageID;
    private Labels labels;
    private String desiredStatus;
    private String knownStatus;
    private Limits limits;
    private String createdAt;
    private String startedAt;
    private String type;
    private Network[] networks;

    @JsonProperty("DockerId")
    public String getDockerID() { return dockerID; }
    @JsonProperty("DockerId")
    public void setDockerID(String value) { this.dockerID = value; }

    @JsonProperty("Name")
    public String getName() { return name; }
    @JsonProperty("Name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("DockerName")
    public String getDockerName() { return dockerName; }
    @JsonProperty("DockerName")
    public void setDockerName(String value) { this.dockerName = value; }

    @JsonProperty("Image")
    public String getImage() { return image; }
    @JsonProperty("Image")
    public void setImage(String value) { this.image = value; }

    @JsonProperty("ImageID")
    public String getImageID() { return imageID; }
    @JsonProperty("ImageID")
    public void setImageID(String value) { this.imageID = value; }

    @JsonProperty("Labels")
    public Labels getLabels() { return labels; }
    @JsonProperty("Labels")
    public void setLabels(Labels value) { this.labels = value; }

    @JsonProperty("DesiredStatus")
    public String getDesiredStatus() { return desiredStatus; }
    @JsonProperty("DesiredStatus")
    public void setDesiredStatus(String value) { this.desiredStatus = value; }

    @JsonProperty("KnownStatus")
    public String getKnownStatus() { return knownStatus; }
    @JsonProperty("KnownStatus")
    public void setKnownStatus(String value) { this.knownStatus = value; }

    @JsonProperty("Limits")
    public Limits getLimits() { return limits; }
    @JsonProperty("Limits")
    public void setLimits(Limits value) { this.limits = value; }

    @JsonProperty("CreatedAt")
    public String getCreatedAt() { return createdAt; }
    @JsonProperty("CreatedAt")
    public void setCreatedAt(String value) { this.createdAt = value; }

    @JsonProperty("StartedAt")
    public String getStartedAt() { return startedAt; }
    @JsonProperty("StartedAt")
    public void setStartedAt(String value) { this.startedAt = value; }

    @JsonProperty("Type")
    public String getType() { return type; }
    @JsonProperty("Type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("Networks")
    public Network[] getNetworks() { return networks; }
    @JsonProperty("Networks")
    public void setNetworks(Network[] value) { this.networks = value; }
}
