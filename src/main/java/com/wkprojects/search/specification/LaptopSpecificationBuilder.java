package com.wkprojects.search.specification;

import com.wkprojects.search.domain.Laptop;
import com.wkprojects.search.model.OperationEnum;
import com.wkprojects.search.model.SearchCriteria;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class LaptopSpecificationBuilder {
    private final List<SearchCriteria> params;

    public LaptopSpecificationBuilder() {
        params = new ArrayList<>();
    }

    public LaptopSpecificationBuilder with(String key, Object value, OperationEnum operation, Boolean orOperation) {
        params.add(new SearchCriteria(key, value, operation, orOperation));
        return this;
    }

    public Specification<Laptop> build() {
        if (params.size() == 0) {
            return null;
        }

        List<LaptopSpecification> specs = params.stream()
                .map(param -> new LaptopSpecification(param.getKey(), param.getValue(), param.getOperation(), param.getOrOperation()))
                .collect(Collectors.toList());

        Specification<Laptop> result = Specification.where(specs.get(0));

        for (int i = 1; i < params.size(); i++) {
            if (params.get(i).getOrOperation()) {
                result = Objects.requireNonNull(result).or(Specification.where(specs.get(i)));
            } else {
                result = Objects.requireNonNull(result).and(Specification.where(specs.get(i)));
            }
        }
        return result;
    }
}
