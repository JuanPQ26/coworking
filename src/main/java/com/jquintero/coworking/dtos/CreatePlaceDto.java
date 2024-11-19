package com.jquintero.coworking.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class CreatePlaceDto {
  @NotBlank
  private String name;

  @NotBlank
  private String country;

  @NotBlank
  private String city;

  @NotBlank
  private String address;

  @NotBlank
  private String zipcode;

  @NotNull
  private Boolean available;

  @NotNull
  private Boolean status;
}
