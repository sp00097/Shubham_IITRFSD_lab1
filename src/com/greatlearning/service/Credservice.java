package com.greatlearning.service;

import com.greatlearning.model.employee;

public interface Credservice {
  String generateEmailId(String firstname, String lastname, String dept);
  String generatePassword();
  void showDetails(employee e1);
}
