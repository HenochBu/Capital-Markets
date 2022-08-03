package com.capitalmarkets.app.implementation.adapters;

import com.capitalmarkets.app.dto.integration.CurrencyApiDTO;

import java.util.List;

public interface ICurrencyAdapter {

    CurrencyApiDTO getByName(String name);
    CurrencyApiDTO getByCode(String code);

    List<CurrencyApiDTO> getAll(String code);
}
