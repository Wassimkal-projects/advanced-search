package com.wkprojects.search.service.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LaptopDto {

    private Long id;

    @NotNull
    @Size(max = 10)
    private String code;

    @NotNull
    private Integer price;

    @NotNull
    private String brand;

    @NotNull
    private String processorType;

    @NotNull
    private String ramSize;

    @NotNull
    private String hardDisk;

    @NotNull
    private String laptopWeight;

    @NotNull
    private String graphicsProcessor;

    @NotNull
    private String screenSize;

    @NotNull
    private String screenType;

    @NotNull
    private String operatingSystem;

    @NotNull
    private Boolean available;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    public String getRamSize() {
        return ramSize;
    }

    public void setRamSize(String ramSize) {
        this.ramSize = ramSize;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getLaptopWeight() {
        return laptopWeight;
    }

    public void setLaptopWeight(String laptopWeight) {
        this.laptopWeight = laptopWeight;
    }

    public String getGraphicsProcessor() {
        return graphicsProcessor;
    }

    public void setGraphicsProcessor(String graphicsProcessor) {
        this.graphicsProcessor = graphicsProcessor;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "LaptopDto{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", processorType='" + processorType + '\'' +
                ", ramSize='" + ramSize + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                ", laptopWeight='" + laptopWeight + '\'' +
                ", graphicsProcessor='" + graphicsProcessor + '\'' +
                ", screenSize='" + screenSize + '\'' +
                ", screenType='" + screenType + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", available=" + available +
                '}';
    }
}
