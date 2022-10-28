package com.training.pms.galaxe.controller;

import lombok.AllArgsConstructor;

//import org.springframework.boot.convert.DataSizeUnit;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reviews {
 
 public int reviewId;
 public String comments;
 public int rating;
 
 

}