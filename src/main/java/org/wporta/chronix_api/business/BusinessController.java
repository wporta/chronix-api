package org.wporta.chronix_api.business;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wporta.chronix_api.business.dto.BusinessDTO;

@RestController
@RequestMapping("/api/v1/business")
public class BusinessController {

    BusinessService businessService;

    public BusinessController(BusinessService businessService) {
        this.businessService = businessService;
    }

    @GetMapping
    public ResponseEntity<BusinessDTO> getBusinessDTO() {
        return ResponseEntity.ok(businessService.getBusinessDTO());
    }
}
