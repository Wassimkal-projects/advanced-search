package com.wkprojects.search.utils;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RandomLaptopFieldsUtil {

    private final int CODE_DEF_COUNT = 10;
    private final int MIN_LENGTH = 3;
    private final int MAX_LENGTH = 5;
    private final Random random;

    public RandomLaptopFieldsUtil(Random random) {
        this.random = random;
    }

    public String generateRandomCode() {
        return RandomStringUtils.randomAlphanumeric(CODE_DEF_COUNT);
    }

    public Integer generateRandomPrice() {
        return Integer.parseInt(RandomStringUtils.randomNumeric(MIN_LENGTH, MAX_LENGTH));
    }

    public String generateRandomBrand() {
        return LaptopFieldsConstants.brands.get(random.nextInt(LaptopFieldsConstants.brands.size()));
    }

    public String generateRandomProcessorType() {
        return LaptopFieldsConstants.processorTypes.get(random.nextInt(LaptopFieldsConstants.processorTypes.size()));
    }

    public String generateRandomRamSize() {
        return LaptopFieldsConstants.ramSizes.get(random.nextInt(LaptopFieldsConstants.ramSizes.size()));
    }

    public String generateRandomHardDisk() {
        return LaptopFieldsConstants.hardDiskSize.get(random.nextInt(LaptopFieldsConstants.hardDiskSize.size()));
    }

    public String generateRandomLaptopWeight() {
        return LaptopFieldsConstants.laptopWeights.get(random.nextInt(LaptopFieldsConstants.laptopWeights.size()));
    }

    public String generateRandomGraphicsProcessor() {
        return LaptopFieldsConstants.graphicsProcessor.get(random.nextInt(LaptopFieldsConstants.graphicsProcessor.size()));
    }

    public String generateRandomScreenSize() {
        return LaptopFieldsConstants.screenSizes.get(random.nextInt(LaptopFieldsConstants.screenSizes.size()));
    }

    public String generateRandomScreenType() {
        return LaptopFieldsConstants.screenTypes.get(random.nextInt(LaptopFieldsConstants.screenTypes.size()));
    }

    public String generateRandomOperatingSystem() {
        return LaptopFieldsConstants.operatingSystems.get(random.nextInt(LaptopFieldsConstants.operatingSystems.size()));
    }

    public Boolean generateRandomIsAvailale() {
        return random.nextBoolean();
    }
}
