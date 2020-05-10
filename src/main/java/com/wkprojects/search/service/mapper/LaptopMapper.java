package com.wkprojects.search.service.mapper;

import com.wkprojects.search.domain.Laptop;
import com.wkprojects.search.service.dto.LaptopDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface LaptopMapper {

    LaptopDto entityToDto(Laptop laptop);

    Laptop dtoToEntity(LaptopDto laptop);

    List<LaptopDto> toDtoList(List<Laptop> laptops);
}
