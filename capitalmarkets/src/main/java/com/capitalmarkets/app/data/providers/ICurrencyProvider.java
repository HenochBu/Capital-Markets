package com.capitalmarkets.app.data.providers;

import com.capitalmarkets.app.dto.data.CurrencyDTO;

public interface ICurrencyProvider {

    CurrencyDTO getCurrencyByName(String name);
    CurrencyDTO getCurrencyByCode(String code);

    //create
}
