package com.fikuro.eurekafargatesample.config.aws;

import com.fasterxml.jackson.annotation.*;

public class Limits {
    private double cpu;
    private long memory;

    @JsonProperty("CPU")
    public double getCPU() { return cpu; }
    @JsonProperty("CPU")
    public void setCPU(double value) { this.cpu = value; }

    @JsonProperty("Memory")
    public long getMemory() { return memory; }
    @JsonProperty("Memory")
    public void setMemory(long value) { this.memory = value; }
}