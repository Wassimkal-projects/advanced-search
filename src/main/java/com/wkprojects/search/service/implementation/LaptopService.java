package com.wkprojects.search.service.implementation;

import com.wkprojects.search.domain.Laptop;
import com.wkprojects.search.domain.Laptop_;
import com.wkprojects.search.model.LaptopSearchCriteria;
import com.wkprojects.search.model.SearchValueOperationModel;
import com.wkprojects.search.repository.LaptopRepository;
import com.wkprojects.search.service.dto.LaptopDto;
import com.wkprojects.search.service.mapper.LaptopMapper;
import com.wkprojects.search.specification.LaptopSpecificationBuilder;
import com.wkprojects.search.utils.RandomLaptopFieldsUtil;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Service
@Transactional
public class LaptopService {

    private final RandomLaptopFieldsUtil randoms;
    private final LaptopRepository laptopRepository;
    private final LaptopMapper laptopMapper;

    public LaptopService(RandomLaptopFieldsUtil randoms, LaptopRepository laptopRepository, LaptopMapper laptopMapper) {
        this.randoms = randoms;
        this.laptopRepository = laptopRepository;
        this.laptopMapper = laptopMapper;
    }

    public void addRandomLaptops(Integer number) {
        for (int i = 0; i < number; i++) {
            Laptop laptop = new Laptop();
            laptop.setCode(randoms.generateRandomCode());
            laptop.setPrice(randoms.generateRandomPrice());
            laptop.setBrand(randoms.generateRandomBrand());
            laptop.setProcessorType(randoms.generateRandomProcessorType());
            laptop.setRamSize(randoms.generateRandomRamSize());
            laptop.setHardDisk(randoms.generateRandomHardDisk());
            laptop.setLaptopWeight(randoms.generateRandomLaptopWeight());
            laptop.setGraphicsProcessor(randoms.generateRandomGraphicsProcessor());
            laptop.setScreenSize(randoms.generateRandomScreenSize());
            laptop.setScreenType(randoms.generateRandomScreenType());
            laptop.setOperatingSystem(randoms.generateRandomOperatingSystem());
            laptop.setAvailable(randoms.generateRandomIsAvailale());
            laptopRepository.save(laptop);
        }
    }

    public Page<LaptopDto> getSearchedLaptops(Map<String, List<SearchValueOperationModel>> searchValues, Pageable pageable) {
        Specification<Laptop> spec = null;
        for (String searchCriteria : LaptopSearchCriteria.searchCriteria) {
            LaptopSpecificationBuilder builder = new LaptopSpecificationBuilder();
            if (searchValues.get(searchCriteria) != null) {
                searchValues.get(searchCriteria).forEach(searchValue -> {
                            if(searchCriteria.equals(Laptop_.AVAILABLE)){
                                builder.with(searchCriteria, searchValue.getValue().equals("true"), searchValue.getOperation(), true);
                            } else{
                                builder.with(searchCriteria, searchValue.getValue(), searchValue.getOperation(), true);
                            }
                        }
                );
                spec = spec == null ? builder.build() : Objects.requireNonNull(spec).and(builder.build());
            }
        }
        return laptopRepository.findAll(spec, pageable).map(laptopMapper::entityToDto);
    }
}
