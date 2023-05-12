package com.darkcandles.backend.people;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public final class Address {
  private String city;
  private String country;
  private String postcode;
  private String street;
  private String houseNumber;
}
