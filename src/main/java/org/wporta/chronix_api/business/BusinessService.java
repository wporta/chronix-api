package org.wporta.chronix_api.business;

import org.springframework.stereotype.Service;
import org.wporta.chronix_api.business.dto.BusinessDTO;

import java.util.NoSuchElementException;

@Service
public class BusinessService {

    private final BusinessRepository businessRepository;
    private final BusinessMapper businessMapper;

    public BusinessService(BusinessRepository businessRepository, BusinessMapper businessMapper) {
        this.businessRepository = businessRepository;
        this.businessMapper = businessMapper;
    }

    public BusinessDTO getBusinessDTO() {
        Business business = businessRepository.findAll().getFirst();
        return businessMapper.toDTO(business);
    }
}
