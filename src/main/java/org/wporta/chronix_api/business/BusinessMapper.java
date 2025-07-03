package org.wporta.chronix_api.business;

import org.mapstruct.Mapper;
import org.wporta.chronix_api.business.dto.BusinessDTO;

@Mapper(componentModel = "spring")
public interface BusinessMapper {

    BusinessDTO toDTO(Business business);

    Business toEntity(BusinessDTO businessDTO);
}
