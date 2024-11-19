package com.jquintero.coworking.dtos;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class UpdatePlaceDto {
  private String name;
  private String country;
  private String city;
  private String address;
  private String zipcode;
  private Boolean available;
  private Boolean status;
}
