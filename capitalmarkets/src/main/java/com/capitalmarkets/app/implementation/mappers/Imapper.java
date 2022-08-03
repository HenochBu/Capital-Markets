package com.capitalmarkets.app.implementation.mappers;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public interface Imapper<R> {

    R mapToDto(String s);


    List<R> mapListToDtoList(String s);


}