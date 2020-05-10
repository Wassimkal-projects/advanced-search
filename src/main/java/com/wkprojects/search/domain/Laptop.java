package com.wkprojects.search.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "laptop")
public class Laptop implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LAPTOP_SEQ")
    @SequenceGenerator(sequenceName = "laptop_seq", allocationSize = 1, name = "LAPTOP_SEQ")
    private Long id;

    @NotNull
    @Size(max = 10)
    @Column(name = "code")
    private String code;

    @NotNull
    @Column(name = "price")
    private Integer price;

    @NotNull
    @Column(name = "brand")
    private String brand;

    @NotNull
    @Column(name = "processor_type")
    private String processorType;

    @NotNull
    @Column(name = "ram_size")
    private String ramSize;

    @NotNull
    @Column(name = "hard_disk")
    private String hardDisk;

    @NotNull
    @Column(name = "laptop_weight")
    private String laptopWeight;

    @NotNull
    @Column(name = "graphics_processor")
    private String graphicsProcessor;

    @NotNull
    @Column(name = "screen_size")
    private String screenSize;

    @NotNull
    @Column(name = "screen_type")
    private String screenType;

    @NotNull
    @Column(name = "operating_system")
    private String operatingSystem;

    @NotNull
    @Column(name = "available")
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
        return "Laptop{" +
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(getId(), laptop.getId()) &&
                Objects.equals(getCode(), laptop.getCode()) &&
                Objects.equals(getPrice(), laptop.getPrice()) &&
                Objects.equals(getBrand(), laptop.getBrand()) &&
                Objects.equals(getProcessorType(), laptop.getProcessorType()) &&
                Objects.equals(getRamSize(), laptop.getRamSize()) &&
                Objects.equals(getHardDisk(), laptop.getHardDisk()) &&
                Objects.equals(getLaptopWeight(), laptop.getLaptopWeight()) &&
                Objects.equals(getGraphicsProcessor(), laptop.getGraphicsProcessor()) &&
                Objects.equals(getScreenSize(), laptop.getScreenSize()) &&
                Objects.equals(getScreenType(), laptop.getScreenType()) &&
                Objects.equals(getOperatingSystem(), laptop.getOperatingSystem()) &&
                Objects.equals(getAvailable(), laptop.getAvailable());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCode(), getPrice(), getBrand(), getProcessorType(), getRamSize(), getHardDisk(), getLaptopWeight(), getGraphicsProcessor(), getScreenSize(), getScreenType(), getOperatingSystem(), getAvailable());
    }
}
