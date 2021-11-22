package com.github.alexandrenavarro.pojotest;

import java.util.Optional;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;


@Getter
@EqualsAndHashCode
@ToString
public final class ImmutablePersonDto {

  private final String firstname;
  private final String lastname;
  private final Optional<String> middlename;

  @Builder
  public ImmutablePersonDto(String firstname, String lastname, Optional<String> middlename) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.middlename = middlename;
  }

}
