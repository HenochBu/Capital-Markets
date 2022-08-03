package com.capitalmarkets.app.implementation.adapters.Impl;

import com.capitalmarkets.app.dto.integration.CurrencyApiDTO;
import com.capitalmarkets.app.implementation.adapters.ICurrencyAdapter;
import com.capitalmarkets.app.implementation.mappers.Imapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@Slf4j
@Component
@AllArgsConstructor
public class CurrencyAdapter implements ICurrencyAdapter {

    private static final String url="https://api.frankfurter.app/";

    private final RestTemplate restTemplate = new RestTemplate();
    private final Imapper<CurrencyApiDTO> mapper;

    @Override
    public CurrencyApiDTO getByName(String name) {
        restTemplate.getForObject(url+"currencies",String.class);
        log.info(restTemplate.getForObject(url+"currencies"+"/"+name,String.class));
        return null;
    }

    @Override
    public CurrencyApiDTO getByCode(String code) {
        restTemplate.getForObject(url+"currencies",String.class);
        log.info(restTemplate.getForObject(url+"currencies",String.class));
        return null;
    }

    @Override
    public List<CurrencyApiDTO> getAll(String code) {
        return null;
    }
}
