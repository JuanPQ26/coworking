package com.jquintero.coworking.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

import jakarta.validation.Valid;

import com.jquintero.coworking.dtos.CreatePlaceDto;
import com.jquintero.coworking.dtos.UpdatePlaceDto;

@RestController
@RequestMapping("/places")
public class PlacesController {

  @GetMapping
  public ResponseEntity<String> getAll() {
    return ResponseEntity
        .ok("this method return all places.");
  }

  @GetMapping("/{id}")
  public ResponseEntity<String> getById(@PathVariable Long id) {
    return ResponseEntity
        .ok(String.format("This method return place with id %s.", id));
  }

  @PostMapping
  public ResponseEntity<String> create(@Valid @RequestBody CreatePlaceDto createPlaceDto) {
    System.out.println(createPlaceDto.toString());

    return ResponseEntity
        .status(HttpStatus.CREATED)
        .body("This method create new place.");
  }

  @PatchMapping("/{id}")
  public ResponseEntity<String> update(@PathVariable Long id, @RequestBody UpdatePlaceDto updatePlaceDto) {
    System.out.println(updatePlaceDto);
    return ResponseEntity.ok(String.format("This method update a place with id %s", id));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<String> remove(@PathVariable Long id) {
    return ResponseEntity.ok(String.format("This method remove a place with id %s", id));
  }

}
