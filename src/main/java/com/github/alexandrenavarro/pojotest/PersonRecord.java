package com.github.alexandrenavarro.pojotest;

import java.util.Optional;
import lombok.Builder;

public record PersonRecord(String firstname, String lastname, Optional<String> middlename) {
  @Builder
  public PersonRecord {}

}
