package com.fikuro.eurekafargatesample.config.aws;

import com.fasterxml.jackson.annotation.*;

public class Network {
    private String networkMode;
    private String[] iPv4Addresses;

    @JsonProperty("NetworkMode")
    public String getNetworkMode() { return networkMode; }
    @JsonProperty("NetworkMode")
    public void setNetworkMode(String value) { this.networkMode = value; }

    @JsonProperty("IPv4Addresses")
    public String[] getIPv4Addresses() { return iPv4Addresses; }
    @JsonProperty("IPv4Addresses")
    public void setIPv4Addresses(String[] value) { this.iPv4Addresses = value; }
}
