package com.github.alexandrenavarro.pojotest;

import java.util.Optional;
import org.mapstruct.factory.Mappers;

public class Demo {

  public static void main(String[] args) {

    final PersonMapper mapper = Mappers.getMapper(PersonMapper.class);
    final MutablePerson mutablePerson = MutablePerson.builder()
      .firstname("firstname")
      .lastname("lastname")
      .middlename(Optional.of("middlename"))
      .build();

    final MutablePersonDto mutablePersonDto = mapper.mutablePersonToMutablePersonDto(mutablePerson);
    System.out.println(mutablePersonDto);

    final ImmutablePersonDto immutablePersonDto = mapper.mutablePersonToImmutablePerson(mutablePerson);
    System.out.println(immutablePersonDto);

    final PersonRecord personRecord = mapper.mutablePersonToPersonRecord(mutablePerson);
    System.out.println(personRecord);

    final MutablePerson mutablePerson1 = mapper.recordPersonToMutableRecord(new PersonRecord("first", "last", Optional.of("middle")));
    System.out.println(mutablePerson1);

  }

}
