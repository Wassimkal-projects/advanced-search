package com.wkprojects.search.specification;

import com.wkprojects.search.domain.Laptop;
import com.wkprojects.search.model.OperationEnum;
import com.wkprojects.search.model.SearchCriteria;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.lang.NonNull;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class LaptopSpecification implements Specification<Laptop> {

    private SearchCriteria criteria;

    public LaptopSpecification(String key, Object value, OperationEnum operation, Boolean orOperation) {
        super();
        this.criteria = new SearchCriteria(key, value, operation, orOperation);
    }

    @Override
    public Predicate toPredicate(@NonNull Root<Laptop> root, @NonNull CriteriaQuery<?> query, @NonNull CriteriaBuilder builder) {
        switch (criteria.getOperation()) {
            case EQUAL:
                return builder.equal(root.<String>get(criteria.getKey()), criteria.getValue());
            case DIFFERENT:
                return builder.notEqual(root.<String>get(criteria.getKey()), criteria.getValue().toString());
            case GREATER_THAN:
                return builder.greaterThan(root.get(criteria.getKey()), criteria.getValue().toString());
            case LESS_THAN:
                return builder.lessThan(root.get(criteria.getKey()), criteria.getValue().toString());
            case LIKE:
                return builder.like(root.get(criteria.getKey()), criteria.getValue().toString());
            default:
                return null;
        }
    }
}
