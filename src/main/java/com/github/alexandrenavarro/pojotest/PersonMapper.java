package com.github.alexandrenavarro.pojotest;

import org.mapstruct.Mapper;

@Mapper
public interface PersonMapper {

  MutablePersonDto mutablePersonToMutablePersonDto(MutablePerson mutablePerson);

  ImmutablePersonDto mutablePersonToImmutablePerson(MutablePerson mutablePerson);

  PersonRecord mutablePersonToPersonRecord(MutablePerson mutablePerson);

  MutablePerson recordPersonToMutableRecord(PersonRecord personRecord);
}
