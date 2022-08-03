package com.capitalmarkets.app.implementation.mappers;


import com.capitalmarkets.app.dto.integration.CurrencyApiDTO;
import com.capitalmarkets.app.implementation.adapters.Impl.CurrencyAdapter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CurrencyAdapterMapper implements Imapper<CurrencyApiDTO>{



    @Override
    public CurrencyApiDTO mapToDto(String s) {
        return null;
    }

    @Override
    public List<CurrencyApiDTO> mapListToDtoList(String s) {
        return null;
    }
}
